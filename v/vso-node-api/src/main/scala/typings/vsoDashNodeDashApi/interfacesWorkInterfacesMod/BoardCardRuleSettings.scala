package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardCardRuleSettings extends js.Object {
  var _links: js.Any
  var rules: StringDictionary[js.Array[Rule]]
  var url: String
}

object BoardCardRuleSettings {
  @scala.inline
  def apply(_links: js.Any, rules: StringDictionary[js.Array[Rule]], url: String): BoardCardRuleSettings = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoardCardRuleSettings]
  }
}

