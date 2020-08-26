package typings.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream", "MemoryStream")
@js.native
class MemoryStream[T] protected () extends Stream[T] {
  def this(producer: InternalProducer[T]) = this()
  var _has: js.Any = js.native
  var _v: js.Any = js.native
}

