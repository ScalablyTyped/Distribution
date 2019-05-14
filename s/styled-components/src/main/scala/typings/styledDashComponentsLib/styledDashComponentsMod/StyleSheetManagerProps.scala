package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheetManagerProps extends js.Object {
  var sheet: js.UndefOr[scala.Nothing | ServerStyleSheet] = js.undefined
  var target: js.UndefOr[stdLib.HTMLElement | scala.Nothing] = js.undefined
}

object StyleSheetManagerProps {
  @scala.inline
  def apply(sheet: ServerStyleSheet = null, target: js.UndefOr[scala.Nothing] = js.undefined): StyleSheetManagerProps = {
    val __obj = js.Dynamic.literal()
    if (sheet != null) __obj.updateDynamic("sheet")(sheet)
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[StyleSheetManagerProps]
  }
}

