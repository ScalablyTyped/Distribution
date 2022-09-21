package typings.webxr

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRDOMOverlayInit extends StObject {
  
  var root: Element
}
object XRDOMOverlayInit {
  
  inline def apply(root: Element): XRDOMOverlayInit = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRDOMOverlayInit]
  }
  
  extension [Self <: XRDOMOverlayInit](x: Self) {
    
    inline def setRoot(value: Element): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
