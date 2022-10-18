package typings.vegaLite.buildSrcTransformMod

import typings.vegaLite.buildSrcChanneldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculateTransform
  extends StObject
     with Transform {
  
  /**
    * The field for storing the computed formula value.
    */
  var as: FieldName
  
  /**
    * A [expression](https://vega.github.io/vega-lite/docs/types.html#expression) string. Use the variable `datum` to refer to the current data object.
    */
  var calculate: String
}
object CalculateTransform {
  
  inline def apply(as: FieldName, calculate: String): CalculateTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], calculate = calculate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculateTransform]
  }
  
  extension [Self <: CalculateTransform](x: Self) {
    
    inline def setAs(value: FieldName): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setCalculate(value: String): Self = StObject.set(x, "calculate", value.asInstanceOf[js.Any])
  }
}
