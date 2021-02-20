package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReadyobject extends StObject {
  
  var context: js.UndefOr[js.Object] = js.native
  
  var errorCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var require: js.UndefOr[js.Array[String]] = js.native
  
  var successCallback: js.UndefOr[js.Function0[Unit]] = js.native
}
object IReadyobject {
  
  @scala.inline
  def apply(): IReadyobject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReadyobject]
  }
  
  @scala.inline
  implicit class IReadyobjectMutableBuilder[Self <: IReadyobject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setErrorCallback(value: () => Unit): Self = StObject.set(x, "errorCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setErrorCallbackUndefined: Self = StObject.set(x, "errorCallback", js.undefined)
    
    @scala.inline
    def setRequire(value: js.Array[String]): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    @scala.inline
    def setRequireVarargs(value: String*): Self = StObject.set(x, "require", js.Array(value :_*))
    
    @scala.inline
    def setSuccessCallback(value: () => Unit): Self = StObject.set(x, "successCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessCallbackUndefined: Self = StObject.set(x, "successCallback", js.undefined)
  }
}
