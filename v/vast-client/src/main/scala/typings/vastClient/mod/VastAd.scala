package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastAd extends js.Object {
  var advertiser: String | Null
  var creatives: js.Array[VastCreative]
  var description: String | Null
  var errorURLTemplates: js.Array[String]
  var extensions: js.Array[VastAdExtension]
  var id: String | Null
  var impressionURLTemplates: js.Array[String]
  var pricing: String | Null
  var sequence: String | Null
  var survey: String | Null
  var system: VastSystem | String | Null
  var title: String | Null
}

object VastAd {
  @scala.inline
  def apply(
    creatives: js.Array[VastCreative],
    errorURLTemplates: js.Array[String],
    extensions: js.Array[VastAdExtension],
    impressionURLTemplates: js.Array[String],
    advertiser: String = null,
    description: String = null,
    id: String = null,
    pricing: String = null,
    sequence: String = null,
    survey: String = null,
    system: VastSystem | String = null,
    title: String = null
  ): VastAd = {
    val __obj = js.Dynamic.literal(creatives = creatives.asInstanceOf[js.Any], errorURLTemplates = errorURLTemplates.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], impressionURLTemplates = impressionURLTemplates.asInstanceOf[js.Any], advertiser = advertiser.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pricing = pricing.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], survey = survey.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastAd]
  }
}

