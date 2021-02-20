package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebviewPortMapping extends StObject {
  
  /**
    * Destination port. The `webviewPort` is resolved to this port.
    */
  val extensionHostPort: Double = js.native
  
  /**
    * Localhost port to remap inside the webview.
    */
  val webviewPort: Double = js.native
}
object WebviewPortMapping {
  
  @scala.inline
  def apply(extensionHostPort: Double, webviewPort: Double): WebviewPortMapping = {
    val __obj = js.Dynamic.literal(extensionHostPort = extensionHostPort.asInstanceOf[js.Any], webviewPort = webviewPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebviewPortMapping]
  }
  
  @scala.inline
  implicit class WebviewPortMappingMutableBuilder[Self <: WebviewPortMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensionHostPort(value: Double): Self = StObject.set(x, "extensionHostPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebviewPort(value: Double): Self = StObject.set(x, "webviewPort", value.asInstanceOf[js.Any])
  }
}
