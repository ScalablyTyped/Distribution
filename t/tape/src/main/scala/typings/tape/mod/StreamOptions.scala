package typings.tape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the createStream function.
  */
@js.native
trait StreamOptions extends js.Object {
  var objectMode: js.UndefOr[Boolean] = js.native
}

object StreamOptions {
  @scala.inline
  def apply(): StreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamOptions]
  }
  @scala.inline
  implicit class StreamOptionsOps[Self <: StreamOptions] (val x: Self) extends AnyVal {
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
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectMode: Self = this.set("objectMode", js.undefined)
  }
  
}

