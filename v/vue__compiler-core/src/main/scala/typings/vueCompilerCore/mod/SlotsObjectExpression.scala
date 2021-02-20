package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`15`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotsObjectExpression
  extends ObjectExpression
     with SlotsExpression {
  
  @JSName("properties")
  var properties_SlotsObjectExpression: js.Array[SlotsObjectProperty] = js.native
}
object SlotsObjectExpression {
  
  @scala.inline
  def apply(loc: SourceLocation, properties: js.Array[SlotsObjectProperty], `type`: `15`): SlotsObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotsObjectExpression]
  }
  
  @scala.inline
  implicit class SlotsObjectExpressionMutableBuilder[Self <: SlotsObjectExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Array[SlotsObjectProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: SlotsObjectProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
  }
}
