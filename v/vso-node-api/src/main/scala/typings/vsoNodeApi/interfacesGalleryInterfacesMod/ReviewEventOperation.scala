package typings.vsoNodeApi.interfacesGalleryInterfacesMod

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
  /* 1 */ val Create: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewEventOperation.Create & Double = js.native
  
  @js.native
  sealed trait Delete
    extends StObject
       with ReviewEventOperation
  /* 3 */ val Delete: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewEventOperation.Delete & Double = js.native
  
  @js.native
  sealed trait Update
    extends StObject
       with ReviewEventOperation
  /* 2 */ val Update: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ReviewEventOperation.Update & Double = js.native
}
