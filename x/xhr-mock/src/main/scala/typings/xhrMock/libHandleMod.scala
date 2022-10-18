package typings.xhrMock

import typings.xhrMock.libMockRequestMod.default
import typings.xhrMock.libTypesMod.MockFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleMod {
  
  @JSImport("xhr-mock/lib/handle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def async(
    handlers: js.Array[MockFunction],
    request: default,
    response: typings.xhrMock.libMockResponseMod.default
  ): js.Promise[typings.xhrMock.libMockResponseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("async")(handlers.asInstanceOf[js.Any], request.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.xhrMock.libMockResponseMod.default]]
  
  inline def sync(
    handlers: js.Array[MockFunction],
    request: default,
    response: typings.xhrMock.libMockResponseMod.default
  ): typings.xhrMock.libMockResponseMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(handlers.asInstanceOf[js.Any], request.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[typings.xhrMock.libMockResponseMod.default]
}
