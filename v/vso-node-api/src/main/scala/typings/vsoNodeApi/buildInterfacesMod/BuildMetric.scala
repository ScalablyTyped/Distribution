package typings.vsoNodeApi.buildInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildMetric extends StObject {
  
  /**
    * The date for the scope.
    */
  var date: Date = js.native
  
  /**
    * The value.
    */
  var intValue: Double = js.native
  
  /**
    * The name of the metric.
    */
  var name: String = js.native
  
  /**
    * The scope.
    */
  var scope: String = js.native
}
object BuildMetric {
  
  @scala.inline
  def apply(date: Date, intValue: Double, name: String, scope: String): BuildMetric = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], intValue = intValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildMetric]
  }
  
  @scala.inline
  implicit class BuildMetricMutableBuilder[Self <: BuildMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntValue(value: Double): Self = StObject.set(x, "intValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
