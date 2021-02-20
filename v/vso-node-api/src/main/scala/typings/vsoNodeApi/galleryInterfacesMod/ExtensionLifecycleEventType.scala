package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionLifecycleEventType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionLifecycleEventType")
@js.native
object ExtensionLifecycleEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionLifecycleEventType with Double] = js.native
  
  @js.native
  sealed trait Acquisition extends ExtensionLifecycleEventType
  /* 4 */ val Acquisition: typings.vsoNodeApi.galleryInterfacesMod.ExtensionLifecycleEventType.Acquisition with Double = js.native
  
  @js.native
  sealed trait Install extends ExtensionLifecycleEventType
  /* 2 */ val Install: typings.vsoNodeApi.galleryInterfacesMod.ExtensionLifecycleEventType.Install with Double = js.native
  
  @js.native
  sealed trait Other extends ExtensionLifecycleEventType
  /* 999 */ val Other: typings.vsoNodeApi.galleryInterfacesMod.ExtensionLifecycleEventType.Other with Double = js.native
  
  @js.native
  sealed trait Review extends ExtensionLifecycleEventType
  /* 3 */ val Review: typings.vsoNodeApi.galleryInterfacesMod.ExtensionLifecycleEventType.Review with Double = js.native
  
  @js.native
  sealed trait Sales extends ExtensionLifecycleEventType
  /* 5 */ val Sales: typings.vsoNodeApi.galleryInterfacesMod.ExtensionLifecycleEventType.Sales with Double = js.native
  
  @js.native
  sealed trait Uninstall extends ExtensionLifecycleEventType
  /* 1 */ val Uninstall: typings.vsoNodeApi.galleryInterfacesMod.ExtensionLifecycleEventType.Uninstall with Double = js.native
}
