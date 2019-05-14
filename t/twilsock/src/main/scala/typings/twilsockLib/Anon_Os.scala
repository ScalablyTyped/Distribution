package typings
package twilsockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Os extends js.Object {
  var os: java.lang.String
  var os_ver: java.lang.String
  var platform: java.lang.String
  var platform_ver: java.lang.String
}

object Anon_Os {
  @scala.inline
  def apply(
    os: java.lang.String,
    os_ver: java.lang.String,
    platform: java.lang.String,
    platform_ver: java.lang.String
  ): Anon_Os = {
    val __obj = js.Dynamic.literal(os = os, os_ver = os_ver, platform = platform, platform_ver = platform_ver)
  
    __obj.asInstanceOf[Anon_Os]
  }
}

