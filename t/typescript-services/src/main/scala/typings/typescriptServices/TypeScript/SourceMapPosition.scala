package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapPosition extends js.Object {
  var emittedColumn: Double
  var emittedLine: Double
  var sourceColumn: Double
  var sourceLine: Double
}

object SourceMapPosition {
  @scala.inline
  def apply(emittedColumn: Double, emittedLine: Double, sourceColumn: Double, sourceLine: Double): SourceMapPosition = {
    val __obj = js.Dynamic.literal(emittedColumn = emittedColumn.asInstanceOf[js.Any], emittedLine = emittedLine.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any], sourceLine = sourceLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapPosition]
  }
}

