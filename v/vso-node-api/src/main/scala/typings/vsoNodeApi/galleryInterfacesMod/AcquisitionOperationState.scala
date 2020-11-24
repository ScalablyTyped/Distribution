package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AcquisitionOperationState extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "AcquisitionOperationState")
@js.native
object AcquisitionOperationState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionOperationState with Double] = js.native
  
  /**
    * Allowed to use this AcquisitionOperation
    */
  @js.native
  sealed trait Allow extends AcquisitionOperationState
  /* 1 */ @js.native
  object Allow extends TopLevel[Allow with Double]
  
  /**
    * Operation has already been completed and is no longer available
    */
  @js.native
  sealed trait Completed extends AcquisitionOperationState
  /* 3 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /**
    * Not allowed to use this AcquisitionOperation
    */
  @js.native
  sealed trait Disallow extends AcquisitionOperationState
  /* 0 */ @js.native
  object Disallow extends TopLevel[Disallow with Double]
}
