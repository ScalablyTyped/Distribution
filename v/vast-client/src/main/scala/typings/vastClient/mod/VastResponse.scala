package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastResponse extends js.Object {
  var ads: js.Array[VastAd]
  var errorURLTemplates: js.Array[String]
}

object VastResponse {
  @scala.inline
  def apply(ads: js.Array[VastAd], errorURLTemplates: js.Array[String]): VastResponse = {
    val __obj = js.Dynamic.literal(ads = ads.asInstanceOf[js.Any], errorURLTemplates = errorURLTemplates.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VastResponse]
  }
}

