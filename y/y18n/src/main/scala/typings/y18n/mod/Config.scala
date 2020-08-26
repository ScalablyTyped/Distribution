package typings.y18n.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * The locale directory, default ./locales.
    */
  var directory: String = js.native
  /**
    * Should fallback to a language-only file (e.g. en.json) be allowed
    * if a file matching the locale does not exist (e.g. en_US.json), default true.
    */
  var fallbackToLanguage: Boolean = js.native
  /**
    * What locale should be used.
    */
  var locale: String = js.native
  /**
    * Should newly observed strings be updated in file, default true.
    */
  var updateFiles: Boolean = js.native
}

object Config {
  @scala.inline
  def apply(directory: String, fallbackToLanguage: Boolean, locale: String, updateFiles: Boolean): Config = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], fallbackToLanguage = fallbackToLanguage.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], updateFiles = updateFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def setFallbackToLanguage(value: Boolean): Self = this.set("fallbackToLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateFiles(value: Boolean): Self = this.set("updateFiles", value.asInstanceOf[js.Any])
  }
  
}

