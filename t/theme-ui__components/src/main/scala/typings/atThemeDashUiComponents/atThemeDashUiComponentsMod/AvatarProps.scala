package typings.atThemeDashUiComponents.atThemeDashUiComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react.react.ComponentProps<'img'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'img'>? react.react.ComponentProps<'img'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ trait AvatarProps extends js.Object {
  var size: js.UndefOr[Double | String] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(size: Double | String = null): AvatarProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarProps]
  }
}

