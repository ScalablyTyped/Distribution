package typings.victory.victoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text anchor type
  */
/* Rewritten from type alias, can be one of: 
  - typings.victory.victoryStrings.start
  - typings.victory.victoryStrings.middle
  - typings.victory.victoryStrings.end
  - typings.victory.victoryStrings.inherit
*/
trait TextAnchorType extends js.Object

object TextAnchorType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typings.victory.victoryStrings.end = this.cast("end")
  @scala.inline
  def inherit: typings.victory.victoryStrings.inherit = this.cast("inherit")
  @scala.inline
  def middle: typings.victory.victoryStrings.middle = this.cast("middle")
  @scala.inline
  def start: typings.victory.victoryStrings.start = this.cast("start")
}

