package typings.xhrMock

import org.scalablytyped.runtime.Shortcut
import typings.std.XMLHttpRequest
import typings.xhrMock.anon.Instantiable
import typings.xhrMock.typesMod.ErrorCallbackEvent
import typings.xhrMock.typesMod.Mock
import typings.xhrMock.typesMod.MockFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xhrmockMod {
  
  object default extends Shortcut {
    
    @JSImport("xhr-mock/lib/XHRMock", JSImport.Default)
    @js.native
    val ^ : XHRMock = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("xhr-mock/lib/XHRMock", "default.RealXMLHttpRequest")
    @js.native
    open class RealXMLHttpRequest ()
      extends StObject
         with XMLHttpRequest
    
    type _To = XHRMock
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: XHRMock = ^
  }
  
  @JSImport("xhr-mock/lib/XHRMock", "XHRMock")
  @js.native
  open class XHRMock () extends StObject {
    
    var RealXMLHttpRequest: Instantiable = js.native
    
    def delete(url: String, mock: Mock): XHRMock = js.native
    def delete(url: js.RegExp, mock: Mock): XHRMock = js.native
    
    def error(callback: js.Function1[/* event */ ErrorCallbackEvent, Unit]): XHRMock = js.native
    
    def get(url: String, mock: Mock): XHRMock = js.native
    def get(url: js.RegExp, mock: Mock): XHRMock = js.native
    
    def mock(fn: MockFunction): XHRMock = js.native
    def mock(method: String, url: String, mock: Mock): XHRMock = js.native
    def mock(method: String, url: js.RegExp, mock: Mock): XHRMock = js.native
    
    def patch(url: String, mock: Mock): XHRMock = js.native
    def patch(url: js.RegExp, mock: Mock): XHRMock = js.native
    
    def post(url: String, mock: Mock): XHRMock = js.native
    def post(url: js.RegExp, mock: Mock): XHRMock = js.native
    
    def put(url: String, mock: Mock): XHRMock = js.native
    def put(url: js.RegExp, mock: Mock): XHRMock = js.native
    
    def reset(): XHRMock = js.native
    
    def setup(): XHRMock = js.native
    
    def teardown(): XHRMock = js.native
    
    def use(fn: MockFunction): XHRMock = js.native
    def use(method: String, url: String, mock: Mock): XHRMock = js.native
    def use(method: String, url: js.RegExp, mock: Mock): XHRMock = js.native
  }
}
