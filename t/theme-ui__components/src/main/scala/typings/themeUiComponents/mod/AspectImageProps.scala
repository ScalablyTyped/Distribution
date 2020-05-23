package typings.themeUiComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react.react.ComponentProps<'img'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'img'>? react.react.ComponentProps<'img'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ trait AspectImageProps extends js.Object {
  var ratio: js.UndefOr[Double] = js.undefined
}

object AspectImageProps {
  @scala.inline
  def apply(ratio: js.UndefOr[Double] = js.undefined): AspectImageProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AspectImageProps]
  }
}

