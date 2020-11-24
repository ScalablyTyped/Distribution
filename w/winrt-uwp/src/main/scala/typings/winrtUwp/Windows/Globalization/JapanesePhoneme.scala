package typings.winrtUwp.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a single Japanese word (a "reading") that has been extracted from a Japanese string by JapanesePhoneticAnalyzer . */
@js.native
trait JapanesePhoneme extends js.Object {
  
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
  implicit class JapanesePhonemeOps[Self <: JapanesePhoneme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplayText(value: String): Self = this.set("displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPhraseStart(value: Boolean): Self = this.set("isPhraseStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYomiText(value: String): Self = this.set("yomiText", value.asInstanceOf[js.Any])
  }
}
