package typings.typeFest

import typings.typeFest.typeFestInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceNumericMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends type-fest.type-fest/source/numeric.PositiveInfinity | type-fest.type-fest/source/numeric.NegativeInfinity ? never : T
    }}}
    */
  @js.native
  trait Finite[T /* <: Double */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends type-fest.type-fest/source/numeric.Integer<T> ? never : T
    }}}
    */
  @js.native
  trait Float[T /* <: Double */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    / * template literal string: ${T} * / string extends / * template literal string: ${bigint} * / string ? T : never
    }}}
    */
  @js.native
  trait Integer[T /* <: Double */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends type-fest.type-fest/source/numeric.Zero ? never : / * template literal string: ${T} * / string extends / * template literal string: -${string} * / string ? T : never
    }}}
    */
  @js.native
  trait Negative[T /* <: Numeric */] extends StObject
  
  type NegativeFloat[T /* <: Double */] = Negative[Float[T]]
  
  type NegativeInfinity = /* -1e999 */ Double
  
  type NegativeInteger[T /* <: Double */] = Negative[Integer[T]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends type-fest.type-fest/source/numeric.Zero ? T : type-fest.type-fest/source/numeric.Negative<T> extends never ? T : never
    }}}
    */
  @js.native
  trait NonNegative[T /* <: Numeric */] extends StObject
  
  type NonNegativeInteger[T /* <: Double */] = NonNegative[Integer[T]]
  
  type Numeric = Double | js.BigInt
  
  type PositiveInfinity = /* 1e999 */ Double
  
  type Zero = `0`
}
