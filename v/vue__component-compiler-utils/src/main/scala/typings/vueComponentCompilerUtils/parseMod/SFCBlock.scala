package typings.vueComponentCompilerUtils.parseMod

import org.scalablytyped.runtime.StringDictionary
import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SFCBlock extends SFCCustomBlock {
  var lang: js.UndefOr[String] = js.native
  var module: js.UndefOr[String | Boolean] = js.native
  var scoped: js.UndefOr[Boolean] = js.native
  var src: js.UndefOr[String] = js.native
}

object SFCBlock {
  @scala.inline
  def apply(
    attrs: StringDictionary[String | `true`],
    content: String,
    end: Double,
    start: Double,
    `type`: String
  ): SFCBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCBlock]
  }
  @scala.inline
  implicit class SFCBlockOps[Self <: SFCBlock] (val x: Self) extends AnyVal {
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
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setModule(value: String | Boolean): Self = this.set("module", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    @scala.inline
    def setScoped(value: Boolean): Self = this.set("scoped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoped: Self = this.set("scoped", js.undefined)
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}

