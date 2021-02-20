package typings.superstruct

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Date
import typings.std.Error
import typings.std.InstanceType
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Map
import typings.std.Record
import typings.std.RegExp
import typings.std.Set
import typings.superstruct.anon.Instantiable
import typings.superstruct.anon.PartialStructFailureBranch
import typings.superstruct.anon.Schema
import typings.superstruct.superstructBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexEsMod {
  
  /**
    * `StructError` objects are thrown (or returned) by Superstruct when its
    * validation fails. The error represents the first error encountered during
    * validation. But they also have an `error.failures` property that holds
    * information for all of the failures encountered.
    */
  @JSImport("superstruct/lib/index.es", "StructError")
  @js.native
  class StructError protected ()
    extends Error
       with /* key */ StringDictionary[js.Any] {
    def this(failure: StructFailure, moreFailures: IterableIterator[StructFailure]) = this()
    
    var branch: js.Array[_] = js.native
    
    def failures(): js.Array[StructFailure] = js.native
    
    var path: js.Array[Double | String] = js.native
    
    var `type`: String = js.native
    
    var value: js.Any = js.native
  }
  
  @JSImport("superstruct/lib/index.es", "Struct")
  @js.native
  class Struct_[T, S] protected () extends StObject {
    def this(props: Schema[S, T]) = this()
    
    def coercer(value: js.Any): js.Any = js.native
    
    def refiner(value: T, context: StructContext): StructResult = js.native
    
    var schema: S = js.native
    
    var `type`: String = js.native
    
    def validator(value: js.Any, context: StructContext): StructResult = js.native
  }
  
  /**
    * Validate any value.
    */
  @JSImport("superstruct/lib/index.es", "any")
  @js.native
  def any(): Struct_[_, _] = js.native
  
  /**
    * Validate that an array of values of a specific type.
    */
  @JSImport("superstruct/lib/index.es", "array")
  @js.native
  def array(): Struct_[js.Array[_], _] = js.native
  @JSImport("superstruct/lib/index.es", "array")
  @js.native
  def array[T](Element: Struct_[T, _]): Struct_[js.Array[T], Struct_[T, _]] = js.native
  
  /**
    * Assert that a value passes a `Struct`, throwing if it doesn't.
    */
  @JSImport("superstruct/lib/index.es", "assert")
  @js.native
  def assert[T](value: js.Any, struct: Struct_[T, _]): /* is T */ Boolean = js.native
  
  /**
    * Validate that boolean values.
    */
  @JSImport("superstruct/lib/index.es", "boolean")
  @js.native
  def boolean(): Struct_[Boolean, _] = js.native
  
  /**
    * Coerce a value with the coercion logic of `Struct` and validate it.
    */
  @JSImport("superstruct/lib/index.es", "coerce")
  @js.native
  def coerce[T](value: js.Any, struct: Struct_[T, _]): T = js.native
  
  /**
    * Augment a `Struct` to add an additional coercion step to its input.
    */
  @JSImport("superstruct/lib/index.es", "coercion")
  @js.native
  def coercion[T](struct: Struct_[T, _], coercer: js.Function1[/* value */ js.Any, _]): Struct_[T, _] = js.native
  
  /**
    * Validate that `Date` values.
    *
    * Note: this also ensures that the value is *not* an invalid `Date` object,
    * which can occur when parsing a date fails but still returns a `Date`.
    */
  @JSImport("superstruct/lib/index.es", "date")
  @js.native
  def date(): Struct_[Date, _] = js.native
  
  /**
    * Augment a struct to coerce a default value for missing values.
    *
    * Note: You must use `coerce(value, Struct)` on the value before validating it
    * to have the value defaulted!
    */
  @JSImport("superstruct/lib/index.es", "defaulted")
  @js.native
  def defaulted[T](S: Struct_[T, _], fallback: js.Any): Struct_[T, _] = js.native
  @JSImport("superstruct/lib/index.es", "defaulted")
  @js.native
  def defaulted_true[T](S: Struct_[T, _], fallback: js.Any, strict: `true`): Struct_[T, _] = js.native
  
  /**
    * Validate that a value dynamically, determing which struct to use at runtime.
    */
  @JSImport("superstruct/lib/index.es", "dynamic")
  @js.native
  def dynamic[T](fn: js.Function2[/* value */ js.Any, /* ctx */ StructContext, Struct_[T, _]]): Struct_[T, _] = js.native
  
  /**
    * Augment a string or array struct to constrain its length to zero.
    */
  @JSImport("superstruct/lib/index.es", "empty")
  @js.native
  def empty[T /* <: String | js.Array[_] */](S: Struct_[T, _]): Struct_[T, _] = js.native
  
  @JSImport("superstruct/lib/index.es", "enums")
  @js.native
  def enums[T /* <: String */](values: js.Array[T]): Struct_[T, _] = js.native
  /**
    * Validate that a value against a set of potential values.
    */
  @JSImport("superstruct/lib/index.es", "enums")
  @js.native
  def enums_T_Double[T /* <: Double */](values: js.Array[T]): Struct_[T, _] = js.native
  
  /**
    * Validate that a value is a function.
    */
  @JSImport("superstruct/lib/index.es", "func")
  @js.native
  def func(): Struct_[js.Function, _] = js.native
  
  /**
    * Validate that a value is an instance of a class.
    */
  @JSImport("superstruct/lib/index.es", "instance")
  @js.native
  def instance[T /* <: Instantiable */](Class: T): Struct_[InstanceType[T], _] = js.native
  
  /**
    * Validate that a value matches all of a set of structs.
    */
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection[A](Structs: StructTuple[js.Array[A]]): Struct_[A, _] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct_[A with B, _] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct_[A with B with C, _] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct_[A with B with C with D, _] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct_[A with B with C with D with E, _] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct_[A with B with C with D with E with F, _] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct_[A with B with C with D with E with F with G, _] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct_[A with B with C with D with E with F with G with H, _] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct_[A with B with C with D with E with F with G with H with I, _] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct_[A with B with C with D with E with F with G with H with I with J, _] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct_[A with B with C with D with E with F with G with H with I with J with K, _] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct_[A with B with C with D with E with F with G with H with I with J with K with L, _] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct_[
    A with B with C with D with E with F with G with H with I with J with K with L with M, 
    _
  ] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct_[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N, 
    _
  ] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct_[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N with O, 
    _
  ] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct_[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N with O with P, 
    _
  ] = js.native
  @JSImport("superstruct/lib/index.es", "intersection")
  @js.native
  def intersection_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct_[
    A with B with C with D with E with F with G with H with I with J with K with L with M with N with O with P with Q, 
    _
  ] = js.native
  
  /**
    * Check if a value passes a `Struct`.
    */
  @JSImport("superstruct/lib/index.es", "is")
  @js.native
  def is[T](value: js.Any, struct: Struct_[T, _]): /* is T */ Boolean = js.native
  
  /**
    * Augment a string or array struct to constrain its length to being between a
    * minimum and maximum size.
    */
  @JSImport("superstruct/lib/index.es", "length")
  @js.native
  def length[T /* <: String | js.Array[_] */](S: Struct_[T, _], min: Double, max: Double): Struct_[T, _] = js.native
  
  @JSImport("superstruct/lib/index.es", "literal")
  @js.native
  def literal[T /* <: String */](constant: T): Struct_[T, _] = js.native
  @JSImport("superstruct/lib/index.es", "literal")
  @js.native
  def literal_T[T](constant: T): Struct_[T, _] = js.native
  /**
    * Validate that a value is a specific constant.
    */
  @JSImport("superstruct/lib/index.es", "literal")
  @js.native
  def literal_T_Boolean[T /* <: Boolean */](constant: T): Struct_[T, _] = js.native
  @JSImport("superstruct/lib/index.es", "literal")
  @js.native
  def literal_T_Double[T /* <: Double */](constant: T): Struct_[T, _] = js.native
  
  /**
    * Validate that a value is a map with specific key and value entries.
    */
  @JSImport("superstruct/lib/index.es", "map")
  @js.native
  def map[K, V](Key: Struct_[K, _], Value: Struct_[V, _]): Struct_[Map[K, V], _] = js.native
  
  /**
    * Coerce a value to mask its properties to only that defined in the struct.
    */
  @JSImport("superstruct/lib/index.es", "masked")
  @js.native
  def masked[T /* <: StringDictionary[js.Any] */, V /* <: Record[String, Struct_[_, _]] */](S: Struct_[T, V]): Struct_[T, _] = js.native
  
  /**
    * Validate that a value always fails.
    */
  @JSImport("superstruct/lib/index.es", "never")
  @js.native
  def never(): Struct_[scala.Nothing, _] = js.native
  
  /**
    * Augment a struct to make it accept `null` values.
    */
  @JSImport("superstruct/lib/index.es", "nullable")
  @js.native
  def nullable[T](S: Struct_[T, _]): Struct_[T | Null, _] = js.native
  
  /**
    * Validate that a value is a number.
    */
  @JSImport("superstruct/lib/index.es", "number")
  @js.native
  def number(): Struct_[Double, _] = js.native
  
  /**
    * Augment a struct to make it optionally accept `undefined` values.
    */
  @JSImport("superstruct/lib/index.es", "optional")
  @js.native
  def optional[T](S: Struct_[T, _]): Struct_[js.UndefOr[T], _] = js.native
  
  /**
    * Validate that a partial object with specific entry values.
    */
  @JSImport("superstruct/lib/index.es", "partial")
  @js.native
  def partial[T, V /* <: StructRecord[_] */](Structs: V): Struct_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial with TopLevel[V], 
    _
  ] = js.native
  @JSImport("superstruct/lib/index.es", "partial")
  @js.native
  def partial[T, V /* <: StructRecord[_] */](Structs: Struct_[T, V]): Struct_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial with TopLevel[V], 
    _
  ] = js.native
  
  /**
    * Refine a string struct to match a specific regexp pattern.
    */
  @JSImport("superstruct/lib/index.es", "pattern")
  @js.native
  def pattern[T /* <: String */](S: Struct_[T, _], regexp: RegExp): Struct_[T, _] = js.native
  
  /**
    * Validate that a value is a record with specific key and
    * value entries.
    */
  @JSImport("superstruct/lib/index.es", "record")
  @js.native
  def record[K /* <: String | Double */, V](Key: Struct_[K, _], Value: Struct_[V, _]): Struct_[Record[K, V], _] = js.native
  
  /**
    * Augment a `Struct` to add an additional refinement to the validation.
    */
  @JSImport("superstruct/lib/index.es", "refinement")
  @js.native
  def refinement[T](
    struct: Struct_[T, _],
    `type`: String,
    refiner: js.Function2[/* value */ T, /* context */ StructContext, StructResult]
  ): Struct_[T, _] = js.native
  
  /**
    * Validate that a set of values matches a specific type.
    */
  @JSImport("superstruct/lib/index.es", "set")
  @js.native
  def set[T](Element: Struct_[T, _]): Struct_[Set[T], _] = js.native
  
  /**
    * Validate that a value is a string.
    */
  @JSImport("superstruct/lib/index.es", "string")
  @js.native
  def string(): Struct_[String, _] = js.native
  
  /**
    * Define a `Struct` instance with a type and validation function.
    */
  @JSImport("superstruct/lib/index.es", "struct")
  @js.native
  def struct[T](
    name: String,
    validator: js.Function2[/* value */ js.Any, /* context */ StructContext, StructResult]
  ): Struct_[T, Null] = js.native
  
  /**
    * Validate that a value is a tuple with entries of specific types.
    */
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple[A](Structs: StructTuple[js.Array[A]]): Struct_[A, _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct_[js.Tuple2[A, B], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct_[js.Tuple3[A, B, C], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct_[js.Tuple4[A, B, C, D], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct_[js.Tuple5[A, B, C, D, E], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct_[js.Tuple6[A, B, C, D, E, F], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct_[js.Tuple7[A, B, C, D, E, F, G], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct_[js.Tuple8[A, B, C, D, E, F, G, H], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct_[js.Tuple9[A, B, C, D, E, F, G, H, I], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct_[js.Tuple10[A, B, C, D, E, F, G, H, I, J], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct_[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct_[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct_[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct_[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct_[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct_[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P], _] = js.native
  @JSImport("superstruct/lib/index.es", "tuple")
  @js.native
  def tuple_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct_[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q], _] = js.native
  
  /**
    * Validate that a value is one of a set of types.
    */
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union[A](Structs: StructTuple[js.Array[A]]): Struct_[A, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct_[A | B, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct_[A | B | C, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct_[A | B | C | D, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct_[A | B | C | D | E, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct_[A | B | C | D | E | F, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct_[A | B | C | D | E | F | G, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct_[A | B | C | D | E | F | G | H, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct_[A | B | C | D | E | F | G | H | I, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct_[A | B | C | D | E | F | G | H | I | J, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct_[A | B | C | D | E | F | G | H | I | J | K, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct_[A | B | C | D | E | F | G | H | I | J | K | L, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M | N, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P, _] = js.native
  @JSImport("superstruct/lib/index.es", "union")
  @js.native
  def union_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q, _] = js.native
  
  /**
    * Validate a value against a `Struct`, returning an error if invalid.
    */
  @JSImport("superstruct/lib/index.es", "validate")
  @js.native
  def validate[T](value: js.Any, struct: Struct_[T, _]): js.Tuple2[js.UndefOr[StructError], js.UndefOr[T]] = js.native
  @JSImport("superstruct/lib/index.es", "validate")
  @js.native
  def validate[T](value: js.Any, struct: Struct_[T, _], coercing: Boolean): js.Tuple2[js.UndefOr[StructError], js.UndefOr[T]] = js.native
  
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
  
  /**
    * A `StructContext` contains information about the current value being
    * validated as well as helper functions for failures and recursive validating.
    */
  @js.native
  trait StructContext extends StObject {
    
    var branch: js.Array[_] = js.native
    
    def check(value: js.Any, struct: Struct_[_ | scala.Nothing, _]): IterableIterator[StructFailure] = js.native
    def check(
      value: js.Any,
      struct: Struct_[_ | scala.Nothing, _],
      parent: js.UndefOr[scala.Nothing],
      key: String
    ): IterableIterator[StructFailure] = js.native
    def check(
      value: js.Any,
      struct: Struct_[_ | scala.Nothing, _],
      parent: js.UndefOr[scala.Nothing],
      key: Double
    ): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct_[_ | scala.Nothing, _], parent: js.Any): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct_[_ | scala.Nothing, _], parent: js.Any, key: String): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct_[_ | scala.Nothing, _], parent: js.Any, key: Double): IterableIterator[StructFailure] = js.native
    
    def fail(): StructFailure = js.native
    def fail(props: PartialStructFailureBranch): StructFailure = js.native
    
    var path: js.Array[String | Double] = js.native
    
    var `type`: String = js.native
    
    var value: js.Any = js.native
  }
  
  /**
    * A `StructFailure` represents a single specific failure in validation.
    */
  @js.native
  trait StructFailure
    extends /* key */ StringDictionary[js.Any] {
    
    var branch: js.Array[_] = js.native
    
    var path: js.Array[String | Double] = js.native
    
    var `type`: String = js.native
    
    var value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/index.es.StructContext['value'] */ js.Any = js.native
  }
  object StructFailure {
    
    @scala.inline
    def apply(
      branch: js.Array[_],
      path: js.Array[String | Double],
      `type`: String,
      value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/index.es.StructContext['value'] */ js.Any
    ): StructFailure = {
      val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StructFailure]
    }
    
    @scala.inline
    implicit class StructFailureMutableBuilder[Self <: StructFailure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranch(value: js.Array[_]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchVarargs(value: js.Any*): Self = StObject.set(x, "branch", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(
        value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/index.es.StructContext['value'] */ js.Any
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type StructRecord[T] = Record[String, Struct_[T, js.Any]]
  
  /**
    * A `StructResult` is returned from validation functions.
    */
  type StructResult = Boolean | Iterable[StructFailure]
  
  type StructTuple[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: superstruct.superstruct/lib/index.es.Struct<T[K], any>}
    */ typings.superstruct.superstructStrings.StructTuple with TopLevel[T]
  
  /**
    * A type utility to extract the type from a `Struct` class.
    */
  type StructType[T /* <: Struct_[_, _] */] = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T['refiner']>[0] */ js.Any
  
  /**
    * Validate a value lazily, by constructing the struct right before the first
    * validation. This is useful for cases where you want to have self-referential
    * structs for nested data structures.
    */
  @JSImport("superstruct/lib/index.es", "lazy")
  @js.native
  def `lazy`[T](fn: js.Function0[Struct_[T, _]]): Struct_[T, _] = js.native
  
  /**
    * Validate that an object with specific entry values.
    */
  @JSImport("superstruct/lib/index.es", "object")
  @js.native
  def `object`[V /* <: StructRecord[_] */](): Struct_[Record[String, _], _] = js.native
  @JSImport("superstruct/lib/index.es", "object")
  @js.native
  def `object`[V /* <: StructRecord[_] */](Structs: V): Struct_[
    OptionalizeObject[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`object` with TopLevel[V]
    ], 
    V
  ] = js.native
  
  /**
    * Validate that a value matches a specific strutural interface, like the
    * structural typing that TypeScript uses.
    */
  @JSImport("superstruct/lib/index.es", "type")
  @js.native
  def `type`[V /* <: StructRecord[_] */](Structs: V): Struct_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`type` with TopLevel[V], 
    _
  ] = js.native
}
