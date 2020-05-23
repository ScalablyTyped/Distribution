package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMapEntry extends js.Object {
  var emittedColumn: Double
  var emittedFile: String
  var emittedLine: Double
  var sourceColumn: Double
  var sourceFile: String
  var sourceLine: Double
  var sourceName: String
}

object SourceMapEntry {
  @scala.inline
  def apply(
    emittedColumn: Double,
    emittedFile: String,
    emittedLine: Double,
    sourceColumn: Double,
    sourceFile: String,
    sourceLine: Double,
    sourceName: String
  ): SourceMapEntry = {
    val __obj = js.Dynamic.literal(emittedColumn = emittedColumn.asInstanceOf[js.Any], emittedFile = emittedFile.asInstanceOf[js.Any], emittedLine = emittedLine.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceLine = sourceLine.asInstanceOf[js.Any], sourceName = sourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapEntry]
  }
}

