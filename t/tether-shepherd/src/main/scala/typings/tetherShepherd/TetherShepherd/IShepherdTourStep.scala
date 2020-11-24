package typings.tetherShepherd.TetherShepherd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShepherdTourStep extends js.Object {
  
  /**
    * Hide this step and trigger the cancel event
    */
  def cancel(): Unit = js.native
  
  /**
    * Hide this step and trigger the complete event
    */
  def complete(): Unit = js.native
  
  /**
    * Remove the element
    */
  def destroy(): Unit = js.native
  
  /**
    * Hide this step
    */
  def hide(): Unit = js.native
  
  /**
    * Returns true if the step is currently shown
    */
  def isOpen(): Boolean = js.native
  
  /**
    * Unbind an event
    */
  def off(eventName: String): js.Any = js.native
  def off(eventName: String, handler: js.Function): js.Any = js.native
  
  /**
    * Bind an event
    */
  def on(eventName: String, handler: js.Function): js.Any = js.native
  def on(eventName: String, handler: js.Function, context: js.Any): js.Any = js.native
  
  /**
    * Bind just the next instance of an event
    */
  def once(eventName: String, handler: js.Function): js.Any = js.native
  def once(eventName: String, handler: js.Function, context: js.Any): js.Any = js.native
  
  /**
    * Scroll to this step's element
    */
  def scrollTo(): Unit = js.native
  
  /**
    * Show this step
    */
  def show(): Unit = js.native
}
