package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.IParentElement because var conflicts: isReadOnly. Inlined addElement, removeElement */ @js.native
trait IPanel extends ISurveyElement {
  
  def addElement(element: IElement, index: Double): js.Any = js.native
  
  def elementWidthChanged(el: IElement): js.Any = js.native
  
  var elements: js.Array[IElement] = js.native
  
  def getChildrenLayoutType(): String = js.native
  
  def getQuestionStartIndex(): String = js.native
  
  def getQuestionTitleLocation(): String = js.native
  
  def indexOf(el: IElement): Double = js.native
  
  var parent: IPanel = js.native
  
  def removeElement(element: IElement): Boolean = js.native
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
  implicit class IPanelOps[Self <: IPanel] (val x: Self) extends AnyVal {
    
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
    def setAddElement(value: (IElement, Double) => js.Any): Self = this.set("addElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setElementWidthChanged(value: IElement => js.Any): Self = this.set("elementWidthChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementsVarargs(value: IElement*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[IElement]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetChildrenLayoutType(value: () => String): Self = this.set("getChildrenLayoutType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetQuestionStartIndex(value: () => String): Self = this.set("getQuestionStartIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetQuestionTitleLocation(value: () => String): Self = this.set("getQuestionTitleLocation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndexOf(value: IElement => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParent(value: IPanel): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveElement(value: IElement => Boolean): Self = this.set("removeElement", js.Any.fromFunction1(value))
  }
}
