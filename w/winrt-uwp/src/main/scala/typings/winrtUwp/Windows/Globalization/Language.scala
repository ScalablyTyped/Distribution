package typings.winrtUwp.Windows.Globalization

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A class that provides information related to BCP-47 language tags such as the language name and the script. */
trait Language extends js.Object {
  /** Gets a localized string that is suitable for display to the user for identifying the language. */
  var displayName: String
  /** Gets the normalized BCP-47 language tag for this language. */
  var languageTag: String
  /** Gets the name of the language in the language itself. */
  var nativeName: String
  /** Gets the four-letter ISO 15924 script code of the language. */
  var script: String
  /**
    * Retrieves a vector of extension subtags in the current language for the given extension identified by singleton.
    * @param singleton A single-character subtag for the LanguageTag of the current language. See BCP-47 language tags, Extensions and the Extensions Registry.
    * @return The list of extension subtags identified by singleton.
    */
  def getExtensionSubtags(singleton: String): IVectorView[String]
}

object Language {
  @scala.inline
  def apply(
    displayName: String,
    getExtensionSubtags: String => IVectorView[String],
    languageTag: String,
    nativeName: String,
    script: String
  ): Language = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], getExtensionSubtags = js.Any.fromFunction1(getExtensionSubtags), languageTag = languageTag.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
}

