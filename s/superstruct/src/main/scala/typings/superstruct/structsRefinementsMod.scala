package typings.superstruct

import typings.std.RegExp
import typings.superstruct.structMod.Struct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object structsRefinementsMod {
  
  @JSImport("superstruct/lib/structs/refinements", "empty")
  @js.native
  def empty[T /* <: String | js.Array[_] */](struct: Struct[T, _]): Struct[T, _] = js.native
  
  @JSImport("superstruct/lib/structs/refinements", "length")
  @js.native
  def length[T /* <: String | js.Array[_] */](struct: Struct[T, _], min: Double, max: Double): Struct[T, _] = js.native
  
  @JSImport("superstruct/lib/structs/refinements", "negative")
  @js.native
  def negative[T /* <: Double */](struct: Struct[T, _]): Struct[T, _] = js.native
  
  @JSImport("superstruct/lib/structs/refinements", "nonnegative")
  @js.native
  def nonnegative[T /* <: Double */](struct: Struct[T, _]): Struct[T, _] = js.native
  
  @JSImport("superstruct/lib/structs/refinements", "nonpositive")
  @js.native
  def nonpositive[T /* <: Double */](struct: Struct[T, _]): Struct[T, _] = js.native
  
  @JSImport("superstruct/lib/structs/refinements", "pattern")
  @js.native
  def pattern[T /* <: String */](struct: Struct[T, _], regexp: RegExp): Struct[T, _] = js.native
  
  @JSImport("superstruct/lib/structs/refinements", "positive")
  @js.native
  def positive[T /* <: Double */](struct: Struct[T, _]): Struct[T, _] = js.native
  
  @JSImport("superstruct/lib/structs/refinements", "refinement")
  @js.native
  def refinement[T, S](
    name: String,
    struct: Struct[T, S],
    refiner: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Refiner<T, S> */ js.Any
  ): Struct[T, S] = js.native
}
