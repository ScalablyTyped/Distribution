package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.RestApiResponseStatus.Completed
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.RestApiResponseStatus.Failed
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.RestApiResponseStatus.Inprogress
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.RestApiResponseStatus.Skipped
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
  sealed trait Completed extends RestApiResponseStatus
  
  /**
    * The operation is failed.
    */
  @js.native
  sealed trait Failed extends RestApiResponseStatus
  
  /**
    * The operation is in progress.
    */
  @js.native
  sealed trait Inprogress extends RestApiResponseStatus
  
  /**
    * The operation is in skipped.
    */
  @js.native
  sealed trait Skipped extends RestApiResponseStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RestApiResponseStatus with Double] = js.native
  /* 0 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /* 1 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 2 */ @js.native
  object Inprogress extends TopLevel[Inprogress with Double]
  
  /* 3 */ @js.native
  object Skipped extends TopLevel[Skipped with Double]
  
}

