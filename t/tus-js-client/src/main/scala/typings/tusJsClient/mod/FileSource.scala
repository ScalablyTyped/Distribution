package typings.tusJsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSource extends js.Object {
  var size: Double
  def close(): Unit
  def slice(start: Double, end: Double): js.Promise[SliceResult]
}

object FileSource {
  @scala.inline
  def apply(close: () => Unit, size: Double, slice: (Double, Double) => js.Promise[SliceResult]): FileSource = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), size = size.asInstanceOf[js.Any], slice = js.Any.fromFunction2(slice))
    __obj.asInstanceOf[FileSource]
  }
}

