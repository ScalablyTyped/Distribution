package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LinterResult extends js.Object {
  var errored: scala.Boolean
  var output: java.lang.String
  var postcssResults: js.Array[_]
  var results: js.Array[LintResult]
}

