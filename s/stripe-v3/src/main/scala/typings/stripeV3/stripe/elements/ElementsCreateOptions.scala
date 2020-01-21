package typings.stripeV3.stripe.elements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementsCreateOptions extends js.Object {
  var fonts: js.UndefOr[js.Array[Font]] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
}

object ElementsCreateOptions {
  @scala.inline
  def apply(fonts: js.Array[Font] = null, locale: String = null): ElementsCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementsCreateOptions]
  }
}

