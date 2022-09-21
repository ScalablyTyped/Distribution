package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurveyTemplateRendererViewModel extends StObject {
  
  var componentData: Any
  
  var templateData: SurveyTemplateRendererTemplateData
}
object SurveyTemplateRendererViewModel {
  
  inline def apply(componentData: Any, templateData: SurveyTemplateRendererTemplateData): SurveyTemplateRendererViewModel = {
    val __obj = js.Dynamic.literal(componentData = componentData.asInstanceOf[js.Any], templateData = templateData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurveyTemplateRendererViewModel]
  }
  
  extension [Self <: SurveyTemplateRendererViewModel](x: Self) {
    
    inline def setComponentData(value: Any): Self = StObject.set(x, "componentData", value.asInstanceOf[js.Any])
    
    inline def setTemplateData(value: SurveyTemplateRendererTemplateData): Self = StObject.set(x, "templateData", value.asInstanceOf[js.Any])
  }
}
