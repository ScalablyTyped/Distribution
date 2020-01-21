package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of HTML conversion settings. */
trait HtmlSettings extends js.Object {
  var exclude_content: js.UndefOr[XPathPatterns] = js.undefined
  /** Array of HTML tag attributes to exclude. */
  var exclude_tag_attributes: js.UndefOr[js.Array[String]] = js.undefined
  /** Array of HTML tags that are excluded completely. */
  var exclude_tags_completely: js.UndefOr[js.Array[String]] = js.undefined
  /** Array of HTML tags which are excluded but still retain content. */
  var exclude_tags_keep_content: js.UndefOr[js.Array[String]] = js.undefined
  var keep_content: js.UndefOr[XPathPatterns] = js.undefined
  /** An array of HTML tag attributes to keep in the converted document. */
  var keep_tag_attributes: js.UndefOr[js.Array[String]] = js.undefined
}

object HtmlSettings {
  @scala.inline
  def apply(
    exclude_content: XPathPatterns = null,
    exclude_tag_attributes: js.Array[String] = null,
    exclude_tags_completely: js.Array[String] = null,
    exclude_tags_keep_content: js.Array[String] = null,
    keep_content: XPathPatterns = null,
    keep_tag_attributes: js.Array[String] = null
  ): HtmlSettings = {
    val __obj = js.Dynamic.literal()
    if (exclude_content != null) __obj.updateDynamic("exclude_content")(exclude_content.asInstanceOf[js.Any])
    if (exclude_tag_attributes != null) __obj.updateDynamic("exclude_tag_attributes")(exclude_tag_attributes.asInstanceOf[js.Any])
    if (exclude_tags_completely != null) __obj.updateDynamic("exclude_tags_completely")(exclude_tags_completely.asInstanceOf[js.Any])
    if (exclude_tags_keep_content != null) __obj.updateDynamic("exclude_tags_keep_content")(exclude_tags_keep_content.asInstanceOf[js.Any])
    if (keep_content != null) __obj.updateDynamic("keep_content")(keep_content.asInstanceOf[js.Any])
    if (keep_tag_attributes != null) __obj.updateDynamic("keep_tag_attributes")(keep_tag_attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlSettings]
  }
}

