package typings.superstruct

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Date
import typings.std.InstanceType
import typings.std.IterableIterator
import typings.std.Map
import typings.std.Record
import typings.std.RegExp
import typings.std.Set
import typings.superstruct.anon.Instantiable
import typings.superstruct.anon.Refiner
import typings.superstruct.libTypesMod.OptionalizeObject
import typings.superstruct.structMod.Struct
import typings.superstruct.structMod.StructContext
import typings.superstruct.structMod.StructFailure
import typings.superstruct.structMod.StructResult
import typings.superstruct.superstructBooleans.`true`
import typings.superstruct.utilsMod.StructRecord
import typings.superstruct.utilsMod.StructTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("superstruct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("superstruct", "StructError")
  @js.native
  class StructError protected ()
    extends typings.superstruct.structMod.StructError {
    def this(failure: StructFailure, moreFailures: IterableIterator[StructFailure]) = this()
  }
  
  @JSImport("superstruct", "Struct")
  @js.native
  class Struct_[T, S] protected () extends Struct[T, S] {
    def this(props: Refiner[S, T]) = this()
  }
  
  @scala.inline
  def any(): Struct[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")().asInstanceOf[Struct[js.Any, js.Any]]
  
  @scala.inline
  def array(): Struct[js.Array[js.Any], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")().asInstanceOf[Struct[js.Array[js.Any], js.Any]]
  @scala.inline
  def array[T](Element: Struct[T, js.Any]): Struct[js.Array[T], Struct[T, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(Element.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Array[T], Struct[T, js.Any]]]
  
  @scala.inline
  def assert[T](value: js.Any, struct: Struct[T, js.Any]): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean]
  
  @scala.inline
  def boolean(): Struct[Boolean, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")().asInstanceOf[Struct[Boolean, js.Any]]
  
  @scala.inline
  def coerce[T](value: js.Any, struct: Struct[T, js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def coercion[T](struct: Struct[T, js.Any], coercer: js.Function1[/* value */ js.Any, js.Any]): Struct[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("coercion")(struct.asInstanceOf[js.Any], coercer.asInstanceOf[js.Any])).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def date(): Struct[Date, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[Struct[Date, js.Any]]
  
  @scala.inline
  def defaulted[T](S: Struct[T, js.Any], fallback: js.Any): Struct[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaulted")(S.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def defaulted_true[T](S: Struct[T, js.Any], fallback: js.Any, strict: `true`): Struct[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaulted")(S.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def dynamic[T](fn: js.Function2[/* value */ js.Any, /* ctx */ StructContext, Struct[T, js.Any]]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dynamic")(fn.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def empty[T /* <: String | js.Array[js.Any] */](S: Struct[T, js.Any]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(S.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def enums[T /* <: String */](values: js.Array[T]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("enums")(values.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def enums_T_Double[T /* <: Double */](values: js.Array[T]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("enums")(values.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def func(): Struct[js.Function, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")().asInstanceOf[Struct[js.Function, js.Any]]
  
  @scala.inline
  def instance[T /* <: Instantiable */](Class: T): Struct[InstanceType[T], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(Class.asInstanceOf[js.Any]).asInstanceOf[Struct[InstanceType[T], js.Any]]
  
  @scala.inline
  def intersection[A](Structs: StructTuple[js.Array[A]]): Struct[A, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A, js.Any]]
  
  @scala.inline
  def intersection_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct[A & B, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B, js.Any]]
  
  @scala.inline
  def intersection_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct[A & B & C, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C, js.Any]]
  
  @scala.inline
  def intersection_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct[A & B & C & D, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D, js.Any]]
  
  @scala.inline
  def intersection_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct[A & B & C & D & E, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E, js.Any]]
  
  @scala.inline
  def intersection_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct[A & B & C & D & E & F, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F, js.Any]]
  
  @scala.inline
  def intersection_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct[A & B & C & D & E & F & G, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G, js.Any]]
  
  @scala.inline
  def intersection_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct[A & B & C & D & E & F & G & H, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H, js.Any]]
  
  @scala.inline
  def intersection_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct[A & B & C & D & E & F & G & H & I, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I, js.Any]]
  
  @scala.inline
  def intersection_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct[A & B & C & D & E & F & G & H & I & J, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J, js.Any]]
  
  @scala.inline
  def intersection_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct[A & B & C & D & E & F & G & H & I & J & K, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J & K, js.Any]]
  
  @scala.inline
  def intersection_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct[A & B & C & D & E & F & G & H & I & J & K & L, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J & K & L, js.Any]]
  
  @scala.inline
  def intersection_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct[A & B & C & D & E & F & G & H & I & J & K & L & M, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J & K & L & M, js.Any]]
  
  @scala.inline
  def intersection_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N, js.Any]]
  
  @scala.inline
  def intersection_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O, js.Any]]
  
  @scala.inline
  def intersection_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O & P, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O & P, js.Any]]
  
  @scala.inline
  def intersection_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O & P & Q, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O & P & Q, js.Any]]
  
  @scala.inline
  def is[T](value: js.Any, struct: Struct[T, js.Any]): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  @scala.inline
  def `lazy`[T](fn: js.Function0[Struct[T, js.Any]]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(fn.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def length[T /* <: String | js.Array[js.Any] */](S: Struct[T, js.Any], min: Double, max: Double): Struct[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(S.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def literal[T /* <: String */](constant: T): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(constant.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def literal_T[T](constant: T): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(constant.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def literal_T_Boolean[T /* <: Boolean */](constant: T): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(constant.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def literal_T_Double[T /* <: Double */](constant: T): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(constant.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def map[K, V](Key: Struct[K, js.Any], Value: Struct[V, js.Any]): Struct[Map[K, V], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(Key.asInstanceOf[js.Any], Value.asInstanceOf[js.Any])).asInstanceOf[Struct[Map[K, V], js.Any]]
  
  @scala.inline
  def masked[T /* <: StringDictionary[js.Any] */, V /* <: Record[String, Struct[js.Any, js.Any]] */](S: Struct[T, V]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("masked")(S.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def never(): Struct[scala.Nothing, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Struct[scala.Nothing, js.Any]]
  
  @scala.inline
  def nullable[T](S: Struct[T, js.Any]): Struct[T | Null, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(S.asInstanceOf[js.Any]).asInstanceOf[Struct[T | Null, js.Any]]
  
  @scala.inline
  def number(): Struct[Double, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[Struct[Double, js.Any]]
  
  @scala.inline
  def `object`[V /* <: StructRecord[js.Any] */](): Struct[Record[String, js.Any], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("object")().asInstanceOf[Struct[Record[String, js.Any], js.Any]]
  @scala.inline
  def `object`[V /* <: StructRecord[js.Any] */](Structs: V): Struct[
    OptionalizeObject[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`object` & TopLevel[V]
    ], 
    V
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[
    OptionalizeObject[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`object` & TopLevel[V]
    ], 
    V
  ]]
  
  @scala.inline
  def optional[T](S: Struct[T, js.Any]): Struct[js.UndefOr[T], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(S.asInstanceOf[js.Any]).asInstanceOf[Struct[js.UndefOr[T], js.Any]]
  
  @scala.inline
  def partial[T, V /* <: StructRecord[js.Any] */](Structs: V): Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial & TopLevel[V], 
    js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial & TopLevel[V], 
    js.Any
  ]]
  @scala.inline
  def partial[T, V /* <: StructRecord[js.Any] */](Structs: Struct[T, V]): Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial & TopLevel[V], 
    js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial & TopLevel[V], 
    js.Any
  ]]
  
  @scala.inline
  def pattern[T /* <: String */](S: Struct[T, js.Any], regexp: RegExp): Struct[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(S.asInstanceOf[js.Any], regexp.asInstanceOf[js.Any])).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def record[K /* <: String | Double */, V](Key: Struct[K, js.Any], Value: Struct[V, js.Any]): Struct[Record[K, V], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("record")(Key.asInstanceOf[js.Any], Value.asInstanceOf[js.Any])).asInstanceOf[Struct[Record[K, V], js.Any]]
  
  @scala.inline
  def refinement[T](
    struct: Struct[T, js.Any],
    `type`: String,
    refiner: js.Function2[/* value */ T, /* context */ StructContext, StructResult]
  ): Struct[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(struct.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], refiner.asInstanceOf[js.Any])).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def set[T](Element: Struct[T, js.Any]): Struct[Set[T], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(Element.asInstanceOf[js.Any]).asInstanceOf[Struct[Set[T], js.Any]]
  
  @scala.inline
  def string(): Struct[String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[Struct[String, js.Any]]
  
  @scala.inline
  def struct[T](
    name: String,
    validator: js.Function2[/* value */ js.Any, /* context */ StructContext, StructResult]
  ): Struct[T, Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(name.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Struct[T, Null]]
  
  @scala.inline
  def tuple[A](Structs: StructTuple[js.Array[A]]): Struct[A, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A, js.Any]]
  
  @scala.inline
  def tuple_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct[js.Tuple2[A, B], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple2[A, B], js.Any]]
  
  @scala.inline
  def tuple_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct[js.Tuple3[A, B, C], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple3[A, B, C], js.Any]]
  
  @scala.inline
  def tuple_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct[js.Tuple4[A, B, C, D], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple4[A, B, C, D], js.Any]]
  
  @scala.inline
  def tuple_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct[js.Tuple5[A, B, C, D, E], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple5[A, B, C, D, E], js.Any]]
  
  @scala.inline
  def tuple_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct[js.Tuple6[A, B, C, D, E, F], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple6[A, B, C, D, E, F], js.Any]]
  
  @scala.inline
  def tuple_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct[js.Tuple7[A, B, C, D, E, F, G], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple7[A, B, C, D, E, F, G], js.Any]]
  
  @scala.inline
  def tuple_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct[js.Tuple8[A, B, C, D, E, F, G, H], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple8[A, B, C, D, E, F, G, H], js.Any]]
  
  @scala.inline
  def tuple_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct[js.Tuple9[A, B, C, D, E, F, G, H, I], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple9[A, B, C, D, E, F, G, H, I], js.Any]]
  
  @scala.inline
  def tuple_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct[js.Tuple10[A, B, C, D, E, F, G, H, I, J], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple10[A, B, C, D, E, F, G, H, I, J], js.Any]]
  
  @scala.inline
  def tuple_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K], js.Any]]
  
  @scala.inline
  def tuple_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L], js.Any]]
  
  @scala.inline
  def tuple_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M], js.Any]]
  
  @scala.inline
  def tuple_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N], js.Any]]
  
  @scala.inline
  def tuple_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O], js.Any]]
  
  @scala.inline
  def tuple_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P], js.Any]]
  
  @scala.inline
  def tuple_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q], js.Any]]
  
  @scala.inline
  def `type`[V /* <: StructRecord[js.Any] */](Structs: V): Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`type` & TopLevel[V], 
    js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`type` & TopLevel[V], 
    js.Any
  ]]
  
  @scala.inline
  def union[A](Structs: StructTuple[js.Array[A]]): Struct[A, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A, js.Any]]
  
  @scala.inline
  def union_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct[A | B, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B, js.Any]]
  
  @scala.inline
  def union_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct[A | B | C, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C, js.Any]]
  
  @scala.inline
  def union_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct[A | B | C | D, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D, js.Any]]
  
  @scala.inline
  def union_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct[A | B | C | D | E, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E, js.Any]]
  
  @scala.inline
  def union_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct[A | B | C | D | E | F, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F, js.Any]]
  
  @scala.inline
  def union_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct[A | B | C | D | E | F | G, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G, js.Any]]
  
  @scala.inline
  def union_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct[A | B | C | D | E | F | G | H, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H, js.Any]]
  
  @scala.inline
  def union_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct[A | B | C | D | E | F | G | H | I, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I, js.Any]]
  
  @scala.inline
  def union_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct[A | B | C | D | E | F | G | H | I | J, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J, js.Any]]
  
  @scala.inline
  def union_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct[A | B | C | D | E | F | G | H | I | J | K, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J | K, js.Any]]
  
  @scala.inline
  def union_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J | K | L, js.Any]]
  
  @scala.inline
  def union_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J | K | L | M, js.Any]]
  
  @scala.inline
  def union_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N, js.Any]]
  
  @scala.inline
  def union_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O, js.Any]]
  
  @scala.inline
  def union_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P, js.Any]]
  
  @scala.inline
  def union_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q, js.Any]]
  
  @scala.inline
  def validate[T](value: js.Any, struct: Struct[T, js.Any]): js.Tuple2[typings.superstruct.structMod.StructError | Unit, T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[typings.superstruct.structMod.StructError | Unit, T | Unit]]
  @scala.inline
  def validate[T](value: js.Any, struct: Struct[T, js.Any], coercing: Boolean): js.Tuple2[typings.superstruct.structMod.StructError | Unit, T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], coercing.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[typings.superstruct.structMod.StructError | Unit, T | Unit]]
}
