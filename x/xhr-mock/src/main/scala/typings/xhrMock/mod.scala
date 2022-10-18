package typings.xhrMock

import org.scalablytyped.runtime.Shortcut
import typings.std.XMLHttpRequest
import typings.xhrMock.libMockRequestMod.default
import typings.xhrMock.libTypesMod.MockFunction
import typings.xhrMock.libTypesMod.MockObject
import typings.xhrMock.libXhrmockMod.XHRMock
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
    open class RealXMLHttpRequest ()
      extends StObject
         with XMLHttpRequest
    
    type _To = XHRMock
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: XHRMock = ^
  }
  
  @JSImport("xhr-mock", "MockRequest")
  @js.native
  open class MockRequest () extends default
  
  @JSImport("xhr-mock", "MockResponse")
  @js.native
  open class MockResponse ()
    extends typings.xhrMock.libMockResponseMod.default
  
  inline def delay(mock: MockFunction): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
  inline def delay(mock: MockFunction, ms: Double): MockFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[MockFunction]
  inline def delay(mock: MockObject): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
  inline def delay(mock: MockObject, ms: Double): MockFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(mock.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[MockFunction]
  
  inline def once(mock: MockFunction): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(mock.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
  inline def once(mock: MockObject): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(mock.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
  
  inline def proxy(req: default, res: typings.xhrMock.libMockResponseMod.default): js.Promise[typings.xhrMock.libMockResponseMod.default] = (^.asInstanceOf[js.Dynamic].applyDynamic("proxy")(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.xhrMock.libMockResponseMod.default]]
  
  inline def sequence(mocks: js.Array[MockFunction | MockObject]): MockFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("sequence")(mocks.asInstanceOf[js.Any]).asInstanceOf[MockFunction]
}
