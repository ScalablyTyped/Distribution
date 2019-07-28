package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcquisitionAssignmentType extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "AcquisitionAssignmentType")
@js.native
object AcquisitionAssignmentType extends js.Object {
  /**
    * Assign for all users in the account
    */
  @js.native
  sealed trait All extends AcquisitionAssignmentType
  
  /**
    * Just assign for me
    */
  @js.native
  sealed trait Me extends AcquisitionAssignmentType
  
  @js.native
  sealed trait None extends AcquisitionAssignmentType
  
  /* 2 */ val All: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.AcquisitionAssignmentType.All with Double = js.native
  /* 1 */ val Me: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.AcquisitionAssignmentType.Me with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.AcquisitionAssignmentType.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionAssignmentType with Double] = js.native
}

