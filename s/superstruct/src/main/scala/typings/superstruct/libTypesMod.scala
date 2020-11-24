package typings.superstruct

import org.scalablytyped.runtime.TopLevel
import typings.std.Date
import typings.std.InstanceType
import typings.std.Map
import typings.std.Record
import typings.std.Set
import typings.superstruct.anon.Instantiable
import typings.superstruct.structMod.Struct
import typings.superstruct.structMod.StructContext
import typings.superstruct.structMod.StructResult
import typings.superstruct.utilsMod.StructRecord
import typings.superstruct.utilsMod.StructTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/types", JSImport.Namespace)
@js.native
object libTypesMod extends js.Object {
  
  def any(): Struct[_, _] = js.native
  
  def array(): Struct[js.Array[_], _] = js.native
  def array[T](Element: Struct[T, _]): Struct[js.Array[T], Struct[T, _]] = js.native
  
  def boolean(): Struct[Boolean, _] = js.native
  
  def date(): Struct[Date, _] = js.native
  
  def dynamic[T](fn: js.Function2[/* value */ js.Any, /* ctx */ StructContext, Struct[T, _]]): Struct[T, _] = js.native
  
  def enums[T /* <: String */](values: js.Array[T]): Struct[T, _] = js.native
  @JSName("enums")
  def enums_T_Double[T /* <: Double */](values: js.Array[T]): Struct[T, _] = js.native
  
  def func(): Struct[js.Function, _] = js.native
  
  def instance[T /* <: Instantiable */](Class: T): Struct[InstanceType[T], _] = js.native
  
