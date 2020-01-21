package typings.yargsParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /** Should variables prefixed with --no be treated as negations? Default is `true` */
  var `boolean-negation`: Boolean
  /** Should hyphenated arguments be expanded into camel-case aliases? Default is `true` */
  var `camel-case-expansion`: Boolean
  /** Should arrays be combined when provided by both command line arguments and a configuration file. Default is `false`  */
  var `combine-arrays`: Boolean
  /** Should keys that contain . be treated as objects? Default is `true` */
  var `dot-notation`: Boolean
  /** Should arguments be coerced into an array when duplicated. Default is `true` */
  var `duplicate-arguments-array`: Boolean
  /** Should array arguments be coerced into a single array when duplicated. Default is `true` */
  var `flatten-duplicate-arrays`: Boolean
  /** Should parsing stop at the first text argument? This is similar to how e.g. ssh parses its command line. Default is `false` */
  var `halt-at-non-option`: Boolean
  /** The prefix to use for negated boolean variables. Default is `'no-'` */
  var `negation-prefix`: String
  /** Should keys that look like numbers be treated as such? Default is `true` */
  var `parse-numbers`: Boolean
  /** Should unparsed flags be stored in -- or _. Default is `false` */
  var `populate--`: Boolean
  /** Should a placeholder be added for keys not set via the corresponding CLI argument? Default is `false` */
  var `set-placeholder-key`: Boolean
  /** Should a group of short-options be treated as boolean flags? Default is `true` */
  var `short-option-groups`: Boolean
  /** Should aliases be removed before returning results? Default is `false` */
  var `strip-aliased`: Boolean
  /** Should dashed keys be removed before returning results? This option has no effect if camel-case-expansion is disabled. Default is `false` */
  var `strip-dashed`: Boolean
  /** Should unknown options be treated like regular arguments? An unknown option is one that is not configured in opts. Default is `false` */
  var `unknown-options-as-args`: Boolean
}

object Configuration {
  @scala.inline
  def apply(
    `boolean-negation`: Boolean,
    `camel-case-expansion`: Boolean,
    `combine-arrays`: Boolean,
    `dot-notation`: Boolean,
    `duplicate-arguments-array`: Boolean,
    `flatten-duplicate-arrays`: Boolean,
    `halt-at-non-option`: Boolean,
    `negation-prefix`: String,
    `parse-numbers`: Boolean,
    `populate--`: Boolean,
    `set-placeholder-key`: Boolean,
    `short-option-groups`: Boolean,
    `strip-aliased`: Boolean,
    `strip-dashed`: Boolean,
    `unknown-options-as-args`: Boolean
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boolean-negation")(`boolean-negation`.asInstanceOf[js.Any])
    __obj.updateDynamic("camel-case-expansion")(`camel-case-expansion`.asInstanceOf[js.Any])
    __obj.updateDynamic("combine-arrays")(`combine-arrays`.asInstanceOf[js.Any])
    __obj.updateDynamic("dot-notation")(`dot-notation`.asInstanceOf[js.Any])
    __obj.updateDynamic("duplicate-arguments-array")(`duplicate-arguments-array`.asInstanceOf[js.Any])
    __obj.updateDynamic("flatten-duplicate-arrays")(`flatten-duplicate-arrays`.asInstanceOf[js.Any])
    __obj.updateDynamic("halt-at-non-option")(`halt-at-non-option`.asInstanceOf[js.Any])
    __obj.updateDynamic("negation-prefix")(`negation-prefix`.asInstanceOf[js.Any])
    __obj.updateDynamic("parse-numbers")(`parse-numbers`.asInstanceOf[js.Any])
    __obj.updateDynamic("populate--")(`populate--`.asInstanceOf[js.Any])
    __obj.updateDynamic("set-placeholder-key")(`set-placeholder-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("short-option-groups")(`short-option-groups`.asInstanceOf[js.Any])
    __obj.updateDynamic("strip-aliased")(`strip-aliased`.asInstanceOf[js.Any])
    __obj.updateDynamic("strip-dashed")(`strip-dashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("unknown-options-as-args")(`unknown-options-as-args`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

