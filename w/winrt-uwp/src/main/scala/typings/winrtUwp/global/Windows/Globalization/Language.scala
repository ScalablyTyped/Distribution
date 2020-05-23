package typings.winrtUwp.global.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /** Gets a localized string that is suitable for display to the user for identifying the language. */
  /* CompleteClass */
  override var displayName: String = js.native
  /** Gets the normalized BCP-47 language tag for this language. */
  /* CompleteClass */
  override var languageTag: String = js.native
  /** Gets the name of the language in the language itself. */
  /* CompleteClass */
  override var nativeName: String = js.native
  /** Gets the four-letter ISO 15924 script code of the language. */
  /* CompleteClass */
  override var script: String = js.native
  /**
    * Retrieves a vector of extension subtags in the current language for the given extension identified by singleton.
    * @param singleton A single-character subtag for the LanguageTag of the current language. See BCP-47 language tags, Extensions and the Extensions Registry.
    * @return The list of extension subtags identified by singleton.
    */
  /* CompleteClass */
  override def getExtensionSubtags(singleton: String): IVectorView[String] = js.native
}

/* static members */
@JSGlobal("Windows.Globalization.Language")
@js.native
object Language extends js.Object {
  /** Gets the BCP-47 language tag for the currently enabled keyboard layout or Input Method Editor (IME). */
  var currentInputMethodLanguageTag: String = js.native
  /**
    * Determines whether a BCP-47 language tag is well-formed.
    * @param languageTag A BCP-47 language tag.
    * @return True if the language tag is well-formed as defined by BCP-47, except when the language tag can never be valid according to BCP-47. Otherwise it returns false. If this method returns true, an application can safely construct a language by using this tag. If it returns false, attempting to construct a language for the given tag will throw an exception.
    */
  def isWellFormed(languageTag: String): Boolean = js.native
  /**
    * Tries to set the normalized BCP-47 language tag of this language.
    * @param languageTag The normalized BCP-47 language tag.
    * @return true if the value is successfully set, otherwise false.
    */
  def trySetInputMethodLanguageTag(languageTag: String): Boolean = js.native
}

