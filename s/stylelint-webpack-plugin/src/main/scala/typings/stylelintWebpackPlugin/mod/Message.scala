package typings.stylelintWebpackPlugin.mod

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
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

