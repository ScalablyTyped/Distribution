package typings.typedarrayPool.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typedarrayPool.typedarrayPoolStrings.uint8
  - typings.typedarrayPool.typedarrayPoolStrings.uint16
  - typings.typedarrayPool.typedarrayPoolStrings.uint32
  - typings.typedarrayPool.typedarrayPoolStrings.int8
  - typings.typedarrayPool.typedarrayPoolStrings.int16
  - typings.typedarrayPool.typedarrayPoolStrings.int32
  - typings.typedarrayPool.typedarrayPoolStrings.float
  - typings.typedarrayPool.typedarrayPoolStrings.float32
  - typings.typedarrayPool.typedarrayPoolStrings.double
  - typings.typedarrayPool.typedarrayPoolStrings.float64
  - typings.typedarrayPool.typedarrayPoolStrings.arraybuffer
  - typings.typedarrayPool.typedarrayPoolStrings.data
  - typings.typedarrayPool.typedarrayPoolStrings.dataview
  - typings.typedarrayPool.typedarrayPoolStrings.uint8_clamped
  - typings.typedarrayPool.typedarrayPoolStrings.buffer
*/
trait DataType extends js.Object

object DataType {
  @scala.inline
  def arraybuffer: typings.typedarrayPool.typedarrayPoolStrings.arraybuffer = this.cast("arraybuffer")
  @scala.inline
  def buffer: typings.typedarrayPool.typedarrayPoolStrings.buffer = this.cast("buffer")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typings.typedarrayPool.typedarrayPoolStrings.data = this.cast("data")
  @scala.inline
  def dataview: typings.typedarrayPool.typedarrayPoolStrings.dataview = this.cast("dataview")
  @scala.inline
  def double: typings.typedarrayPool.typedarrayPoolStrings.double = this.cast("double")
  @scala.inline
  def float: typings.typedarrayPool.typedarrayPoolStrings.float = this.cast("float")
  @scala.inline
  def float32: typings.typedarrayPool.typedarrayPoolStrings.float32 = this.cast("float32")
  @scala.inline
  def float64: typings.typedarrayPool.typedarrayPoolStrings.float64 = this.cast("float64")
  @scala.inline
  def int16: typings.typedarrayPool.typedarrayPoolStrings.int16 = this.cast("int16")
  @scala.inline
  def int32: typings.typedarrayPool.typedarrayPoolStrings.int32 = this.cast("int32")
  @scala.inline
  def int8: typings.typedarrayPool.typedarrayPoolStrings.int8 = this.cast("int8")
  @scala.inline
  def uint16: typings.typedarrayPool.typedarrayPoolStrings.uint16 = this.cast("uint16")
  @scala.inline
  def uint32: typings.typedarrayPool.typedarrayPoolStrings.uint32 = this.cast("uint32")
  @scala.inline
  def uint8: typings.typedarrayPool.typedarrayPoolStrings.uint8 = this.cast("uint8")
  @scala.inline
  def uint8_clamped: typings.typedarrayPool.typedarrayPoolStrings.uint8_clamped = this.cast("uint8_clamped")
}

