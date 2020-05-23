package typings.wordpressComponents.iconMod.Icon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps[P] extends js.Object {
  /**
    * The icon to render. Supported values are: Dashicons (specified as
    * strings), functions, WPComponent instances and `null`.
    * @defaultValue null
    */
  var icon: js.UndefOr[IconType[P]] = js.undefined
  /**
    * The size (width and height) of the icon.
    * @defaultValue `20` (when using Dashicon), `24` otherwise
    */
  var size: js.UndefOr[Double] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply[P](icon: IconType[P] = null, size: js.UndefOr[Double] = js.undefined): BaseProps[P] = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps[P]]
  }
}

