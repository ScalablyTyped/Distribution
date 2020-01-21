package typings.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.theo.theoStrings.name
  - typings.theo.theoStrings.value
  - typings.theo.theoStrings.`type`
  - typings.theo.theoStrings.originalValue
  - typings.theo.theoStrings.category
  - typings.theo.theoStrings.comment
  - typings.theo.theoStrings.meta
*/
trait StyleProperty extends js.Object

object StyleProperty {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typings.theo.theoStrings.category = this.cast("category")
  @scala.inline
  def comment: typings.theo.theoStrings.comment = this.cast("comment")
  @scala.inline
  def meta: typings.theo.theoStrings.meta = this.cast("meta")
  @scala.inline
  def name: typings.theo.theoStrings.name = this.cast("name")
  @scala.inline
  def originalValue: typings.theo.theoStrings.originalValue = this.cast("originalValue")
  @scala.inline
  def `type`: typings.theo.theoStrings.`type` = this.cast("type")
  @scala.inline
  def value: typings.theo.theoStrings.value = this.cast("value")
}

