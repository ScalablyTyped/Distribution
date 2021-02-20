package typings.xhrMock

import typings.std.RegExp
import typings.xhrMock.typesMod.Mock
import typings.xhrMock.typesMod.MockFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMockFunctionMod {
  
  @JSImport("xhr-mock/lib/createMockFunction", JSImport.Default)
  @js.native
  def default(method: String, url: String, mock: Mock): MockFunction = js.native
  @JSImport("xhr-mock/lib/createMockFunction", JSImport.Default)
  @js.native
  def default(method: String, url: RegExp, mock: Mock): MockFunction = js.native
}
