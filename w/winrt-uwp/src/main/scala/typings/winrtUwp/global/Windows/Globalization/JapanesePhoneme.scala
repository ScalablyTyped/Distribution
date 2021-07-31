package typings.winrtUwp.global.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a single Japanese word (a "reading") that has been extracted from a Japanese string by JapanesePhoneticAnalyzer . */
@JSGlobal("Windows.Globalization.JapanesePhoneme")
@js.native
abstract class JapanesePhoneme ()
  extends StObject
     with typings.winrtUwp.Windows.Globalization.JapanesePhoneme {
  
  /** Gets the text to display for this Japanese word. */
  /* CompleteClass */
  var displayText: String = js.native
  
  /** Gets a Boolean that indicates if this Japanese word is the start of a phrase. */
  /* CompleteClass */
  var isPhraseStart: Boolean = js.native
  
  /** Gets the "reading" (the pronunciation of DisplayText ) for this Japanese word. */
  /* CompleteClass */
  var yomiText: String = js.native
}
