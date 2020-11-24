package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Media.Protection.PlayReady.INDCustomData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves and sets properties used for fetching a PlayReady-ND license. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDLicenseFetchDescriptor")
@js.native
class NDLicenseFetchDescriptor protected ()
  extends typings.winrtUwp.Windows.Media.Protection.PlayReady.NDLicenseFetchDescriptor {
  /**
    * Creates a new instance of the NDLicenseFetchDescriptor class.
    * @param contentIDType The type of the content identifier.
    * @param contentIDBytes The content identifier.
    * @param licenseFetchChallengeCustomData The license fetch challenge custom data.
    */
  def this(
    contentIDType: typings.winrtUwp.Windows.Media.Protection.PlayReady.NDContentIDType,
    contentIDBytes: js.Array[Double],
    licenseFetchChallengeCustomData: INDCustomData
  ) = this()
}
