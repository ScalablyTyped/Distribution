package typings.xhrMock

import typings.xhrMock.mockRequestMod.default
import typings.xhrMock.typesMod.MockFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handleMod {
  
  @JSImport("xhr-mock/lib/handle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def async(
    handlers: js.Array[MockFunction],
    request: default,
    response: typings.xhrMock.mockResponseMod.default
  ): js.Promise[typings.xhrMock.mockResponseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(handlers.asInstanceOf[js.Any], request.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.xhrMock.mockResponseMod.default]]
  
  inline def sync(
    handlers: js.Array[MockFunction],
    request: default,
    response: typings.xhrMock.mockResponseMod.default
  ): typings.xhrMock.mockResponseMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(handlers.asInstanceOf[js.Any], request.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[typings.xhrMock.mockResponseMod.default]
}
