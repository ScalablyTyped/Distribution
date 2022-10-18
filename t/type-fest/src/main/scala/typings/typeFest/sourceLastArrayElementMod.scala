package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceLastArrayElementMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    ValueType extends [infer ElementType] ? ElementType : ValueType extends [infer _, ...infer Tail] ? type-fest.type-fest/source/last-array-element.LastArrayElement<Tail> : ValueType extends std.ReadonlyArray<infer ElementType> ? ElementType : never
    }}}
    */
  @js.native
  trait LastArrayElement[ValueType /* <: js.Array[Any] */] extends StObject
}
