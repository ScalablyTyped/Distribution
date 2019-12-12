package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationState.Allow
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationState.Completed
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.AcquisitionOperationState.Disallow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcquisitionOperationState extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "AcquisitionOperationState")
@js.native
object AcquisitionOperationState extends js.Object {
  /**
    * Allowed to use this AcquisitionOperation
    */
  @js.native
  sealed trait Allow extends AcquisitionOperationState
  
  /**
    * Operation has already been completed and is no longer available
    */
  @js.native
  sealed trait Completed extends AcquisitionOperationState
  
  /**
    * Not allowed to use this AcquisitionOperation
    */
  @js.native
  sealed trait Disallow extends AcquisitionOperationState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionOperationState with Double] = js.native
  /* 1 */ @js.native
  object Allow extends TopLevel[Allow with Double]
  
  /* 3 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /* 0 */ @js.native
  object Disallow extends TopLevel[Disallow with Double]
  
}

