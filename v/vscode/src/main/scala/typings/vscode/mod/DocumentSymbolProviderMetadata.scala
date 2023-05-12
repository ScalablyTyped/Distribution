package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSymbolProviderMetadata extends StObject {
  
  /**
  		 * A human-readable string that is shown when multiple outlines trees show for one document.
  		 */
  var label: js.UndefOr[String] = js.undefined
}
object DocumentSymbolProviderMetadata {
  
  inline def apply(): DocumentSymbolProviderMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSymbolProviderMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentSymbolProviderMetadata] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
