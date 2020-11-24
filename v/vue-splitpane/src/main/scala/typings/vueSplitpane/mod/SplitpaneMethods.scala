package typings.vueSplitpane.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitpaneMethods extends js.Object {
  
  def onClick(): Unit = js.native
  
  def onMouseDown(): Unit = js.native
  
  def onMouseMove(e: Event): Unit = js.native
  
  def onMouseUp(): Unit = js.native
}
object SplitpaneMethods {
  
  @scala.inline
  def apply(onClick: () => Unit, onMouseDown: () => Unit, onMouseMove: Event => Unit, onMouseUp: () => Unit): SplitpaneMethods = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), onMouseDown = js.Any.fromFunction0(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction0(onMouseUp))
    __obj.asInstanceOf[SplitpaneMethods]
  }
  
  @scala.inline
  implicit class SplitpaneMethodsOps[Self <: SplitpaneMethods] (val x: Self) extends AnyVal {
    
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
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseDown(value: () => Unit): Self = this.set("onMouseDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMouseMove(value: Event => Unit): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMouseUp(value: () => Unit): Self = this.set("onMouseUp", js.Any.fromFunction0(value))
  }
}
