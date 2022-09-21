package typings.useGestureCore

import typings.std.AddEventListenerOptions
import typings.useGestureCore.anon.Capture
import typings.useGestureCore.anon.Shared
import typings.useGestureCore.stateMod.State
import typings.useGestureCore.utilsMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonConfigResolverMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/config/commonConfigResolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@use-gesture/core/dist/declarations/src/config/commonConfigResolver", "DEFAULT_RUBBERBAND")
  @js.native
  val DEFAULT_RUBBERBAND: /* 0.15 */ Double = js.native
  
  object commonConfigResolver {
    
    @JSImport("@use-gesture/core/dist/declarations/src/config/commonConfigResolver", "commonConfigResolver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def enabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")().asInstanceOf[Boolean]
    inline def enabled(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("enabled")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def eventOptions(value: Unit, _k: String, config: Shared): Capture = (^.asInstanceOf[js.Dynamic].applyDynamic("eventOptions")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Capture]
    inline def eventOptions(value: AddEventListenerOptions, _k: String, config: Shared): Capture = (^.asInstanceOf[js.Dynamic].applyDynamic("eventOptions")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Capture]
    
    inline def from(value: js.Function1[/* s */ State, Vector2]): js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])]]
    inline def from(value: Double): js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])]]
    inline def from(value: Vector2): js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function1[/* s */ State, Vector2])]]
    
    inline def preventDefault(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")().asInstanceOf[Boolean]
    inline def preventDefault(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventDefault")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def rubberband(): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")().asInstanceOf[Vector2]
    inline def rubberband(value: Boolean): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")(value.asInstanceOf[js.Any]).asInstanceOf[Vector2]
    inline def rubberband(value: Double): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")(value.asInstanceOf[js.Any]).asInstanceOf[Vector2]
    inline def rubberband(value: Vector2): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")(value.asInstanceOf[js.Any]).asInstanceOf[Vector2]
    
    inline def threshold(value: Any): js.Tuple2[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("threshold")(value.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Any, Any]]
    
    inline def transform(value: Any, _k: String, config: Shared): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(value.asInstanceOf[js.Any], _k.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def triggerAllEvents(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerAllEvents")().asInstanceOf[Boolean]
    inline def triggerAllEvents(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerAllEvents")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def identity(v: Vector2): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(v.asInstanceOf[js.Any]).asInstanceOf[Vector2]
}
