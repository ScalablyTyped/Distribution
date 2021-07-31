package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "EventObject")
@js.native
class EventObject[TargetType] () extends StObject {
  
  /**
    * The object that fired the event.
    * @constant
    */
  val target: TargetType = js.native
  
  /**
    * The time at which the event was created, in milliseconds.
    * @constant
    */
  val timeStamp: Double = js.native
  
  /**
    * The event type.
    * @constant
    */
  val `type`: String = js.native
}
