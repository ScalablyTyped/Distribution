package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var defaultSeverity: stylelintLib.stylelintLibStrings.warning | stylelintLib.stylelintLibStrings.error
  var `extends`: java.lang.String | js.Array[java.lang.String]
  var ignoreFiles: java.lang.String | js.Array[java.lang.String]
  var plugins: js.Array[java.lang.String]
  var processors: js.Array[java.lang.String]
  var rules: stdLib.Record[java.lang.String, _]
}

object Configuration {
  @scala.inline
  def apply(
    defaultSeverity: stylelintLib.stylelintLibStrings.warning | stylelintLib.stylelintLibStrings.error,
    `extends`: java.lang.String | js.Array[java.lang.String],
    ignoreFiles: java.lang.String | js.Array[java.lang.String],
    plugins: js.Array[java.lang.String],
    processors: js.Array[java.lang.String],
    rules: stdLib.Record[java.lang.String, _]
  ): Configuration = {
    val __obj = js.Dynamic.literal(defaultSeverity = defaultSeverity.asInstanceOf[js.Any], ignoreFiles = ignoreFiles.asInstanceOf[js.Any], plugins = plugins, processors = processors, rules = rules)
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

