package typings.yargs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<yargs.yargs.ParserConfigurationOptions> */
trait PartialParserConfiguratio extends js.Object {
  var `boolean-negation`: js.UndefOr[Boolean] = js.undefined
  var `camel-case-expansion`: js.UndefOr[Boolean] = js.undefined
  var `combine-arrays`: js.UndefOr[Boolean] = js.undefined
  var `dot-notation`: js.UndefOr[Boolean] = js.undefined
  var `duplicate-arguments-array`: js.UndefOr[Boolean] = js.undefined
  var `flatten-duplicate-arrays`: js.UndefOr[Boolean] = js.undefined
  var `halt-at-non-option`: js.UndefOr[Boolean] = js.undefined
  var `negation-prefix`: js.UndefOr[String] = js.undefined
  var `parse-numbers`: js.UndefOr[Boolean] = js.undefined
  var `populate--`: js.UndefOr[Boolean] = js.undefined
  var `set-placeholder-key`: js.UndefOr[Boolean] = js.undefined
  var `short-option-groups`: js.UndefOr[Boolean] = js.undefined
  var `sort-commands`: js.UndefOr[Boolean] = js.undefined
  var `strip-aliased`: js.UndefOr[Boolean] = js.undefined
  var `strip-dashed`: js.UndefOr[Boolean] = js.undefined
  var `unknown-options-as-args`: js.UndefOr[Boolean] = js.undefined
}

object PartialParserConfiguratio {
  @scala.inline
  def apply(
    `boolean-negation`: js.UndefOr[Boolean] = js.undefined,
    `camel-case-expansion`: js.UndefOr[Boolean] = js.undefined,
    `combine-arrays`: js.UndefOr[Boolean] = js.undefined,
    `dot-notation`: js.UndefOr[Boolean] = js.undefined,
    `duplicate-arguments-array`: js.UndefOr[Boolean] = js.undefined,
    `flatten-duplicate-arrays`: js.UndefOr[Boolean] = js.undefined,
    `halt-at-non-option`: js.UndefOr[Boolean] = js.undefined,
    `negation-prefix`: String = null,
    `parse-numbers`: js.UndefOr[Boolean] = js.undefined,
    `populate--`: js.UndefOr[Boolean] = js.undefined,
    `set-placeholder-key`: js.UndefOr[Boolean] = js.undefined,
    `short-option-groups`: js.UndefOr[Boolean] = js.undefined,
    `sort-commands`: js.UndefOr[Boolean] = js.undefined,
    `strip-aliased`: js.UndefOr[Boolean] = js.undefined,
    `strip-dashed`: js.UndefOr[Boolean] = js.undefined,
    `unknown-options-as-args`: js.UndefOr[Boolean] = js.undefined
  ): PartialParserConfiguratio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`boolean-negation`)) __obj.updateDynamic("boolean-negation")(`boolean-negation`.asInstanceOf[js.Any])
    if (!js.isUndefined(`camel-case-expansion`)) __obj.updateDynamic("camel-case-expansion")(`camel-case-expansion`.asInstanceOf[js.Any])
    if (!js.isUndefined(`combine-arrays`)) __obj.updateDynamic("combine-arrays")(`combine-arrays`.asInstanceOf[js.Any])
    if (!js.isUndefined(`dot-notation`)) __obj.updateDynamic("dot-notation")(`dot-notation`.asInstanceOf[js.Any])
    if (!js.isUndefined(`duplicate-arguments-array`)) __obj.updateDynamic("duplicate-arguments-array")(`duplicate-arguments-array`.asInstanceOf[js.Any])
    if (!js.isUndefined(`flatten-duplicate-arrays`)) __obj.updateDynamic("flatten-duplicate-arrays")(`flatten-duplicate-arrays`.asInstanceOf[js.Any])
    if (!js.isUndefined(`halt-at-non-option`)) __obj.updateDynamic("halt-at-non-option")(`halt-at-non-option`.asInstanceOf[js.Any])
    if (`negation-prefix` != null) __obj.updateDynamic("negation-prefix")(`negation-prefix`.asInstanceOf[js.Any])
    if (!js.isUndefined(`parse-numbers`)) __obj.updateDynamic("parse-numbers")(`parse-numbers`.asInstanceOf[js.Any])
    if (!js.isUndefined(`populate--`)) __obj.updateDynamic("populate--")(`populate--`.asInstanceOf[js.Any])
    if (!js.isUndefined(`set-placeholder-key`)) __obj.updateDynamic("set-placeholder-key")(`set-placeholder-key`.asInstanceOf[js.Any])
    if (!js.isUndefined(`short-option-groups`)) __obj.updateDynamic("short-option-groups")(`short-option-groups`.asInstanceOf[js.Any])
    if (!js.isUndefined(`sort-commands`)) __obj.updateDynamic("sort-commands")(`sort-commands`.asInstanceOf[js.Any])
    if (!js.isUndefined(`strip-aliased`)) __obj.updateDynamic("strip-aliased")(`strip-aliased`.asInstanceOf[js.Any])
    if (!js.isUndefined(`strip-dashed`)) __obj.updateDynamic("strip-dashed")(`strip-dashed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`unknown-options-as-args`)) __obj.updateDynamic("unknown-options-as-args")(`unknown-options-as-args`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialParserConfiguratio]
  }
}

