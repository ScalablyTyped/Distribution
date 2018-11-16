package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the custom data for one of the following PlayReady-ND messages: Registration Challenge, Registration Response, License Fetch Challenge, or License Fetch Response. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDCustomData")
@js.native
class NDCustomData protected () extends js.Object {
  /**
                       * Creates a new instance of the NDCustomData class.
                       * @param customDataTypeIDBytes The type identifier for the custom data. Only a type identifier that is exactly 16 bytes in size is supported.
                       * @param customDataBytes The custom data.
                       */
  def this(customDataTypeIDBytes: js.Array[scala.Double], customDataBytes: js.Array[scala.Double]) = this()
  /** Gets the custom data. */
  var customData: scala.Double = js.native
  /** Gets the 16-byte type identifier for the custom data. */
  var customDataTypeID: scala.Double = js.native
}

