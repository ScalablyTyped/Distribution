package typings.svelte

import typings.std.Element
import typings.svelte.anon.From
import typings.svelte.typesRuntimeAnimateMod.AnimationConfig
import typings.svelte.typesRuntimeAnimateMod.FlipParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object animateMod {
  
  @JSImport("svelte/animate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flip(node: Element, hasFromTo: From): AnimationConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("flip")(node.asInstanceOf[js.Any], hasFromTo.asInstanceOf[js.Any])).asInstanceOf[AnimationConfig]
  inline def flip(node: Element, hasFromTo: From, params: FlipParams): AnimationConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("flip")(node.asInstanceOf[js.Any], hasFromTo.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[AnimationConfig]
}
