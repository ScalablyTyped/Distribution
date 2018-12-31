package typings
package vanillaDashTiltLib.vanillaDashTiltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vanilla-tilt", JSImport.Default)
@js.native
class default protected () extends VanillaTilt {
  /**
    * Creates a new instance of a VanillaTilt element.
    * @param element The element, which should be a VanillaTilt element
    * @param settings Settings which configures the element
    */
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, settings: TiltOptions) = this()
  /**
    * Start listening to events
    */
  /* CompleteClass */
  override def addEventListeners(): scala.Unit = js.native
  /**
    * Destroys the instance and removes the listeners.
    */
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /**
    * Get values of instance
    */
  /* CompleteClass */
  override def getValues(): TiltValues = js.native
  /**
    * Stop listening to events
    */
  /* CompleteClass */
  override def removeEventListener(): scala.Unit = js.native
  /**
    * Resets the styling
    */
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
}

@JSImport("vanilla-tilt", JSImport.Default)
@js.native
object default extends js.Object {
  def init(elements: js.Array[stdLib.HTMLElement]): scala.Unit = js.native
  def init(
    elements: js.Array[stdLib.HTMLElement],
    settings: vanillaDashTiltLib.vanillaDashTiltMod.TiltOptions
  ): scala.Unit = js.native
  /**
    * Initializes one or multiple elements
    * @param elements The element, which should tilt
    * @param settings Settings, which configures the elements
    */
  def init(elements: stdLib.HTMLElement): scala.Unit = js.native
  def init(elements: stdLib.HTMLElement, settings: vanillaDashTiltLib.vanillaDashTiltMod.TiltOptions): scala.Unit = js.native
}

