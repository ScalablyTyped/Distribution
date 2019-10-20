package typings.watsonDashDeveloperDashCloud.personalityDashInsightsV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Content. */
trait Content extends js.Object {
  /** An array of `ContentItem` objects that provides the text that is to be analyzed. */
  var content_items: js.Array[ContentItem]
}

object Content {
  @scala.inline
  def apply(content_items: js.Array[ContentItem]): Content = {
    val __obj = js.Dynamic.literal(content_items = content_items)
  
    __obj.asInstanceOf[Content]
  }
}

