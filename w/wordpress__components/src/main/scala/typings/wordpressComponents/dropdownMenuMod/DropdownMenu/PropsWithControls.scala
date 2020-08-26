package typings.wordpressComponents.dropdownMenuMod.DropdownMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsWithControls
  extends BaseProps
     with Props {
  var children: js.UndefOr[scala.Nothing] = js.native
  /**
    * An array of objects describing the options to be shown in the
    * expanded menu.
    */
  var controls: js.Array[Control] = js.native
}

object PropsWithControls {
  @scala.inline
  def apply(controls: js.Array[Control], label: String): PropsWithControls = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithControls]
  }
  @scala.inline
  implicit class PropsWithControlsOps[Self <: PropsWithControls] (val x: Self) extends AnyVal {
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
    def setControlsVarargs(value: Control*): Self = this.set("controls", js.Array(value :_*))
    @scala.inline
    def setControls(value: js.Array[Control]): Self = this.set("controls", value.asInstanceOf[js.Any])
  }
  
}

