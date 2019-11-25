package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Basic information about the input document. */
trait Document extends js.Object {
  /** The MD5 hash value of the input document. */
  var hash: js.UndefOr[String] = js.undefined
  /** The input document converted into HTML format. */
  var html: js.UndefOr[String] = js.undefined
  /** The label applied to the input document with the calling method's `file_1_label` or `file_2_label` value. This field is specified only in the output of the **Comparing two documents** method. */
  var label: js.UndefOr[String] = js.undefined
  /** Document title, if detected. */
  var title: js.UndefOr[String] = js.undefined
}

object Document {
  @scala.inline
  def apply(hash: String = null, html: String = null, label: String = null, title: String = null): Document = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

