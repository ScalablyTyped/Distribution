package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessControl
  extends UiCanGetVisibleElement
     with UiCanSetVisibleElement {
  /**
    * Gets the display state of the process flow control.
    */
  def getDisplayState(): xrmLib.XrmNs.DisplayState
  /**
    * Reflow the UI of the process control
    * @param updateUI Specify true to update the UI of the process control; false otherwise.
    * @param parentStage ID of the parent stage.
    * @param nextStage ID of the next stage.
    */
  def reflow(updateUI: scala.Boolean, parentStage: java.lang.String, nextStage: java.lang.String): scala.Unit
  /**
    * Sets display state of the process flow control.
    * @param displayState Display state of the process flow control, as either "expanded" or "collapsed"
    */
  def setDisplayState(displayState: xrmLib.XrmNs.DisplayState): scala.Unit
}

object ProcessControl {
  @scala.inline
  def apply(
    getDisplayState: () => xrmLib.XrmNs.DisplayState,
    getVisible: () => scala.Boolean,
    reflow: (scala.Boolean, java.lang.String, java.lang.String) => scala.Unit,
    setDisplayState: xrmLib.XrmNs.DisplayState => scala.Unit,
    setVisible: scala.Boolean => scala.Unit
  ): ProcessControl = {
    val __obj = js.Dynamic.literal(getDisplayState = js.Any.fromFunction0(getDisplayState), getVisible = js.Any.fromFunction0(getVisible), reflow = js.Any.fromFunction3(reflow), setDisplayState = js.Any.fromFunction1(setDisplayState), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[ProcessControl]
  }
}

