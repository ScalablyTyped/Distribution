package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReviewEventOperation extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewEventOperation")
@js.native
object ReviewEventOperation extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewEventOperation with Double] = js.native
  
  @js.native
  sealed trait Create extends ReviewEventOperation
  /* 1 */ val Create: typings.vsoNodeApi.galleryInterfacesMod.ReviewEventOperation.Create with Double = js.native
  
  @js.native
  sealed trait Delete extends ReviewEventOperation
  /* 3 */ val Delete: typings.vsoNodeApi.galleryInterfacesMod.ReviewEventOperation.Delete with Double = js.native
  
  @js.native
  sealed trait Update extends ReviewEventOperation
  /* 2 */ val Update: typings.vsoNodeApi.galleryInterfacesMod.ReviewEventOperation.Update with Double = js.native
}
