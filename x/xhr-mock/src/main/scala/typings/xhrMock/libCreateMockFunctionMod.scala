package typings.xhrMock

import typings.xhrMock.libTypesMod.Mock
import typings.xhrMock.libTypesMod.MockFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreateMockFunctionMod {
  
  @JSImport("xhr-mock/lib/createMockFunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(method: String, url: String, mock: Mock): MockFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], mock.asInstanceOf[js.Any])).asInstanceOf[MockFunction]
  inline def default(method: String, url: js.RegExp, mock: Mock): MockFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], mock.asInstanceOf[js.Any])).asInstanceOf[MockFunction]
}
