package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SheetTarget extends StyleSheetManagerProps {
  var sheet: js.UndefOr[scala.Nothing] = js.undefined
  var target: stdLib.HTMLElement
}

object Anon_SheetTarget {
  @scala.inline
  def apply(target: stdLib.HTMLElement, sheet: js.UndefOr[scala.Nothing] = js.undefined): Anon_SheetTarget = {
    val __obj = js.Dynamic.literal(target = target)
    if (!js.isUndefined(sheet)) __obj.updateDynamic("sheet")(sheet)
    __obj.asInstanceOf[Anon_SheetTarget]
  }
}

