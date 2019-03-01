package typings
package stylelintDashWebpackDashPluginLib.stylelintDashWebpackDashPluginMod.StylelintWebpackPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var column: scala.Double
  var line: scala.Double
  var rule: java.lang.String
  var severity: java.lang.String
  var text: java.lang.String
}

object Message {
  @scala.inline
  def apply(
    column: scala.Double,
    line: scala.Double,
    rule: java.lang.String,
    severity: java.lang.String,
    text: java.lang.String
  ): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("rule")(rule)
    __obj.updateDynamic("severity")(severity)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Message]
  }
}

