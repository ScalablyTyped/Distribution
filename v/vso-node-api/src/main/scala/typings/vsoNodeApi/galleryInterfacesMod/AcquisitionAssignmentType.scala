package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AcquisitionAssignmentType with Double] = js.native
  /* 2 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 1 */ @js.native
  object Me extends TopLevel[Me with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

