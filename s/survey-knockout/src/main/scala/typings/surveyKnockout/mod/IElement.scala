package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IElement
  extends IConditionRunner
     with ISurveyElement {
  
  def clearErrors(): js.Any = js.native
  
  def clearIncorrectValues(): js.Any = js.native
  
  def dispose(): Unit = js.native
  
  def getLayoutType(): String = js.native
  
  def getPanel(): IPanel = js.native
  
  def isLayoutTypeSupported(layoutType: String): Boolean = js.native
  
  var maxWidth: js.UndefOr[String] = js.native
  
  var minWidth: js.UndefOr[String] = js.native
  
  def onAnyValueChanged(name: String): js.Any = js.native
  
  var parent: IPanel = js.native
  
  def removeElement(el: IElement): Boolean = js.native
  
  var renderWidth: String = js.native
  
  var rightIndent: Double = js.native
  
  var startWithNewLine: Boolean = js.native
  
  def updateCustomWidgets(): js.Any = js.native
  
  var visible: Boolean = js.native
  
  var width: String = js.native
}
object IElement {
  
  @scala.inline
  def apply(
    clearErrors: () => js.Any,
    clearIncorrectValues: () => js.Any,
    containsErrors: Boolean,
    delete: () => js.Any,
    dispose: () => Unit,
    getLayoutType: () => String,
    getPanel: () => IPanel,
    getType: () => String,
    isLayoutTypeSupported: String => Boolean,
    isPage: Boolean,
    isPanel: Boolean,
    isReadOnly: Boolean,
    isVisible: Boolean,
    locStrsChanged: () => js.Any,
    name: String,
    onAnyValueChanged: String => js.Any,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    parent: IPanel,
    removeElement: IElement => Boolean,
    renderWidth: String,
    rightIndent: Double,
    runCondition: (HashTable[_], HashTable[_]) => js.Any,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: Double => Double,
    startWithNewLine: Boolean,
    updateCustomWidgets: () => js.Any,
    visible: Boolean,
    width: String
  ): IElement = {
    val __obj = js.Dynamic.literal(clearErrors = js.Any.fromFunction0(clearErrors), clearIncorrectValues = js.Any.fromFunction0(clearIncorrectValues), containsErrors = containsErrors.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), dispose = js.Any.fromFunction0(dispose), getLayoutType = js.Any.fromFunction0(getLayoutType), getPanel = js.Any.fromFunction0(getPanel), getType = js.Any.fromFunction0(getType), isLayoutTypeSupported = js.Any.fromFunction1(isLayoutTypeSupported), isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name.asInstanceOf[js.Any], onAnyValueChanged = js.Any.fromFunction1(onAnyValueChanged), onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), parent = parent.asInstanceOf[js.Any], removeElement = js.Any.fromFunction1(removeElement), renderWidth = renderWidth.asInstanceOf[js.Any], rightIndent = rightIndent.asInstanceOf[js.Any], runCondition = js.Any.fromFunction2(runCondition), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex), startWithNewLine = startWithNewLine.asInstanceOf[js.Any], updateCustomWidgets = js.Any.fromFunction0(updateCustomWidgets), visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IElement]
  }
  
  @scala.inline
  implicit class IElementOps[Self <: IElement] (val x: Self) extends AnyVal {
    
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
    def setClearErrors(value: () => js.Any): Self = this.set("clearErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearIncorrectValues(value: () => js.Any): Self = this.set("clearIncorrectValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLayoutType(value: () => String): Self = this.set("getLayoutType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPanel(value: () => IPanel): Self = this.set("getPanel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLayoutTypeSupported(value: String => Boolean): Self = this.set("isLayoutTypeSupported", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAnyValueChanged(value: String => js.Any): Self = this.set("onAnyValueChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: IPanel): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveElement(value: IElement => Boolean): Self = this.set("removeElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderWidth(value: String): Self = this.set("renderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIndent(value: Double): Self = this.set("rightIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartWithNewLine(value: Boolean): Self = this.set("startWithNewLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCustomWidgets(value: () => js.Any): Self = this.set("updateCustomWidgets", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: String): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
  }
}
