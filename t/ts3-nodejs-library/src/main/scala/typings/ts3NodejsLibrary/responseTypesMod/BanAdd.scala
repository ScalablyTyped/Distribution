package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BanAdd extends js.Object {
  var banid: Double
}

object BanAdd {
  @scala.inline
  def apply(banid: Double): BanAdd = {
    val __obj = js.Dynamic.literal(banid = banid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BanAdd]
  }
}

