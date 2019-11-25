package typings.stylelint.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Warning extends js.Object {
  var column: Double
  var line: Double
  var rule: String
  var severity: Severity
  var text: String
}

object Warning {
  @scala.inline
  def apply(column: Double, line: Double, rule: String, severity: Severity, text: String): Warning = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Warning]
  }
}

