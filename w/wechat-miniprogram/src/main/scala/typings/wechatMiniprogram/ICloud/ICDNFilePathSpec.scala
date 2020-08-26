package typings.wechatMiniprogram.ICloud

import typings.wechatMiniprogram.wechatMiniprogramStrings.filePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICDNFilePathSpec extends js.Object {
  var filePath: String = js.native
  var `type`: filePath = js.native
}

object ICDNFilePathSpec {
  @scala.inline
  def apply(filePath: String, `type`: filePath): ICDNFilePathSpec = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICDNFilePathSpec]
  }
  @scala.inline
  implicit class ICDNFilePathSpecOps[Self <: ICDNFilePathSpec] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: filePath): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

