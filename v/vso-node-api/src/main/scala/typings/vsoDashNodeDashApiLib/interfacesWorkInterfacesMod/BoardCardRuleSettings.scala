package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardCardRuleSettings extends js.Object {
  var _links: js.Any
  var rules: org.scalablytyped.runtime.StringDictionary[js.Array[Rule]]
  var url: java.lang.String
}

object BoardCardRuleSettings {
  @scala.inline
  def apply(
    _links: js.Any,
    rules: org.scalablytyped.runtime.StringDictionary[js.Array[Rule]],
    url: java.lang.String
  ): BoardCardRuleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("rules")(rules)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BoardCardRuleSettings]
  }
}

