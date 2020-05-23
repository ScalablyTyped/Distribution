package typings.xmlbuilder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PubID extends js.Object {
  var pubID: js.UndefOr[java.lang.String] = js.undefined
  var sysID: js.UndefOr[java.lang.String] = js.undefined
}

object PubID {
  @scala.inline
  def apply(pubID: java.lang.String = null, sysID: java.lang.String = null): PubID = {
    val __obj = js.Dynamic.literal()
    if (pubID != null) __obj.updateDynamic("pubID")(pubID.asInstanceOf[js.Any])
    if (sysID != null) __obj.updateDynamic("sysID")(sysID.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubID]
  }
}

