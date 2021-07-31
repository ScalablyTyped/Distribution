package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReviewEventOperation extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewEventOperation")
@js.native
object ReviewEventOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewEventOperation & Double] = js.native
  
  @js.native
  sealed trait Create
    extends StObject
       with ReviewEventOperation
  /* 1 */ val Create: typings.vsoNodeApi.galleryInterfacesMod.ReviewEventOperation.Create & Double = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with ReviewEventOperation
  /* 3 */ val Delete: typings.vsoNodeApi.galleryInterfacesMod.ReviewEventOperation.Delete & Double = js.native
  
  @js.native
  sealed trait Update
    extends StObject
       with ReviewEventOperation
  /* 2 */ val Update: typings.vsoNodeApi.galleryInterfacesMod.ReviewEventOperation.Update & Double = js.native
}
