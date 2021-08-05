package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Calculation. */
trait Calculation extends StObject {
  
  /** The field where the aggregation is located in the document. */
  var field: js.UndefOr[String] = js.undefined
  
  /** Value of the aggregation. */
  var value: js.UndefOr[Double] = js.undefined
}
object Calculation {
  
  inline def apply(): Calculation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calculation]
  }
  
  extension [Self <: Calculation](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
