package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionStatisticOperation extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionStatisticOperation")
@js.native
object ExtensionStatisticOperation extends js.Object {
  @js.native
  sealed trait Decrement extends ExtensionStatisticOperation
  
  @js.native
  sealed trait Delete extends ExtensionStatisticOperation
  
  @js.native
  sealed trait Increment extends ExtensionStatisticOperation
  
  @js.native
  sealed trait None extends ExtensionStatisticOperation
  
  @js.native
  sealed trait Set extends ExtensionStatisticOperation
  
  /* 3 */ val Decrement: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionStatisticOperation.Decrement with Double = js.native
  /* 4 */ val Delete: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionStatisticOperation.Delete with Double = js.native
  /* 2 */ val Increment: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionStatisticOperation.Increment with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionStatisticOperation.None with Double = js.native
  /* 1 */ val Set: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionStatisticOperation.Set with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionStatisticOperation with Double] = js.native
}

