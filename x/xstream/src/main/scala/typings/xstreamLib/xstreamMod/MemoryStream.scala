package typings
package xstreamLib.xstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstream", "MemoryStream")
@js.native
class MemoryStream[T] protected () extends Stream[T] {
  def this(producer: InternalProducer[T]) = this()
  var _has: js.UndefOr[js.Any] = js.native
  var _v: js.UndefOr[js.Any] = js.native
}

