package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSymbolOptions
  extends StObject
     with WorkDoneProgressOptions {
  
  /**
    * A human-readable string that is shown when multiple outlines trees
    * are shown for the same document.
    *
    * @since 3.16.0
    */
  var label: js.UndefOr[String] = js.undefined
}
object DocumentSymbolOptions {
  
  inline def apply(): DocumentSymbolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSymbolOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentSymbolOptions] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
