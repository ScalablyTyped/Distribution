package typings.winrtUwp.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a single Japanese word (a "reading") that has been extracted from a Japanese string by JapanesePhoneticAnalyzer . */
trait JapanesePhoneme extends StObject {
  
  /** Gets the text to display for this Japanese word. */
  var displayText: String
  
  /** Gets a Boolean that indicates if this Japanese word is the start of a phrase. */
  var isPhraseStart: Boolean
  
  /** Gets the "reading" (the pronunciation of DisplayText ) for this Japanese word. */
  var yomiText: String
}
object JapanesePhoneme {
  
  inline def apply(displayText: String, isPhraseStart: Boolean, yomiText: String): JapanesePhoneme = {
    val __obj = js.Dynamic.literal(displayText = displayText.asInstanceOf[js.Any], isPhraseStart = isPhraseStart.asInstanceOf[js.Any], yomiText = yomiText.asInstanceOf[js.Any])
    __obj.asInstanceOf[JapanesePhoneme]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JapanesePhoneme] (val x: Self) extends AnyVal {
    
    inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    inline def setIsPhraseStart(value: Boolean): Self = StObject.set(x, "isPhraseStart", value.asInstanceOf[js.Any])
    
    inline def setYomiText(value: String): Self = StObject.set(x, "yomiText", value.asInstanceOf[js.Any])
  }
}
