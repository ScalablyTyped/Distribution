package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISurveyElement extends StObject {
  
  var containsErrors: Boolean
  
  def delete(): js.Any
  
  def getType(): String
  
  var isPage: Boolean
  
  var isPanel: Boolean
  
  var isReadOnly: Boolean
  
  var isVisible: Boolean
  
  def locStrsChanged(): js.Any
  
  var name: String
  
  def onFirstRendering(): js.Any
  
  def onSurveyLoad(): js.Any
  
  def setSurveyImpl(value: ISurveyImpl): js.Any
  
  def setVisibleIndex(value: Double): Double
}
object ISurveyElement {
  
  inline def apply(
    containsErrors: Boolean,
    delete: () => js.Any,
    getType: () => String,
    isPage: Boolean,
    isPanel: Boolean,
    isReadOnly: Boolean,
    isVisible: Boolean,
    locStrsChanged: () => js.Any,
    name: String,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: Double => Double
  ): ISurveyElement = {
    val __obj = js.Dynamic.literal(containsErrors = containsErrors.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), getType = js.Any.fromFunction0(getType), isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name.asInstanceOf[js.Any], onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex))
    __obj.asInstanceOf[ISurveyElement]
  }
  
  extension [Self <: ISurveyElement](x: Self) {
    
    inline def setContainsErrors(value: Boolean): Self = StObject.set(x, "containsErrors", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => js.Any): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    
    inline def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    inline def setIsPage(value: Boolean): Self = StObject.set(x, "isPage", value.asInstanceOf[js.Any])
    
    inline def setIsPanel(value: Boolean): Self = StObject.set(x, "isPanel", value.asInstanceOf[js.Any])
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setLocStrsChanged(value: () => js.Any): Self = StObject.set(x, "locStrsChanged", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnFirstRendering(value: () => js.Any): Self = StObject.set(x, "onFirstRendering", js.Any.fromFunction0(value))
    
    inline def setOnSurveyLoad(value: () => js.Any): Self = StObject.set(x, "onSurveyLoad", js.Any.fromFunction0(value))
    
    inline def setSetSurveyImpl(value: ISurveyImpl => js.Any): Self = StObject.set(x, "setSurveyImpl", js.Any.fromFunction1(value))
    
    inline def setSetVisibleIndex(value: Double => Double): Self = StObject.set(x, "setVisibleIndex", js.Any.fromFunction1(value))
  }
}
