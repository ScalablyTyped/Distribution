package typings.themeUiComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react.react.ComponentProps<'img'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'img'>? react.react.ComponentProps<'img'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ @js.native
trait AvatarProps extends js.Object {
  var size: js.UndefOr[Double | String] = js.native
}

object AvatarProps {
  @scala.inline
  def apply(): AvatarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvatarProps]
  }
  @scala.inline
  implicit class AvatarPropsOps[Self <: AvatarProps] (val x: Self) extends AnyVal {
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
    def setSize(value: Double | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

