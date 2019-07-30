package typings.stylelint.stylelintMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var defaultSeverity: Severity
  var `extends`: String | js.Array[String]
  var ignoreFiles: String | js.Array[String]
  var plugins: js.Array[String]
  var processors: js.Array[String]
  var rules: Record[String, _]
}

object Configuration {
  @scala.inline
  def apply(
    defaultSeverity: Severity,
    `extends`: String | js.Array[String],
    ignoreFiles: String | js.Array[String],
    plugins: js.Array[String],
    processors: js.Array[String],
    rules: Record[String, _]
  ): Configuration = {
    val __obj = js.Dynamic.literal(defaultSeverity = defaultSeverity, ignoreFiles = ignoreFiles.asInstanceOf[js.Any], plugins = plugins, processors = processors, rules = rules)
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

