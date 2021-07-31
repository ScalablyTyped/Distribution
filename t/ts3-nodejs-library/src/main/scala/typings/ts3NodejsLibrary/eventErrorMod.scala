package typings.ts3NodejsLibrary

import typings.std.Error
import typings.ts3NodejsLibrary.anon.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventErrorMod {
  
  @JSImport("ts3-nodejs-library/lib/exception/EventError", "EventError")
  @js.native
  class EventError protected ()
    extends StObject
       with Error {
    /**
      * @param message error message
      * @param eventName source event of this error
      */
    def this(message: String, eventName: String) = this()
    
    val eventName: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    def toJSON(): EventName = js.native
  }
}
