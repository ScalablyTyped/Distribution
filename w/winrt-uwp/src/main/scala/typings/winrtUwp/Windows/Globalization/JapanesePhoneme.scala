package typings.winrtUwp.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a single Japanese word (a "reading") that has been extracted from a Japanese string by JapanesePhoneticAnalyzer . */
@js.native
trait JapanesePhoneme extends StObject {
  
  /** Gets the text to display for this Japanese word. */
  var displayText: String = js.native
  
  /** Gets a Boolean that indicates if this Japanese word is the start of a phrase. */
  var isPhraseStart: Boolean = js.native
  
  /** Gets the "reading" (the pronunciation of DisplayText ) for this Japanese word. */
  var yomiText: String = js.native
}
object JapanesePhoneme {
  
  @scala.inline
  def apply(displayText: String, isPhraseStart: Boolean, yomiText: String): JapanesePhoneme = {
    val __obj = js.Dynamic.literal(displayText = displayText.asInstanceOf[js.Any], isPhraseStart = isPhraseStart.asInstanceOf[js.Any], yomiText = yomiText.asInstanceOf[js.Any])
    __obj.asInstanceOf[JapanesePhoneme]
  }
  
  @scala.inline
  implicit class JapanesePhonemeMutableBuilder[Self <: JapanesePhoneme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPhraseStart(value: Boolean): Self = StObject.set(x, "isPhraseStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYomiText(value: String): Self = StObject.set(x, "yomiText", value.asInstanceOf[js.Any])
  }
}
