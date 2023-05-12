package typings.typeFest

import typings.typeFest.sourceInternalMod.IsNotFalse
import typings.typeFest.sourceNumericMod.Numeric
import typings.typeFest.sourcePrimitiveMod.Primitive
import typings.typeFest.typeFestBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceIsLiteralMod {
  
  type IsBooleanLiteral[T] = LiteralCheck[T, Boolean]
  
  type IsLiteral[T /* <: Primitive */] = IsNotFalse[IsLiteralUnion[T]]
  
  /** Helper type for `IsLiteral`. */
  type IsLiteralUnion[T] = IsStringLiteral[T] | IsNumericLiteral[T] | IsBooleanLiteral[T] | IsSymbolLiteral[T]
  
  type IsNumericLiteral[T] = LiteralChecks[T, Numeric]
  
  type IsStringLiteral[T] = LiteralCheck[T, String]
  
  type IsSymbolLiteral[T] = LiteralCheck[T, js.Symbol]
  
  /**
  Returns a boolean for whether the given type `T` is the specified `LiteralType`.
  @link https://stackoverflow.com/a/52806744/10292952
  @example
  ```
  LiteralCheck<1, number>
  //=> true
  LiteralCheck<number, number>
  //=> false
  LiteralCheck<1, string>
  //=> false
  ```
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    type-fest.type-fest/source/is-never.IsNever<T> extends false ? [T] extends [LiteralType] ? [LiteralType] extends [T] ? false : true : false : false
    }}}
    */
  type LiteralCheck[T, LiteralType /* <: Primitive */] = `false`
  
  /**
  Returns a boolean for whether the given type `T` is one of the specified literal types in `LiteralUnionType`.
  @example
  ```
  LiteralChecks<1, Numeric>
  //=> true
  LiteralChecks<1n, Numeric>
  //=> true
  LiteralChecks<bigint, Numeric>
  //=> false
  ```
  */
  type LiteralChecks[T, LiteralUnionType] = // Conditional type to force union distribution.
  // If `T` is none of the literal types in the union `LiteralUnionType`, then `LiteralCheck<T, LiteralType>` will evaluate to `false` for the whole union.
  // If `T` is one of the literal types in the union, it will evaluate to `boolean` (i.e. `true | false`)
  IsNotFalse[
    /* import warning: importer.ImportType#apply Failed type conversion: LiteralUnionType extends type-fest.type-fest/source/primitive.Primitive ? type-fest.type-fest/source/is-literal.LiteralCheck<T, LiteralUnionType> : never */ js.Any
  ]
}
