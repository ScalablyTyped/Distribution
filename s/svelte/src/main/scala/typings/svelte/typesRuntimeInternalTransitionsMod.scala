package typings.svelte

import typings.std.Element
import typings.std.ElementCSSInlineStyle
import typings.svelte.anon.End
import typings.svelte.anon.Invalidate
import typings.svelte.anon.`0`
import typings.svelte.svelteInts.`1`
import typings.svelte.typesRuntimeInternalComponentMod.Fragment
import typings.svelte.typesRuntimeTransitionMod.TransitionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeInternalTransitionsMod {
  
  @JSImport("svelte/types/runtime/internal/transitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkOutros(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("check_outros")().asInstanceOf[Unit]
  
  inline def createBidirectionalTransition(node: Element & ElementCSSInlineStyle, fn: TransitionFn, params: Any, intro: Boolean): End = (^.asInstanceOf[js.Dynamic].applyDynamic("create_bidirectional_transition")(node.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], params.asInstanceOf[js.Any], intro.asInstanceOf[js.Any])).asInstanceOf[End]
  
  inline def createInTransition(node: Element & ElementCSSInlineStyle, fn: TransitionFn, params: Any): Invalidate = (^.asInstanceOf[js.Dynamic].applyDynamic("create_in_transition")(node.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Invalidate]
  
  inline def createOutTransition(node: Element & ElementCSSInlineStyle, fn: TransitionFn, params: Any): `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("create_out_transition")(node.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[`0`]
  
  inline def groupOutros(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("group_outros")().asInstanceOf[Unit]
  
  inline def transitionIn(block: Fragment): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("transition_in")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def transitionIn(block: Fragment, local: typings.svelte.svelteInts.`0` | `1`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transition_in")(block.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transitionOut(block: Fragment, local: typings.svelte.svelteInts.`0` | `1`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transition_out")(block.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transitionOut(
    block: Fragment,
    local: typings.svelte.svelteInts.`0` | `1`,
    detach: typings.svelte.svelteInts.`0` | `1`
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transition_out")(block.asInstanceOf[js.Any], local.asInstanceOf[js.Any], detach.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transitionOut(
    block: Fragment,
    local: typings.svelte.svelteInts.`0` | `1`,
    detach: typings.svelte.svelteInts.`0` | `1`,
    callback: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transition_out")(block.asInstanceOf[js.Any], local.asInstanceOf[js.Any], detach.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transitionOut(block: Fragment, local: typings.svelte.svelteInts.`0` | `1`, detach: Unit, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transition_out")(block.asInstanceOf[js.Any], local.asInstanceOf[js.Any], detach.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type INTRO = `1`
  
  type OUTRO = typings.svelte.svelteInts.`0`
  
  type TransitionFn = js.Function2[/* node */ Element, /* params */ Any, TransitionConfig]
}
