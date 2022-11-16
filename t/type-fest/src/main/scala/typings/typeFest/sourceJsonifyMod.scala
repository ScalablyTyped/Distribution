package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceJsonifyMod {
  
  // Returns never if the key or property is not jsonable without testing whether the property is required or optional otherwise return the key.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Key extends symbol ? never : Type[Key] extends symbol ? never : [(args : ...any): any] extends [Type[Key]] ? never : Key
    }}}
    */
  type BaseKeyFilter[Type, Key /* <: /* keyof Type */ String */] = Key
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [std.Extract<T, type-fest.type-fest/source/jsonify.NotJsonable | bigint>] extends [never] ? T extends type-fest.type-fest/source/numeric.PositiveInfinity | type-fest.type-fest/source/numeric.NegativeInfinity ? null : T extends type-fest.type-fest/source/basic.JsonPrimitive ? T : T extends object ? T extends {toJSON (): infer J} ? (): J extends (): type-fest.type-fest/source/basic.JsonValue ? J : never : T extends std.Number ? number : T extends std.String ? string : T extends std.Boolean ? boolean : T extends std.Map<any, any> | std.Set<any> ? {} : T extends type-fest.type-fest/source/typed-array.TypedArray ? std.Record<string, number> : T extends std.Array<any> ? {[ I in keyof T ]: T[I] extends type-fest.type-fest/source/jsonify.NotJsonable? null : type-fest.type-fest/source/jsonify.Jsonify<T[I]>} : type-fest.type-fest/source/merge.Merge<{[ Key in keyof T as type-fest.type-fest/source/jsonify.RequiredKeyFilter<T, Key> ]: type-fest.type-fest/source/jsonify.Jsonify<T[Key]>}, {[ Key in keyof T as type-fest.type-fest/source/jsonify.OptionalKeyFilter<T, Key> ]:? type-fest.type-fest/source/jsonify.Jsonify<std.Exclude<T[Key], undefined>>}> : never : never
    }}}
    */
  type Jsonify[T] = T
  
  // Note: The return value has to be `any` and not `unknown` so it can match `void`.
  type NotJsonable = js.UndefOr[(js.Function1[/* repeated */ Any, Any]) | js.Symbol]
  
  // Returns never if the key or property is not jsonable or required otherwise return the key.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    undefined extends Type[Key] ? Type[Key] extends undefined ? never : type-fest.type-fest/source/jsonify.BaseKeyFilter<Type, Key> : never
    }}}
    */
  @js.native
  trait OptionalKeyFilter[Type, Key /* <: /* keyof Type */ String */] extends StObject
  
  // Returns never if the key or property is not jsonable or optional otherwise return the key.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    undefined extends Type[Key] ? never : type-fest.type-fest/source/jsonify.BaseKeyFilter<Type, Key>
    }}}
    */
  @js.native
  trait RequiredKeyFilter[Type, Key /* <: /* keyof Type */ String */] extends StObject
}
