package typings.superstruct

import typings.std.IterableIterator
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import typings.superstruct.anon.Branch
import typings.superstruct.anon.PartialFailure
import typings.superstruct.distErrorMod.Failure
import typings.superstruct.distStructMod.Context
import typings.superstruct.distStructMod.Result
import typings.superstruct.distStructMod.Struct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("superstruct/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isObject(x: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(x.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isPlainObject(x: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def print(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def run[T, S](value: Any, struct: Struct[T, S]): IterableIterator[js.Tuple2[Failure | Unit, T | Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[js.Tuple2[Failure | Unit, T | Unit]]]
  inline def run[T, S](value: Any, struct: Struct[T, S], options: Branch): IterableIterator[js.Tuple2[Failure | Unit, T | Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[js.Tuple2[Failure | Unit, T | Unit]]]
  
  inline def shiftIterator[T](input: js.Iterator[T]): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shiftIterator")(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def toFailure[T, S](result: String, context: Context, struct: Struct[T, S], value: Any): js.UndefOr[Failure] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFailure")(result.asInstanceOf[js.Any], context.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Failure]]
  inline def toFailure[T, S](result: Boolean, context: Context, struct: Struct[T, S], value: Any): js.UndefOr[Failure] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFailure")(result.asInstanceOf[js.Any], context.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Failure]]
  inline def toFailure[T, S](result: PartialFailure, context: Context, struct: Struct[T, S], value: Any): js.UndefOr[Failure] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFailure")(result.asInstanceOf[js.Any], context.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Failure]]
  
  inline def toFailures[T, S](result: Result, context: Context, struct: Struct[T, S], value: Any): IterableIterator[Failure] = (^.asInstanceOf[js.Dynamic].applyDynamic("toFailures")(result.asInstanceOf[js.Any], context.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[Failure]]
  
  type AnyStruct = Struct[Any, Any]
  
  type Assign[T, U] = Simplify[U & (Omit[T, /* keyof U */ String])]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in std.NonNullable<T> ]: K}
    }}}
    */
  @js.native
  trait EnumSchema[T /* <: js.UndefOr[String | Double | Null] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    B extends true ? Then : Else
    }}}
    */
  type If[B /* <: Boolean */, Then, Else] = Then
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Length extends Length ? number extends Length ? Tuple : superstruct.superstruct/dist/utils._InferTuple<Tuple, Length, [], []['length']> : never
    }}}
    */
  type InferStructTuple[Tuple /* <: js.Array[AnyStruct] */, Length /* <: Double */] = Tuple
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Index extends Length ? Accumulated : superstruct.superstruct/dist/utils._InferTuple<Tuple, Length, [...Accumulated, superstruct.superstruct/dist/struct.Infer<Tuple[Index]>], [...Accumulated, superstruct.superstruct/dist/struct.Infer<Tuple[Index]>]['length']>
    }}}
    */
  type InferTuple[Tuple /* <: js.Array[AnyStruct] */, Length /* <: Double */, Accumulated /* <: js.Array[Any] */, Index /* <: Double */] = Accumulated
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    <G>(): G extends T ? 1 : 2 extends <G>(): G extends U ? 1 : 2 ? T : never
    }}}
    */
  type IsExactMatch[T, U] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends G ? G extends T ? T : never : never
    }}}
    */
  type IsMatch[T, G] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends object ? string extends keyof T ? T : never : never
    }}}
    */
  type IsRecord[T] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends [any] ? T : T extends [any, any] ? T : T extends [any, any, any] ? T : T extends [any, any, any, any] ? T : T extends [any, any, any, any, any] ? T : never
    }}}
    */
  type IsTuple[T] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends any ? U extends T ? false : true : false extends false ? never : T
    }}}
    */
  type IsUnion[T, U /* <: T */] = T
  
  type ObjectSchema = Record[String, Struct[Any, Any]]
  
  type ObjectType[S /* <: ObjectSchema */] = Simplify[
    Optionalize[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof S ]: superstruct.superstruct/dist/struct.Infer<S[K]>} */ js.Any
    ]
  ]
  
  type OmitBy[T, V] = Omit[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: V extends std.Extract<T[K], V>? K : never}[keyof T] */ js.Any
  ]
  
  type Optionalize[S /* <: js.Object */] = (OmitBy[S, Unit]) & (Partial[PickBy[S, Unit]])
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof S ]: superstruct.superstruct/dist/struct.Struct<superstruct.superstruct/dist/struct.Infer<S[K]> | undefined, unknown>}
    }}}
    */
  @js.native
  trait PartialObjectSchema[S /* <: ObjectSchema */] extends StObject
  
  type PickBy[T, V] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: V extends std.Extract<T[K], V>? K : never}[keyof T] */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Array<any> | std.Date ? T : {[ K in keyof T ]: T[K]} & {}
    }}}
    */
  type Simplify[T] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [string | undefined | null] ? [T] extends [superstruct.superstruct/dist/utils.IsMatch<T, string | undefined | null>] ? null : [T] extends [superstruct.superstruct/dist/utils.IsUnion<T, T>] ? superstruct.superstruct/dist/utils.EnumSchema<T> : T : [T] extends [number | undefined | null] ? [T] extends [superstruct.superstruct/dist/utils.IsMatch<T, number | undefined | null>] ? null : [T] extends [superstruct.superstruct/dist/utils.IsUnion<T, T>] ? superstruct.superstruct/dist/utils.EnumSchema<T> : T : [T] extends [boolean] ? [T] extends [superstruct.superstruct/dist/utils.IsExactMatch<T, boolean>] ? null : T : T extends bigint | symbol | undefined | null | std.Function | std.Date | std.Error | std.RegExp | std.Map<any, any> | std.WeakMap<any, any> | std.Set<any> | std.WeakSet<any> | std.Promise<any> ? null : T extends std.Array<infer E> ? T extends superstruct.superstruct/dist/utils.IsTuple<T> ? null : superstruct.superstruct/dist/struct.Struct<E, unknown> : T extends object ? T extends superstruct.superstruct/dist/utils.IsRecord<T> ? null : {[ K in keyof T ]: superstruct.superstruct/dist/struct.Describe<T[K]>} : null
    }}}
    */
  type StructSchema[T] = T
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: superstruct.superstruct/dist/struct.Struct<T[K], unknown>}
    }}}
    */
  @js.native
  trait TupleSchema[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    U extends any ? (arg : U): any : never extends (arg : infer I): void ? I : never
    }}}
    */
  @js.native
  trait UnionToIntersection[U] extends StObject
}
