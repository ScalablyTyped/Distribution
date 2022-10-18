package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RestApiResponseStatus extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "RestApiResponseStatus")
@js.native
object RestApiResponseStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RestApiResponseStatus & Double] = js.native
  
  /**
    * The operation is completed.
    */
  @js.native
  sealed trait Completed
    extends StObject
       with RestApiResponseStatus
  /* 0 */ val Completed: typings.vsoNodeApi.interfacesGalleryInterfacesMod.RestApiResponseStatus.Completed & Double = js.native
  
  /**
    * The operation is failed.
    */
  @js.native
  sealed trait Failed
    extends StObject
       with RestApiResponseStatus
  /* 1 */ val Failed: typings.vsoNodeApi.interfacesGalleryInterfacesMod.RestApiResponseStatus.Failed & Double = js.native
  
  /**
    * The operation is in progress.
    */
  @js.native
  sealed trait Inprogress
    extends StObject
       with RestApiResponseStatus
  /* 2 */ val Inprogress: typings.vsoNodeApi.interfacesGalleryInterfacesMod.RestApiResponseStatus.Inprogress & Double = js.native
  
  /**
    * The operation is in skipped.
    */
  @js.native
  sealed trait Skipped
    extends StObject
       with RestApiResponseStatus
  /* 3 */ val Skipped: typings.vsoNodeApi.interfacesGalleryInterfacesMod.RestApiResponseStatus.Skipped & Double = js.native
}
