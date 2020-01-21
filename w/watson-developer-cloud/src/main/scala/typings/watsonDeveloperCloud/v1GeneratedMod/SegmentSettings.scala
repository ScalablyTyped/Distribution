package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of Document Segmentation settings. */
trait SegmentSettings extends js.Object {
  /** Enables/disables the Document Segmentation feature. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Defines the heading level that splits into document segments. Valid values are h1, h2, h3, h4, h5, h6. The content of the header field that the segmentation splits at is used as the **title** field for that segmented result. */
  var selector_tags: js.UndefOr[js.Array[String]] = js.undefined
}

object SegmentSettings {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, selector_tags: js.Array[String] = null): SegmentSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (selector_tags != null) __obj.updateDynamic("selector_tags")(selector_tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentSettings]
  }
}

