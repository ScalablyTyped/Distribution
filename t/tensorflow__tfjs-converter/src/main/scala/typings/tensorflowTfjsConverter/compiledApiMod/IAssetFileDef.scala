package typings.tensorflowTfjsConverter.compiledApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAssetFileDef extends js.Object {
  /** AssetFileDef filename */
  var filename: js.UndefOr[String | Null] = js.native
  /** AssetFileDef tensorInfo */
  var tensorInfo: js.UndefOr[ITensorInfo | Null] = js.native
}

object IAssetFileDef {
  @scala.inline
  def apply(): IAssetFileDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAssetFileDef]
  }
  @scala.inline
  implicit class IAssetFileDefOps[Self <: IAssetFileDef] (val x: Self) extends AnyVal {
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
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFilenameNull: Self = this.set("filename", null)
    @scala.inline
    def setTensorInfo(value: ITensorInfo): Self = this.set("tensorInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTensorInfo: Self = this.set("tensorInfo", js.undefined)
    @scala.inline
    def setTensorInfoNull: Self = this.set("tensorInfo", null)
  }
  
}

