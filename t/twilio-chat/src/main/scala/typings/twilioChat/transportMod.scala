package typings.twilioChat

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportMod {
  
  trait Result extends StObject
  
  @js.native
  trait Transport extends EventEmitter {
    
    def delete(url: String, headers: js.Any): js.Promise[Result] = js.native
    
    def get(url: String, headers: js.Any): js.Promise[Result] = js.native
    
    val isConnected: Boolean = js.native
    
    def post(url: String, headers: js.Any, body: js.Any): js.Promise[Result] = js.native
    
    def put(url: String, headers: js.Any, body: js.Any): js.Promise[Result] = js.native
    
    val state: String = js.native
  }
}
