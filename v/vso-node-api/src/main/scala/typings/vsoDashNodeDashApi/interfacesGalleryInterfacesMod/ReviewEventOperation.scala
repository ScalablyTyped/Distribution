package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReviewEventOperation extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewEventOperation")
@js.native
object ReviewEventOperation extends js.Object {
  @js.native
  sealed trait Create extends ReviewEventOperation
  
  @js.native
  sealed trait Delete extends ReviewEventOperation
  
  @js.native
  sealed trait Update extends ReviewEventOperation
  
  /* 1 */ val Create: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewEventOperation.Create with Double = js.native
  /* 3 */ val Delete: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewEventOperation.Delete with Double = js.native
  /* 2 */ val Update: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ReviewEventOperation.Update with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReviewEventOperation with Double] = js.native
}

