package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "PopupBaseViewModel")
@js.native
open class PopupBaseViewModel protected () extends Base {
  def this(model: Any) = this()
  
  var _model: Any = js.native
  
  def cancel(): Unit = js.native
  
  def cancelButtonText: String = js.native
  
  def clickOutside(): Unit = js.native
  
  var container: Any = js.native
  
  def contentComponentData: Any = js.native
  
  def contentComponentName: String = js.native
  
  /* protected */ def createFooterActionBar(): Unit = js.native
  
  def footerToolbar: Any = js.native
  
  /* protected */ var footerToolbarValue: Any = js.native
  
  /* protected */ def getPopupHeaderTemplate(): String = js.native
  
  /* protected */ def getShowFooter(): Boolean = js.native
  
  /* protected */ def getShowHeader(): Boolean = js.native
  
  /* protected */ def getStyleClass(): CssClassBuilder = js.native
  
  var height: String = js.native
  
  /* protected */ def hidePopup(): Unit = js.native
  
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
  
  def popupHeaderTemplate: String = js.native
  
  /* protected */ var prevActiveElement: Any = js.native
  
  def showFooter: Boolean = js.native
  
  def showHeader: Boolean = js.native
  
  def styleClass: String = js.native
  
  def switchFocus(): Unit = js.native
  
  def title: String = js.native
  
  var top: String = js.native
  
  def unmountPopupContainer(): Unit = js.native
  
  def updateOnHiding(): Unit = js.native
  
  def updateOnShowing(): Unit = js.native
  
  var width: String = js.native
}
