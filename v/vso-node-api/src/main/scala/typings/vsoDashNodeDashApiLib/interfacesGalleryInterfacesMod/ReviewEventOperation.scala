package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReviewEventOperation extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ReviewEventOperation")
@js.native
object ReviewEventOperation extends js.Object {
  @js.native
  sealed trait Create
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewEventOperation
  
  @js.native
  sealed trait Delete
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewEventOperation
  
  @js.native
  sealed trait Update
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewEventOperation
  
  /* 1 */ val Create: Create with scala.Double = js.native
  /* 3 */ val Delete: Delete with scala.Double = js.native
  /* 2 */ val Update: Update with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ReviewEventOperation with scala.Double
  ] = js.native
}

