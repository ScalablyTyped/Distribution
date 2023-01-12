package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Details extends StObject {
  
  var all: scala.Double
  
  var details: scala.Double
  
  var dropLocation: scala.Double
  
  var label: scala.Double
  
  var none: scala.Double
  
  var symbols: scala.Double
  
  var testResults: scala.Double
}
object Details {
  
  inline def apply(
    all: scala.Double,
    details: scala.Double,
    dropLocation: scala.Double,
    label: scala.Double,
    none: scala.Double,
    symbols: scala.Double,
    testResults: scala.Double
  ): Details = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dropLocation = dropLocation.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: scala.Double): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDropLocation(value: scala.Double): Self = StObject.set(x, "dropLocation", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: scala.Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setSymbols(value: scala.Double): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setTestResults(value: scala.Double): Self = StObject.set(x, "testResults", value.asInstanceOf[js.Any])
  }
}
