package typings.svelte

import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.Element
import typings.std.ElementCSSInlineStyle
import typings.svelte.animateMod.AnimationConfig
import typings.svelte.anon.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationsMod {
  
  @JSImport("svelte/types/runtime/internal/animations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addTransform(node: Element & ElementCSSInlineStyle, a: PositionRect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add_transform")(node.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createAnimation(node: Element & ElementCSSInlineStyle, from: PositionRect, fn: AnimationFn, params: Any): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("create_animation")(node.asInstanceOf[js.Any], from.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def fixPosition(node: Element & ElementCSSInlineStyle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fix_position")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type AnimationFn = js.Function3[/* node */ Element, /* hasFromTo */ To, /* params */ Any, AnimationConfig]
  
  type PositionRect = DOMRect | ClientRect
}
