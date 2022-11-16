package typings.typeFest

import typings.typeFest.typeFestInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceNumericMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends type-fest.type-fest/source/numeric.PositiveInfinity | type-fest.type-fest/source/numeric.NegativeInfinity ? never : T
    }}}
    */
  type Finite[T /* <: Double */] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends type-fest.type-fest/source/numeric.Integer<T> ? never : T
    }}}
    */
  type Float[T /* <: Double */] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    / * template literal string: ${T} * / string extends / * template literal string: ${bigint} * / string ? T : never
    }}}
    */
  type Integer[T /* <: Double */] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends type-fest.type-fest/source/numeric.Zero ? never : / * template literal string: ${T} * / string extends / * template literal string: -${string} * / string ? T : never
    }}}
    */
  type Negative[T /* <: Numeric */] = T
  
  type NegativeFloat[T /* <: Double */] = Negative[Float[T]]
  
  type NegativeInfinity = /* -1e999 */ Double
  
  type NegativeInteger[T /* <: Double */] = Negative[Integer[T]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends type-fest.type-fest/source/numeric.Zero ? T : type-fest.type-fest/source/numeric.Negative<T> extends never ? T : never
    }}}
    */
  type NonNegative[T /* <: Numeric */] = T
  
  type NonNegativeInteger[T /* <: Double */] = NonNegative[Integer[T]]
  
  type Numeric = Double | js.BigInt
  
  type PositiveInfinity = /* 1e999 */ Double
  
  type Zero = `0`
}
