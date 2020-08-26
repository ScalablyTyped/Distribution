package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoardCardRuleSettings extends js.Object {
  var _links: js.Any = js.native
  var rules: StringDictionary[js.Array[Rule]] = js.native
  var url: String = js.native
}

object BoardCardRuleSettings {
  @scala.inline
  def apply(_links: js.Any, rules: StringDictionary[js.Array[Rule]], url: String): BoardCardRuleSettings = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardCardRuleSettings]
  }
  @scala.inline
  implicit class BoardCardRuleSettingsOps[Self <: BoardCardRuleSettings] (val x: Self) extends AnyVal {
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setRules(value: StringDictionary[js.Array[Rule]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

