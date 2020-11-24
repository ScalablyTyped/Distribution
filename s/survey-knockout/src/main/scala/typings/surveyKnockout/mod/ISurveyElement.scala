package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISurveyElement extends js.Object {
  
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
  implicit class ISurveyElementOps[Self <: ISurveyElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainsErrors(value: Boolean): Self = this.set("containsErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => js.Any): Self = this.set("delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => String): Self = this.set("getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPage(value: Boolean): Self = this.set("isPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPanel(value: Boolean): Self = this.set("isPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocStrsChanged(value: () => js.Any): Self = this.set("locStrsChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFirstRendering(value: () => js.Any): Self = this.set("onFirstRendering", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSurveyLoad(value: () => js.Any): Self = this.set("onSurveyLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSurveyImpl(value: ISurveyImpl => js.Any): Self = this.set("setSurveyImpl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVisibleIndex(value: Double => Double): Self = this.set("setVisibleIndex", js.Any.fromFunction1(value))
  }
}
