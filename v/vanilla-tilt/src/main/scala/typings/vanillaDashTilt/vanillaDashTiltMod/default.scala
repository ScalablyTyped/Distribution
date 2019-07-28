package typings.vanillaDashTilt.vanillaDashTiltMod

import typings.std.HTMLElement
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
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, settings: TiltOptions) = this()
  /**
    * Start listening to events
    */
  /* CompleteClass */
  override def addEventListeners(): Unit = js.native
  /**
    * Destroys the instance and removes the listeners.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Get values of instance
    */
  /* CompleteClass */
  override def getValues(): TiltValues = js.native
  /**
    * Stop listening to events
    */
  /* CompleteClass */
  override def removeEventListener(): Unit = js.native
  /**
    * Resets the styling
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
}

/* static members */
@JSImport("vanilla-tilt", JSImport.Default)
@js.native
object default extends js.Object {
  def init(elements: js.Array[HTMLElement]): Unit = js.native
  def init(elements: js.Array[HTMLElement], settings: TiltOptions): Unit = js.native
  /**
    * Initializes one or multiple elements
    * @param elements The element, which should tilt
    * @param settings Settings, which configures the elements
    */
  def init(elements: HTMLElement): Unit = js.native
  def init(elements: HTMLElement, settings: TiltOptions): Unit = js.native
}

