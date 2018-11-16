package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExtensionLifecycleEventType extends js.Object

@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionLifecycleEventType")
@js.native
object ExtensionLifecycleEventType extends js.Object {
  @js.native
  sealed trait Acquisition
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType
  
  @js.native
  sealed trait Install
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType
  
  @js.native
  sealed trait Other
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType
  
  @js.native
  sealed trait Review
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType
  
  @js.native
  sealed trait Sales
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType
  
  @js.native
  sealed trait Uninstall
    extends vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType
  
  /* 4 */ val Acquisition: Acquisition with scala.Double = js.native
  /* 2 */ val Install: Install with scala.Double = js.native
  /* 999 */ val Other: Other with scala.Double = js.native
  /* 3 */ val Review: Review with scala.Double = js.native
  /* 5 */ val Sales: Sales with scala.Double = js.native
  /* 1 */ val Uninstall: Uninstall with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType with scala.Double
  ] = js.native
}

