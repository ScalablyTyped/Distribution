package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastResponse extends js.Object {
  var ads: js.Array[VastAd]
  var errorURLTemplates: js.Array[java.lang.String]
}

object VastResponse {
  @scala.inline
  def apply(ads: js.Array[VastAd], errorURLTemplates: js.Array[java.lang.String]): VastResponse = {
    val __obj = js.Dynamic.literal(ads = ads, errorURLTemplates = errorURLTemplates)
  
    __obj.asInstanceOf[VastResponse]
  }
}

