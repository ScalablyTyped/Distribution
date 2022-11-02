package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "PopupDropdownViewModel")
@js.native
open class PopupDropdownViewModel protected () extends PopupBaseViewModel {
  def this(model: Any) = this()
  def this(model: Any, targetElement: Any) = this()
  
  var isAutoScroll: Boolean = js.native
  
  var pointerTarget: IPosition = js.native
  
  var popupDirection: String = js.native
  
  var scrollEventCallBack: Any = js.native
  
  var targetElement: Any = js.native
  
  def updatePosition(isResetHeight: Boolean): Unit = js.native
  def updatePosition(isResetHeight: Boolean, isDelayUpdating: Boolean): Unit = js.native
}
