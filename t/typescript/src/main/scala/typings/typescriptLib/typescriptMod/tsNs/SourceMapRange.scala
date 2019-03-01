package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapRange extends TextRange {
  var source: js.UndefOr[SourceMapSource] = js.undefined
}

object SourceMapRange {
  @scala.inline
  def apply(end: scala.Double, pos: scala.Double, source: SourceMapSource = null): SourceMapRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("pos")(pos)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SourceMapRange]
  }
}

