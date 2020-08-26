package typings.tiffToPng.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converted extends js.Object {
  val filename: String = js.native
  val success: Boolean = js.native
  val target: String = js.native
  val tiff: String = js.native
}

object Converted {
  @scala.inline
  def apply(filename: String, success: Boolean, target: String, tiff: String): Converted = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], tiff = tiff.asInstanceOf[js.Any])
    __obj.asInstanceOf[Converted]
  }
  @scala.inline
  implicit class ConvertedOps[Self <: Converted] (val x: Self) extends AnyVal {
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTiff(value: String): Self = this.set("tiff", value.asInstanceOf[js.Any])
  }
  
}

