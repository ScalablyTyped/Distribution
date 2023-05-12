package typings.typeFest

import typings.std.Exclude
import typings.std.Record
import typings.typeFest.sourceInternalMod.KeysOfUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceExactMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    type-fest.type-fest/source/is-equal.IsEqual<ParameterType, InputType> extends true ? ParameterType : ParameterType extends std.Array<unknown> ? std.Array<type-fest.type-fest/source/exact.Exact<type-fest.type-fest/source/internal.ArrayElement<ParameterType>, type-fest.type-fest/source/internal.ArrayElement<InputType>>> : ParameterType extends std.Array<unknown> ? std.ReadonlyArray<type-fest.type-fest/source/exact.Exact<type-fest.type-fest/source/internal.ArrayElement<ParameterType>, type-fest.type-fest/source/internal.ArrayElement<InputType>>> : ParameterType extends type-fest.type-fest/source/opaque.Opaque<infer OpaqueType, infer OpaqueToken> ? ParameterType : ParameterType extends object ? type-fest.type-fest/source/exact.ExactObject<ParameterType, InputType> : ParameterType
    }}}
    */
  type Exact[ParameterType, InputType] = ParameterType
  
  /**
  Create a type from `ParameterType` and `InputType` and change keys exclusive to `InputType` to `never`.
  - Generate a list of keys that exists in `InputType` but not in `ParameterType`.
  - Mark these excess keys as `never`.
  */
  type ExactObject[ParameterType, InputType] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof ParameterType ]: type-fest.type-fest/source/exact.Exact<ParameterType[Key], type-fest.type-fest/source/internal.ObjectValue<InputType, Key>>} */ js.Any) & (Record[Exclude[/* keyof InputType */ String, KeysOfUnion[ParameterType]], scala.Nothing])
}
