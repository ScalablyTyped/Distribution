package typings.tslint.libVerifyLintErrorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/verify/lintError", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def errorComparator(err1: LintError, err2: LintError): Double = js.native
  def lintSyntaxError(message: String): Error = js.native
}

