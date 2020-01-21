package typings.wordwrap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In "soft" mode, split chunks by `/(\S+\s+/` and don't break up chunks
  * which are longer than `stop - start`, in "hard" mode, split chunks with
  * `/\b/` and break up chunks longer than `stop - start`.
  */
/* Rewritten from type alias, can be one of: 
  - typings.wordwrap.wordwrapStrings.soft
  - typings.wordwrap.wordwrapStrings.hard
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hard: typings.wordwrap.wordwrapStrings.hard = this.cast("hard")
  @scala.inline
  def soft: typings.wordwrap.wordwrapStrings.soft = this.cast("soft")
}

