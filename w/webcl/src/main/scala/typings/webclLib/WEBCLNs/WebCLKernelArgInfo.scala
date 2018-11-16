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

