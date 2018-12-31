package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "EventDispatcher")
@js.native
/**
  * Creates eventDispatcher object. It needs to be call with '.call' to add the functionality to an object.
  */
class EventDispatcher () extends js.Object {
  /**
    * Adds a listener to an event type.
    * @param type The type of event to listen to.
    * @param listener The function that gets called when the event is fired.
    */
  def addEventListener(`type`: java.lang.String, listener: js.Function1[/* event */ Event, scala.Unit]): scala.Unit = js.native
  /**
    * Fire an event type.
    * @param type The type of event that gets fired.
    */
  def dispatchEvent(event: threeLib.Anon_Attachment): scala.Unit = js.native
  /**
    * Checks if listener is added to an event type.
    * @param type The type of event to listen to.
    * @param listener The function that gets called when the event is fired.
    */
  def hasEventListener(`type`: java.lang.String, listener: js.Function1[/* event */ Event, scala.Unit]): scala.Boolean = js.native
  /**
    * Removes a listener from an event type.
    * @param type The type of the listener that gets removed.
    * @param listener The listener function that gets removed.
    */
  def removeEventListener(`type`: java.lang.String, listener: js.Function1[/* event */ Event, scala.Unit]): scala.Unit = js.native
}

