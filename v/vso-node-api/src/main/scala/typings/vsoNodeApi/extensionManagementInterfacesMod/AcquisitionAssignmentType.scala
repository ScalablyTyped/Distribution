package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AcquisitionAssignmentType extends js.Object
@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "AcquisitionAssignmentType")
@js.native
object AcquisitionAssignmentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionAssignmentType with Double] = js.native
  
  /**
    * Assign for all users in the account
    */
  @js.native
  sealed trait All extends AcquisitionAssignmentType
  /* 2 */ @js.native
  object All extends TopLevel[All with Double]
  
  /**
    * Just assign for me
    */
  @js.native
  sealed trait Me extends AcquisitionAssignmentType
  /* 1 */ @js.native
  object Me extends TopLevel[Me with Double]
  
  @js.native
  sealed trait None extends AcquisitionAssignmentType
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
}
