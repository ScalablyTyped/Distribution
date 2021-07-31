package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionLifecycleEventType extends StObject
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionLifecycleEventType")
@js.native
object ExtensionLifecycleEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionLifecycleEventType & Double] = js.native
  
  @js.native
  sealed trait Acquisition
    extends StObject
       with ExtensionLifecycleEventType
  /* 4 */ val Acquisition: typings.vsoNodeApi.galleryInterfacesMod.ExtensionLifecycleEventType.Acquisition & Double = js.native
  
  @js.native
  sealed trait Install
    extends StObject
       with ExtensionLifecycleEventType
  /* 2 */ val Install: typings.vsoNodeApi.galleryInterfacesMod.ExtensionLifecycleEventType.Install & Double = js.native
  
  @js.native
  sealed trait Other
    extends StObject
       with ExtensionLifecycleEventType
  /* 999 */ val Other: typings.vsoNodeApi.galleryInterfacesMod.ExtensionLifecycleEventType.Other & Double = js.native
  
  @js.native
  sealed trait Review
    extends StObject
       with ExtensionLifecycleEventType
  /* 3 */ val Review: typings.vsoNodeApi.galleryInterfacesMod.ExtensionLifecycleEventType.Review & Double = js.native
  
  @js.native
  sealed trait Sales
    extends StObject
       with ExtensionLifecycleEventType
  /* 5 */ val Sales: typings.vsoNodeApi.galleryInterfacesMod.ExtensionLifecycleEventType.Sales & Double = js.native
  
  @js.native
  sealed trait Uninstall
    extends StObject
       with ExtensionLifecycleEventType
  /* 1 */ val Uninstall: typings.vsoNodeApi.galleryInterfacesMod.ExtensionLifecycleEventType.Uninstall & Double = js.native
}
