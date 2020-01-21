package typings.xmlbuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPubID extends js.Object {
  var pubID: js.UndefOr[String] = js.undefined
  var sysID: js.UndefOr[String] = js.undefined
}

object AnonPubID {
  @scala.inline
  def apply(pubID: String = null, sysID: String = null): AnonPubID = {
    val __obj = js.Dynamic.literal()
    if (pubID != null) __obj.updateDynamic("pubID")(pubID.asInstanceOf[js.Any])
    if (sysID != null) __obj.updateDynamic("sysID")(sysID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPubID]
  }
}

