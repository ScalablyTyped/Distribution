package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates the PlayReady ITA-specific serialized initialization data. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyITADataGenerator")
@js.native
class PlayReadyITADataGenerator () extends js.Object {
  /**
                       * Returns a serialized blob of the specified IPropertySet data that the PlayReady ITA can consume if wrapped in a content protection instantiation format.
                       * @param guidCPSystemId The content protection system GUID.
                       * @param countOfStreams The stream count.
                       * @param configuration The data to be returned as a serialized blob.
                       * @param format The format for the ITA serialized data.
                       * @return The serialized blob. See Remarks.
                       */
  def generateData(
    guidCPSystemId: java.lang.String,
    countOfStreams: scala.Double,
    configuration: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IPropertySet,
    format: PlayReadyITADataFormat
  ): js.Array[scala.Double] = js.native
}

