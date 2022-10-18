package typings.superstruct

import typings.std.IterableIterator
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import typings.superstruct.anon.Branch
import typings.superstruct.anon.PartialFailure
import typings.superstruct.libErrorMod.Failure
import typings.superstruct.libStructMod.Context
import typings.superstruct.libStructMod.Result
import typings.superstruct.libStructMod.Struct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsMod {
  
  @JSImport("superstruct/lib/utils", JSImport.Namespace)
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
  trait EnumSchema[T /* <: js.UndefOr[String | Double] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    B extends true ? Then : Else
    }}}
    */
  @js.native
  trait If[B /* <: Boolean */, Then, Else] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Length extends Length ? number extends Length ? Tuple : superstruct.superstruct/lib/utils._InferTuple<Tuple, Length, [], []['length']> : never
    }}}
    */
  @js.native
  trait InferStructTuple[Tuple /* <: js.Array[AnyStruct] */, Length /* <: Double */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Index extends Length ? Accumulated : superstruct.superstruct/lib/utils._InferTuple<Tuple, Length, [...Accumulated, superstruct.superstruct/lib/struct.Infer<Tuple[Index]>], [...Accumulated, superstruct.superstruct/lib/struct.Infer<Tuple[Index]>]['length']>
    }}}
    */
  @js.native
  trait InferTuple[Tuple /* <: js.Array[AnyStruct] */, Length /* <: Double */, Accumulated /* <: js.Array[Any] */, Index /* <: Double */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    <G>(): G extends T ? 1 : 2 extends <G>(): G extends U ? 1 : 2 ? T : never
    }}}
    */
  @js.native
  trait IsExactMatch[T, U] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends G ? G extends T ? T : never : never
    }}}
    */
  @js.native
  trait IsMatch[T, G] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends object ? string extends keyof T ? T : never : never
    }}}
    */
  @js.native
  trait IsRecord[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends [any] ? T : T extends [any, any] ? T : T extends [any, any, any] ? T : T extends [any, any, any, any] ? T : T extends [any, any, any, any, any] ? T : never
    }}}
    */
  @js.native
  trait IsTuple[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends any ? U extends T ? false : true : false extends false ? never : T
    }}}
    */
  @js.native
  trait IsUnion[T, U /* <: T */] extends StObject
  
  type ObjectSchema = Record[String, Struct[Any, Any]]
  
  type ObjectType[S /* <: ObjectSchema */] = Simplify[
    Optionalize[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof S ]: superstruct.superstruct/lib/struct.Infer<S[K]>} */ js.Any
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
    {[ K in keyof S ]: superstruct.superstruct/lib/struct.Struct<superstruct.superstruct/lib/struct.Infer<S[K]> | undefined, unknown>}
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
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<any> | std.Date ? T : {[ K in keyof T ]: T[K]} & {}
    }}}
    */
  @js.native
  trait Simplify[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    [T] extends [string | undefined] ? [T] extends [superstruct.superstruct/lib/utils.IsMatch<T, string | undefined>] ? null : [T] extends [superstruct.superstruct/lib/utils.IsUnion<T, T>] ? superstruct.superstruct/lib/utils.EnumSchema<T> : T : [T] extends [number | undefined] ? [T] extends [superstruct.superstruct/lib/utils.IsMatch<T, number | undefined>] ? null : [T] extends [superstruct.superstruct/lib/utils.IsUnion<T, T>] ? superstruct.superstruct/lib/utils.EnumSchema<T> : T : [T] extends [boolean] ? [T] extends [superstruct.superstruct/lib/utils.IsExactMatch<T, boolean>] ? null : T : T extends bigint | symbol | undefined | null | std.Function | std.Date | std.Error | std.RegExp | std.Map<any, any> | std.WeakMap<any, any> | std.Set<any> | std.WeakSet<any> | std.Promise<any> ? null : T extends std.Array<infer E> ? T extends superstruct.superstruct/lib/utils.IsTuple<T> ? null : superstruct.superstruct/lib/struct.Struct<E, unknown> : T extends object ? T extends superstruct.superstruct/lib/utils.IsRecord<T> ? null : {[ K in keyof T ]: superstruct.superstruct/lib/struct.Describe<T[K]>} : null
    }}}
    */
  @js.native
  trait StructSchema[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: superstruct.superstruct/lib/struct.Struct<T[K], unknown>}
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
