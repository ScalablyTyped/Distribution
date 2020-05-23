package typings.unzipper.anon

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  var stream: Readable
  def size(): js.Promise[Double]
}

object Size {
  @scala.inline
  def apply(size: () => js.Promise[Double], stream: Readable): Size = {
    val __obj = js.Dynamic.literal(size = js.Any.fromFunction0(size), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
}

