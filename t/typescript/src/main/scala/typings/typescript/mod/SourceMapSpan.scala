package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapSpan extends js.Object {
  /** Column number in the .js file. */
  var emittedColumn: Double
  /** Line number in the .js file. */
  var emittedLine: Double
  /** Optional name (index into names array) associated with this span. */
  var nameIndex: js.UndefOr[Double] = js.undefined
  /** Column number in the .ts file. */
  var sourceColumn: Double
  /** .ts file (index into sources array) associated with this span */
  var sourceIndex: Double
  /** Line number in the .ts file. */
  var sourceLine: Double
}

object SourceMapSpan {
  @scala.inline
  def apply(
    emittedColumn: Double,
    emittedLine: Double,
    sourceColumn: Double,
    sourceIndex: Double,
    sourceLine: Double,
    nameIndex: Int | Double = null
  ): SourceMapSpan = {
    val __obj = js.Dynamic.literal(emittedColumn = emittedColumn.asInstanceOf[js.Any], emittedLine = emittedLine.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], sourceLine = sourceLine.asInstanceOf[js.Any])
    if (nameIndex != null) __obj.updateDynamic("nameIndex")(nameIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapSpan]
  }
}

