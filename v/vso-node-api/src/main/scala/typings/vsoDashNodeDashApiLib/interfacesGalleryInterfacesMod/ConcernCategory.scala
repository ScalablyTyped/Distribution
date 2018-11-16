package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConcernCategory extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ConcernCategory")
@js.native
object ConcernCategory extends js.Object {
  @js.native
  sealed trait Abusive
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ConcernCategory
  
  @js.native
  sealed trait General
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ConcernCategory
  
  @js.native
  sealed trait Spam
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ConcernCategory
  
  /* 2 */ val Abusive: Abusive with scala.Double = js.native
  /* 1 */ val General: General with scala.Double = js.native
  /* 4 */ val Spam: Spam with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ConcernCategory with scala.Double
  ] = js.native
}

