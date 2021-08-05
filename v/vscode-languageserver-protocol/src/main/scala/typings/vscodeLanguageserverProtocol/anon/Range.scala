package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentContentChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range
  extends StObject
     with TextDocumentContentChangeEvent {
  
  /**
    * The range of the document that changed.
    */
  var range: typings.vscodeLanguageserverTypes.mod.Range
  
  /**
    * The optional length of the range that got replaced.
    *
    * @deprecated use range instead.
    */
  var rangeLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The new text for the provided range.
    */
  var text: String
}
object Range {
  
  inline def apply(range: typings.vscodeLanguageserverTypes.mod.Range, text: String): Range = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setRange(value: typings.vscodeLanguageserverTypes.mod.Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeLength(value: Double): Self = StObject.set(x, "rangeLength", value.asInstanceOf[js.Any])
    
    inline def setRangeLengthUndefined: Self = StObject.set(x, "rangeLength", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
