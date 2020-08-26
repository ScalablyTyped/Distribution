package typings.wicgNativeFileSystem.anon

import typings.std.Blob
import typings.std.BufferSource
import typings.wicgNativeFileSystem.WriteParams
import typings.wicgNativeFileSystem.wicgNativeFileSystemStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends WriteParams {
  var data: BufferSource | Blob | String = js.native
  var position: js.UndefOr[Double] = js.native
  var `type`: write = js.native
}

object Data {
  @scala.inline
  def apply(data: BufferSource | Blob | String, `type`: write): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setData(value: BufferSource | Blob | String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: write): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

