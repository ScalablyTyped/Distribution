package typings
package stripejsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: js.UndefOr[java.lang.String] = js.undefined
   /** @default StripeElement */ var complete: js.UndefOr[java.lang.String] = js.undefined
   /** @default StripeElement--complete */ var focus: java.lang.String
   /** @default StripeElement--focus */ var invalid: java.lang.String
}

object Anon_Base {
  @scala.inline
  def apply(
    focus: java.lang.String,
    invalid: java.lang.String,
    base: java.lang.String = null,
    complete: java.lang.String = null
  ): Anon_Base = {
    val __obj = js.Dynamic.literal(focus = focus, invalid = invalid)
    if (base != null) __obj.updateDynamic("base")(base)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    __obj.asInstanceOf[Anon_Base]
  }
}

