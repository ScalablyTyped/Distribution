package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionData extends js.Object {
  var kernel: String
  var node: String
  var npm: String
  var openssl: String
  var pm2: String
  var v8: String
}

object VersionData {
  @scala.inline
  def apply(kernel: String, node: String, npm: String, openssl: String, pm2: String, v8: String): VersionData = {
    val __obj = js.Dynamic.literal(kernel = kernel, node = node, npm = npm, openssl = openssl, pm2 = pm2, v8 = v8)
  
    __obj.asInstanceOf[VersionData]
  }
}

