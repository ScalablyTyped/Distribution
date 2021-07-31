package typings.vkOpenapi.vk.OpenAPI

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Api {
  
  trait API extends StObject {
    
    def call(method: String, params: ApiParams, cb: js.Function1[/* response */ js.Any, Unit]): Unit
  }
  object API {
    
    @scala.inline
    def apply(call: (String, ApiParams, js.Function1[/* response */ js.Any, Unit]) => Unit): API = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction3(call))
      __obj.asInstanceOf[API]
    }
    
    @scala.inline
    implicit class APIMutableBuilder[Self <: API] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: (String, ApiParams, js.Function1[/* response */ js.Any, Unit]) => Unit): Self = StObject.set(x, "call", js.Any.fromFunction3(value))
    }
  }
  
  trait ApiParams
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var v: String
  }
  object ApiParams {
    
    @scala.inline
    def apply(v: String): ApiParams = {
      val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiParams]
    }
    
    @scala.inline
    implicit class ApiParamsMutableBuilder[Self <: ApiParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setV(value: String): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}
