package typings.atTypescriptDashEslintTypescriptDashEstree

import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Range
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loc extends js.Object {
  var loc: js.UndefOr[SourceLocation] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
}

object Anon_Loc {
  @scala.inline
  def apply(loc: SourceLocation = null, range: Range = null): Anon_Loc = {
    val __obj = js.Dynamic.literal()
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Anon_Loc]
  }
}

