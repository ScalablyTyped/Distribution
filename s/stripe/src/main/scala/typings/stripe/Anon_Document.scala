package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Document extends js.Object {
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: js.UndefOr[Anon_Back] = js.undefined
}

object Anon_Document {
  @scala.inline
  def apply(document: Anon_Back = null): Anon_Document = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document)
    __obj.asInstanceOf[Anon_Document]
  }
}

