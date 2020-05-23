package typings.themeUiComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react.react.ComponentProps<'div'> & @theme-ui/components.@theme-ui/components.BoxOwnProps ]: P extends keyof react.react.ComponentProps<'div'>? react.react.ComponentProps<'div'>[P] : P extends keyof @theme-ui/components.@theme-ui/components.BoxOwnProps? @theme-ui/components.@theme-ui/components.BoxOwnProps[P] : never} */ trait EmbedProps extends js.Object {
  var allow: js.UndefOr[String] = js.undefined
  var allowFullScreen: js.UndefOr[Boolean] = js.undefined
  var frameBorder: js.UndefOr[Double | String] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object EmbedProps {
  @scala.inline
  def apply(
    allow: String = null,
    allowFullScreen: js.UndefOr[Boolean] = js.undefined,
    frameBorder: Double | String = null,
    ratio: js.UndefOr[Double] = js.undefined,
    src: String = null
  ): EmbedProps = {
    val __obj = js.Dynamic.literal()
    if (allow != null) __obj.updateDynamic("allow")(allow.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen.get.asInstanceOf[js.Any])
    if (frameBorder != null) __obj.updateDynamic("frameBorder")(frameBorder.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbedProps]
  }
}

