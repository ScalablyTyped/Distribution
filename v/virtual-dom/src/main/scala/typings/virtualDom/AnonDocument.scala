package typings.virtualDom

import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocument extends js.Object {
  var document: js.UndefOr[Document_] = js.undefined
  var warn: js.UndefOr[Boolean] = js.undefined
}

object AnonDocument {
  @scala.inline
  def apply(document: Document_ = null, warn: js.UndefOr[Boolean] = js.undefined): AnonDocument = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (!js.isUndefined(warn)) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocument]
  }
}

