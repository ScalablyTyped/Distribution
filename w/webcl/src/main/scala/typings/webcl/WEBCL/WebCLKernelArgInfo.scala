package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.9.1
@js.native
trait WebCLKernelArgInfo extends js.Object {
   // 'global', 'local', 'constant', or 'private'
  var accessQualifier: String = js.native
           // 'char', 'float', 'uint4', 'image2d_t', 'sampler_t', etc.
  var addressQualifier: String = js.native
  var name: String = js.native
  var typeName: String = js.native
}

object WebCLKernelArgInfo {
  @scala.inline
  def apply(accessQualifier: String, addressQualifier: String, name: String, typeName: String): WebCLKernelArgInfo = {
    val __obj = js.Dynamic.literal(accessQualifier = accessQualifier.asInstanceOf[js.Any], addressQualifier = addressQualifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebCLKernelArgInfo]
  }
  @scala.inline
  implicit class WebCLKernelArgInfoOps[Self <: WebCLKernelArgInfo] (val x: Self) extends AnyVal {
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
    def setAccessQualifier(value: String): Self = this.set("accessQualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddressQualifier(value: String): Self = this.set("addressQualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeName(value: String): Self = this.set("typeName", value.asInstanceOf[js.Any])
  }
  
}

