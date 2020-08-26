package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapEntry extends js.Object {
  var emittedColumn: Double = js.native
  var emittedFile: String = js.native
  var emittedLine: Double = js.native
  var sourceColumn: Double = js.native
  var sourceFile: String = js.native
  var sourceLine: Double = js.native
  var sourceName: String = js.native
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
  @scala.inline
  implicit class SourceMapEntryOps[Self <: SourceMapEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmittedColumn(value: Double): Self = this.set("emittedColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmittedFile(value: String): Self = this.set("emittedFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmittedLine(value: Double): Self = this.set("emittedLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceColumn(value: Double): Self = this.set("sourceColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceFile(value: String): Self = this.set("sourceFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceLine(value: Double): Self = this.set("sourceLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceName(value: String): Self = this.set("sourceName", value.asInstanceOf[js.Any])
  }
  
}

