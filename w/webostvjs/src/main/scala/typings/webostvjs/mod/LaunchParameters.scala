package typings.webostvjs.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchParameters extends StObject {
  
  /**
    * The app ID or webOSDev.APP
    */
  var id: String
  
  /**
    * The callback function called when the method fails.
    */
  def onFailure(error: FailureResponse): Unit
  
  /**
    * The callback function called when the method succeeds.
    */
  def onSuccess(): Unit
  
  /**
    * The JSON data object to pass when launching an app
    */
  var params: Record[String, Any]
}
object LaunchParameters {
  
  inline def apply(id: String, onFailure: FailureResponse => Unit, onSuccess: () => Unit, params: Record[String, Any]): LaunchParameters = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction0(onSuccess), params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchParameters]
  }
  
  extension [Self <: LaunchParameters](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOnFailure(value: FailureResponse => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
    
    inline def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
