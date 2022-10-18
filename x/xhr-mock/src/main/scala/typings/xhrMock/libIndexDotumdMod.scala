package typings.xhrMock

import org.scalablytyped.runtime.Shortcut
import typings.std.XMLHttpRequest
import typings.xhrMock.libXhrmockMod.XHRMock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIndexDotumdMod {
  
  object default extends Shortcut {
    
    @JSImport("xhr-mock/lib/index.umd", JSImport.Default)
    @js.native
    val ^ : XHRMock = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("xhr-mock/lib/index.umd", "default.RealXMLHttpRequest")
    @js.native
    open class RealXMLHttpRequest ()
      extends StObject
         with XMLHttpRequest
    
    type _To = XHRMock
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: XHRMock = ^
  }
}
