package typings.y18n.y18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * The locale directory, default ./locales.
    */
  var directory: String
  /**
    * Should fallback to a language-only file (e.g. en.json) be allowed
    * if a file matching the locale does not exist (e.g. en_US.json), default true.
    */
  var fallbackToLanguage: Boolean
  /**
    * What locale should be used.
    */
  var locale: String
  /**
    * Should newly observed strings be updated in file, default true.
    */
  var updateFiles: Boolean
}

object Config {
  @scala.inline
  def apply(directory: String, fallbackToLanguage: Boolean, locale: String, updateFiles: Boolean): Config = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], fallbackToLanguage = fallbackToLanguage.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], updateFiles = updateFiles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config]
  }
}

