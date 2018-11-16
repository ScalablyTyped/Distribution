package typings
package tetherDashShepherdLib.TetherShepherdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShepherdTourStep extends js.Object {
  /**
           * Hide this step and trigger the cancel event
           */
  def cancel(): scala.Unit = js.native
  /**
           * Hide this step and trigger the complete event
           */
  def complete(): scala.Unit = js.native
  /**
           * Remove the element
           */
  def destroy(): scala.Unit = js.native
  /**
           * Hide this step
           */
  def hide(): scala.Unit = js.native
  /**
           * Returns true if the step is currently shown
           */
  def isOpen(): scala.Boolean = js.native
  /**
           * Unbind an event
           */
  def off(eventName: java.lang.String): js.Any = js.native
  /**
           * Unbind an event
           */
  def off(eventName: java.lang.String, handler: js.Function): js.Any = js.native
  /**
           * Bind an event
           */
  def on(eventName: java.lang.String, handler: js.Function): js.Any = js.native
  /**
           * Bind an event
           */
  def on(eventName: java.lang.String, handler: js.Function, context: js.Any): js.Any = js.native
  /**
           * Bind just the next instance of an event
           */
  def once(eventName: java.lang.String, handler: js.Function): js.Any = js.native
  /**
           * Bind just the next instance of an event
           */
  def once(eventName: java.lang.String, handler: js.Function, context: js.Any): js.Any = js.native
  /**
           * Scroll to this step's element
           */
  def scrollTo(): scala.Unit = js.native
  /**
           * Show this step
           */
  def show(): scala.Unit = js.native
}

