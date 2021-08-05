package typings.xhrMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyBrowserMod {
  
  @JSImport("xhr-mock/lib/proxy.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(req: typings.xhrMock.mockRequestMod.default, res: typings.xhrMock.mockResponseMod.default): js.Promise[typings.xhrMock.mockResponseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.xhrMock.mockResponseMod.default]]
}
