package typings.winrtUwp.Windows.Data.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Identifies a sub-string of a source text string. Your app can use this structure to obtain the segment of your provided text that is identified by AlternateWordForm , SelectableWordSegment , WordSegment , or SemanticTextQuery . */
trait TextSegment extends StObject {
  
  /** The number of characters in the associated text segment. */
  var length: Double
  
  /** The zero-based index of the start of the associated text segment. */
  var startPosition: Double
}
object TextSegment {
  
  inline def apply(length: Double, startPosition: Double): TextSegment = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextSegment] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setStartPosition(value: Double): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}
