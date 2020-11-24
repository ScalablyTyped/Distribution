package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtensionLifecycleEventType extends js.Object
@JSImport("vso-node-api/interfaces/GalleryInterfaces", "ExtensionLifecycleEventType")
@js.native
object ExtensionLifecycleEventType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionLifecycleEventType with Double] = js.native
  
  @js.native
  sealed trait Acquisition extends ExtensionLifecycleEventType
  /* 4 */ @js.native
  object Acquisition extends TopLevel[Acquisition with Double]
  
  @js.native
  sealed trait Install extends ExtensionLifecycleEventType
  /* 2 */ @js.native
  object Install extends TopLevel[Install with Double]
  
  @js.native
  sealed trait Other extends ExtensionLifecycleEventType
  /* 999 */ @js.native
  object Other extends TopLevel[Other with Double]
  
  @js.native
  sealed trait Review extends ExtensionLifecycleEventType
  /* 3 */ @js.native
  object Review
    extends TopLevel[
          typings.vsoNodeApi.galleryInterfacesMod.ExtensionLifecycleEventType.Review with Double
        ]
  
  @js.native
  sealed trait Sales extends ExtensionLifecycleEventType
  /* 5 */ @js.native
  object Sales extends TopLevel[Sales with Double]
  
  @js.native
  sealed trait Uninstall extends ExtensionLifecycleEventType
  /* 1 */ @js.native
  object Uninstall extends TopLevel[Uninstall with Double]
}
