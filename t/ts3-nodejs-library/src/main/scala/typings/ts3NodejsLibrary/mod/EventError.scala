package typings.ts3NodejsLibrary.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib", "EventError")
@js.native
class EventError protected ()
  extends typings.ts3NodejsLibrary.eventErrorMod.EventError {
  /**
    * @param message error message
    * @param eventName source event of this error
    */
  def this(message: String, eventName: String) = this()
}

