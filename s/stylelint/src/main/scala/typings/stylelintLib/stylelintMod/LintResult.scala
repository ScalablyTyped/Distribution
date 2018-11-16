package typings
package stylelintLib.stylelintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LintResult extends js.Object {
  var deprecations: js.Array[java.lang.String]
  var errored: js.UndefOr[scala.Boolean]
  var ignored: js.UndefOr[scala.Boolean]
  var invalidOptionWarnings: js.Array[_]
  var source: java.lang.String
  var warnings: js.Array[java.lang.String]
}

