package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Sheet extends StyleSheetManagerProps {
  var sheet: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerStyleSheet */ js.Any
  var target: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_Sheet {
  @scala.inline
  def apply(
    sheet: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerStyleSheet */ js.Any,
    target: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_Sheet = {
    val __obj = js.Dynamic.literal(sheet = sheet)
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_Sheet]
  }
}

