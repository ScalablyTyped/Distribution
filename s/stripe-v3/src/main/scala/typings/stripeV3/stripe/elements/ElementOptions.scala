package typings.stripeV3.stripe.elements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementOptions extends js.Object {
  var fonts: js.UndefOr[js.Array[Font]] = js.native
  var locale: js.UndefOr[String] = js.native
}

object ElementOptions {
  @scala.inline
  def apply(): ElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementOptions]
  }
  @scala.inline
  implicit class ElementOptionsOps[Self <: ElementOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFontsVarargs(value: Font*): Self = this.set("fonts", js.Array(value :_*))
    @scala.inline
    def setFonts(value: js.Array[Font]): Self = this.set("fonts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFonts: Self = this.set("fonts", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
  
}

