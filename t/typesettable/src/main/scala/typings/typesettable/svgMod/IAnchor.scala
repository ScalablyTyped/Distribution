package typings.typesettable.svgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typesettable.typesettableStrings.start
  - typings.typesettable.typesettableStrings.middle
  - typings.typesettable.typesettableStrings.end
*/
trait IAnchor extends js.Object

object IAnchor {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typings.typesettable.typesettableStrings.end = this.cast("end")
  @scala.inline
  def middle: typings.typesettable.typesettableStrings.middle = this.cast("middle")
  @scala.inline
  def start: typings.typesettable.typesettableStrings.start = this.cast("start")
}

