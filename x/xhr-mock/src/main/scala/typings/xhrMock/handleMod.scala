package typings.xhrMock

import typings.xhrMock.mockRequestMod.default
import typings.xhrMock.typesMod.MockFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xhr-mock/lib/handle", JSImport.Namespace)
@js.native
object handleMod extends js.Object {
  
  def async(
    handlers: js.Array[MockFunction],
    request: default,
    response: typings.xhrMock.mockResponseMod.default
  ): js.Promise[typings.xhrMock.mockResponseMod.default] = js.native
  
  def sync(
    handlers: js.Array[MockFunction],
    request: default,
    response: typings.xhrMock.mockResponseMod.default
  ): typings.xhrMock.mockResponseMod.default = js.native
}
