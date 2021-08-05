package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextDocumentContentChangeEvent extends StObject {
  
  /**
    * The range that got replaced.
    */
  val range: Range
  
  /**
    * The length of the range that got replaced.
    */
  val rangeLength: Double
  
  /**
    * The offset of the range that got replaced.
    */
  val rangeOffset: Double
  
  /**
    * The new text for the range.
    */
  val text: String
}
object TextDocumentContentChangeEvent {
  
  inline def apply(range: Range, rangeLength: Double, rangeOffset: Double, text: String): TextDocumentContentChangeEvent = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], rangeLength = rangeLength.asInstanceOf[js.Any], rangeOffset = rangeOffset.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDocumentContentChangeEvent]
  }
  
  extension [Self <: TextDocumentContentChangeEvent](x: Self) {
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeLength(value: Double): Self = StObject.set(x, "rangeLength", value.asInstanceOf[js.Any])
    
    inline def setRangeOffset(value: Double): Self = StObject.set(x, "rangeOffset", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
