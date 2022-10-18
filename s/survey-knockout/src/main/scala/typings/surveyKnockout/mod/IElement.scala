package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IElement
  extends StObject
     with IConditionRunner
     with ISurveyElement {
  
  def clearErrors(): Any = js.native
  
  def clearIncorrectValues(): Any = js.native
  
  def dispose(): Unit = js.native
  
  def getLayoutType(): String = js.native
  
  def getPanel(): IPanel = js.native
  
  var isCollapsed: Boolean = js.native
  
  var isExpanded: Boolean = js.native
  
  def isLayoutTypeSupported(layoutType: String): Boolean = js.native
  
  var maxWidth: js.UndefOr[String] = js.native
  
  var minWidth: js.UndefOr[String] = js.native
  
  def needResponsiveWidth(): Boolean = js.native
  
  def onAnyValueChanged(name: String): Any = js.native
  
  def registerFunctionOnPropertyValueChanged(name: String, func: Any, key: String): Unit = js.native
  
  def registerPropertyChangedHandlers(propertyNames: Any, handler: Any, key: String): Unit = js.native
  
  def removeElement(el: IElement): Boolean = js.native
  
  var renderWidth: String = js.native
  
  var rightIndent: Double = js.native
  
  var startWithNewLine: Boolean = js.native
  
  def unRegisterFunctionOnPropertyValueChanged(name: String, key: String): Unit = js.native
  
  def updateCustomWidgets(): Any = js.native
  
  var visible: Boolean = js.native
  
  var width: String = js.native
}
