package typings.webcl.WEBCL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.9.1
trait WebCLKernelArgInfo extends js.Object {
   // 'global', 'local', 'constant', or 'private'
  var accessQualifier: String
           // 'char', 'float', 'uint4', 'image2d_t', 'sampler_t', etc.
  var addressQualifier: String
  var name: String
  var typeName: String
}

object WebCLKernelArgInfo {
  @scala.inline
  def apply(accessQualifier: String, addressQualifier: String, name: String, typeName: String): WebCLKernelArgInfo = {
    val __obj = js.Dynamic.literal(accessQualifier = accessQualifier, addressQualifier = addressQualifier, name = name, typeName = typeName)
  
    __obj.asInstanceOf[WebCLKernelArgInfo]
  }
}

