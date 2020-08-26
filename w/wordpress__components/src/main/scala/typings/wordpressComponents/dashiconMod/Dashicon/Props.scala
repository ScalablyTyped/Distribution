package typings.wordpressComponents.dashiconMod.Dashicon

import typings.react.mod.ClassAttributes
import typings.react.mod.SVGAttributes
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props
  extends SVGAttributes[SVGSVGElement]
     with ClassAttributes[SVGSVGElement] {
  /**
    * ID of the dashicon to use.
    */
  var icon: Icon = js.native
  /**
    * Width of the icon (in pixels).
    * @defaultValue 20
    */
  var size: js.UndefOr[Double] = js.native
}

object Props {
  @scala.inline
  def apply(icon: Icon): Props = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

