package typings.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stylelint.stylelintStrings.warning
  - typings.stylelint.stylelintStrings.error
*/
trait Severity extends js.Object

object Severity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.stylelint.stylelintStrings.error = this.cast("error")
  @scala.inline
  def warning: typings.stylelint.stylelintStrings.warning = this.cast("warning")
}

