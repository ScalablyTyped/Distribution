package typings.webostvjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLoadedParameters extends StObject {
  
  /**
    * The callback function called when the method fails.
    */
  def onFailure(error: FailureResponse): Unit
  
  /**
    * The callback function called when the method succeeds.
    */
  def onSuccess(response: IsLoadedSuccessResponse): Unit
}
object IsLoadedParameters {
  
  inline def apply(onFailure: FailureResponse => Unit, onSuccess: IsLoadedSuccessResponse => Unit): IsLoadedParameters = {
    val __obj = js.Dynamic.literal(onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess))
    __obj.asInstanceOf[IsLoadedParameters]
  }
  
  extension [Self <: IsLoadedParameters](x: Self) {
    
    inline def setOnFailure(value: FailureResponse => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction1(value))
    
    inline def setOnSuccess(value: IsLoadedSuccessResponse => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
  }
}
