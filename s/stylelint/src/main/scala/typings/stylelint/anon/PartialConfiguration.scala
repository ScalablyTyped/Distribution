package typings.stylelint.anon

import typings.std.Record
import typings.stylelint.mod.Severity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<stylelint.stylelint.Configuration> */
trait PartialConfiguration extends js.Object {
  var defaultSeverity: js.UndefOr[Severity] = js.undefined
  var `extends`: js.UndefOr[String | js.Array[String]] = js.undefined
  var ignoreFiles: js.UndefOr[String | js.Array[String]] = js.undefined
  var plugins: js.UndefOr[js.Array[String]] = js.undefined
  var processors: js.UndefOr[js.Array[String]] = js.undefined
  var rules: js.UndefOr[Record[String, _]] = js.undefined
}

object PartialConfiguration {
  @scala.inline
  def apply(
    defaultSeverity: Severity = null,
    `extends`: String | js.Array[String] = null,
    ignoreFiles: String | js.Array[String] = null,
    plugins: js.Array[String] = null,
    processors: js.Array[String] = null,
    rules: Record[String, _] = null
  ): PartialConfiguration = {
    val __obj = js.Dynamic.literal()
    if (defaultSeverity != null) __obj.updateDynamic("defaultSeverity")(defaultSeverity.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (ignoreFiles != null) __obj.updateDynamic("ignoreFiles")(ignoreFiles.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (processors != null) __obj.updateDynamic("processors")(processors.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfiguration]
  }
}

