package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentFront extends js.Object {
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: Front
}

object DocumentFront {
  @scala.inline
  def apply(document: Front): DocumentFront = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFront]
  }
}

