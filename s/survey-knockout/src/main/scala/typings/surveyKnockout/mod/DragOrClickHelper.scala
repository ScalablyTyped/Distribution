package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "DragOrClickHelper")
@js.native
open class DragOrClickHelper protected () extends StObject {
  def this(dragHandler: Any) = this()
  
  var currentTarget: Any = js.native
  
  var currentX: Any = js.native
  
  var currentY: Any = js.native
  
  var itemModel: Any = js.native
  
  def onPointerDown(pointerDownEvent: Any): Unit = js.native
  def onPointerDown(pointerDownEvent: Any, itemModel: Any): Unit = js.native
  
  def onPointerUp(pointerUpEvent: Any): Unit = js.native
  
  var pointerDownEvent: Any = js.native
  
  var startX: Any = js.native
  
  var startY: Any = js.native
  
  def tryToStartDrag(pointerMoveEvent: Any): Boolean = js.native
}
