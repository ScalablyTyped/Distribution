package typings.winrtUwp.Windows.Graphics.Printing3D

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies how to parse data in the buffer. */
@js.native
trait Printing3DBufferDescription extends js.Object {
  /** Specifies the format used by the buffer. */
  var format: Printing3DBufferFormat = js.native
  /** Specifies how far to move the pointer forward to find the next unit of data. */
  var stride: Double = js.native
}

object Printing3DBufferDescription {
  @scala.inline
  def apply(format: Printing3DBufferFormat, stride: Double): Printing3DBufferDescription = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DBufferDescription]
  }
  @scala.inline
  implicit class Printing3DBufferDescriptionOps[Self <: Printing3DBufferDescription] (val x: Self) extends AnyVal {
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
    def setFormat(value: Printing3DBufferFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setStride(value: Double): Self = this.set("stride", value.asInstanceOf[js.Any])
  }
  
}

