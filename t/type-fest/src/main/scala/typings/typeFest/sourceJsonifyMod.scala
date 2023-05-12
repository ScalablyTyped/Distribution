package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceJsonifyMod {
  
  type FilterJsonableKeys[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof T ]: T[Key] extends type-fest.type-fest/source/jsonify.NotJsonable? never : Key}[keyof T] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    type-fest.type-fest/source/is-any.IsAny<T> extends true ? any : T extends type-fest.type-fest/source/numeric.PositiveInfinity | type-fest.type-fest/source/numeric.NegativeInfinity ? null : T extends type-fest.type-fest/source/basic.JsonPrimitive ? T : // Instanced primitives are objects
  T extends std.Number ? number : T extends std.String ? string : T extends std.Boolean ? boolean : T extends std.Map<any, any> | std.Set<any> ? type-fest.type-fest/source/empty-object.EmptyObject : T extends type-fest.type-fest/source/typed-array.TypedArray ? std.Record<string, number> : T extends type-fest.type-fest/source/jsonify.NotJsonable ? never : // Any object with toJSON is special case
  T extends {toJSON (): infer J} ? (): J extends (): type-fest.type-fest/source/basic.JsonValue ? J : type-fest.type-fest/source/jsonify.Jsonify<J> : T extends [] ? [] : T extends [unknown, ...std.Array<unknown>] ? type-fest.type-fest/source/jsonify.JsonifyTuple<T> : T extends std.ReadonlyArray<infer U> ? std.Array<U extends type-fest.type-fest/source/jsonify.NotJsonable ? null : type-fest.type-fest/source/jsonify.Jsonify<U>> : T extends object ? type-fest.type-fest/source/jsonify.JsonifyObject<type-fest.type-fest/source/internal.UndefinedToOptional<T>> : never
    }}}
    */
  type Jsonify[T] = T
  
  /**
  JSON serialize objects (not including arrays) and classes.
  */
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Key in keyof std.Pick<T, type-fest.type-fest/source/jsonify.FilterJsonableKeys<T>> ]: type-fest.type-fest/source/jsonify.Jsonify<T[Key]>}
    }}}
    */
  @js.native
  trait JsonifyObject[T /* <: js.Object */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Key in keyof T ]: T[Key] extends type-fest.type-fest/source/jsonify.NotJsonable? null : type-fest.type-fest/source/jsonify.Jsonify<T[Key]>}
    }}}
    */
  @js.native
  trait JsonifyTuple[T /* <: Array[Any] */] extends StObject
  
  // Note: The return value has to be `any` and not `unknown` so it can match `void`.
  type NotJsonable = js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | js.Symbol]
}
