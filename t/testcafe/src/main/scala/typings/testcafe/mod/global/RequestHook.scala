package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Request Hook
//----------------------------------------------------------------------------------------------------------------------
trait RequestHook extends StObject {
  
  /**
    * The `onRequest` method is called before sending the request.
    */
  def onRequest(requestEvent: js.Object): js.Promise[Unit] | Unit
  
  /**
    * The `onResponse` method is called after sending the request
    */
  def onResponse(responseEvent: js.Object): js.Promise[Unit] | Unit
}
object RequestHook {
  
  @JSGlobal("RequestHook")
  @js.native
  val ^ : RequestHookConstructor = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestHook] (val x: Self) extends AnyVal {
    
    inline def setOnRequest(value: js.Object => js.Promise[Unit] | Unit): Self = StObject.set(x, "onRequest", js.Any.fromFunction1(value))
    
    inline def setOnResponse(value: js.Object => js.Promise[Unit] | Unit): Self = StObject.set(x, "onResponse", js.Any.fromFunction1(value))
  }
}
