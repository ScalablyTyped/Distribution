package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.surveyKnockout.mod.IParentElement because var conflicts: isReadOnly. Inlined addElement, removeElement */ @js.native
trait IPanel
  extends StObject
     with ISurveyElement {
  
  def addElement(element: IElement, index: Double): Any = js.native
  
  def elementWidthChanged(el: IElement): Any = js.native
  
  var elements: Any = js.native
  
  def ensureRowsVisibility(): Unit = js.native
  
  def getChildrenLayoutType(): String = js.native
  
  def getQuestionStartIndex(): String = js.native
  
  def getQuestionTitleLocation(): String = js.native
  
  def indexOf(el: IElement): Double = js.native
  
  def removeElement(element: IElement): Boolean = js.native
}
