package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriHandler extends StObject {
  
  /**
    * Handle the provided system-wide {@link Uri}.
    *
    * @see {@link window.registerUriHandler}.
    */
  def handleUri(uri: Uri): ProviderResult[Unit]
}
object UriHandler {
  
  inline def apply(handleUri: Uri => ProviderResult[Unit]): UriHandler = {
    val __obj = js.Dynamic.literal(handleUri = js.Any.fromFunction1(handleUri))
    __obj.asInstanceOf[UriHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UriHandler] (val x: Self) extends AnyVal {
    
    inline def setHandleUri(value: Uri => ProviderResult[Unit]): Self = StObject.set(x, "handleUri", js.Any.fromFunction1(value))
  }
}
