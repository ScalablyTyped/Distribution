package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotsObjectExpression
  extends StObject
     with ObjectExpression {
  
  @JSName("properties")
  var properties_SlotsObjectExpression: js.Array[SlotsObjectProperty]
}
object SlotsObjectExpression {
  
  inline def apply(loc: SourceLocation, properties: js.Array[SlotsObjectProperty]): SlotsObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(15)
    __obj.asInstanceOf[SlotsObjectExpression]
  }
  
  extension [Self <: SlotsObjectExpression](x: Self) {
    
    inline def setProperties(value: js.Array[SlotsObjectProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: SlotsObjectProperty*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
