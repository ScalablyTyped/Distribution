package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentAnonBackFront extends js.Object {
  /**
    * An identifying document, either a passport or local ID card.
    */
  var document: Anon_BackFront
}

object Anon_DocumentAnonBackFront {
  @scala.inline
  def apply(document: Anon_BackFront): Anon_DocumentAnonBackFront = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DocumentAnonBackFront]
  }
}

