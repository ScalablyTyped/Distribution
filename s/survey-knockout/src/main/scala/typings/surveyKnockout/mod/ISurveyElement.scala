package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISurveyElement extends StObject {
  
  var containsErrors: Boolean = js.native
  
  def delete(): js.Any = js.native
  
  def getType(): String = js.native
  
  var isPage: Boolean = js.native
  
  var isPanel: Boolean = js.native
  
  var isReadOnly: Boolean = js.native
  
  var isVisible: Boolean = js.native
  
  def locStrsChanged(): js.Any = js.native
  
  var name: String = js.native
  
  def onFirstRendering(): js.Any = js.native
  
  def onSurveyLoad(): js.Any = js.native
  
  def setSurveyImpl(value: ISurveyImpl): js.Any = js.native
  
  def setVisibleIndex(value: Double): Double = js.native
}
object ISurveyElement {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ISurveyElementMutableBuilder[Self <: ISurveyElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainsErrors(value: Boolean): Self = StObject.set(x, "containsErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => js.Any): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPage(value: Boolean): Self = StObject.set(x, "isPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPanel(value: Boolean): Self = StObject.set(x, "isPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocStrsChanged(value: () => js.Any): Self = StObject.set(x, "locStrsChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFirstRendering(value: () => js.Any): Self = StObject.set(x, "onFirstRendering", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSurveyLoad(value: () => js.Any): Self = StObject.set(x, "onSurveyLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSurveyImpl(value: ISurveyImpl => js.Any): Self = StObject.set(x, "setSurveyImpl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisibleIndex(value: Double => Double): Self = StObject.set(x, "setVisibleIndex", js.Any.fromFunction1(value))
  }
}
