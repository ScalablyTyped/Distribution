package typings
package y18nLib.y18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * The locale directory, default ./locales.
    */
  var directory: java.lang.String
  /**
    * Should fallback to a language-only file (e.g. en.json) be allowed
    * if a file matching the locale does not exist (e.g. en_US.json), default true.
    */
  var fallbackToLanguage: scala.Boolean
  /**
    * What locale should be used.
    */
  var locale: java.lang.String
  /**
    * Should newly observed strings be updated in file, default true.
    */
  var updateFiles: scala.Boolean
}

object Config {
  @scala.inline
  def apply(
    directory: java.lang.String,
    fallbackToLanguage: scala.Boolean,
    locale: java.lang.String,
    updateFiles: scala.Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(directory = directory, fallbackToLanguage = fallbackToLanguage, locale = locale, updateFiles = updateFiles)
  
    __obj.asInstanceOf[Config]
  }
}

