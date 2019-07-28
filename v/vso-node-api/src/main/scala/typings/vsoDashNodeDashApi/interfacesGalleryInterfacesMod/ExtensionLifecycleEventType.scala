package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionLifecycleEventType extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionLifecycleEventType")
@js.native
object ExtensionLifecycleEventType extends js.Object {
  @js.native
  sealed trait Acquisition extends ExtensionLifecycleEventType
  
  @js.native
  sealed trait Install extends ExtensionLifecycleEventType
  
  @js.native
  sealed trait Other extends ExtensionLifecycleEventType
  
  @js.native
  sealed trait Review extends ExtensionLifecycleEventType
  
  @js.native
  sealed trait Sales extends ExtensionLifecycleEventType
  
  @js.native
  sealed trait Uninstall extends ExtensionLifecycleEventType
  
  /* 4 */ val Acquisition: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Acquisition with Double = js.native
  /* 2 */ val Install: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Install with Double = js.native
  /* 999 */ val Other: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Other with Double = js.native
  /* 3 */ val Review: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Review with Double = js.native
  /* 5 */ val Sales: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Sales with Double = js.native
  /* 1 */ val Uninstall: typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Uninstall with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionLifecycleEventType with Double] = js.native
}

