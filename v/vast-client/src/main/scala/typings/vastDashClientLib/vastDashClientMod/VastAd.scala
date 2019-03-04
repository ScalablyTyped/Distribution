package typings
package vastDashClientLib.vastDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VastAd extends js.Object {
  var advertiser: java.lang.String | scala.Null
  var creatives: js.Array[VastCreative]
  var description: java.lang.String | scala.Null
  var errorURLTemplates: js.Array[java.lang.String]
  var extensions: js.Array[VastAdExtension]
  var id: java.lang.String | scala.Null
  var impressionURLTemplates: js.Array[java.lang.String]
  var pricing: java.lang.String | scala.Null
  var sequence: java.lang.String | scala.Null
  var survey: java.lang.String | scala.Null
  var system: VastSystem | java.lang.String | scala.Null
  var title: java.lang.String | scala.Null
}

object VastAd {
  @scala.inline
  def apply(
    creatives: js.Array[VastCreative],
    errorURLTemplates: js.Array[java.lang.String],
    extensions: js.Array[VastAdExtension],
    impressionURLTemplates: js.Array[java.lang.String],
    advertiser: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    pricing: java.lang.String = null,
    sequence: java.lang.String = null,
    survey: java.lang.String = null,
    system: VastSystem | java.lang.String = null,
    title: java.lang.String = null
  ): VastAd = {
    val __obj = js.Dynamic.literal(creatives = creatives, errorURLTemplates = errorURLTemplates, extensions = extensions, impressionURLTemplates = impressionURLTemplates)
    if (advertiser != null) __obj.updateDynamic("advertiser")(advertiser)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (pricing != null) __obj.updateDynamic("pricing")(pricing)
    if (sequence != null) __obj.updateDynamic("sequence")(sequence)
    if (survey != null) __obj.updateDynamic("survey")(survey)
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[VastAd]
  }
}

