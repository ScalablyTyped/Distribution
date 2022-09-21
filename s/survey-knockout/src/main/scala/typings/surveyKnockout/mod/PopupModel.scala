package typings.surveyKnockout.mod

import typings.surveyKnockout.surveyKnockoutStrings.overlay
import typings.surveyKnockout.surveyKnockoutStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "PopupModel")
@js.native
open class PopupModel[T] protected () extends Base {
  def this(
    contentComponentName: String,
    contentComponentData: T,
    verticalPosition: js.UndefOr[Any],
    horizontalPosition: js.UndefOr[Any],
    showPointer: js.UndefOr[Boolean],
    isModal: js.UndefOr[Boolean],
    onCancel: js.UndefOr[Any],
    onApply: js.UndefOr[Any],
    onHide: js.UndefOr[Any],
    onShow: js.UndefOr[Any],
    cssClass: js.UndefOr[String],
    title: js.UndefOr[String]
  ) = this()
  
  var contentComponentData: T = js.native
  
  var contentComponentName: String = js.native
  
  var cssClass: String = js.native
  
  var displayMode: popup | overlay = js.native
  
  var focusFirstInputSelector: String = js.native
  
  var horizontalPosition: Any = js.native
  
  var isFocusedContent: Boolean = js.native
  
  var isModal: Boolean = js.native
  
  def isVisible: Boolean = js.native
  def isVisible_=(`val`: Boolean): Unit = js.native
  
  var onApply: Any = js.native
  
  var onCancel: Any = js.native
  
  var onHide: Any = js.native
  
  var onShow: Any = js.native
  
  var onTargetModified: EventBase[Base] = js.native
  
  var onVisibilityChanged: EventBase[PopupModel[Any]] = js.native
  
  var positionMode: Any = js.native
  
  var setWidthByTarget: Boolean = js.native
  
  var showPointer: Boolean = js.native
  
  def targetModified(): Unit = js.native
  
  var title: String = js.native
  
  def toggleVisibility(): Unit = js.native
  
  var verticalPosition: Any = js.native
}
