package typings.xhrMock

import typings.std.RegExp
import typings.xhrMock.typesMod.Mock
import typings.xhrMock.typesMod.MockFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMockFunctionMod {
  
  @JSImport("xhr-mock/lib/createMockFunction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(method: String, url: String, mock: Mock): MockFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], mock.asInstanceOf[js.Any])).asInstanceOf[MockFunction]
  @scala.inline
  def default(method: String, url: RegExp, mock: Mock): MockFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], mock.asInstanceOf[js.Any])).asInstanceOf[MockFunction]
}
