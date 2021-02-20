package typings.xhrMock

import org.scalablytyped.runtime.Shortcut
import typings.std.XMLHttpRequest
import typings.xhrMock.mockRequestMod.default
import typings.xhrMock.typesMod.MockFunction
import typings.xhrMock.typesMod.MockObject
import typings.xhrMock.xhrmockMod.XHRMock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    @JSImport("xhr-mock", JSImport.Default)
    @js.native
    val ^ : XHRMock = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("xhr-mock", "default.RealXMLHttpRequest")
    @js.native
    class RealXMLHttpRequest () extends XMLHttpRequest
    
    type _To = XHRMock
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: XHRMock = ^
  }
  
  @JSImport("xhr-mock", "MockRequest")
  @js.native
  class MockRequest () extends default
  
  @JSImport("xhr-mock", "MockResponse")
  @js.native
  class MockResponse ()
    extends typings.xhrMock.mockResponseMod.default
  
  @JSImport("xhr-mock", "delay")
  @js.native
  def delay(mock: MockFunction): MockFunction = js.native
  @JSImport("xhr-mock", "delay")
  @js.native
  def delay(mock: MockFunction, ms: Double): MockFunction = js.native
  @JSImport("xhr-mock", "delay")
  @js.native
  def delay(mock: MockObject): MockFunction = js.native
  @JSImport("xhr-mock", "delay")
  @js.native
  def delay(mock: MockObject, ms: Double): MockFunction = js.native
  
  @JSImport("xhr-mock", "once")
  @js.native
  def once(mock: MockFunction): MockFunction = js.native
  @JSImport("xhr-mock", "once")
  @js.native
  def once(mock: MockObject): MockFunction = js.native
  
  @JSImport("xhr-mock", "proxy")
  @js.native
  def proxy(req: default, res: typings.xhrMock.mockResponseMod.default): js.Promise[typings.xhrMock.mockResponseMod.default] = js.native
  
  @JSImport("xhr-mock", "sequence")
  @js.native
  def sequence(mocks: js.Array[MockFunction | MockObject]): MockFunction = js.native
}
