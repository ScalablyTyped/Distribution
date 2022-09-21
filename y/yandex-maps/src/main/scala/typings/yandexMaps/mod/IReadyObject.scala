package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IReadyObject extends StObject {
  
  var context: js.UndefOr[js.Object] = js.undefined
  
  var errorCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var require: js.UndefOr[js.Array[String]] = js.undefined
  
  var successCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IReadyObject {
  
  inline def apply(): IReadyObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReadyObject]
  }
  
  extension [Self <: IReadyObject](x: Self) {
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setErrorCallback(value: () => Unit): Self = StObject.set(x, "errorCallback", js.Any.fromFunction0(value))
    
    inline def setErrorCallbackUndefined: Self = StObject.set(x, "errorCallback", js.undefined)
    
    inline def setRequire(value: js.Array[String]): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    inline def setRequireVarargs(value: String*): Self = StObject.set(x, "require", js.Array(value*))
    
    inline def setSuccessCallback(value: () => Unit): Self = StObject.set(x, "successCallback", js.Any.fromFunction0(value))
    
    inline def setSuccessCallbackUndefined: Self = StObject.set(x, "successCallback", js.undefined)
  }
}
