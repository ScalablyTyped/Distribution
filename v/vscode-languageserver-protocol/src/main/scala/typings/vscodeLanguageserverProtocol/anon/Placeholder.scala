package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod._PrepareRenameResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placeholder
  extends StObject
     with _PrepareRenameResult {
  
  var placeholder: String
  
  var range: typings.vscodeLanguageserverTypes.mod.Range
}
object Placeholder {
  
  inline def apply(placeholder: String, range: typings.vscodeLanguageserverTypes.mod.Range): Placeholder = {
    val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder]
  }
  
  extension [Self <: Placeholder](x: Self) {
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typings.vscodeLanguageserverTypes.mod.Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
