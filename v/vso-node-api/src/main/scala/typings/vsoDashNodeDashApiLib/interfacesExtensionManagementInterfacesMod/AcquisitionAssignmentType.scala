package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcquisitionAssignmentType extends js.Object

@JSImport("vso-node-api/interfaces/ExtensionManagementInterfaces", "AcquisitionAssignmentType")
@js.native
object AcquisitionAssignmentType extends js.Object {
  /**
       * Assign for all users in the account
       */
  @js.native
  sealed trait All
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.AcquisitionAssignmentType
  
  /**
       * Just assign for me
       */
  @js.native
  sealed trait Me
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.AcquisitionAssignmentType
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.AcquisitionAssignmentType
  
  /* 2 */ val All: All with scala.Double = js.native
  /* 1 */ val Me: Me with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.AcquisitionAssignmentType with scala.Double
  ] = js.native
}

