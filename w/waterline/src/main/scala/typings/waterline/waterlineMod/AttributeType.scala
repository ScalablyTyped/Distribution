package typings.waterline.waterlineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.waterline.waterlineStrings.string
  - typings.waterline.waterlineStrings.text
  - typings.waterline.waterlineStrings.integer
  - typings.waterline.waterlineStrings.float
  - typings.waterline.waterlineStrings.date
  - typings.waterline.waterlineStrings.time
  - typings.waterline.waterlineStrings.datetime
  - typings.waterline.waterlineStrings.boolean
  - typings.waterline.waterlineStrings.binary
  - typings.waterline.waterlineStrings.array
  - typings.waterline.waterlineStrings.json
*/
trait AttributeType extends js.Object

object AttributeType {
  @scala.inline
  def array: typings.waterline.waterlineStrings.array = this.cast("array")
  @scala.inline
  def binary: typings.waterline.waterlineStrings.binary = this.cast("binary")
  @scala.inline
  def boolean: typings.waterline.waterlineStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.waterline.waterlineStrings.date = this.cast("date")
  @scala.inline
  def datetime: typings.waterline.waterlineStrings.datetime = this.cast("datetime")
  @scala.inline
  def float: typings.waterline.waterlineStrings.float = this.cast("float")
  @scala.inline
  def integer: typings.waterline.waterlineStrings.integer = this.cast("integer")
  @scala.inline
  def json: typings.waterline.waterlineStrings.json = this.cast("json")
  @scala.inline
  def string: typings.waterline.waterlineStrings.string = this.cast("string")
  @scala.inline
  def text: typings.waterline.waterlineStrings.text = this.cast("text")
  @scala.inline
  def time: typings.waterline.waterlineStrings.time = this.cast("time")
}

