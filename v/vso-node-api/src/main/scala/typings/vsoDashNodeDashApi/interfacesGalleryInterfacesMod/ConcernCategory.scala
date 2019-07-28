package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConcernCategory extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ConcernCategory")
@js.native
object ConcernCategory extends js.Object {
  @js.native
  sealed trait Abusive extends ConcernCategory
  
  @js.native
  sealed trait General extends ConcernCategory
  
  @js.native
  sealed trait Spam extends ConcernCategory
  
  /* 2 */ val Abusive: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ConcernCategory.Abusive with Double = js.native
  /* 1 */ val General: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ConcernCategory.General with Double = js.native
  /* 4 */ val Spam: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ConcernCategory.Spam with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConcernCategory with Double] = js.native
}

