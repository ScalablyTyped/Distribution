package typings.superstruct

import typings.std.RegExp
import typings.superstruct.structMod.Struct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structsRefinementsMod {
  
  @JSImport("superstruct/lib/structs/refinements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def empty[T /* <: String | js.Array[js.Any] */](struct: Struct[T, js.Any]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  inline def length[T /* <: String | js.Array[js.Any] */](struct: Struct[T, js.Any], min: Double, max: Double): Struct[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(struct.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Struct[T, js.Any]]
  
  inline def negative[T /* <: Double */](struct: Struct[T, js.Any]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("negative")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  inline def nonnegative[T /* <: Double */](struct: Struct[T, js.Any]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonnegative")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  inline def nonpositive[T /* <: Double */](struct: Struct[T, js.Any]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("nonpositive")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  inline def pattern[T /* <: String */](struct: Struct[T, js.Any], regexp: RegExp): Struct[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(struct.asInstanceOf[js.Any], regexp.asInstanceOf[js.Any])).asInstanceOf[Struct[T, js.Any]]
  
  inline def positive[T /* <: Double */](struct: Struct[T, js.Any]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("positive")(struct.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  inline def refinement[T, S](
    name: String,
    struct: Struct[T, S],
    refiner: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Refiner<T, S> */ js.Any
  ): Struct[T, S] = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(name.asInstanceOf[js.Any], struct.asInstanceOf[js.Any], refiner.asInstanceOf[js.Any])).asInstanceOf[Struct[T, S]]
}
