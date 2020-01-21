package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocument extends js.Object {
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: js.UndefOr[AnonBack] = js.undefined
}

object AnonDocument {
  @scala.inline
  def apply(document: AnonBack = null): AnonDocument = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocument]
  }
}

