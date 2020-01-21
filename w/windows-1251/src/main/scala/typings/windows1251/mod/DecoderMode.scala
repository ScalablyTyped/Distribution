package typings.windows1251.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.windows1251.windows1251Strings.replacement
  - typings.windows1251.windows1251Strings.fatal
*/
trait DecoderMode extends js.Object

object DecoderMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fatal: typings.windows1251.windows1251Strings.fatal = this.cast("fatal")
  @scala.inline
  def replacement: typings.windows1251.windows1251Strings.replacement = this.cast("replacement")
}

