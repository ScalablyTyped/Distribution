package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentContentChangeEvent
import typings.vscodeLanguageserverTypes.mod.uinteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range
  extends StObject
     with TextDocumentContentChangeEvent {
  
  var range: typings.vscodeLanguageserverTypes.mod.Range
  
  var rangeLength: js.UndefOr[uinteger] = js.undefined
  
  var text: String
}
object Range {
  
  inline def apply(range: typings.vscodeLanguageserverTypes.mod.Range, text: String): Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    inline def setRange(value: typings.vscodeLanguageserverTypes.mod.Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeLength(value: uinteger): Self = StObject.set(x, "rangeLength", value.asInstanceOf[js.Any])
    
    inline def setRangeLengthUndefined: Self = StObject.set(x, "rangeLength", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
