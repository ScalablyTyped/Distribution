package typings.virtualDashDom

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Document extends js.Object {
  var document: js.UndefOr[Document] = js.undefined
  var warn: js.UndefOr[Boolean] = js.undefined
}

object Anon_Document {
  @scala.inline
  def apply(document: Document = null, warn: js.UndefOr[Boolean] = js.undefined): Anon_Document = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document)
    if (!js.isUndefined(warn)) __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Anon_Document]
  }
}

