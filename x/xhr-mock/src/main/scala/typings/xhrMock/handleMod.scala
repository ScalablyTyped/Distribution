package typings.xhrMock

import typings.xhrMock.mockRequestMod.default
import typings.xhrMock.typesMod.MockFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handleMod {
  
  @JSImport("xhr-mock/lib/handle", "async")
  @js.native
  def async(
    handlers: js.Array[MockFunction],
    request: default,
    response: typings.xhrMock.mockResponseMod.default
  ): js.Promise[typings.xhrMock.mockResponseMod.default] = js.native
  
  @JSImport("xhr-mock/lib/handle", "sync")
  @js.native
  def sync(
    handlers: js.Array[MockFunction],
    request: default,
    response: typings.xhrMock.mockResponseMod.default
  ): typings.xhrMock.mockResponseMod.default = js.native
}
