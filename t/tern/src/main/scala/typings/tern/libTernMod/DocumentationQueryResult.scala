package typings.tern.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationQueryResult extends js.Object {
  /** The documentation string of the definition or value, if any. */
  var doc: js.UndefOr[String] = js.undefined
  /** The origin of the definition or value, if any. */
  var origin: js.UndefOr[String] = js.undefined
  /** The url of the definition or value, if any. */
  var url: js.UndefOr[String] = js.undefined
}

object DocumentationQueryResult {
  @scala.inline
  def apply(doc: String = null, origin: String = null, url: String = null): DocumentationQueryResult = {
    val __obj = js.Dynamic.literal()
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationQueryResult]
  }
}

