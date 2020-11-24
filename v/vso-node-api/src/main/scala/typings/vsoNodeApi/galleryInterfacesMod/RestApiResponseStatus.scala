package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RestApiResponseStatus extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "RestApiResponseStatus")
@js.native
object RestApiResponseStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RestApiResponseStatus with Double] = js.native
  
  /**
    * The operation is completed.
    */
  @js.native
  sealed trait Completed extends RestApiResponseStatus
  /* 0 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /**
    * The operation is failed.
    */
  @js.native
  sealed trait Failed extends RestApiResponseStatus
  /* 1 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /**
    * The operation is in progress.
    */
  @js.native
  sealed trait Inprogress extends RestApiResponseStatus
  /* 2 */ @js.native
  object Inprogress extends TopLevel[Inprogress with Double]
  
  /**
    * The operation is in skipped.
    */
  @js.native
  sealed trait Skipped extends RestApiResponseStatus
  /* 3 */ @js.native
  object Skipped extends TopLevel[Skipped with Double]
}
