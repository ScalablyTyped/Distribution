package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalculateTransform extends Transform {
  
  /**
    * The field for storing the computed formula value.
    */
  var as: FieldName = js.native
  
  /**
    * A [expression](https://vega.github.io/vega-lite/docs/types.html#expression) string. Use the variable `datum` to refer to the current data object.
    */
  var calculate: String = js.native
}
object CalculateTransform {
  
  @scala.inline
  def apply(as: FieldName, calculate: String): CalculateTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], calculate = calculate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculateTransform]
  }
  
  @scala.inline
  implicit class CalculateTransformMutableBuilder[Self <: CalculateTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: FieldName): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculate(value: String): Self = StObject.set(x, "calculate", value.asInstanceOf[js.Any])
  }
}
