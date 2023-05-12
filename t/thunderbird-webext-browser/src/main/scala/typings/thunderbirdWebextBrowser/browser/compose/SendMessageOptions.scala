package typings.thunderbirdWebextBrowser.browser.compose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMessageOptions extends StObject {
  
  var mode: SendMessageOptionsMode
}
object SendMessageOptions {
  
  inline def apply(mode: SendMessageOptionsMode): SendMessageOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendMessageOptions] (val x: Self) extends AnyVal {
    
    inline def setMode(value: SendMessageOptionsMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
