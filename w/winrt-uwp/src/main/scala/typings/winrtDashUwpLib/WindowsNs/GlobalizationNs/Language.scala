package typings
package winrtDashUwpLib.WindowsNs.GlobalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A class that provides information related to BCP-47 language tags such as the language name and the script. */
@JSGlobal("Windows.Globalization.Language")
@js.native
class Language protected () extends js.Object {
  /**
    * Creates a Language object.
    * @param languageTag A BCP-47 language tag. See Remarks.
    */
  def this(languageTag: java.lang.String) = this()
  /** Gets a localized string that is suitable for display to the user for identifying the language. */
  var displayName: java.lang.String = js.native
  /** Gets the normalized BCP-47 language tag for this language. */
  var languageTag: java.lang.String = js.native
  /** Gets the name of the language in the language itself. */
  var nativeName: java.lang.String = js.native
  /** Gets the four-letter ISO 15924 script code of the language. */
  var script: java.lang.String = js.native
  /**
    * Retrieves a vector of extension subtags in the current language for the given extension identified by singleton.
    * @param singleton A single-character subtag for the LanguageTag of the current language. See BCP-47 language tags, Extensions and the Extensions Registry.
    * @return The list of extension subtags identified by singleton.
    */
  def getExtensionSubtags(singleton: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
}

/** A class that provides information related to BCP-47 language tags such as the language name and the script. */
@JSGlobal("Windows.Globalization.Language")
@js.native
object Language extends js.Object {
  /** Gets the BCP-47 language tag for the currently enabled keyboard layout or Input Method Editor (IME). */
  var currentInputMethodLanguageTag: java.lang.String = js.native
  /**
    * Determines whether a BCP-47 language tag is well-formed.
    * @param languageTag A BCP-47 language tag.
    * @return True if the language tag is well-formed as defined by BCP-47, except when the language tag can never be valid according to BCP-47. Otherwise it returns false. If this method returns true, an application can safely construct a language by using this tag. If it returns false, attempting to construct a language for the given tag will throw an exception.
    */
  def isWellFormed(languageTag: java.lang.String): scala.Boolean = js.native
  /**
    * Tries to set the normalized BCP-47 language tag of this language.
    * @param languageTag The normalized BCP-47 language tag.
    * @return true if the value is successfully set, otherwise false.
    */
  def trySetInputMethodLanguageTag(languageTag: java.lang.String): scala.Boolean = js.native
}

