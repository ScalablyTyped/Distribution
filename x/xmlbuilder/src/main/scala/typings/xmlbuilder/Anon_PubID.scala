package typings.xmlbuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PubID extends js.Object {
  var pubID: js.UndefOr[String] = js.undefined
  var sysID: js.UndefOr[String] = js.undefined
}

object Anon_PubID {
  @scala.inline
  def apply(pubID: String = null, sysID: String = null): Anon_PubID = {
    val __obj = js.Dynamic.literal()
    if (pubID != null) __obj.updateDynamic("pubID")(pubID)
    if (sysID != null) __obj.updateDynamic("sysID")(sysID)
    __obj.asInstanceOf[Anon_PubID]
  }
}

