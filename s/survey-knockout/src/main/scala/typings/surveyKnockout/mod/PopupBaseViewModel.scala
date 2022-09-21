package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "PopupBaseViewModel")
@js.native
open class PopupBaseViewModel protected () extends Base {
  def this(model: Any) = this()
  def this(model: Any, targetElement: Any) = this()
  
  var _model: Any = js.native
  
  @JSName("apply")
  def apply(): Unit = js.native
  
  def applyButtonText: String = js.native
  
  def cancel(): Unit = js.native
  
  def cancelButtonText: String = js.native
  
  def clickOutside(): Unit = js.native
  
  var container: Any = js.native
  
  def contentComponentData: Any = js.native
  
  def contentComponentName: String = js.native
  
  var height: String = js.native
  
  def initializePopupContainer(): Unit = js.native
  
  def isFocusedContent: Boolean = js.native
  
  def isModal: Boolean = js.native
  
  def isOverlay: Boolean = js.native
  
  var isVisible: Boolean = js.native
  
  var left: String = js.native
  
  var minWidth: String = js.native
  
  def model: Any = js.native
  def model_=(`val`: Any): Unit = js.native
  
  def onKeyDown(event: Any): Unit = js.native
  
  var pointerTarget: IPosition = js.native
  
  var popupDirection: String = js.native
  
  var prevActiveElement: Any = js.native
  
  var scrollEventCallBack: Any = js.native
  
  def showFooter: Boolean = js.native
  
  def showPointer: Boolean = js.native
  
  def styleClass: String = js.native
  
  var targetElement: Any = js.native
  
  def title: String = js.native
  
  var top: String = js.native
  
  def unmountPopupContainer(): Unit = js.native
  
  def updateOnHiding(): Unit = js.native
  
  def updateOnShowing(): Unit = js.native
  
  var width: String = js.native
}
