package typings.vsoNodeApi.interfacesGalleryInterfacesMod

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
  /* 4 */ val Acquisition: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Acquisition & Double = js.native
  
  @js.native
  sealed trait Install
    extends StObject
       with ExtensionLifecycleEventType
  /* 2 */ val Install: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Install & Double = js.native
  
  @js.native
  sealed trait Other
    extends StObject
       with ExtensionLifecycleEventType
  /* 999 */ val Other: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Other & Double = js.native
  
  @js.native
  sealed trait Review
    extends StObject
       with ExtensionLifecycleEventType
  /* 3 */ val Review: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Review & Double = js.native
  
  @js.native
  sealed trait Sales
    extends StObject
       with ExtensionLifecycleEventType
  /* 5 */ val Sales: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Sales & Double = js.native
  
  @js.native
  sealed trait Uninstall
    extends StObject
       with ExtensionLifecycleEventType
  /* 1 */ val Uninstall: typings.vsoNodeApi.interfacesGalleryInterfacesMod.ExtensionLifecycleEventType.Uninstall & Double = js.native
}
