package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-model", "ArrayValue")
@js.native
open class ArrayValue protected () extends Value {
  def this(_values: js.Array[Value]) = this()
  
  /* private */ var _values: Any = js.native
  
  def values(): js.Array[Value] = js.native
}
