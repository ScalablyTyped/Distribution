package typings.xo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined xo.xo.Pick<eslint.eslint.Linter.LintOptions, 'filename'> */
trait ESLintOptions extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
}

object ESLintOptions {
  @scala.inline
  def apply(filename: String = null): ESLintOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESLintOptions]
  }
}

