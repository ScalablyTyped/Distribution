package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.IParentElement because var conflicts: isReadOnly. Inlined addElement, removeElement */ trait IPanel
  extends StObject
     with ISurveyElement {
  
  def addElement(element: IElement, index: Double): js.Any
  
  def elementWidthChanged(el: IElement): js.Any
  
  var elements: js.Array[IElement]
  
  def getChildrenLayoutType(): String
  
  def getQuestionStartIndex(): String
  
  def getQuestionTitleLocation(): String
  
  def indexOf(el: IElement): Double
  
  var parent: IPanel
  
  def removeElement(element: IElement): Boolean
}
object IPanel {
  
  @scala.inline
  def apply(
    addElement: (IElement, Double) => js.Any,
    containsErrors: Boolean,
    delete: () => js.Any,
    elementWidthChanged: IElement => js.Any,
    elements: js.Array[IElement],
    getChildrenLayoutType: () => String,
    getQuestionStartIndex: () => String,
    getQuestionTitleLocation: () => String,
    getType: () => String,
    indexOf: IElement => Double,
    isPage: Boolean,
    isPanel: Boolean,
    isReadOnly: Boolean,
    isVisible: Boolean,
    locStrsChanged: () => js.Any,
    name: String,
    onFirstRendering: () => js.Any,
    onSurveyLoad: () => js.Any,
    parent: IPanel,
    removeElement: IElement => Boolean,
    setSurveyImpl: ISurveyImpl => js.Any,
    setVisibleIndex: Double => Double
  ): IPanel = {
    val __obj = js.Dynamic.literal(addElement = js.Any.fromFunction2(addElement), containsErrors = containsErrors.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), elementWidthChanged = js.Any.fromFunction1(elementWidthChanged), elements = elements.asInstanceOf[js.Any], getChildrenLayoutType = js.Any.fromFunction0(getChildrenLayoutType), getQuestionStartIndex = js.Any.fromFunction0(getQuestionStartIndex), getQuestionTitleLocation = js.Any.fromFunction0(getQuestionTitleLocation), getType = js.Any.fromFunction0(getType), indexOf = js.Any.fromFunction1(indexOf), isPage = isPage.asInstanceOf[js.Any], isPanel = isPanel.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], locStrsChanged = js.Any.fromFunction0(locStrsChanged), name = name.asInstanceOf[js.Any], onFirstRendering = js.Any.fromFunction0(onFirstRendering), onSurveyLoad = js.Any.fromFunction0(onSurveyLoad), parent = parent.asInstanceOf[js.Any], removeElement = js.Any.fromFunction1(removeElement), setSurveyImpl = js.Any.fromFunction1(setSurveyImpl), setVisibleIndex = js.Any.fromFunction1(setVisibleIndex))
    __obj.asInstanceOf[IPanel]
  }
  
  @scala.inline
  implicit class IPanelMutableBuilder[Self <: IPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddElement(value: (IElement, Double) => js.Any): Self = StObject.set(x, "addElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setElementWidthChanged(value: IElement => js.Any): Self = StObject.set(x, "elementWidthChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElements(value: js.Array[IElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: IElement*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setGetChildrenLayoutType(value: () => String): Self = StObject.set(x, "getChildrenLayoutType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetQuestionStartIndex(value: () => String): Self = StObject.set(x, "getQuestionStartIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetQuestionTitleLocation(value: () => String): Self = StObject.set(x, "getQuestionTitleLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndexOf(value: IElement => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: IPanel): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveElement(value: IElement => Boolean): Self = StObject.set(x, "removeElement", js.Any.fromFunction1(value))
  }
}
