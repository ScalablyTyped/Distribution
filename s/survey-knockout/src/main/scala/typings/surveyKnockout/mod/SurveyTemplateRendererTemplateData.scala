package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurveyTemplateRendererTemplateData extends StObject {
  
  def afterRender(el: Any, context: Any): Unit
  
  var data: Any
  
  var name: String
  
  var nodes: js.UndefOr[Any] = js.undefined
}
object SurveyTemplateRendererTemplateData {
  
  inline def apply(afterRender: (Any, Any) => Unit, data: Any, name: String): SurveyTemplateRendererTemplateData = {
    val __obj = js.Dynamic.literal(afterRender = js.Any.fromFunction2(afterRender), data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurveyTemplateRendererTemplateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SurveyTemplateRendererTemplateData] (val x: Self) extends AnyVal {
    
    inline def setAfterRender(value: (Any, Any) => Unit): Self = StObject.set(x, "afterRender", js.Any.fromFunction2(value))
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
  }
}
