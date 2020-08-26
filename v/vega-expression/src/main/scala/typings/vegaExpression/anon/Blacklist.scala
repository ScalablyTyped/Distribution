package typings.vegaExpression.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blacklist extends js.Object {
  var blacklist: js.UndefOr[js.Array[String]] = js.native
  var constants: js.UndefOr[js.Object] = js.native
  var fieldvar: js.UndefOr[String] = js.native
  var functions: js.UndefOr[StringDictionary[js.Function]] = js.native
  var globalvar: String = js.native
  var whitelist: js.UndefOr[js.Array[String]] = js.native
}

object Blacklist {
  @scala.inline
  def apply(globalvar: String): Blacklist = {
    val __obj = js.Dynamic.literal(globalvar = globalvar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blacklist]
  }
  @scala.inline
  implicit class BlacklistOps[Self <: Blacklist] (val x: Self) extends AnyVal {
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
    def setGlobalvar(value: String): Self = this.set("globalvar", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlacklistVarargs(value: String*): Self = this.set("blacklist", js.Array(value :_*))
    @scala.inline
    def setBlacklist(value: js.Array[String]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    @scala.inline
    def setConstants(value: js.Object): Self = this.set("constants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstants: Self = this.set("constants", js.undefined)
    @scala.inline
    def setFieldvar(value: String): Self = this.set("fieldvar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldvar: Self = this.set("fieldvar", js.undefined)
    @scala.inline
    def setFunctions(value: StringDictionary[js.Function]): Self = this.set("functions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctions: Self = this.set("functions", js.undefined)
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = this.set("whitelist", js.Array(value :_*))
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
  
}

