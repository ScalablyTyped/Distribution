package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriHandler extends StObject {
  
  /**
    * Handle the provided system-wide [uri](#Uri).
    *
    * @see [window.registerUriHandler](#window.registerUriHandler).
    */
  def handleUri(uri: Uri): ProviderResult[Unit]
}
object UriHandler {
  
  @scala.inline
  def apply(handleUri: Uri => ProviderResult[Unit]): UriHandler = {
    val __obj = js.Dynamic.literal(handleUri = js.Any.fromFunction1(handleUri))
    __obj.asInstanceOf[UriHandler]
  }
  
  @scala.inline
  implicit class UriHandlerMutableBuilder[Self <: UriHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleUri(value: Uri => ProviderResult[Unit]): Self = StObject.set(x, "handleUri", js.Any.fromFunction1(value))
  }
}
