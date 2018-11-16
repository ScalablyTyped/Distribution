package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionStatisticOperation extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionStatisticOperation")
@js.native
object ExtensionStatisticOperation extends js.Object {
  @js.native
  sealed trait Decrement
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionStatisticOperation
  
  @js.native
  sealed trait Delete
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionStatisticOperation
  
  @js.native
  sealed trait Increment
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionStatisticOperation
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionStatisticOperation
  
  @js.native
  sealed trait Set
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionStatisticOperation
  
  /* 3 */ val Decrement: Decrement with scala.Double = js.native
  /* 4 */ val Delete: Delete with scala.Double = js.native
  /* 2 */ val Increment: Increment with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Set: Set with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionStatisticOperation with scala.Double
  ] = js.native
}

