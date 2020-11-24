package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.DisplayState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessControl
  extends UiCanGetVisibleElement
     with UiCanSetVisibleElement {
  
  /**
    * Gets the display state of the process flow control.
    */
  def getDisplayState(): DisplayState = js.native
  
  /**
    * Reflow the UI of the process control
    * @param updateUI Specify true to update the UI of the process control; false otherwise.
    * @param parentStage ID of the parent stage.
    * @param nextStage ID of the next stage.
    */
  def reflow(updateUI: Boolean, parentStage: String, nextStage: String): Unit = js.native
  
  /**
    * Sets display state of the process flow control.
    * @param displayState Display state of the process flow control, as either "expanded" or "collapsed"
    */
  def setDisplayState(displayState: DisplayState): Unit = js.native
}
object ProcessControl {
  
  @scala.inline
  def apply(
    getDisplayState: () => DisplayState,
    getVisible: () => Boolean,
    reflow: (Boolean, String, String) => Unit,
    setDisplayState: DisplayState => Unit,
    setVisible: Boolean => Unit
  ): ProcessControl = {
    val __obj = js.Dynamic.literal(getDisplayState = js.Any.fromFunction0(getDisplayState), getVisible = js.Any.fromFunction0(getVisible), reflow = js.Any.fromFunction3(reflow), setDisplayState = js.Any.fromFunction1(setDisplayState), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[ProcessControl]
  }
  
  @scala.inline
  implicit class ProcessControlOps[Self <: ProcessControl] (val x: Self) extends AnyVal {
    
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
    def setGetDisplayState(value: () => DisplayState): Self = this.set("getDisplayState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReflow(value: (Boolean, String, String) => Unit): Self = this.set("reflow", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetDisplayState(value: DisplayState => Unit): Self = this.set("setDisplayState", js.Any.fromFunction1(value))
  }
}
