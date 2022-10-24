package typings.useGestureCore

import typings.std.EventTarget
import typings.std.Window
import typings.useGestureCore.anon.CapturePassive
import typings.useGestureCore.anon.Passive
import typings.useGestureCore.distDeclarationsSrcTypesUtilsMod.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcConfigSharedConfigResolverMod {
  
  object sharedConfigResolver {
    
    @JSImport("@use-gesture/core/dist/declarations/src/config/sharedConfigResolver", "sharedConfigResolver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def enabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")().asInstanceOf[Boolean]
    inline def enabled(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def eventOptions(): CapturePassive = ^.asInstanceOf[js.Dynamic].applyDynamic("eventOptions")().asInstanceOf[CapturePassive]
    inline def eventOptions(param0: Passive): CapturePassive = ^.asInstanceOf[js.Dynamic].applyDynamic("eventOptions")(param0.asInstanceOf[js.Any]).asInstanceOf[CapturePassive]
    
    inline def target(value: Target): js.UndefOr[js.Function0[EventTarget | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("target")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Function0[EventTarget | Null]]]
    
    inline def transform(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def window(): js.UndefOr[Window & (/* globalThis */ Any)] = ^.asInstanceOf[js.Dynamic].applyDynamic("window")().asInstanceOf[js.UndefOr[Window & (/* globalThis */ Any)]]
    inline def window(value: Window & (/* globalThis */ Any)): js.UndefOr[Window & (/* globalThis */ Any)] = ^.asInstanceOf[js.Dynamic].applyDynamic("window")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Window & (/* globalThis */ Any)]]
  }
}
