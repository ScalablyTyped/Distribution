package typings.superstruct

import typings.std.Map
import typings.std.Set
import typings.superstruct.anon.Exclusive
import typings.superstruct.structMod.Refiner
import typings.superstruct.structMod.Struct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refinementsMod {
  
  @JSImport("superstruct/lib/structs/refinements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def empty[T /* <: String | js.Array[Any] | (Map[Any, Any]) | Set[Any] */, S /* <: Any */](struct: Struct[T, S]): Struct[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[T, S]]
  
  inline def max[S /* <: Any */](struct: Struct[js.Date, S], threshold: js.Date): Struct[js.Date, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Struct[js.Date, S]]
  inline def max[S /* <: Any */](struct: Struct[js.Date, S], threshold: js.Date, options: Exclusive): Struct[js.Date, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Struct[js.Date, S]]
  inline def max[S /* <: Any */](struct: Struct[Double, S], threshold: Double): Struct[Double, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Struct[Double, S]]
  inline def max[S /* <: Any */](struct: Struct[Double, S], threshold: Double, options: Exclusive): Struct[Double, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Struct[Double, S]]
  
  inline def min[S /* <: Any */](struct: Struct[js.Date, S], threshold: js.Date): Struct[js.Date, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Struct[js.Date, S]]
  inline def min[S /* <: Any */](struct: Struct[js.Date, S], threshold: js.Date, options: Exclusive): Struct[js.Date, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Struct[js.Date, S]]
  inline def min[S /* <: Any */](struct: Struct[Double, S], threshold: Double): Struct[Double, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any])).asInstanceOf[Struct[Double, S]]
  inline def min[S /* <: Any */](struct: Struct[Double, S], threshold: Double, options: Exclusive): Struct[Double, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(struct.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Struct[Double, S]]
  
  inline def nonempty[T /* <: String | js.Array[Any] | (Map[Any, Any]) | Set[Any] */, S /* <: Any */](struct: Struct[T, S]): Struct[T, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonempty")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[T, S]]
  
  inline def pattern[T /* <: String */, S /* <: Any */](struct: Struct[T, S], regexp: js.RegExp): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(struct.asInstanceOf[js.Any], regexp.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  
  inline def refine[T, S](struct: Struct[T, S], name: String, refiner: Refiner[T]): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("refine")(struct.asInstanceOf[js.Any], name.asInstanceOf[js.Any], refiner.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  
  inline def size[T /* <: String | Double | js.Date | js.Array[Any] | (Map[Any, Any]) | Set[Any] */, S /* <: Any */](struct: Struct[T, S], min: Double): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(struct.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
  inline def size[T /* <: String | Double | js.Date | js.Array[Any] | (Map[Any, Any]) | Set[Any] */, S /* <: Any */](struct: Struct[T, S], min: Double, max: Double): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("size")(struct.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
}
