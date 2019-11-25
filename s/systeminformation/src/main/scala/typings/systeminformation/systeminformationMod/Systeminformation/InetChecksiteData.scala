package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InetChecksiteData extends js.Object {
  var ms: Double
  var ok: Boolean
  var status: Double
  var url: String
}

object InetChecksiteData {
  @scala.inline
  def apply(ms: Double, ok: Boolean, status: Double, url: String): InetChecksiteData = {
    val __obj = js.Dynamic.literal(ms = ms.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InetChecksiteData]
  }
}

