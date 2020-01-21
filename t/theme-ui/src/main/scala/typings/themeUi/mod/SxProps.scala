package typings.themeUi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SxProps extends js.Object {
  /**
    * The sx prop lets you style elements inline, using values from your
    * theme. To use the sx prop, add the custom pragma as a comment to the
    * top of your module and import the jsx function.
    *
    * ```ts
    * // @jsx jsx
    *
    * import { jsx } from 'theme-ui'
    * ```
    */
  var sx: js.UndefOr[SxStyleProp] = js.undefined
}

object SxProps {
  @scala.inline
  def apply(sx: SxStyleProp = null): SxProps = {
    val __obj = js.Dynamic.literal()
    if (sx != null) __obj.updateDynamic("sx")(sx.asInstanceOf[js.Any])
    __obj.asInstanceOf[SxProps]
  }
}

