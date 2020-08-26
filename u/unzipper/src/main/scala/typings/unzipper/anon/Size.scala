package typings.unzipper.anon

import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Size extends js.Object {
  var stream: Readable = js.native
  def size(): js.Promise[Double] = js.native
}

object Size {
  @scala.inline
  def apply(size: () => js.Promise[Double], stream: Readable): Size = {
    val __obj = js.Dynamic.literal(size = js.Any.fromFunction0(size), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  @scala.inline
  implicit class SizeOps[Self <: Size] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSize(value: () => js.Promise[Double]): Self = this.set("size", js.Any.fromFunction0(value))
    @scala.inline
    def setStream(value: Readable): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
  
}

