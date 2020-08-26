package typings.titanium

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to [createStream](Titanium.Stream.createStream).
  */
@js.native
trait CreateStreamArgs extends js.Object {
  /**
    * Mode to open the stream in.
    */
  var mode: js.UndefOr[Double] = js.native
  /**
    * Object that the stream will read from or write to.
    */
  var source: js.UndefOr[Blob | Buffer] = js.native
}

object CreateStreamArgs {
  @scala.inline
  def apply(): CreateStreamArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamArgs]
  }
  @scala.inline
  implicit class CreateStreamArgsOps[Self <: CreateStreamArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setSource(value: Blob | Buffer): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

