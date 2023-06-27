package typings.vueComponentTypeHelpers

import org.scalablytyped.runtime.Shortcut
import typings.vueComponentTypeHelpers.vueComponentTypeHelpersInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-component-type-helpers", JSImport.Default)
  @js.native
  val default: String = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends new (): {  $emit :infer E} ? std.NonNullable<E> : T extends (props : any, ctx : {  emit :infer E}, args : any): any ? std.NonNullable<E> : {}
    }}}
    */
  @js.native
  trait ComponentEmit[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends new (): infer E ? E : T extends (props : any, ctx : {expose (exposed : infer E): any}, args : any): any ? std.NonNullable<E> : {}
    }}}
    */
  @js.native
  trait ComponentExposed[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends new (): {  $props :infer P} ? std.NonNullable<P> : T extends (props : infer P, args : any): any ? P : {}
    }}}
    */
  @js.native
  trait ComponentProps[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends new (): {  $slots :infer S} ? std.NonNullable<S> : T extends (props : any, ctx : {  slots :infer S}, args : any): any ? std.NonNullable<S> : {}
    }}}
    */
  @js.native
  trait ComponentSlots[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends new (): {} ? 1 : T extends (args : any): any ? 2 : 0
    }}}
    */
  type ComponentType[T] = `1`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends new (): {  $scopedSlots :infer S} ? std.NonNullable<S> : T extends (props : any, ctx : {  slots :infer S}, args : any): any ? std.NonNullable<S> : {}
    }}}
    */
  @js.native
  trait Vue2ComponentSlots[T] extends StObject
  
  type _To = String
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: String = default
}
