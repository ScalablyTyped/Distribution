package typings.thunderbirdWebextBrowser.browser.compose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveMessageOptions extends StObject {
  
  var mode: SaveMessageOptionsMode
}
object SaveMessageOptions {
  
  inline def apply(mode: SaveMessageOptionsMode): SaveMessageOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveMessageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaveMessageOptions] (val x: Self) extends AnyVal {
    
    inline def setMode(value: SaveMessageOptionsMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
