package typings.svelte

import typings.std.Element
import typings.svelte.anon.CrossfadeParamsfallbackno
import typings.svelte.anon.CrossfadeParamskeyany
import typings.svelte.anon.SVGElementgetTotalLengthn
import typings.svelte.typesRuntimeTransitionMod.BlurParams
import typings.svelte.typesRuntimeTransitionMod.DrawParams
import typings.svelte.typesRuntimeTransitionMod.FadeParams
import typings.svelte.typesRuntimeTransitionMod.FlyParams
import typings.svelte.typesRuntimeTransitionMod.ScaleParams
import typings.svelte.typesRuntimeTransitionMod.SlideParams
import typings.svelte.typesRuntimeTransitionMod.TransitionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object transitionMod {
  
  @JSImport("svelte/transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blur(node: Element): TransitionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("blur")(node.asInstanceOf[js.Any]).asInstanceOf[TransitionConfig]
  inline def blur(node: Element, hasDelayDurationEasingAmountOpacity: BlurParams): TransitionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(node.asInstanceOf[js.Any], hasDelayDurationEasingAmountOpacity.asInstanceOf[js.Any])).asInstanceOf[TransitionConfig]
  
  inline def crossfade(hasFallbackDefaults: CrossfadeParamsfallbackno): js.Tuple2[
    js.Function2[
      /* node */ Element, 
      /* params */ CrossfadeParamskeyany, 
      js.Function0[TransitionConfig]
    ], 
    js.Function2[
      /* node */ Element, 
      /* params */ CrossfadeParamskeyany, 
      js.Function0[TransitionConfig]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("crossfade")(hasFallbackDefaults.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.Function2[
      /* node */ Element, 
      /* params */ CrossfadeParamskeyany, 
      js.Function0[TransitionConfig]
    ], 
    js.Function2[
      /* node */ Element, 
      /* params */ CrossfadeParamskeyany, 
      js.Function0[TransitionConfig]
    ]
  ]]
  
  inline def draw(node: SVGElementgetTotalLengthn): TransitionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("draw")(node.asInstanceOf[js.Any]).asInstanceOf[TransitionConfig]
  inline def draw(node: SVGElementgetTotalLengthn, hasDelaySpeedDurationEasing: DrawParams): TransitionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("draw")(node.asInstanceOf[js.Any], hasDelaySpeedDurationEasing.asInstanceOf[js.Any])).asInstanceOf[TransitionConfig]
  
  inline def fade(node: Element): TransitionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fade")(node.asInstanceOf[js.Any]).asInstanceOf[TransitionConfig]
  inline def fade(node: Element, hasDelayDurationEasing: FadeParams): TransitionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("fade")(node.asInstanceOf[js.Any], hasDelayDurationEasing.asInstanceOf[js.Any])).asInstanceOf[TransitionConfig]
  
  inline def fly(node: Element): TransitionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fly")(node.asInstanceOf[js.Any]).asInstanceOf[TransitionConfig]
  inline def fly(node: Element, hasDelayDurationEasingXYOpacity: FlyParams): TransitionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(node.asInstanceOf[js.Any], hasDelayDurationEasingXYOpacity.asInstanceOf[js.Any])).asInstanceOf[TransitionConfig]
  
  inline def scale(node: Element): TransitionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("scale")(node.asInstanceOf[js.Any]).asInstanceOf[TransitionConfig]
  inline def scale(node: Element, hasDelayDurationEasingStartOpacity: ScaleParams): TransitionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(node.asInstanceOf[js.Any], hasDelayDurationEasingStartOpacity.asInstanceOf[js.Any])).asInstanceOf[TransitionConfig]
  
  inline def slide(node: Element): TransitionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("slide")(node.asInstanceOf[js.Any]).asInstanceOf[TransitionConfig]
  inline def slide(node: Element, hasDelayDurationEasing: SlideParams): TransitionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("slide")(node.asInstanceOf[js.Any], hasDelayDurationEasing.asInstanceOf[js.Any])).asInstanceOf[TransitionConfig]
}
