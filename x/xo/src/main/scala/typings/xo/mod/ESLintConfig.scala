package typings.xo.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined xo.xo.Pick<eslint.eslint.Linter.Config, 'extends' | 'settings'> */
@js.native
trait ESLintConfig extends js.Object {
  var `extends`: js.UndefOr[String | js.Array[String]] = js.native
  var settings: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object ESLintConfig {
  @scala.inline
  def apply(): ESLintConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ESLintConfig]
  }
  @scala.inline
  implicit class ESLintConfigOps[Self <: ESLintConfig] (val x: Self) extends AnyVal {
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
    def setExtendsVarargs(value: String*): Self = this.set("extends", js.Array(value :_*))
    @scala.inline
    def setExtends(value: String | js.Array[String]): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    @scala.inline
    def setSettings(value: StringDictionary[js.Any]): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
  
}

