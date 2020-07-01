package typings.superstruct

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import typings.std.RegExp
import typings.superstruct.anon.InstantiableAny
import typings.superstruct.structMod.Struct
import typings.superstruct.superstructBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/structs", JSImport.Namespace)
@js.native
object structsMod extends js.Object {
  def any(): Struct = js.native
  def array[T](Element: Struct): Struct = js.native
  def boolean(): Struct = js.native
  @JSName("coercion")
  def coercion_coercer[T](
    struct: Struct,
    coercer: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/struct.Struct['coercer'] */ js.Any
  ): Struct = js.native
  def date(): Struct = js.native
  def defaulted[T](S: Struct, fallback: js.Any): Struct = js.native
  @JSName("defaulted")
  def defaulted_true[T](S: Struct, fallback: js.Any, strict: `true`): Struct = js.native
  def dynamic[T](
    fn: js.Function2[
      /* value */ js.Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StructContext */ /* ctx */ js.Any, 
      Struct
    ]
  ): Struct = js.native
  def enums[T](values: js.Array[T]): Struct = js.native
  def instance[T /* <: InstantiableAny */](Class: T): Struct = js.native
  def integer(): Struct = js.native
  def intersection[A](Structs: StructTuple[js.Array[A]]): Struct = js.native
  @JSName("intersection")
  def intersection_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct = js.native
  @JSName("intersection")
  def intersection_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct = js.native
  @JSName("intersection")
  def intersection_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct = js.native
  @JSName("intersection")
  def intersection_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct = js.native
  def `lazy`[T](fn: js.Function0[Struct]): Struct = js.native
  def length[T /* <: String | js.Array[_] */](S: Struct, min: Double): Struct = js.native
  def length[T /* <: String | js.Array[_] */](S: Struct, min: Double, max: Double): Struct = js.native
  def literal[T](constant: T): Struct = js.native
  def map[K, V](Structs: StructTuple[js.Tuple2[K, V]]): Struct = js.native
  def never(): Struct = js.native
  def number(): Struct = js.native
  def `object`[V /* <: StructRecord[_] */](Structs: V): Struct = js.native
  def optional[T](S: Struct): Struct = js.native
  def partial[V /* <: StructRecord[_] */](Structs: V): Struct = js.native
  def pattern[T /* <: String */](S: Struct, regexp: RegExp): Struct = js.native
  def record[K /* <: String | Double */, V](Structs: StructTuple[js.Tuple2[K, V]]): Struct = js.native
  @JSName("refinement")
  def refinement_refiner[T](
    struct: Struct,
    `type`: String,
    refiner: /* import warning: importer.ImportType#apply Failed type conversion: superstruct.superstruct/lib/struct.Struct['refiner'] */ js.Any
  ): Struct = js.native
  def set[T](Element: Struct): Struct = js.native
  def string(): Struct = js.native
  def trimmed[T /* <: String */](S: Struct): Struct = js.native
  def tuple[A](Elements: StructTuple[js.Array[A]]): Struct = js.native
  @JSName("tuple")
  def tuple_AB[A, B](Elements: StructTuple[js.Tuple2[A, B]]): Struct = js.native
  @JSName("tuple")
  def tuple_ABC[A, B, C](Elements: StructTuple[js.Tuple3[A, B, C]]): Struct = js.native
  @JSName("tuple")
  def tuple_ABCD[A, B, C, D](Elements: StructTuple[js.Tuple4[A, B, C, D]]): Struct = js.native
  @JSName("tuple")
  def tuple_ABCDE[A, B, C, D, E](Elements: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct = js.native
  def `type`[V /* <: StructRecord[_] */](Structs: V): Struct = js.native
  def union[A](Structs: StructTuple[js.Array[A]]): Struct = js.native
  @JSName("union")
  def union_AB[A, B](Structs: StructTuple[js.Tuple2[A, B]]): Struct = js.native
  @JSName("union")
  def union_ABC[A, B, C](Structs: StructTuple[js.Tuple3[A, B, C]]): Struct = js.native
  @JSName("union")
  def union_ABCD[A, B, C, D](Structs: StructTuple[js.Tuple4[A, B, C, D]]): Struct = js.native
  @JSName("union")
  def union_ABCDE[A, B, C, D, E](Structs: StructTuple[js.Tuple5[A, B, C, D, E]]): Struct = js.native
  def unknown(): Struct = js.native
  type StructRecord[T] = Record[String, Struct]
  type StructTuple[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: superstruct.superstruct/lib/struct.Struct}
    */ typings.superstruct.superstructStrings.StructTuple with TopLevel[js.Any]
}

