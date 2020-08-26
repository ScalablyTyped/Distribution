package typings.vscodeLanguageserverProtocol.anon

import typings.vscodeLanguageserverProtocol.protocolMod.DocumentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Language extends DocumentFilter {
  /** A language id, like `typescript`. */
  var language: String = js.native
  /** A glob pattern, like `*.{ts,js}`. */
  var pattern: js.UndefOr[String] = js.native
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: js.UndefOr[String] = js.native
}

object Language {
  @scala.inline
  def apply(language: String): Language = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  @scala.inline
  implicit class LanguageOps[Self <: Language] (val x: Self) extends AnyVal {
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
  }
  
}

