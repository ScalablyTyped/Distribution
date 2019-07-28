package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapRange extends TextRange {
  var source: js.UndefOr[SourceMapSource] = js.undefined
}

object SourceMapRange {
  @scala.inline
  def apply(end: Double, pos: Double, source: SourceMapSource = null): SourceMapRange = {
    val __obj = js.Dynamic.literal(end = end, pos = pos)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SourceMapRange]
  }
}

