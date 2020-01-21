package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExtensionLifecycleEventType with Double] = js.native
  /* 4 */ @js.native
  object Acquisition extends TopLevel[Acquisition with Double]
  
  /* 2 */ @js.native
  object Install extends TopLevel[Install with Double]
  
  /* 999 */ @js.native
  object Other extends TopLevel[Other with Double]
  
  /* 3 */ @js.native
  object Review
    extends TopLevel[
          typings.vsoNodeApi.galleryInterfacesMod.ExtensionLifecycleEventType.Review with Double
        ]
  
  /* 5 */ @js.native
  object Sales extends TopLevel[Sales with Double]
  
  /* 1 */ @js.native
  object Uninstall extends TopLevel[Uninstall with Double]
  
}

