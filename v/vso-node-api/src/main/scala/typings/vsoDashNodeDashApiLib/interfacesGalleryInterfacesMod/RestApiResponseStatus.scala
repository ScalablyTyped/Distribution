package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RestApiResponseStatus extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "RestApiResponseStatus")
@js.native
object RestApiResponseStatus extends js.Object {
  /**
       * The operation is completed.
       */
  @js.native
  sealed trait Completed
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.RestApiResponseStatus
  
  /**
       * The operation is failed.
       */
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.RestApiResponseStatus
  
  /**
       * The operation is in progress.
       */
  @js.native
  sealed trait Inprogress
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.RestApiResponseStatus
  
  /**
       * The operation is in skipped.
       */
  @js.native
  sealed trait Skipped
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.RestApiResponseStatus
  
  /* 0 */ val Completed: Completed with scala.Double = js.native
  /* 1 */ val Failed: Failed with scala.Double = js.native
  /* 2 */ val Inprogress: Inprogress with scala.Double = js.native
  /* 3 */ val Skipped: Skipped with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.RestApiResponseStatus with scala.Double
  ] = js.native
}

