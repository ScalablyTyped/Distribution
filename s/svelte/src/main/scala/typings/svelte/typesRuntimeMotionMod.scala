package typings.svelte

import typings.svelte.typesRuntimeMotionSpringMod.SpringOpts
import typings.svelte.typesRuntimeMotionSpringMod.Spring_
import typings.svelte.typesRuntimeMotionTweenedMod.Options
import typings.svelte.typesRuntimeMotionTweenedMod.Tweened_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeMotionMod {
  
  @JSImport("svelte/types/runtime/motion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def spring[T](): Spring_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("spring")().asInstanceOf[Spring_[T]]
  inline def spring[T](value: T): Spring_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any]).asInstanceOf[Spring_[T]]
  inline def spring[T](value: T, opts: SpringOpts): Spring_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Spring_[T]]
  inline def spring[T](value: Unit, opts: SpringOpts): Spring_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("spring")(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Spring_[T]]
  
  inline def tweened[T](): Tweened_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tweened")().asInstanceOf[Tweened_[T]]
  inline def tweened[T](value: T): Tweened_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("tweened")(value.asInstanceOf[js.Any]).asInstanceOf[Tweened_[T]]
  inline def tweened[T](value: T, defaults: Options[T]): Tweened_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tweened")(value.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Tweened_[T]]
  inline def tweened[T](value: Unit, defaults: Options[T]): Tweened_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tweened")(value.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Tweened_[T]]
}
