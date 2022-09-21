package typings.superstruct

import org.scalablytyped.runtime.TopLevel
import typings.std.IterableIterator
import typings.std.Omit
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import typings.superstruct.anon.Branch
import typings.superstruct.anon.PartialFailure
import typings.superstruct.errorMod.Failure
import typings.superstruct.structMod.Context
import typings.superstruct.structMod.Result
import typings.superstruct.structMod.Struct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
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
  
  type EnumSchema[T /* <: js.UndefOr[String | Double] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in std.NonNullable<T> ]: K}
    */ typings.superstruct.superstructStrings.EnumSchema & TopLevel[Any]
  
  type If[B /* <: Boolean */, Then, Else] = Else | Then
  
  type InferStructTuple[Tuple /* <: js.Array[AnyStruct] */, Length /* <: Double */] = (InferTuple[
    Tuple, 
    Length, 
    js.Array[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: []['length'] */ js.Any
  ]) | Tuple
  
  type InferTuple[Tuple /* <: js.Array[AnyStruct] */, Length /* <: Double */, Accumulated /* <: js.Array[Any] */, Index /* <: Double */] = Accumulated
  
  type IsExactMatch[T, U] = T
  
  type IsMatch[T, G] = T
  
  type IsRecord[T] = T
  
  type IsTuple[T] = T
  
  type IsUnion[T, U /* <: T */] = T
  
  type ObjectSchema = Record[String, Struct[Any, Any]]
  
  type ObjectType[S /* <: ObjectSchema */] = Simplify[
    Optionalize[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: superstruct.superstruct/lib/struct.Infer<S[K]>}
    */ typings.superstruct.superstructStrings.ObjectType & TopLevel[S]
    ]
  ]
  
  type OmitBy[T, V] = Omit[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: V extends std.Extract<T[K], V>? K : never}[keyof T] */ js.Any
  ]
  
  type Optionalize[S /* <: js.Object */] = (OmitBy[S, Unit]) & (Partial[PickBy[S, Unit]])
  
  type PartialObjectSchema[S /* <: ObjectSchema */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof S ]: superstruct.superstruct/lib/struct.Struct<superstruct.superstruct/lib/struct.Infer<S[K]> | undefined, unknown>}
    */ typings.superstruct.superstructStrings.PartialObjectSchema & TopLevel[S]
  
  type PickBy[T, V] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: V extends std.Extract<T[K], V>? K : never}[keyof T] */ js.Any
  ]
  
  type Simplify[T] = (typings.superstruct.superstructStrings.Simplify & TopLevel[T] & js.Object) | T
  
  type StructSchema[T] = Null | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: superstruct.superstruct/lib/struct.Describe<T[K]>}
    */ typings.superstruct.superstructStrings.StructSchema & TopLevel[T]) | (Struct[Any, Any]) | T | EnumSchema[T]
  
  type TupleSchema[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: superstruct.superstruct/lib/struct.Struct<T[K], unknown>}
    */ typings.superstruct.superstructStrings.TupleSchema & TopLevel[T]
  
  type UnionToIntersection[U] = Any
}
