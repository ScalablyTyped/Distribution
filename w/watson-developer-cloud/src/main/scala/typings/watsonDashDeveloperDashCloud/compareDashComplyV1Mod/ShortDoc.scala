package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Brief information about the input document. */
trait ShortDoc extends js.Object {
  /** The MD5 hash of the input document. */
  var hash: js.UndefOr[String] = js.undefined
  /** The title of the input document, if identified. */
  var title: js.UndefOr[String] = js.undefined
}

object ShortDoc {
  @scala.inline
  def apply(hash: String = null, title: String = null): ShortDoc = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortDoc]
  }
}

