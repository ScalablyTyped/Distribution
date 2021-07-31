package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IElement
  extends StObject
     with IConditionRunner
     with ISurveyElement {
  
  def clearErrors(): js.Any
  
  def clearIncorrectValues(): js.Any
  
  def dispose(): Unit
  
  def getLayoutType(): String
  
  def getPanel(): IPanel
  
  def isLayoutTypeSupported(layoutType: String): Boolean
  
  var maxWidth: js.UndefOr[String] = js.undefined
  
  var minWidth: js.UndefOr[String] = js.undefined
  
  def onAnyValueChanged(name: String): js.Any
  
  var parent: IPanel
  
  def removeElement(el: IElement): Boolean
  
  var renderWidth: String
  
  var rightIndent: Double
  
  var startWithNewLine: Boolean
  
  def updateCustomWidgets(): js.Any
  
  var visible: Boolean
  
  var width: String
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
    runCondition: (HashTable[js.Any], HashTable[js.Any]) => js.Any,
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
  implicit class IElementMutableBuilder[Self <: IElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearErrors(value: () => js.Any): Self = StObject.set(x, "clearErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearIncorrectValues(value: () => js.Any): Self = StObject.set(x, "clearIncorrectValues", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLayoutType(value: () => String): Self = StObject.set(x, "getLayoutType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPanel(value: () => IPanel): Self = StObject.set(x, "getPanel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLayoutTypeSupported(value: String => Boolean): Self = StObject.set(x, "isLayoutTypeSupported", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setOnAnyValueChanged(value: String => js.Any): Self = StObject.set(x, "onAnyValueChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: IPanel): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveElement(value: IElement => Boolean): Self = StObject.set(x, "removeElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderWidth(value: String): Self = StObject.set(x, "renderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightIndent(value: Double): Self = StObject.set(x, "rightIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartWithNewLine(value: Boolean): Self = StObject.set(x, "startWithNewLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateCustomWidgets(value: () => js.Any): Self = StObject.set(x, "updateCustomWidgets", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
