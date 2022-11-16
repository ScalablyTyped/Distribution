package typings.typeFest

import typings.std.Exclude
import typings.std.Record
import typings.typeFest.sourceInternalMod.KeysOfUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceExactMod {
  
  /**
  Extract the element of an array that also works for array union.
  Returns `never` if T is not an array.
  It creates a type-safe way to access the element type of `unknown` type.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends std.Array<unknown> ? T[0] : never
    }}}
    */
  @js.native
  trait ArrayElement[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    // Convert union of array to array of union: A[] & B[] => (A & B)[]
  ParameterType extends std.Array<unknown> ? std.Array<type-fest.type-fest/source/exact.Exact<type-fest.type-fest/source/exact.ArrayElement<ParameterType>, type-fest.type-fest/source/exact.ArrayElement<InputType>>> : ParameterType extends std.Array<unknown> ? std.ReadonlyArray<type-fest.type-fest/source/exact.Exact<type-fest.type-fest/source/exact.ArrayElement<ParameterType>, type-fest.type-fest/source/exact.ArrayElement<InputType>>> : ParameterType extends object ? type-fest.type-fest/source/exact.ExactObject<ParameterType, InputType> : ParameterType
    }}}
    */
  type Exact[ParameterType, InputType] = ParameterType
  
  /**
  Create a type from `ParameterType` and `InputType` and change keys exclusive to `InputType` to `never`.
  - Generate a list of keys that exists in `InputType` but not in `ParameterType`.
  - Mark these excess keys as `never`.
  */
  type ExactObject[ParameterType, InputType] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof ParameterType ]: type-fest.type-fest/source/exact.Exact<ParameterType[Key], type-fest.type-fest/source/exact.ObjectValue<InputType, Key>>} */ js.Any) & (Record[Exclude[/* keyof InputType */ String, KeysOfUnion[ParameterType]], scala.Nothing])
  
  /**
  Extract the object field type if T is an object and K is a key of T, return `never` otherwise.
  It creates a type-safe way to access the member type of `unknown` type.
  */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    K extends keyof T ? T[K] : never
    }}}
    */
  @js.native
  trait ObjectValue[T, K] extends StObject
}
