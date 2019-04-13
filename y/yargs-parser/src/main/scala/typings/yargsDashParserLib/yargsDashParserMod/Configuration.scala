package typings
package yargsDashParserLib.yargsDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /** Should variables prefixed with --no be treated as negations? Default is `true` */
  var `boolean-negation`: scala.Boolean
  /** Should hyphenated arguments be expanded into camel-case aliases? Default is `true` */
  var `camel-case-expansion`: scala.Boolean
  /** Should arrays be combined when provided by both command line arguments and a configuration file. Default is `false`  */
  var `combine-arrays`: scala.Boolean
  /** Should keys that contain . be treated as objects? Default is `true` */
  var `dot-notation`: scala.Boolean
  /** Should arguments be coerced into an array when duplicated. Default is `true` */
  var `duplicate-arguments-array`: scala.Boolean
  /** Should array arguments be coerced into a single array when duplicated. Default is `true` */
  var `flatten-duplicate-arrays`: scala.Boolean
  /** Should parsing stop at the first text argument? This is similar to how e.g. ssh parses its command line. Default is `false` */
  var `halt-at-non-option`: scala.Boolean
  /** The prefix to use for negated boolean variables. Default is `'no-'` */
  var `negation-prefix`: java.lang.String
  /** Should keys that look like numbers be treated as such? Default is `true` */
  var `parse-numbers`: scala.Boolean
  /** Should unparsed flags be stored in -- or _. Default is `false` */
  var `populate--`: scala.Boolean
  /** Should a placeholder be added for keys not set via the corresponding CLI argument? Default is `false` */
  var `set-placeholder-key`: scala.Boolean
  /** Should a group of short-options be treated as boolean flags? Default is `true` */
  var `short-option-groups`: scala.Boolean
}

object Configuration {
  @scala.inline
  def apply(
    `boolean-negation`: scala.Boolean,
    `camel-case-expansion`: scala.Boolean,
    `combine-arrays`: scala.Boolean,
    `dot-notation`: scala.Boolean,
    `duplicate-arguments-array`: scala.Boolean,
    `flatten-duplicate-arrays`: scala.Boolean,
    `halt-at-non-option`: scala.Boolean,
    `negation-prefix`: java.lang.String,
    `parse-numbers`: scala.Boolean,
    `populate--`: scala.Boolean,
    `set-placeholder-key`: scala.Boolean,
    `short-option-groups`: scala.Boolean
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boolean-negation")(`boolean-negation`)
    __obj.updateDynamic("camel-case-expansion")(`camel-case-expansion`)
    __obj.updateDynamic("combine-arrays")(`combine-arrays`)
    __obj.updateDynamic("dot-notation")(`dot-notation`)
    __obj.updateDynamic("duplicate-arguments-array")(`duplicate-arguments-array`)
    __obj.updateDynamic("flatten-duplicate-arrays")(`flatten-duplicate-arrays`)
    __obj.updateDynamic("halt-at-non-option")(`halt-at-non-option`)
    __obj.updateDynamic("negation-prefix")(`negation-prefix`)
    __obj.updateDynamic("parse-numbers")(`parse-numbers`)
    __obj.updateDynamic("populate--")(`populate--`)
    __obj.updateDynamic("set-placeholder-key")(`set-placeholder-key`)
    __obj.updateDynamic("short-option-groups")(`short-option-groups`)
    __obj.asInstanceOf[Configuration]
  }
}

