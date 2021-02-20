package typings.winrtUwp.global.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A class that provides information related to BCP-47 language tags such as the language name and the script. */
@JSGlobal("Windows.Globalization.Language")
@js.native
class Language protected ()
  extends typings.winrtUwp.Windows.Globalization.Language {
  /**
    * Creates a Language object.
    * @param languageTag A BCP-47 language tag. See Remarks.
    */
  def this(languageTag: String) = this()
}
object Language {
  
  @JSGlobal("Windows.Globalization.Language")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the BCP-47 language tag for the currently enabled keyboard layout or Input Method Editor (IME). */
  /* static member */
  @JSGlobal("Windows.Globalization.Language.currentInputMethodLanguageTag")
  @js.native
  def currentInputMethodLanguageTag: String = js.native
  @scala.inline
  def currentInputMethodLanguageTag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentInputMethodLanguageTag")(x.asInstanceOf[js.Any])
  
  /**
    * Determines whether a BCP-47 language tag is well-formed.
    * @param languageTag A BCP-47 language tag.
    * @return True if the language tag is well-formed as defined by BCP-47, except when the language tag can never be valid according to BCP-47. Otherwise it returns false. If this method returns true, an application can safely construct a language by using this tag. If it returns false, attempting to construct a language for the given tag will throw an exception.
    */
  /* static member */
  @JSGlobal("Windows.Globalization.Language.isWellFormed")
  @js.native
  def isWellFormed(languageTag: String): Boolean = js.native
  
  /**
    * Tries to set the normalized BCP-47 language tag of this language.
    * @param languageTag The normalized BCP-47 language tag.
    * @return true if the value is successfully set, otherwise false.
    */
  /* static member */
  @JSGlobal("Windows.Globalization.Language.trySetInputMethodLanguageTag")
  @js.native
  def trySetInputMethodLanguageTag(languageTag: String): Boolean = js.native
}
