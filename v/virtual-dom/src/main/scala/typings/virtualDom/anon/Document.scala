package typings.virtualDom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var document: js.UndefOr[typings.std.Document] = js.undefined
  var warn: js.UndefOr[Boolean] = js.undefined
}

object Document {
  @scala.inline
  def apply(document: typings.std.Document = null, warn: js.UndefOr[Boolean] = js.undefined): Document = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (!js.isUndefined(warn)) __obj.updateDynamic("warn")(warn.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

