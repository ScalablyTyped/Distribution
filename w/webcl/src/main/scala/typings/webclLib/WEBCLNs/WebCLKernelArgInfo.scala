package typings
package webclLib.WEBCLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.9.1
trait WebCLKernelArgInfo extends js.Object {
   // 'global', 'local', 'constant', or 'private'
  var accessQualifier: java.lang.String
           // 'char', 'float', 'uint4', 'image2d_t', 'sampler_t', etc.
  var addressQualifier: java.lang.String
  var name: java.lang.String
  var typeName: java.lang.String
}

object WebCLKernelArgInfo {
  @scala.inline
  def apply(
    accessQualifier: java.lang.String,
    addressQualifier: java.lang.String,
    name: java.lang.String,
    typeName: java.lang.String
  ): WebCLKernelArgInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessQualifier")(accessQualifier)
    __obj.updateDynamic("addressQualifier")(addressQualifier)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("typeName")(typeName)
    __obj.asInstanceOf[WebCLKernelArgInfo]
  }
}

