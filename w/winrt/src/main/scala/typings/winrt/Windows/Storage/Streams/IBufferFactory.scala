package typings.winrt.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBufferFactory extends js.Object {
  def create(capacity: Double): Buffer
}

object IBufferFactory {
  @scala.inline
  def apply(create: Double => Buffer): IBufferFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[IBufferFactory]
  }
}

