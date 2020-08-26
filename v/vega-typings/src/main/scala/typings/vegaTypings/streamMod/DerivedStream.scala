package typings.vegaTypings.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DerivedStream
  extends _Stream
     with StreamParameters {
  var stream: Stream = js.native
}

object DerivedStream {
  @scala.inline
  def apply(stream: Stream): DerivedStream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[DerivedStream]
  }
  @scala.inline
  implicit class DerivedStreamOps[Self <: DerivedStream] (val x: Self) extends AnyVal {
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
    def setStream(value: Stream): Self = this.set("stream", value.asInstanceOf[js.Any])
  }
  
}

