package typings.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.victory.victoryStrings.top
  - typings.victory.victoryStrings.bottom
  - typings.victory.victoryStrings.left
  - typings.victory.victoryStrings.right
*/
trait OrientationTypes extends js.Object

object OrientationTypes {
  @scala.inline
  def bottom: typings.victory.victoryStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.victory.victoryStrings.left = this.cast("left")
  @scala.inline
  def right: typings.victory.victoryStrings.right = this.cast("right")
  @scala.inline
  def top: typings.victory.victoryStrings.top = this.cast("top")
}

