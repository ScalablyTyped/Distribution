package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _defineEmits extends StObject {
  
  def apply[TypeEmit](): TypeEmit = js.native
  def apply[E /* <: EmitsOptions */](emitOptions: E): EmitFn[E, /* keyof E */ String] = js.native
  def apply[EE /* <: String */](emitOptions: js.Array[EE]): EmitFn[
    js.Array[EE], 
    /* keyof std.Array<EE> */ "length" | "toString" | "toLocaleString" | "pop" | "push" | "concat" | "join" | "reverse" | "shift" | "slice" | "sort" | "splice" | "unshift" | "indexOf" | "lastIndexOf" | "every" | "some" | "forEach" | "map" | "filter" | "reduce" | "reduceRight" | "find" | "findIndex" | "fill" | "copyWithin" | "entries" | "keys" | "values" | "includes" | "flatMap" | "flat" | "at"
  ] = js.native
}
