package typings.superstruct

import org.scalablytyped.runtime.TopLevel
import typings.std.InstanceType
import typings.std.Map
import typings.std.Record
import typings.std.Set
import typings.superstruct.anon.Instantiable
import typings.superstruct.structMod.Infer
import typings.superstruct.structMod.Struct
import typings.superstruct.utilsMod.AnyStruct
import typings.superstruct.utilsMod.InferTuple
import typings.superstruct.utilsMod.ObjectSchema
import typings.superstruct.utilsMod.ObjectType
import typings.superstruct.utilsMod.UnionToIntersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("superstruct/lib/structs/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def any(): Struct[Any, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")().asInstanceOf[Struct[Any, Null]]
  
  inline def array(): Struct[js.Array[Any], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")().asInstanceOf[Struct[js.Array[Any], Unit]]
  inline def array[T /* <: Struct[Any, Any] */](Element: T): Struct[js.Array[Infer[T]], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(Element.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Array[Infer[T]], T]]
  
  inline def bigint(): Struct[js.BigInt, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("bigint")().asInstanceOf[Struct[js.BigInt, Null]]
  
  inline def boolean(): Struct[Boolean, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")().asInstanceOf[Struct[Boolean, Null]]
  
  inline def date(): Struct[js.Date, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[Struct[js.Date, Null]]
  
  inline def enums[U /* <: Double */, T /* <: js.Array[U] */](values: T): Struct[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in T[number] ]: K}
    */ typings.superstruct.superstructStrings.enums & TopLevel[Any]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("enums")(values.asInstanceOf[js.Any]).asInstanceOf[Struct[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in T[number] ]: K}
    */ typings.superstruct.superstructStrings.enums & TopLevel[Any]
  ]]
  
  inline def func(): Struct[js.Function, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")().asInstanceOf[Struct[js.Function, Null]]
  
  inline def instance[T /* <: Instantiable */](Class: T): Struct[InstanceType[T], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(Class.asInstanceOf[js.Any]).asInstanceOf[Struct[InstanceType[T], Null]]
  
  inline def integer(): Struct[Double, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("integer")().asInstanceOf[Struct[Double, Null]]
  
  inline def intersection[A /* <: AnyStruct */, B /* <: js.Array[AnyStruct] */](Structs: /* import warning: importer.ImportType#apply c repeated non-array type: B */ js.Array[B]): Struct[
    Infer[A] & (UnionToIntersection[
      /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/utils.InferStructTuple<B, B['length']>[number] */ js.Any
    ]), 
    Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[
    Infer[A] & (UnionToIntersection[
      /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/utils.InferStructTuple<B, B['length']>[number] */ js.Any
    ]), 
    Null
  ]]
  
  inline def literal[T /* <: Boolean */](constant: T): Struct[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(constant.asInstanceOf[js.Any]).asInstanceOf[Struct[T, T]]
  
  inline def map(): Struct[Map[Any, Any], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")().asInstanceOf[Struct[Map[Any, Any], Null]]
  inline def map[K, V](Key: Struct[K, Any], Value: Struct[V, Any]): Struct[Map[K, V], Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(Key.asInstanceOf[js.Any], Value.asInstanceOf[js.Any])).asInstanceOf[Struct[Map[K, V], Null]]
  
  inline def never(): Struct[scala.Nothing, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Struct[scala.Nothing, Null]]
  
  inline def nullable[T, S](struct: Struct[T, S]): Struct[T | Null, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[T | Null, S]]
  
  inline def number(): Struct[Double, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[Struct[Double, Null]]
  
  inline def `object`(): Struct[Record[String, Any], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("object")().asInstanceOf[Struct[Record[String, Any], Null]]
  inline def `object`[S /* <: ObjectSchema */](schema: S): Struct[ObjectType[S], S] = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(schema.asInstanceOf[js.Any]).asInstanceOf[Struct[ObjectType[S], S]]
  
  inline def optional[T, S](struct: Struct[T, S]): Struct[js.UndefOr[T], S] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[js.UndefOr[T], S]]
  
  inline def record[K /* <: String */, V](Key: Struct[K, Any], Value: Struct[V, Any]): Struct[Record[K, V], Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("record")(Key.asInstanceOf[js.Any], Value.asInstanceOf[js.Any])).asInstanceOf[Struct[Record[K, V], Null]]
  
  inline def regexp(): Struct[js.RegExp, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("regexp")().asInstanceOf[Struct[js.RegExp, Null]]
  
  inline def set(): Struct[Set[Any], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")().asInstanceOf[Struct[Set[Any], Null]]
  inline def set[T](Element: Struct[T, Any]): Struct[Set[T], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(Element.asInstanceOf[js.Any]).asInstanceOf[Struct[Set[T], Null]]
  
  inline def string(): Struct[String, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[Struct[String, Null]]
  
  inline def tuple[A /* <: AnyStruct */, B /* <: js.Array[AnyStruct] */](Structs: /* import warning: importer.ImportType#apply c repeated non-array type: B */ js.Array[B]): Struct[
    /* import warning: importer.ImportType#apply c repeated non-array type: B['length'] extends B['length'] ? number extends B['length'] ? B : superstruct.superstruct/lib/utils._InferTuple<B, B['length'], [], []['length']> : never */ js.Array[
      (InferTuple[
        B, 
        /* import warning: importer.ImportType#apply Failed type conversion: B['length'] */ js.Any, 
        js.Array[Any], 
        /* import warning: importer.ImportType#apply Failed type conversion: []['length'] */ js.Any
      ]) | B
    ], 
    Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[
    /* import warning: importer.ImportType#apply c repeated non-array type: B['length'] extends B['length'] ? number extends B['length'] ? B : superstruct.superstruct/lib/utils._InferTuple<B, B['length'], [], []['length']> : never */ js.Array[
      (InferTuple[
        B, 
        /* import warning: importer.ImportType#apply Failed type conversion: B['length'] */ js.Any, 
        js.Array[Any], 
        /* import warning: importer.ImportType#apply Failed type conversion: []['length'] */ js.Any
      ]) | B
    ], 
    Null
  ]]
  
  inline def `type`[S /* <: ObjectSchema */](schema: S): Struct[ObjectType[S], S] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(schema.asInstanceOf[js.Any]).asInstanceOf[Struct[ObjectType[S], S]]
  
  inline def union[A /* <: AnyStruct */, B /* <: js.Array[AnyStruct] */](Structs: /* import warning: importer.ImportType#apply c repeated non-array type: B */ js.Array[B]): Struct[
    Infer[A] | (/* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/utils.InferStructTuple<B, B['length']>[number] */ js.Any), 
    Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[
    Infer[A] | (/* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/utils.InferStructTuple<B, B['length']>[number] */ js.Any), 
    Null
  ]]
  
  inline def unknown(): Struct[Any, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("unknown")().asInstanceOf[Struct[Any, Null]]
}
