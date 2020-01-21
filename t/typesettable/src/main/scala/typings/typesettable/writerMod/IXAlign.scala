package typings.typesettable.writerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typesettable.typesettableStrings.left
  - typings.typesettable.typesettableStrings.center
  - typings.typesettable.typesettableStrings.right
*/
trait IXAlign extends js.Object

object IXAlign {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.typesettable.typesettableStrings.center = this.cast("center")
  @scala.inline
  def left: typings.typesettable.typesettableStrings.left = this.cast("left")
  @scala.inline
  def right: typings.typesettable.typesettableStrings.right = this.cast("right")
}

