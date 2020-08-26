package typings.unzipper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disknum extends js.Object {
  var compressedSize: Double = js.native
  var disknum: Double = js.native
  var offset: Double = js.native
  var partsize: Double = js.native
  var signature: Double = js.native
  var uncompressedSize: Double = js.native
}

object Disknum {
  @scala.inline
  def apply(
    compressedSize: Double,
    disknum: Double,
    offset: Double,
    partsize: Double,
    signature: Double,
    uncompressedSize: Double
  ): Disknum = {
    val __obj = js.Dynamic.literal(compressedSize = compressedSize.asInstanceOf[js.Any], disknum = disknum.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partsize = partsize.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], uncompressedSize = uncompressedSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disknum]
  }
  @scala.inline
  implicit class DisknumOps[Self <: Disknum] (val x: Self) extends AnyVal {
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
    def setCompressedSize(value: Double): Self = this.set("compressedSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisknum(value: Double): Self = this.set("disknum", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartsize(value: Double): Self = this.set("partsize", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: Double): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def setUncompressedSize(value: Double): Self = this.set("uncompressedSize", value.asInstanceOf[js.Any])
  }
  
}

