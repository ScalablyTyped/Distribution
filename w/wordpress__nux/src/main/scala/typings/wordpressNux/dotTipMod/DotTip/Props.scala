package typings.wordpressNux.dotTipMod.DotTip

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Any React element or elements can be passed as children. They will be rendered within the
    * tip bubble.
    */
  var children: ReactNode = js.native
  /**
    * A string that uniquely identifies the tip. Identifiers should be prefixed with the name
    * of the plugin, followed by a `/`. For example, `acme/add-to-cart`.
    */
  var tipId: String = js.native
}

object Props {
  @scala.inline
  def apply(tipId: String): Props = {
    val __obj = js.Dynamic.literal(tipId = tipId.asInstanceOf[js.Any])
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
    def setTipId(value: String): Self = this.set("tipId", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

