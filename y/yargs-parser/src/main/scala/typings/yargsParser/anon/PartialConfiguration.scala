package typings.yargsParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<yargs-parser.yargs-parser.Configuration> */
trait PartialConfiguration extends js.Object {
  var `boolean-negation`: js.UndefOr[scala.Boolean] = js.undefined
  var `camel-case-expansion`: js.UndefOr[scala.Boolean] = js.undefined
  var `combine-arrays`: js.UndefOr[scala.Boolean] = js.undefined
  var `dot-notation`: js.UndefOr[scala.Boolean] = js.undefined
  var `duplicate-arguments-array`: js.UndefOr[scala.Boolean] = js.undefined
  var `flatten-duplicate-arrays`: js.UndefOr[scala.Boolean] = js.undefined
  var `halt-at-non-option`: js.UndefOr[scala.Boolean] = js.undefined
  var `negation-prefix`: js.UndefOr[String] = js.undefined
  var `parse-numbers`: js.UndefOr[scala.Boolean] = js.undefined
  var `populate--`: js.UndefOr[scala.Boolean] = js.undefined
  var `set-placeholder-key`: js.UndefOr[scala.Boolean] = js.undefined
  var `short-option-groups`: js.UndefOr[scala.Boolean] = js.undefined
  var `strip-aliased`: js.UndefOr[scala.Boolean] = js.undefined
  var `strip-dashed`: js.UndefOr[scala.Boolean] = js.undefined
  var `unknown-options-as-args`: js.UndefOr[scala.Boolean] = js.undefined
}

object PartialConfiguration {
  @scala.inline
  def apply(
    `boolean-negation`: js.UndefOr[scala.Boolean] = js.undefined,
    `camel-case-expansion`: js.UndefOr[scala.Boolean] = js.undefined,
    `combine-arrays`: js.UndefOr[scala.Boolean] = js.undefined,
    `dot-notation`: js.UndefOr[scala.Boolean] = js.undefined,
    `duplicate-arguments-array`: js.UndefOr[scala.Boolean] = js.undefined,
    `flatten-duplicate-arrays`: js.UndefOr[scala.Boolean] = js.undefined,
    `halt-at-non-option`: js.UndefOr[scala.Boolean] = js.undefined,
    `negation-prefix`: String = null,
    `parse-numbers`: js.UndefOr[scala.Boolean] = js.undefined,
    `populate--`: js.UndefOr[scala.Boolean] = js.undefined,
    `set-placeholder-key`: js.UndefOr[scala.Boolean] = js.undefined,
    `short-option-groups`: js.UndefOr[scala.Boolean] = js.undefined,
    `strip-aliased`: js.UndefOr[scala.Boolean] = js.undefined,
    `strip-dashed`: js.UndefOr[scala.Boolean] = js.undefined,
    `unknown-options-as-args`: js.UndefOr[scala.Boolean] = js.undefined
  ): PartialConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`boolean-negation`)) __obj.updateDynamic("boolean-negation")(`boolean-negation`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`camel-case-expansion`)) __obj.updateDynamic("camel-case-expansion")(`camel-case-expansion`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`combine-arrays`)) __obj.updateDynamic("combine-arrays")(`combine-arrays`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`dot-notation`)) __obj.updateDynamic("dot-notation")(`dot-notation`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`duplicate-arguments-array`)) __obj.updateDynamic("duplicate-arguments-array")(`duplicate-arguments-array`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`flatten-duplicate-arrays`)) __obj.updateDynamic("flatten-duplicate-arrays")(`flatten-duplicate-arrays`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`halt-at-non-option`)) __obj.updateDynamic("halt-at-non-option")(`halt-at-non-option`.get.asInstanceOf[js.Any])
    if (`negation-prefix` != null) __obj.updateDynamic("negation-prefix")(`negation-prefix`.asInstanceOf[js.Any])
    if (!js.isUndefined(`parse-numbers`)) __obj.updateDynamic("parse-numbers")(`parse-numbers`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`populate--`)) __obj.updateDynamic("populate--")(`populate--`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`set-placeholder-key`)) __obj.updateDynamic("set-placeholder-key")(`set-placeholder-key`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`short-option-groups`)) __obj.updateDynamic("short-option-groups")(`short-option-groups`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`strip-aliased`)) __obj.updateDynamic("strip-aliased")(`strip-aliased`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`strip-dashed`)) __obj.updateDynamic("strip-dashed")(`strip-dashed`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`unknown-options-as-args`)) __obj.updateDynamic("unknown-options-as-args")(`unknown-options-as-args`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfiguration]
  }
}

