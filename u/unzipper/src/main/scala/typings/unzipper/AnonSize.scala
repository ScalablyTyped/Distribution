package typings.unzipper

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSize extends js.Object {
  var stream: Readable
  def size(): js.Promise[Double]
}

object AnonSize {
  @scala.inline
  def apply(size: () => js.Promise[Double], stream: Readable): AnonSize = {
    val __obj = js.Dynamic.literal(size = js.Any.fromFunction0(size), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSize]
  }
}

