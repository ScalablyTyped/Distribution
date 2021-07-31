package typings.vastClient.mod

import typings.vastClient.anon.FnCall
import typings.vastClient.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VASTClientUrlHandler extends StObject {
  
  def get(url: String, options: Timeout, cb: FnCall): Unit
}
object VASTClientUrlHandler {
  
  @scala.inline
  def apply(get: (String, Timeout, FnCall) => Unit): VASTClientUrlHandler = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
    __obj.asInstanceOf[VASTClientUrlHandler]
  }
  
  @scala.inline
  implicit class VASTClientUrlHandlerMutableBuilder[Self <: VASTClientUrlHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: (String, Timeout, FnCall) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
  }
}
