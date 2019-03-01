package typings
package yargsDashParserLib.yargsDashParserMod.yargsParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var `boolean-negation`: scala.Boolean
  var `camel-case-expansion`: scala.Boolean
  var `combine-arrays`: scala.Boolean
  var `dot-notation`: scala.Boolean
  var `duplicate-arguments-array`: scala.Boolean
  var `flatten-duplicate-arrays`: scala.Boolean
  var `negation-prefix`: java.lang.String
  var `parse-numbers`: scala.Boolean
  var `populate--`: scala.Boolean
  var `set-placeholder-key`: scala.Boolean
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
    `negation-prefix`: java.lang.String,
    `parse-numbers`: scala.Boolean,
    `populate--`: scala.Boolean,
    `set-placeholder-key`: scala.Boolean,
    `short-option-groups`: scala.Boolean
  ): Configuration = {
    val __obj = js.Dynamic.literal(`boolean-negation` = `boolean-negation`, `camel-case-expansion` = `camel-case-expansion`, `combine-arrays` = `combine-arrays`, `dot-notation` = `dot-notation`, `duplicate-arguments-array` = `duplicate-arguments-array`, `flatten-duplicate-arrays` = `flatten-duplicate-arrays`, `negation-prefix` = `negation-prefix`, `parse-numbers` = `parse-numbers`, `populate--` = `populate--`, `set-placeholder-key` = `set-placeholder-key`, `short-option-groups` = `short-option-groups`)
  
    __obj.asInstanceOf[Configuration]
  }
}

