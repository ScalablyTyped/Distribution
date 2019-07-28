package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetChecksiteData extends js.Object {
  var ms: Double
  var ok: Boolean
  var status: Double
  var url: String
}

object NetChecksiteData {
  @scala.inline
  def apply(ms: Double, ok: Boolean, status: Double, url: String): NetChecksiteData = {
    val __obj = js.Dynamic.literal(ms = ms, ok = ok, status = status, url = url)
  
    __obj.asInstanceOf[NetChecksiteData]
  }
}

