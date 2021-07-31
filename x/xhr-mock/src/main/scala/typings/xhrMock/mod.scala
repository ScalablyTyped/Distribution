package typings.xhrMock

import org.scalablytyped.runtime.Shortcut
import typings.std.XMLHttpRequest
import typings.xhrMock.mockRequestMod.default
import typings.xhrMock.typesMod.MockFunction
import typings.xhrMock.typesMod.MockObject
import typings.xhrMock.xhrmockMod.XHRMock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xhr-mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default extends Shortcut {
    
    @JSImport("xhr-mock", JSImport.Default)
    @js.native
    val ^ : XHRMock = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("xhr-mock", "default.RealXMLHttpRequest")
    @js.native
    class RealXMLHttpRequest ()
      extends StObject
         with XMLHttpRequest
    
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
  
  @scala.inline
  def delay(mock: MockFunction): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
  @scala.inline
  def delay(mock: MockFunction, ms: Double): MockFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[MockFunction]
  @scala.inline
  def delay(mock: MockObject): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
  @scala.inline
  def delay(mock: MockObject, ms: Double): MockFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[MockFunction]
  
  @scala.inline
  def once(mock: MockFunction): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(mock.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
  @scala.inline
  def once(mock: MockObject): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(mock.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
  
  @scala.inline
  def proxy(req: default, res: typings.xhrMock.mockResponseMod.default): js.Promise[typings.xhrMock.mockResponseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.xhrMock.mockResponseMod.default]]
  
  @scala.inline
  def sequence(mocks: js.Array[MockFunction | MockObject]): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(mocks.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
}
