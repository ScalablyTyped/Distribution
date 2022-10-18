package typings.superstruct

import typings.std.Generator
import typings.std.InstanceType
import typings.std.Map
import typings.std.Omit
import typings.std.Pick
import typings.std.Record
import typings.std.Set
import typings.superstruct.anon.Coerce
import typings.superstruct.anon.Coercer
import typings.superstruct.anon.Exclusive
import typings.superstruct.anon.Instantiable
import typings.superstruct.anon.Strict
import typings.superstruct.libErrorMod.Failure
import typings.superstruct.libStructMod.Context
import typings.superstruct.libStructMod.Infer
import typings.superstruct.libStructMod.Refiner
import typings.superstruct.libStructMod.Struct
import typings.superstruct.libStructMod.Validator
import typings.superstruct.libUtilsMod.AnyStruct
import typings.superstruct.libUtilsMod.Assign
import typings.superstruct.libUtilsMod.ObjectSchema
import typings.superstruct.libUtilsMod.ObjectType
import typings.superstruct.libUtilsMod.PartialObjectSchema
import typings.superstruct.libUtilsMod.UnionToIntersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("superstruct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("superstruct", "StructError")
  @js.native
  open class StructError protected ()
    extends typings.superstruct.libErrorMod.StructError {
    def this(failure: Failure, failures: js.Function0[Generator[Failure, Any, Any]]) = this()
  }
  
  @JSImport("superstruct", "Struct")
  @js.native
  open class Struct_[T, S] protected () extends Struct[T, S] {
    def this(props: Coercer[S, T]) = this()
  }
  
  inline def any(): Struct[Any, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")().asInstanceOf[Struct[Any, Null]]
  
  inline def array(): Struct[js.Array[Any], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")().asInstanceOf[Struct[js.Array[Any], Unit]]
  inline def array[T /* <: Struct[Any, Any] */](Element: T): Struct[js.Array[Infer[T]], T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(Element.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Array[Infer[T]], T]]
  
  inline def assert[T, S](value: Any, struct: Struct[T, S]): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  inline def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */](A: Struct[ObjectType[A], A], B: Struct[ObjectType[B], B]): Struct[ObjectType[Assign[A, B]], Assign[A, B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[Struct[ObjectType[Assign[A, B]], Assign[A, B]]]
  inline def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */, C /* <: ObjectSchema */](A: Struct[ObjectType[A], A], B: Struct[ObjectType[B], B], C: Struct[ObjectType[C], C]): Struct[ObjectType[Assign[Assign[A, B], C]], Assign[Assign[A, B], C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[Struct[ObjectType[Assign[Assign[A, B], C]], Assign[Assign[A, B], C]]]
  inline def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */, C /* <: ObjectSchema */, D /* <: ObjectSchema */](
    A: Struct[ObjectType[A], A],
    B: Struct[ObjectType[B], B],
    C: Struct[ObjectType[C], C],
    D: Struct[ObjectType[D], D]
  ): Struct[ObjectType[Assign[Assign[Assign[A, B], C], D]], Assign[Assign[Assign[A, B], C], D]] = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any])).asInstanceOf[Struct[ObjectType[Assign[Assign[Assign[A, B], C], D]], Assign[Assign[Assign[A, B], C], D]]]
  inline def assign[A /* <: ObjectSchema */, B /* <: ObjectSchema */, C /* <: ObjectSchema */, D /* <: ObjectSchema */, E /* <: ObjectSchema */](
    A: Struct[ObjectType[A], A],
    B: Struct[ObjectType[B], B],
    C: Struct[ObjectType[C], C],
    D: Struct[ObjectType[D], D],
    E: Struct[ObjectType[E], E]
  ): Struct[
    ObjectType[Assign[Assign[Assign[Assign[A, B], C], D], E]], 
    Assign[Assign[Assign[Assign[A, B], C], D], E]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[Struct[
    ObjectType[Assign[Assign[Assign[Assign[A, B], C], D], E]], 
    Assign[Assign[Assign[Assign[A, B], C], D], E]
  ]]
  
  inline def bigint(): Struct[js.BigInt, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("bigint")().asInstanceOf[Struct[js.BigInt, Null]]
  
  inline def boolean(): Struct[Boolean, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")().asInstanceOf[Struct[Boolean, Null]]
  
  inline def coerce[T, S, C](
    struct: Struct[T, S],
    condition: Struct[C, Any],
    coercer: typings.superstruct.libStructMod.Coercer[C]
  ): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(struct.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], coercer.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  
  inline def create[T, S](value: Any, struct: Struct[T, S]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def date(): Struct[js.Date, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[Struct[js.Date, Null]]
  
  inline def defaulted[T, S](struct: Struct[T, S], fallback: Any): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaulted")(struct.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  inline def defaulted[T, S](struct: Struct[T, S], fallback: Any, options: Strict): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaulted")(struct.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  
  inline def define[T](name: String, validator: Validator): Struct[T, Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Struct[T, Null]]
  
  inline def deprecated[T](struct: Struct[T, Any], log: js.Function2[/* value */ Any, /* ctx */ Context, Unit]): Struct[T, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecated")(struct.asInstanceOf[js.Any], log.asInstanceOf[js.Any])).asInstanceOf[Struct[T, Any]]
  
  inline def dynamic[T](fn: js.Function2[/* value */ Any, /* ctx */ Context, Struct[T, Any]]): Struct[T, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("dynamic")(fn.asInstanceOf[js.Any]).asInstanceOf[Struct[T, Null]]
  
  inline def empty[T /* <: String | js.Array[Any] | (Map[Any, Any]) | Set[Any] */, S /* <: Any */](struct: Struct[T, S]): Struct[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[T, S]]
  
  inline def enums[U /* <: Double */, T /* <: js.Array[U] */](values: T): Struct[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in T[number] ]: K} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("enums")(values.asInstanceOf[js.Any]).asInstanceOf[Struct[
    /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in T[number] ]: K} */ js.Any
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
  
  inline def is[T, S](value: Any, struct: Struct[T, S]): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  inline def `lazy`[T](fn: js.Function0[Struct[T, Any]]): Struct[T, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(fn.asInstanceOf[js.Any]).asInstanceOf[Struct[T, Null]]
  
  inline def literal[T /* <: Boolean */](constant: T): Struct[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(constant.asInstanceOf[js.Any]).asInstanceOf[Struct[T, T]]
  
  inline def map(): Struct[Map[Any, Any], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")().asInstanceOf[Struct[Map[Any, Any], Null]]
  inline def map[K, V](Key: Struct[K, Any], Value: Struct[V, Any]): Struct[Map[K, V], Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(Key.asInstanceOf[js.Any], Value.asInstanceOf[js.Any])).asInstanceOf[Struct[Map[K, V], Null]]
  
  inline def mask[T, S](value: Any, struct: Struct[T, S]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mask")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def max[S /* <: Any */](struct: Struct[js.Date, S], threshold: js.Date): Struct[js.Date, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Struct[js.Date, S]]
  inline def max[S /* <: Any */](struct: Struct[js.Date, S], threshold: js.Date, options: Exclusive): Struct[js.Date, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Struct[js.Date, S]]
  inline def max[S /* <: Any */](struct: Struct[Double, S], threshold: Double): Struct[Double, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Struct[Double, S]]
  inline def max[S /* <: Any */](struct: Struct[Double, S], threshold: Double, options: Exclusive): Struct[Double, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Struct[Double, S]]
  
  inline def min[S /* <: Any */](struct: Struct[js.Date, S], threshold: js.Date): Struct[js.Date, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Struct[js.Date, S]]
  inline def min[S /* <: Any */](struct: Struct[js.Date, S], threshold: js.Date, options: Exclusive): Struct[js.Date, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Struct[js.Date, S]]
  inline def min[S /* <: Any */](struct: Struct[Double, S], threshold: Double): Struct[Double, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Struct[Double, S]]
  inline def min[S /* <: Any */](struct: Struct[Double, S], threshold: Double, options: Exclusive): Struct[Double, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Struct[Double, S]]
  
  inline def never(): Struct[scala.Nothing, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Struct[scala.Nothing, Null]]
  
  inline def nonempty[T /* <: String | js.Array[Any] | (Map[Any, Any]) | Set[Any] */, S /* <: Any */](struct: Struct[T, S]): Struct[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonempty")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[T, S]]
  
  inline def nullable[T, S](struct: Struct[T, S]): Struct[T | Null, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[T | Null, S]]
  
  inline def number(): Struct[Double, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[Struct[Double, Null]]
  
  inline def `object`(): Struct[Record[String, Any], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("object")().asInstanceOf[Struct[Record[String, Any], Null]]
  inline def `object`[S /* <: ObjectSchema */](schema: S): Struct[ObjectType[S], S] = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(schema.asInstanceOf[js.Any]).asInstanceOf[Struct[ObjectType[S], S]]
  
  inline def omit[S /* <: ObjectSchema */, K /* <: /* keyof S */ String */](struct: Struct[ObjectType[S], S], keys: js.Array[K]): Struct[ObjectType[Omit[S, K]], Omit[S, K]] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(struct.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Struct[ObjectType[Omit[S, K]], Omit[S, K]]]
  
  inline def optional[T, S](struct: Struct[T, S]): Struct[js.UndefOr[T], S] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[js.UndefOr[T], S]]
  
  inline def partial[S /* <: ObjectSchema */](struct: S): Struct[ObjectType[PartialObjectSchema[S]], PartialObjectSchema[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[ObjectType[PartialObjectSchema[S]], PartialObjectSchema[S]]]
  inline def partial[S /* <: ObjectSchema */](struct: Struct[ObjectType[S], S]): Struct[ObjectType[PartialObjectSchema[S]], PartialObjectSchema[S]] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[ObjectType[PartialObjectSchema[S]], PartialObjectSchema[S]]]
  
  inline def pattern[T /* <: String */, S /* <: Any */](struct: Struct[T, S], regexp: js.RegExp): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(struct.asInstanceOf[js.Any], regexp.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  
  inline def pick[S /* <: ObjectSchema */, K /* <: /* keyof S */ String */](struct: Struct[ObjectType[S], S], keys: js.Array[K]): Struct[ObjectType[Pick[S, K]], Pick[S, K]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(struct.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Struct[ObjectType[Pick[S, K]], Pick[S, K]]]
  
  inline def record[K /* <: String */, V](Key: Struct[K, Any], Value: Struct[V, Any]): Struct[Record[K, V], Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("record")(Key.asInstanceOf[js.Any], Value.asInstanceOf[js.Any])).asInstanceOf[Struct[Record[K, V], Null]]
  
  inline def refine[T, S](struct: Struct[T, S], name: String, refiner: Refiner[T]): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("refine")(struct.asInstanceOf[js.Any], name.asInstanceOf[js.Any], refiner.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  
  inline def regexp(): Struct[js.RegExp, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("regexp")().asInstanceOf[Struct[js.RegExp, Null]]
  
  inline def set(): Struct[Set[Any], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")().asInstanceOf[Struct[Set[Any], Null]]
  inline def set[T](Element: Struct[T, Any]): Struct[Set[T], Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(Element.asInstanceOf[js.Any]).asInstanceOf[Struct[Set[T], Null]]
  
  inline def size[T /* <: String | Double | js.Date | js.Array[Any] | (Map[Any, Any]) | Set[Any] */, S /* <: Any */](struct: Struct[T, S], min: Double): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(struct.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  inline def size[T /* <: String | Double | js.Date | js.Array[Any] | (Map[Any, Any]) | Set[Any] */, S /* <: Any */](struct: Struct[T, S], min: Double, max: Double): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(struct.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  
  inline def string(): Struct[String, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[Struct[String, Null]]
  
  inline def struct[T](name: String, validator: Validator): Struct[T, Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(name.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Struct[T, Null]]
  
  inline def trimmed[T, S](struct: Struct[T, S]): Struct[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("trimmed")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[T, S]]
  
  inline def tuple[A /* <: AnyStruct */, B /* <: js.Array[AnyStruct] */](Structs: /* import warning: importer.ImportType#apply c repeated non-array type: B */ js.Array[B]): Struct[
    /* import warning: importer.ImportType#apply c repeated non-array type: B['length'] extends B['length'] ? number extends B['length'] ? B : superstruct.superstruct/lib/utils._InferTuple<B, B['length'], [], []['length']> : never */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: B['length'] extends B['length'] ? number extends B['length'] ? B : superstruct.superstruct/lib/utils._InferTuple<B, B['length'], [], []['length']> : never */ js.Any
    ], 
    Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[
    /* import warning: importer.ImportType#apply c repeated non-array type: B['length'] extends B['length'] ? number extends B['length'] ? B : superstruct.superstruct/lib/utils._InferTuple<B, B['length'], [], []['length']> : never */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: B['length'] extends B['length'] ? number extends B['length'] ? B : superstruct.superstruct/lib/utils._InferTuple<B, B['length'], [], []['length']> : never */ js.Any
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
  
  inline def validate[T, S](value: Any, struct: Struct[T, S]): js.Tuple2[typings.superstruct.libErrorMod.StructError | Unit, T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[typings.superstruct.libErrorMod.StructError | Unit, T | Unit]]
  inline def validate[T, S](value: Any, struct: Struct[T, S], options: Coerce): js.Tuple2[typings.superstruct.libErrorMod.StructError | Unit, T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[typings.superstruct.libErrorMod.StructError | Unit, T | Unit]]
}
