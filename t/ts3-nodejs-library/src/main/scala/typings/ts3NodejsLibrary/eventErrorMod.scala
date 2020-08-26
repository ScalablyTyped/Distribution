package typings.ts3NodejsLibrary

import typings.std.Error
import typings.ts3NodejsLibrary.anon.EventName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/exception/EventError", JSImport.Namespace)
@js.native
object eventErrorMod extends js.Object {
  @js.native
  class EventError protected () extends Error {
    /**
      * @param message error message
      * @param eventName source event of this error
      */
    def this(message: String, eventName: String) = this()
    val eventName: String = js.native
    def toJSON(): EventName = js.native
  }
  
}

