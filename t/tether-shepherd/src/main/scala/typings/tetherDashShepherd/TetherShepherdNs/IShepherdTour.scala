package typings.tetherDashShepherd.TetherShepherdNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShepherdTour
  extends Instantiable0[IShepherdTour]
     with Instantiable1[/* options */ IShepherdTourOptions, IShepherdTour] {
  def addStep(id: String, options: IShepherdTourStep): IShepherdTour = js.native
  /**
    * Creates a new Step object with options, and returns the Tour object for convenient chaining when creating multiple steps. If you'd like you can also just pass an options hash which includes id as a key. If the options hash doesn't include an id, one will be generated. You can also pass an existing Step instance rather than options, but note that Shepherd does not support a Step being attached to multiple Tours.
    */
  def addStep(id: String, options: IShepherdTourStepOptions): IShepherdTour = js.native
  /**
    * Show the previous step, in the order they were added
    */
  def back(): Unit = js.native
  /**
    * Trigger cancel on the current step, hiding it without advancing
    */
  def cancel(): Unit = js.native
  /**
    * Return a step with a specific id
    */
  def getById(id: String): IShepherdTourStep = js.native
  /**
    * Returns the currently shown step
    */
  def getCurrentStep(): IShepherdTourStep = js.native
  /**
    * Hide the current step
    */
  def hide(): Unit = js.native
  /**
    * Advance to the next step, in the order they were added
    */
  def next(): Unit = js.native
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
    * Show the step specified by id (if it's a string), or index (if it's a number) provided. Defaults to the first step.
    */
  def show(): Unit = js.native
  def show(id: String): Unit = js.native
  def show(id: Double): Unit = js.native
  /**
    * Show the first step and begin the tour
    */
  def start(): Unit = js.native
}

