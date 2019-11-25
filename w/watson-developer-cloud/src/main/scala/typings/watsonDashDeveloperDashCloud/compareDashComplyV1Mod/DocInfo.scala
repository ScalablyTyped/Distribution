package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about the parsed input document. */
trait DocInfo extends js.Object {
  /** The MD5 hash of the input document. */
  var hash: js.UndefOr[String] = js.undefined
  /** The full text of the parsed document in HTML format. */
  var html: js.UndefOr[String] = js.undefined
  /** The title of the parsed document. If the service did not detect a title, the value of this element is `null`. */
  var title: js.UndefOr[String] = js.undefined
}

object DocInfo {
  @scala.inline
  def apply(hash: String = null, html: String = null, title: String = null): DocInfo = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocInfo]
  }
}