  def intersection[A](Structs: StructTuple[js.Array[A]]): Struct[A, _] = js.native
  @JSName("intersection")
  def intersection_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct[A with B, _] = js.native
  @JSName("intersection")
  def intersection_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct[A with B with C, _] = js.native
  @JSName("intersection")
  def intersection_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct[A with B with C with D, _] = js.native
  @JSName("intersection")
  def intersection_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct[A with B with C with D with E, _] = js.native
  @JSName("intersection")
  def intersection_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct[A with B with C with D with E with F, _] = js.native
  @JSName("intersection")
  def intersection_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct[A with B with C with D with E with F with G, _] = js.native
  @JSName("intersection")
  def intersection_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct[A with B with C with D with E with F with G with H, _] = js.native
  @JSName("intersection")
  def intersection_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct[A with B with C with D with E with F with G with H with I, _] = js.native
  @JSName("intersection")
  def intersection_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct[A with B with C with D with E with F with G with H with I with J, _] = js.native
  @JSName("intersection")
  def intersection_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct[A with B with C with D with E with F with G with H with I with J with K, _] = js.native
  @JSName("intersection")
  def intersection_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct[A with B with C with D with E with F with G with H with I with J with K with L, _] = js.native
  @JSName("intersection")
  def intersection_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M, 
    _
  ] = js.native
  @JSName("intersection")
  def intersection_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N, 
    _
  ] = js.native
  @JSName("intersection")
  def intersection_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N with O, 
    _
  ] = js.native
  @JSName("intersection")
  def intersection_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N with O with P, 
    _
  ] = js.native
  @JSName("intersection")
  def intersection_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N with O with P with Q, 
    _
  ] = js.native
  
  def `lazy`[T](fn: js.Function0[Struct[T, _]]): Struct[T, _] = js.native
  
  def literal[T /* <: String */](constant: T): Struct[T, _] = js.native
  @JSName("literal")
  def literal_T[T](constant: T): Struct[T, _] = js.native
  @JSName("literal")
  def literal_T_Boolean[T /* <: Boolean */](constant: T): Struct[T, _] = js.native
  @JSName("literal")
  def literal_T_Double[T /* <: Double */](constant: T): Struct[T, _] = js.native
  
  def map[K, V](Key: Struct[K, _], Value: Struct[V, _]): Struct[Map[K, V], _] = js.native
  
  def never(): Struct[scala.Nothing, _] = js.native
  
  def nullable[T](S: Struct[T, _]): Struct[T | Null, _] = js.native
  
  def number(): Struct[Double, _] = js.native
  
  def `object`[V /* <: StructRecord[_] */](): Struct[Record[String, _], _] = js.native
  def `object`[V /* <: StructRecord[_] */](Structs: V): Struct[
    OptionalizeObject[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`object` with TopLevel[V]
    ], 
    V
  ] = js.native
  
  def optional[T](S: Struct[T, _]): Struct[js.UndefOr[T], _] = js.native
  
  def partial[T, V /* <: StructRecord[_] */](Structs: V): Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial with TopLevel[V], 
    _
  ] = js.native
  def partial[T, V /* <: StructRecord[_] */](Structs: Struct[T, V]): Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial with TopLevel[V], 
    _
  ] = js.native
  
  def record[K /* <: String | Double */, V](Key: Struct[K, _], Value: Struct[V, _]): Struct[Record[K, V], _] = js.native
  
  def set[T](Element: Struct[T, _]): Struct[Set[T], _] = js.native
  
  def string(): Struct[String, _] = js.native
  
  def struct[T](
    name: String,
    validator: js.Function2[/* value */ js.Any, /* context */ StructContext, StructResult]
  ): Struct[T, Null] = js.native
  
  def tuple[A](Structs: StructTuple[js.Array[A]]): Struct[A, _] = js.native
  @JSName("tuple")
  def tuple_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct[js.Tuple2[A, B], _] = js.native
  @JSName("tuple")
  def tuple_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct[js.Tuple3[A, B, C], _] = js.native
  @JSName("tuple")
  def tuple_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct[js.Tuple4[A, B, C, D], _] = js.native
  @JSName("tuple")
  def tuple_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct[js.Tuple5[A, B, C, D, E], _] = js.native
  @JSName("tuple")
  def tuple_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct[js.Tuple6[A, B, C, D, E, F], _] = js.native
  @JSName("tuple")
  def tuple_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct[js.Tuple7[A, B, C, D, E, F, G], _] = js.native
  @JSName("tuple")
  def tuple_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct[js.Tuple8[A, B, C, D, E, F, G, H], _] = js.native
  @JSName("tuple")
  def tuple_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct[js.Tuple9[A, B, C, D, E, F, G, H, I], _] = js.native
  @JSName("tuple")
  def tuple_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct[js.Tuple10[A, B, C, D, E, F, G, H, I, J], _] = js.native
  @JSName("tuple")
  def tuple_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K], _] = js.native
  @JSName("tuple")
  def tuple_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L], _] = js.native
  @JSName("tuple")
  def tuple_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M], _] = js.native
  @JSName("tuple")
  def tuple_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N], _] = js.native
  @JSName("tuple")
  def tuple_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O], _] = js.native
  @JSName("tuple")
  def tuple_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P], _] = js.native
  @JSName("tuple")
  def tuple_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q], _] = js.native
  
  def `type`[V /* <: StructRecord[_] */](Structs: V): Struct[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/struct.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`type` with TopLevel[V], 
    _
  ] = js.native
  
  def union[A](Structs: StructTuple[js.Array[A]]): Struct[A, _] = js.native
  @JSName("union")
  def union_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct[A | B, _] = js.native
  @JSName("union")
  def union_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct[A | B | C, _] = js.native
  @JSName("union")
  def union_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct[A | B | C | D, _] = js.native
  @JSName("union")
  def union_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct[A | B | C | D | E, _] = js.native
  @JSName("union")
  def union_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct[A | B | C | D | E | F, _] = js.native
  @JSName("union")
  def union_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct[A | B | C | D | E | F | G, _] = js.native
  @JSName("union")
  def union_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct[A | B | C | D | E | F | G | H, _] = js.native
  @JSName("union")
  def union_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct[A | B | C | D | E | F | G | H | I, _] = js.native
  @JSName("union")
  def union_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct[A | B | C | D | E | F | G | H | I | J, _] = js.native
  @JSName("union")
  def union_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct[A | B | C | D | E | F | G | H | I | J | K, _] = js.native
  @JSName("union")
  def union_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L, _] = js.native
  @JSName("union")
  def union_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M, _] = js.native
  @JSName("union")
  def union_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N, _] = js.native
  @JSName("union")
  def union_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O, _] = js.native
  @JSName("union")
  def union_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P, _] = js.native
  @JSName("union")
  def union_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q, _] = js.native
  
  /**
    * Type helper to Flatten the Union of optional and required properties.
    */
  type Flatten[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: any[K]}
    */ typings.superstruct.superstructStrings.Flatten with TopLevel[js.Any]
  
  /**
    * Type helper to extract the optional keys of an object
    */
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: undefined extends T[K]? K : never}[keyof T] */ js.Any
  
  /**
    * Type helper to create optional properties when the property value can be
    * undefined (ie. when `optional()` is used to define a type)
    */
  type OptionalizeObject[T] = Flatten[typings.superstruct.superstructStrings.OptionalizeObject with TopLevel[T]]
  
  /**
    * Type helper to extract the required keys of an object
    */
  type RequiredKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: undefined extends T[K]? never : K}[keyof T] */ js.Any
}
