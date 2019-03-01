package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the custom data for one of the following PlayReady-ND messages: Registration Challenge, Registration Response, License Fetch Challenge, or License Fetch Response. */
trait INDCustomData extends js.Object {
  /** Gets the custom data. */
  var customData: scala.Double
  /** Gets the 16-byte type identifier for the custom data. */
  var customDataTypeID: scala.Double
}

object INDCustomData {
  @scala.inline
  def apply(customData: scala.Double, customDataTypeID: scala.Double): INDCustomData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customData")(customData)
    __obj.updateDynamic("customDataTypeID")(customDataTypeID)
    __obj.asInstanceOf[INDCustomData]
  }
}

