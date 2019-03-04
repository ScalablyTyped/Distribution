package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionData extends js.Object {
  var kernel: java.lang.String
  var node: java.lang.String
  var npm: java.lang.String
  var openssl: java.lang.String
  var pm2: java.lang.String
  var v8: java.lang.String
}

object VersionData {
  @scala.inline
  def apply(
    kernel: java.lang.String,
    node: java.lang.String,
    npm: java.lang.String,
    openssl: java.lang.String,
    pm2: java.lang.String,
    v8: java.lang.String
  ): VersionData = {
    val __obj = js.Dynamic.literal(kernel = kernel, node = node, npm = npm, openssl = openssl, pm2 = pm2, v8 = v8)
  
    __obj.asInstanceOf[VersionData]
  }
}

