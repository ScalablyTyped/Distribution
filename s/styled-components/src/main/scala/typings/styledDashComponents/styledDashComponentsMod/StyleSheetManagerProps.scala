package typings.styledDashComponents.styledDashComponentsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheetManagerProps extends js.Object {
  var sheet: js.UndefOr[ServerStyleSheet] = js.undefined
  var target: js.UndefOr[HTMLElement] = js.undefined
}

object StyleSheetManagerProps {
  @scala.inline
  def apply(sheet: ServerStyleSheet = null, target: HTMLElement = null): StyleSheetManagerProps = {
    val __obj = js.Dynamic.literal()
    if (sheet != null) __obj.updateDynamic("sheet")(sheet)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[StyleSheetManagerProps]
  }
}

