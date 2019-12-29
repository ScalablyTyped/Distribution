package typings.atThemeDashUiComponents.atThemeDashUiComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react.react.ComponentProps<'div'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'div'>? react.react.ComponentProps<'div'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ trait AspectRatioProps extends js.Object {
  var ratio: js.UndefOr[Double] = js.undefined
}

object AspectRatioProps {
  @scala.inline
  def apply(ratio: Int | Double = null): AspectRatioProps = {
    val __obj = js.Dynamic.literal()
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[AspectRatioProps]
  }
}

