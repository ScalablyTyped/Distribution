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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexEsMod {
  
  @JSImport("superstruct/lib/index.es", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * `StructError` objects are thrown (or returned) by Superstruct when its
    * validation fails. The error represents the first error encountered during
    * validation. But they also have an `error.failures` property that holds
    * information for all of the failures encountered.
    */
  @JSImport("superstruct/lib/index.es", "StructError")
  @js.native
  class StructError protected ()
    extends StObject
       with Error
       with /* key */ StringDictionary[js.Any] {
    def this(failure: StructFailure, moreFailures: IterableIterator[StructFailure]) = this()
    
    var branch: js.Array[js.Any] = js.native
    
    def failures(): js.Array[StructFailure] = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
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
  inline def any(): Struct_[js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("any")().asInstanceOf[Struct_[js.Any, js.Any]]
  
  /**
    * Validate that an array of values of a specific type.
    */
  inline def array(): Struct_[js.Array[js.Any], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")().asInstanceOf[Struct_[js.Array[js.Any], js.Any]]
  inline def array[T](Element: Struct_[T, js.Any]): Struct_[js.Array[T], Struct_[T, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(Element.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Array[T], Struct_[T, js.Any]]]
  
  /**
    * Assert that a value passes a `Struct`, throwing if it doesn't.
    */
  inline def assert[T](value: js.Any, struct: Struct_[T, js.Any]): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("assert")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  /**
    * Validate that boolean values.
    */
  inline def boolean(): Struct_[Boolean, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("boolean")().asInstanceOf[Struct_[Boolean, js.Any]]
  
  /**
    * Coerce a value with the coercion logic of `Struct` and validate it.
    */
  inline def coerce[T](value: js.Any, struct: Struct_[T, js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Augment a `Struct` to add an additional coercion step to its input.
    */
  inline def coercion[T](struct: Struct_[T, js.Any], coercer: js.Function1[/* value */ js.Any, js.Any]): Struct_[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("coercion")(struct.asInstanceOf[js.Any], coercer.asInstanceOf[js.Any])).asInstanceOf[Struct_[T, js.Any]]
  
  /**
    * Validate that `Date` values.
    *
    * Note: this also ensures that the value is *not* an invalid `Date` object,
    * which can occur when parsing a date fails but still returns a `Date`.
    */
  inline def date(): Struct_[Date, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[Struct_[Date, js.Any]]
  
  /**
    * Augment a struct to coerce a default value for missing values.
    *
    * Note: You must use `coerce(value, Struct)` on the value before validating it
    * to have the value defaulted!
    */
  inline def defaulted[T](S: Struct_[T, js.Any], fallback: js.Any): Struct_[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaulted")(S.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Struct_[T, js.Any]]
  
  inline def defaulted_true[T](S: Struct_[T, js.Any], fallback: js.Any, strict: `true`): Struct_[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaulted")(S.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Struct_[T, js.Any]]
  
  /**
    * Validate that a value dynamically, determing which struct to use at runtime.
    */
  inline def dynamic[T](fn: js.Function2[/* value */ js.Any, /* ctx */ StructContext, Struct_[T, js.Any]]): Struct_[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dynamic")(fn.asInstanceOf[js.Any]).asInstanceOf[Struct_[T, js.Any]]
  
  /**
    * Augment a string or array struct to constrain its length to zero.
    */
  inline def empty[T /* <: String | js.Array[js.Any] */](S: Struct_[T, js.Any]): Struct_[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(S.asInstanceOf[js.Any]).asInstanceOf[Struct_[T, js.Any]]
  
  inline def enums[T /* <: String */](values: js.Array[T]): Struct_[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("enums")(values.asInstanceOf[js.Any]).asInstanceOf[Struct_[T, js.Any]]
  
  /**
    * Validate that a value against a set of potential values.
    */
  inline def enums_T_Double[T /* <: Double */](values: js.Array[T]): Struct_[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("enums")(values.asInstanceOf[js.Any]).asInstanceOf[Struct_[T, js.Any]]
  
  /**
    * Validate that a value is a function.
    */
  inline def func(): Struct_[js.Function, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")().asInstanceOf[Struct_[js.Function, js.Any]]
  
  /**
    * Validate that a value is an instance of a class.
    */
  inline def instance[T /* <: Instantiable */](Class: T): Struct_[InstanceType[T], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(Class.asInstanceOf[js.Any]).asInstanceOf[Struct_[InstanceType[T], js.Any]]
  
  /**
    * Validate that a value matches all of a set of structs.
    */
  inline def intersection[A](Structs: StructTuple[js.Array[A]]): Struct_[A, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A, js.Any]]
  
  inline def intersection_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct_[A & B, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B, js.Any]]
  
  inline def intersection_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct_[A & B & C, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C, js.Any]]
  
  inline def intersection_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct_[A & B & C & D, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C & D, js.Any]]
  
  inline def intersection_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct_[A & B & C & D & E, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C & D & E, js.Any]]
  
  inline def intersection_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct_[A & B & C & D & E & F, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C & D & E & F, js.Any]]
  
  inline def intersection_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct_[A & B & C & D & E & F & G, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C & D & E & F & G, js.Any]]
  
  inline def intersection_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct_[A & B & C & D & E & F & G & H, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C & D & E & F & G & H, js.Any]]
  
  inline def intersection_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct_[A & B & C & D & E & F & G & H & I, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C & D & E & F & G & H & I, js.Any]]
  
  inline def intersection_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct_[A & B & C & D & E & F & G & H & I & J, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C & D & E & F & G & H & I & J, js.Any]]
  
  inline def intersection_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct_[A & B & C & D & E & F & G & H & I & J & K, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C & D & E & F & G & H & I & J & K, js.Any]]
  
  inline def intersection_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct_[A & B & C & D & E & F & G & H & I & J & K & L, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C & D & E & F & G & H & I & J & K & L, js.Any]]
  
  inline def intersection_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct_[A & B & C & D & E & F & G & H & I & J & K & L & M, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C & D & E & F & G & H & I & J & K & L & M, js.Any]]
  
  inline def intersection_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct_[A & B & C & D & E & F & G & H & I & J & K & L & M & N, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C & D & E & F & G & H & I & J & K & L & M & N, js.Any]]
  
  inline def intersection_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct_[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O, js.Any]]
  
  inline def intersection_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct_[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O & P, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O & P, js.Any]]
  
  inline def intersection_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct_[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O & P & Q, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A & B & C & D & E & F & G & H & I & J & K & L & M & N & O & P & Q, js.Any]]
  
  /**
    * Check if a value passes a `Struct`.
    */
  inline def is[T](value: js.Any, struct: Struct_[T, js.Any]): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  /**
    * Validate a value lazily, by constructing the struct right before the first
    * validation. This is useful for cases where you want to have self-referential
    * structs for nested data structures.
    */
  inline def `lazy`[T](fn: js.Function0[Struct_[T, js.Any]]): Struct_[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(fn.asInstanceOf[js.Any]).asInstanceOf[Struct_[T, js.Any]]
  
  /**
    * Augment a string or array struct to constrain its length to being between a
    * minimum and maximum size.
    */
  inline def length[T /* <: String | js.Array[js.Any] */](S: Struct_[T, js.Any], min: Double, max: Double): Struct_[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(S.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Struct_[T, js.Any]]
  
  inline def literal[T /* <: String */](constant: T): Struct_[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(constant.asInstanceOf[js.Any]).asInstanceOf[Struct_[T, js.Any]]
  
  inline def literal_T[T](constant: T): Struct_[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(constant.asInstanceOf[js.Any]).asInstanceOf[Struct_[T, js.Any]]
  
  /**
    * Validate that a value is a specific constant.
    */
  inline def literal_T_Boolean[T /* <: Boolean */](constant: T): Struct_[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(constant.asInstanceOf[js.Any]).asInstanceOf[Struct_[T, js.Any]]
  
  inline def literal_T_Double[T /* <: Double */](constant: T): Struct_[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(constant.asInstanceOf[js.Any]).asInstanceOf[Struct_[T, js.Any]]
  
  /**
    * Validate that a value is a map with specific key and value entries.
    */
  inline def map[K, V](Key: Struct_[K, js.Any], Value: Struct_[V, js.Any]): Struct_[Map[K, V], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(Key.asInstanceOf[js.Any], Value.asInstanceOf[js.Any])).asInstanceOf[Struct_[Map[K, V], js.Any]]
  
  /**
    * Coerce a value to mask its properties to only that defined in the struct.
    */
  inline def masked[T /* <: StringDictionary[js.Any] */, V /* <: Record[String, Struct_[js.Any, js.Any]] */](S: Struct_[T, V]): Struct_[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("masked")(S.asInstanceOf[js.Any]).asInstanceOf[Struct_[T, js.Any]]
  
  /**
    * Validate that a value always fails.
    */
  inline def never(): Struct_[scala.Nothing, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("never")().asInstanceOf[Struct_[scala.Nothing, js.Any]]
  
  /**
    * Augment a struct to make it accept `null` values.
    */
  inline def nullable[T](S: Struct_[T, js.Any]): Struct_[T | Null, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(S.asInstanceOf[js.Any]).asInstanceOf[Struct_[T | Null, js.Any]]
  
  /**
    * Validate that a value is a number.
    */
  inline def number(): Struct_[Double, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("number")().asInstanceOf[Struct_[Double, js.Any]]
  
  /**
    * Validate that an object with specific entry values.
    */
  inline def `object`[V /* <: StructRecord[js.Any] */](): Struct_[Record[String, js.Any], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("object")().asInstanceOf[Struct_[Record[String, js.Any], js.Any]]
  inline def `object`[V /* <: StructRecord[js.Any] */](Structs: V): Struct_[
    OptionalizeObject[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`object` & TopLevel[V]
    ], 
    V
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("object")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[
    OptionalizeObject[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`object` & TopLevel[V]
    ], 
    V
  ]]
  
  /**
    * Augment a struct to make it optionally accept `undefined` values.
    */
  inline def optional[T](S: Struct_[T, js.Any]): Struct_[js.UndefOr[T], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(S.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.UndefOr[T], js.Any]]
  
  /**
    * Validate that a partial object with specific entry values.
    */
  inline def partial[T, V /* <: StructRecord[js.Any] */](Structs: V): Struct_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial & TopLevel[V], 
    js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial & TopLevel[V], 
    js.Any
  ]]
  inline def partial[T, V /* <: StructRecord[js.Any] */](Structs: Struct_[T, V]): Struct_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial & TopLevel[V], 
    js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.partial & TopLevel[V], 
    js.Any
  ]]
  
  /**
    * Refine a string struct to match a specific regexp pattern.
    */
  inline def pattern[T /* <: String */](S: Struct_[T, js.Any], regexp: RegExp): Struct_[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(S.asInstanceOf[js.Any], regexp.asInstanceOf[js.Any])).asInstanceOf[Struct_[T, js.Any]]
  
  /**
    * Validate that a value is a record with specific key and
    * value entries.
    */
  inline def record[K /* <: String | Double */, V](Key: Struct_[K, js.Any], Value: Struct_[V, js.Any]): Struct_[Record[K, V], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("record")(Key.asInstanceOf[js.Any], Value.asInstanceOf[js.Any])).asInstanceOf[Struct_[Record[K, V], js.Any]]
  
  /**
    * Augment a `Struct` to add an additional refinement to the validation.
    */
  inline def refinement[T](
    struct: Struct_[T, js.Any],
    `type`: String,
    refiner: js.Function2[/* value */ T, /* context */ StructContext, StructResult]
  ): Struct_[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(struct.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], refiner.asInstanceOf[js.Any])).asInstanceOf[Struct_[T, js.Any]]
  
  /**
    * Validate that a set of values matches a specific type.
    */
  inline def set[T](Element: Struct_[T, js.Any]): Struct_[Set[T], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(Element.asInstanceOf[js.Any]).asInstanceOf[Struct_[Set[T], js.Any]]
  
  /**
    * Validate that a value is a string.
    */
  inline def string(): Struct_[String, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[Struct_[String, js.Any]]
  
  /**
    * Define a `Struct` instance with a type and validation function.
    */
  inline def struct[T](
    name: String,
    validator: js.Function2[/* value */ js.Any, /* context */ StructContext, StructResult]
  ): Struct_[T, Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("struct")(name.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Struct_[T, Null]]
  
  /**
    * Validate that a value is a tuple with entries of specific types.
    */
  inline def tuple[A](Structs: StructTuple[js.Array[A]]): Struct_[A, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A, js.Any]]
  
  inline def tuple_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct_[js.Tuple2[A, B], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple2[A, B], js.Any]]
  
  inline def tuple_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct_[js.Tuple3[A, B, C], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple3[A, B, C], js.Any]]
  
  inline def tuple_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct_[js.Tuple4[A, B, C, D], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple4[A, B, C, D], js.Any]]
  
  inline def tuple_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct_[js.Tuple5[A, B, C, D, E], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple5[A, B, C, D, E], js.Any]]
  
  inline def tuple_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct_[js.Tuple6[A, B, C, D, E, F], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple6[A, B, C, D, E, F], js.Any]]
  
  inline def tuple_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct_[js.Tuple7[A, B, C, D, E, F, G], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple7[A, B, C, D, E, F, G], js.Any]]
  
  inline def tuple_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct_[js.Tuple8[A, B, C, D, E, F, G, H], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple8[A, B, C, D, E, F, G, H], js.Any]]
  
  inline def tuple_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct_[js.Tuple9[A, B, C, D, E, F, G, H, I], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple9[A, B, C, D, E, F, G, H, I], js.Any]]
  
  inline def tuple_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct_[js.Tuple10[A, B, C, D, E, F, G, H, I, J], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple10[A, B, C, D, E, F, G, H, I, J], js.Any]]
  
  inline def tuple_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct_[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K], js.Any]]
  
  inline def tuple_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct_[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L], js.Any]]
  
  inline def tuple_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct_[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M], js.Any]]
  
  inline def tuple_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct_[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N], js.Any]]
  
  inline def tuple_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct_[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O], js.Any]]
  
  inline def tuple_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct_[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P], js.Any]]
  
  inline def tuple_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct_[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q], js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q], js.Any]]
  
  /**
    * Validate that a value matches a specific strutural interface, like the
    * structural typing that TypeScript uses.
    */
  inline def `type`[V /* <: StructRecord[js.Any] */](Structs: V): Struct_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`type` & TopLevel[V], 
    js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: superstruct.superstruct/lib/index.es.StructType<V[K]>}
    */ typings.superstruct.superstructStrings.`type` & TopLevel[V], 
    js.Any
  ]]
  
  /**
    * Validate that a value is one of a set of types.
    */
  inline def union[A](Structs: StructTuple[js.Array[A]]): Struct_[A, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A, js.Any]]
  
  inline def union_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct_[A | B, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B, js.Any]]
  
  inline def union_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct_[A | B | C, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C, js.Any]]
  
  inline def union_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct_[A | B | C | D, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C | D, js.Any]]
  
  inline def union_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct_[A | B | C | D | E, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C | D | E, js.Any]]
  
  inline def union_ABCDEF[A, B, C, D, E, F](Structs: StructTuple[js.Tuple6[A, B, C, D, E, F]]): Struct_[A | B | C | D | E | F, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C | D | E | F, js.Any]]
  
  inline def union_ABCDEFG[A, B, C, D, E, F, G](Structs: StructTuple[js.Tuple7[A, B, C, D, E, F, G]]): Struct_[A | B | C | D | E | F | G, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C | D | E | F | G, js.Any]]
  
  inline def union_ABCDEFGH[A, B, C, D, E, F, G, H](Structs: StructTuple[js.Tuple8[A, B, C, D, E, F, G, H]]): Struct_[A | B | C | D | E | F | G | H, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C | D | E | F | G | H, js.Any]]
  
  inline def union_ABCDEFGHI[A, B, C, D, E, F, G, H, I](Structs: StructTuple[js.Tuple9[A, B, C, D, E, F, G, H, I]]): Struct_[A | B | C | D | E | F | G | H | I, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C | D | E | F | G | H | I, js.Any]]
  
  inline def union_ABCDEFGHIJ[A, B, C, D, E, F, G, H, I, J](Structs: StructTuple[js.Tuple10[A, B, C, D, E, F, G, H, I, J]]): Struct_[A | B | C | D | E | F | G | H | I | J, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C | D | E | F | G | H | I | J, js.Any]]
  
  inline def union_ABCDEFGHIJK[A, B, C, D, E, F, G, H, I, J, K](Structs: StructTuple[js.Tuple11[A, B, C, D, E, F, G, H, I, J, K]]): Struct_[A | B | C | D | E | F | G | H | I | J | K, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C | D | E | F | G | H | I | J | K, js.Any]]
  
  inline def union_ABCDEFGHIJKL[A, B, C, D, E, F, G, H, I, J, K, L](Structs: StructTuple[js.Tuple12[A, B, C, D, E, F, G, H, I, J, K, L]]): Struct_[A | B | C | D | E | F | G | H | I | J | K | L, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C | D | E | F | G | H | I | J | K | L, js.Any]]
  
  inline def union_ABCDEFGHIJKLM[A, B, C, D, E, F, G, H, I, J, K, L, M](Structs: StructTuple[js.Tuple13[A, B, C, D, E, F, G, H, I, J, K, L, M]]): Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M, js.Any]]
  
  inline def union_ABCDEFGHIJKLMN[A, B, C, D, E, F, G, H, I, J, K, L, M, N](Structs: StructTuple[js.Tuple14[A, B, C, D, E, F, G, H, I, J, K, L, M, N]]): Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M | N, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M | N, js.Any]]
  
  inline def union_ABCDEFGHIJKLMNO[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O](Structs: StructTuple[js.Tuple15[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O]]): Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O, js.Any]]
  
  inline def union_ABCDEFGHIJKLMNOP[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P](Structs: StructTuple[js.Tuple16[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P]]): Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P, js.Any]]
  
  inline def union_ABCDEFGHIJKLMNOPQ[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q](Structs: StructTuple[js.Tuple17[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q]]): Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(Structs.asInstanceOf[js.Any]).asInstanceOf[Struct_[A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q, js.Any]]
  
  /**
    * Validate a value against a `Struct`, returning an error if invalid.
    */
  inline def validate[T](value: js.Any, struct: Struct_[T, js.Any]): js.Tuple2[StructError | Unit, T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[StructError | Unit, T | Unit]]
  inline def validate[T](value: js.Any, struct: Struct_[T, js.Any], coercing: Boolean): js.Tuple2[StructError | Unit, T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(value.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], coercing.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[StructError | Unit, T | Unit]]
  
  /**
    * Type helper to Flatten the Union of optional and required properties.
    */
  type Flatten[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: any[K]}
    */ typings.superstruct.superstructStrings.Flatten & TopLevel[js.Any]
  
  /**
    * Type helper to extract the optional keys of an object
    */
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: undefined extends T[K]? K : never}[keyof T] */ js.Any
  
  /**
    * Type helper to create optional properties when the property value can be
    * undefined (ie. when `optional()` is used to define a type)
    */
  type OptionalizeObject[T] = Flatten[typings.superstruct.superstructStrings.OptionalizeObject & TopLevel[T]]
  
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
    
    var branch: js.Array[js.Any] = js.native
    
    def check(value: js.Any, struct: Struct_[js.Any | scala.Nothing, js.Any]): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct_[js.Any | scala.Nothing, js.Any], parent: js.Any): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct_[js.Any | scala.Nothing, js.Any], parent: js.Any, key: String): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct_[js.Any | scala.Nothing, js.Any], parent: js.Any, key: Double): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct_[js.Any | scala.Nothing, js.Any], parent: Unit, key: String): IterableIterator[StructFailure] = js.native
    def check(value: js.Any, struct: Struct_[js.Any | scala.Nothing, js.Any], parent: Unit, key: Double): IterableIterator[StructFailure] = js.native
    
    def fail(): StructFailure = js.native
    def fail(props: PartialStructFailureBranch): StructFailure = js.native
    
    var path: js.Array[String | Double] = js.native
    
    var `type`: String = js.native
    
    var value: js.Any = js.native
  }
  
  /**
    * A `StructFailure` represents a single specific failure in validation.
    */
  trait StructFailure
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var branch: js.Array[js.Any]
    
    var path: js.Array[String | Double]
    
    var `type`: String
    
    var value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/index.es.StructContext['value'] */ js.Any
  }
  object StructFailure {
    
    inline def apply(
      branch: js.Array[js.Any],
      path: js.Array[String | Double],
      `type`: String,
      value: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/index.es.StructContext['value'] */ js.Any
    ): StructFailure = {
      val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StructFailure]
    }
    
    extension [Self <: StructFailure](x: Self) {
      
      inline def setBranch(value: js.Array[js.Any]): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchVarargs(value: js.Any*): Self = StObject.set(x, "branch", js.Array(value :_*))
      
      inline def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(
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
    */ typings.superstruct.superstructStrings.StructTuple & TopLevel[T]
  
  /**
    * A type utility to extract the type from a `Struct` class.
    */
  type StructType[T /* <: Struct_[js.Any, js.Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T['refiner']>[0] */ js.Any
}
