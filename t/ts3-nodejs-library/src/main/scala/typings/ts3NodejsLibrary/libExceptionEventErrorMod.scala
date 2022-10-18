package typings.ts3NodejsLibrary

import typings.std.Error
import typings.ts3NodejsLibrary.anon.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExceptionEventErrorMod {
  
  @JSImport("ts3-nodejs-library/lib/exception/EventError", "EventError")
  @js.native
  open class EventError protected ()
    extends StObject
       with Error {
    /**
      * @param message error message
      * @param eventName source event of this error
      */
    def this(message: String, eventName: String) = this()
    
    val eventName: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    def toJSON(): EventName = js.native
  }
}
