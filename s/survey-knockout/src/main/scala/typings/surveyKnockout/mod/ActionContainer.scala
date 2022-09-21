package typings.surveyKnockout.mod

import typings.surveyKnockout.surveyKnockoutStrings.default
import typings.surveyKnockout.surveyKnockoutStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ActionContainer")
@js.native
open class ActionContainer[T /* <: Action */] ()
  extends Base
     with ILocalizableOwner {
  
  var actions: Any = js.native
  
  def addAction(`val`: IAction): Action = js.native
  def addAction(`val`: IAction, sortByVisibleIndex: Boolean): Action = js.native
  
  var containerCss: String = js.native
  
  def cssClasses: Any = js.native
  
  var cssClassesValue: Any = js.native
  
  def getActionById(id: String): T = js.native
  
  /* protected */ def getDefaultCssClasses(): Any = js.native
  
  /* InferMemberOverrides */
  override def getLocale(): String = js.native
  
  /* CompleteClass */
  override def getMarkdownHtml(text: String, name: String): String = js.native
  
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  
  /* protected */ def getRenderedActions(): js.Array[T] = js.native
  
  /* CompleteClass */
  override def getRenderer(name: String): String = js.native
  
  /* CompleteClass */
  override def getRendererContext(locStr: LocalizableString): Any = js.native
  
  def getRootCss(): String = js.native
  
  def hasActions: Boolean = js.native
  
  def initResponsivityManager(container: Any): Unit = js.native
  
  var isEmpty: Boolean = js.native
  
  var locOwner: ILocalizableOwner = js.native
  
  /* protected */ def onPush(item: T): Unit = js.native
  
  /* protected */ def onRemove(item: T): Unit = js.native
  
  /* protected */ def onSet(): Unit = js.native
  
  /* protected */ def raiseUpdate(isResetInitialized: Boolean): Unit = js.native
  
  def renderedActions: Any = js.native
  
  def resetResponsivityManager(): Unit = js.native
  
  def setItems(items: Any): Unit = js.native
  def setItems(items: Any, sortByVisibleIndex: Boolean): Unit = js.native
  
  var sizeMode: default | small = js.native
  
  def updateCallback(isResetInitialized: Boolean): Unit = js.native
  
  def visibleActions: Any = js.native
}
