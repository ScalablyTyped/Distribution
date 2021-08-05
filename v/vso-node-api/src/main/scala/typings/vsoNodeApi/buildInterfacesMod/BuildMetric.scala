package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildMetric extends StObject {
  
  /**
    * The date for the scope.
    */
  var date: Date
  
  /**
    * The value.
    */
  var intValue: Double
  
  /**
    * The name of the metric.
    */
  var name: String
  
  /**
    * The scope.
    */
  var scope: String
}
object BuildMetric {
  
  inline def apply(date: Date, intValue: Double, name: String, scope: String): BuildMetric = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], intValue = intValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildMetric]
  }
  
  extension [Self <: BuildMetric](x: Self) {
    
    inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setIntValue(value: Double): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
