package typings.themeUiComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react.react.ComponentProps<'div'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'div'>? react.react.ComponentProps<'div'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ @js.native
trait AspectRatioProps extends js.Object {
  var ratio: js.UndefOr[Double] = js.native
}

object AspectRatioProps {
  @scala.inline
  def apply(): AspectRatioProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AspectRatioProps]
  }
  @scala.inline
  implicit class AspectRatioPropsOps[Self <: AspectRatioProps] (val x: Self) extends AnyVal {
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
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
  }
  
}

