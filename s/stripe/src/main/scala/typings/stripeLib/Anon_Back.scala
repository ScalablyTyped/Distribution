package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Back extends js.Object {
  /**
    * The back of an ID returned by a file upload with a purpose value of identity_document.
    * This can be unset by updating the value to null and then saving.
    */
  var back: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The front of an ID returned by a file upload with a purpose value of identity_document.
    * This can be unset by updating the value to null and then saving.
    */
  var front: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Back {
  @scala.inline
  def apply(back: java.lang.String = null, front: java.lang.String = null): Anon_Back = {
    val __obj = js.Dynamic.literal()
    if (back != null) __obj.updateDynamic("back")(back)
    if (front != null) __obj.updateDynamic("front")(front)
    __obj.asInstanceOf[Anon_Back]
  }
}

