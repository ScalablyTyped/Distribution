package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "EventObject")
@js.native
/**
  * Base class for all events fired by the framework. Instances may include additional properties, which
  * are documented together with the event type. Change events also have a `value` property. 
  * When the trigger method is called with a new instance of `EventObject`, `type`, `target` and
  * `timeStamp` are initialized automatically.
  */
open class EventObject[TargetType] () extends StObject {
  
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
