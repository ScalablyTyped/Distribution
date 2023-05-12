package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebviewPortMapping extends StObject {
  
  /**
  		 * Destination port. The `webviewPort` is resolved to this port.
  		 */
  val extensionHostPort: Double
  
  /**
  		 * Localhost port to remap inside the webview.
  		 */
  val webviewPort: Double
}
object WebviewPortMapping {
  
  inline def apply(extensionHostPort: Double, webviewPort: Double): WebviewPortMapping = {
    val __obj = js.Dynamic.literal(extensionHostPort = extensionHostPort.asInstanceOf[js.Any], webviewPort = webviewPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebviewPortMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebviewPortMapping] (val x: Self) extends AnyVal {
    
    inline def setExtensionHostPort(value: Double): Self = StObject.set(x, "extensionHostPort", value.asInstanceOf[js.Any])
    
    inline def setWebviewPort(value: Double): Self = StObject.set(x, "webviewPort", value.asInstanceOf[js.Any])
  }
}
