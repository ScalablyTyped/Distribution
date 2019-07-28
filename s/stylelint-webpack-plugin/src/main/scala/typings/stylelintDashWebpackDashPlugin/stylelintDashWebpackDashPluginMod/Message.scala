package typings.stylelintDashWebpackDashPlugin.stylelintDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var column: Double
  var line: Double
  var rule: String
  var severity: String
  var text: String
}

object Message {
  @scala.inline
  def apply(column: Double, line: Double, rule: String, severity: String, text: String): Message = {
    val __obj = js.Dynamic.literal(column = column, line = line, rule = rule, severity = severity, text = text)
  
    __obj.asInstanceOf[Message]
  }
}

