package typings.stripejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: js.UndefOr[String] = js.undefined
   /** @default StripeElement */ var complete: js.UndefOr[String] = js.undefined
   /** @default StripeElement--complete */ var focus: String
   /** @default StripeElement--focus */ var invalid: String
}

object Anon_Base {
  @scala.inline
  def apply(focus: String, invalid: String, base: String = null, complete: String = null): Anon_Base = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Base]
  }
}

