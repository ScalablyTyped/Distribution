package typings.superstruct

import typings.std.RegExp
import typings.superstruct.structMod.Struct
import typings.superstruct.structMod.StructContext
import typings.superstruct.structMod.StructResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refinementsMod {
  
  @JSImport("superstruct/lib/refinements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def empty[T /* <: String | js.Array[js.Any] */](S: Struct[T, js.Any]): Struct[T, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(S.asInstanceOf[js.Any]).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def length[T /* <: String | js.Array[js.Any] */](S: Struct[T, js.Any], min: Double, max: Double): Struct[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(S.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def pattern[T /* <: String */](S: Struct[T, js.Any], regexp: RegExp): Struct[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("pattern")(S.asInstanceOf[js.Any], regexp.asInstanceOf[js.Any])).asInstanceOf[Struct[T, js.Any]]
  
  @scala.inline
  def refinement[T](
    struct: Struct[T, js.Any],
    `type`: String,
    refiner: js.Function2[/* value */ T, /* context */ StructContext, StructResult]
  ): Struct[T, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("refinement")(struct.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], refiner.asInstanceOf[js.Any])).asInstanceOf[Struct[T, js.Any]]
}
