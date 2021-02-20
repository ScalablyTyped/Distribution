package typings.superstruct

import typings.std.RegExp
import typings.superstruct.structMod.Struct
import typings.superstruct.structMod.StructContext
import typings.superstruct.structMod.StructResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refinementsMod {
  
  @JSImport("superstruct/lib/refinements", "empty")
  @js.native
  def empty[T /* <: String | js.Array[_] */](S: Struct[T, _]): Struct[T, _] = js.native
  
  @JSImport("superstruct/lib/refinements", "length")
  @js.native
  def length[T /* <: String | js.Array[_] */](S: Struct[T, _], min: Double, max: Double): Struct[T, _] = js.native
  
  @JSImport("superstruct/lib/refinements", "pattern")
  @js.native
  def pattern[T /* <: String */](S: Struct[T, _], regexp: RegExp): Struct[T, _] = js.native
  
  @JSImport("superstruct/lib/refinements", "refinement")
  @js.native
  def refinement[T](
    struct: Struct[T, _],
    `type`: String,
    refiner: js.Function2[/* value */ T, /* context */ StructContext, StructResult]
  ): Struct[T, _] = js.native
}
