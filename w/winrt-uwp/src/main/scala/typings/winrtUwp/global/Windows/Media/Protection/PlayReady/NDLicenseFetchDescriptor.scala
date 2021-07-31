package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Media.Protection.PlayReady.INDCustomData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves and sets properties used for fetching a PlayReady-ND license. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDLicenseFetchDescriptor")
@js.native
class NDLicenseFetchDescriptor protected ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Protection.PlayReady.NDLicenseFetchDescriptor {
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
  
  /** Gets the content identifer. */
  /* CompleteClass */
  var contentID: Double = js.native
  
  /** Gets the type of the content identifier. */
  /* CompleteClass */
  var contentIDType: typings.winrtUwp.Windows.Media.Protection.PlayReady.NDContentIDType = js.native
  
  /** Gets or sets custom data for a license fetch challenge. */
  /* CompleteClass */
  var licenseFetchChallengeCustomData: INDCustomData = js.native
}
