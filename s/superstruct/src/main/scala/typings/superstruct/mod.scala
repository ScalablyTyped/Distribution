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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("superstruct", "any")
  @js.native
  def any(): Struct[_, _] = js.native
  
  @JSImport("superstruct", "array")
  @js.native
  def array(): Struct[js.Array[_], _] = js.native
  @JSImport("superstruct", "array")
  @js.native
  def array[T](Element: Struct[T, _]): Struct[js.Array[T], Struct[T, _]] = js.native
  
  @JSImport("superstruct", "assert")
  @js.native
  def assert[T](value: js.Any, struct: Struct[T, _]): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())*/ Boolean = js.native
  
  @JSImport("superstruct", "boolean")
  @js.native
  def boolean(): Struct[Boolean, _] = js.native
  
  @JSImport("superstruct", "coerce")
  @js.native
  def coerce[T](value: js.Any, struct: Struct[T, _]): T = js.native
  
  @JSImport("superstruct", "coercion")
  @js.native
  def coercion[T](struct: Struct[T, _], coercer: js.Function1[/* value */ js.Any, _]): Struct[T, _] = js.native
  
  @JSImport("superstruct", "date")
  @js.native
  def date(): Struct[Date, _] = js.native
  
  @JSImport("superstruct", "defaulted")
  @js.native
  def defaulted[T](S: Struct[T, _], fallback: js.Any): Struct[T, _] = js.native
  @JSImport("superstruct", "defaulted")
  @js.native
  def defaulted_true[T](S: Struct[T, _], fallback: js.Any, strict: `true`): Struct[T, _] = js.native
  
  @JSImport("superstruct", "dynamic")
  @js.native
  def dynamic[T](fn: js.Function2[/* value */ js.Any, /* ctx */ StructContext, Struct[T, _]]): Struct[T, _] = js.native
  
  @JSImport("superstruct", "empty")
  @js.native
  def empty[T /* <: String | js.Array[_] */](S: Struct[T, _]): Struct[T, _] = js.native
  
  @JSImport("superstruct", "enums")
  @js.native
  def enums[T /* <: String */](values: js.Array[T]): Struct[T, _] = js.native
  @JSImport("superstruct", "enums")
  @js.native
  def enums_T_Double[T /* <: Double */](values: js.Array[T]): Struct[T, _] = js.native
  
  @JSImport("superstruct", "func")
  @js.native
  def func(): Struct[js.Function, _] = js.native
  
  @JSImport("superstruct", "instance")
  @js.native
  def instance[T /* <: Instantiable */](Class: T): Struct[InstanceType[T], _] = js.native
  
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection[A](Structs: StructTuple[js.Array[A]]): Struct[A, _] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct[A with B, _] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct[A with B with C, _] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct[A with B with C with D, _] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct[A with B with C with D with E, _] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct[A with B with C with D with E with F, _] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct[A with B with C with D with E with F with G, _] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct[A with B with C with D with E with F with G with H, _] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct[A with B with C with D with E with F with G with H with I, _] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct[A with B with C with D with E with F with G with H with I with J, _] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct[A with B with C with D with E with F with G with H with I with J with K, _] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct[A with B with C with D with E with F with G with H with I with J with K with L, _] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M, 
    _
  ] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N, 
    _
  ] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N with O, 
    _
  ] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N with O with P, 
    _
  ] = js.native
  @JSImport("superstruct", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N with O with P with Q, 
    _
  ] = js.native
  
  @JSImport("superstruct", "is")
  @js.native
  def is[T](value: js.Any, struct: Struct[T, _]): /* is T */ Boolean = js.native
  
  @JSImport("superstruct", "length")
  @js.native
  def length[T /* <: String | js.Array[_] */](S: Struct[T, _], min: Double, max: Double): Struct[T, _] = js.native
  
  @JSImport("superstruct", "literal")
  @js.native
  def literal[T /* <: String */](constant: T): Struct[T, _] = js.native
  @JSImport("superstruct", "literal")
  @js.native
  def literal_T[T](constant: T): Struct[T, _] = js.native
  @JSImport("superstruct", "literal")
  @js.native
  def literal_T_Boolean[T /* <: Boolean */](constant: T): Struct[T, _] = js.native
  @JSImport("superstruct", "literal")
  @js.native
  def literal_T_Double[T /* <: Double */](constant: T): Struct[T, _] = js.native
  
  @JSImport("superstruct", "map")
  @js.native
  def map[K, V](Key: Struct[K, _], Value: Struct[V, _]): Struct[Map[K, V], _] = js.native
  
  @JSImport("superstruct", "masked")
  @js.native
  def masked[T /* <: StringDictionary[js.Any] */, V /* <: Record[String, Struct[_, _]] */](S: Struct[T, V]): Struct[T, _] = js.native
  
  @JSImport("superstruct", "never")
  @js.native
  def never(): Struct[scala.Nothing, _] = js.native
  
  @JSImport("superstruct", "nullable")
  @js.native
  def nullable[T](S: Struct[T, _]): Struct[T | Null, _] = js.native
  
  @JSImport("superstruct", "number")
  @js.native
  def number(): Struct[Double, _] = js.native
  
  @JSImport("superstruct", "optional")
  @js.native
  def optional[T](S: Struct[T, _]): Struct[js.UndefOr[T], _] = js.native
  
  @JSImport("superstruct", "partial")
  @js.native
  def partial[T, V /* <: StructRecord[_] */](Structs: V): Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial with TopLevel[V], 
    _
  ] = js.native
  @JSImport("superstruct", "partial")
  @js.native
  def partial[T, V /* <: StructRecord[_] */](Structs: Struct[T, V]): Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial with TopLevel[V], 
    _
  ] = js.native
  
  @JSImport("superstruct", "pattern")
  @js.native
  def pattern[T /* <: String */](S: Struct[T, _], regexp: RegExp): Struct[T, _] = js.native
  
  @JSImport("superstruct", "record")
  @js.native
  def record[K /* <: String | Double */, V](Key: Struct[K, _], Value: Struct[V, _]): Struct[Record[K, V], _] = js.native
  
  @JSImport("superstruct", "refinement")
  @js.native
  def refinement[T](
    struct: Struct[T, _],
    `type`: String,
    refiner: js.Function2[/* value */ T, /* context */ StructContext, StructResult]
  ): Struct[T, _] = js.native
  
  @JSImport("superstruct", "set")
  @js.native
  def set[T](Element: Struct[T, _]): Struct[Set[T], _] = js.native
  
  @JSImport("superstruct", "string")
  @js.native
  def string(): Struct[String, _] = js.native
  
  @JSImport("superstruct", "struct")
  @js.native
  def struct[T](
    name: String,
    validator: js.Function2[/* value */ js.Any, /* context */ StructContext, StructResult]
  ): Struct[T, Null] = js.native
  
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple[A](Structs: StructTuple[js.Array[A]]): Struct[A, _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct[js.Tuple2[A, B], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct[js.Tuple3[A, B, C], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct[js.Tuple4[A, B, C, D], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct[js.Tuple5[A, B, C, D, E], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct[js.Tuple6[A, B, C, D, E, F], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct[js.Tuple7[A, B, C, D, E, F, G], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct[js.Tuple8[A, B, C, D, E, F, G, H], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct[js.Tuple9[A, B, C, D, E, F, G, H, I], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct[js.Tuple10[A, B, C, D, E, F, G, H, I, J], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P], _] = js.native
  @JSImport("superstruct", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q], _] = js.native
  
  @JSImport("superstruct", "union")
  @js.native
  def union[A](Structs: StructTuple[js.Array[A]]): Struct[A, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct[A | B, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct[A | B | C, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct[A | B | C | D, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct[A | B | C | D | E, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct[A | B | C | D | E | F, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct[A | B | C | D | E | F | G, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct[A | B | C | D | E | F | G | H, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct[A | B | C | D | E | F | G | H | I, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct[A | B | C | D | E | F | G | H | I | J, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct[A | B | C | D | E | F | G | H | I | J | K, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P, _] = js.native
  @JSImport("superstruct", "union")
  @js.native
  def union_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q, _] = js.native
  
  @JSImport("superstruct", "validate")
  @js.native
  def validate[T](value: js.Any, struct: Struct[T, _]): js.Tuple2[js.UndefOr[typings.superstruct.structMod.StructError], js.UndefOr[T]] = js.native
  @JSImport("superstruct", "validate")
  @js.native
  def validate[T](value: js.Any, struct: Struct[T, _], coercing: Boolean): js.Tuple2[js.UndefOr[typings.superstruct.structMod.StructError], js.UndefOr[T]] = js.native
  
  @JSImport("superstruct", "lazy")
  @js.native
  def `lazy`[T](fn: js.Function0[Struct[T, _]]): Struct[T, _] = js.native
  
  @JSImport("superstruct", "object")
  @js.native
  def `object`[V /* <: StructRecord[_] */](): Struct[Record[String, _], _] = js.native
  @JSImport("superstruct", "object")
  @js.native
  def `object`[V /* <: StructRecord[_] */](Structs: V): Struct[
    OptionalizeObject[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`object` with TopLevel[V]
    ], 
    V
  ] = js.native
  
  @JSImport("superstruct", "type")
  @js.native
  def `type`[V /* <: StructRecord[_] */](Structs: V): Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`type` with TopLevel[V], 
    _
  ] = js.native
}
