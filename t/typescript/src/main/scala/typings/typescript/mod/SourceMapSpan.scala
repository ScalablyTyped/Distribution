package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapSpan extends js.Object {
  
  /** Column number in the .js file. */
  var emittedColumn: Double = js.native
  
  /** Line number in the .js file. */
  var emittedLine: Double = js.native
  
  /** Optional name (index into names array) associated with this span. */
  var nameIndex: js.UndefOr[Double] = js.native
  
  /** Column number in the .ts file. */
  var sourceColumn: Double = js.native
  
  /** .ts file (index into sources array) associated with this span */
  var sourceIndex: Double = js.native
  
  /** Line number in the .ts file. */
  var sourceLine: Double = js.native
}
object SourceMapSpan {
  
  @scala.inline
  def apply(
    emittedColumn: Double,
    emittedLine: Double,
    sourceColumn: Double,
    sourceIndex: Double,
    sourceLine: Double
  ): SourceMapSpan = {
    val __obj = js.Dynamic.literal(emittedColumn = emittedColumn.asInstanceOf[js.Any], emittedLine = emittedLine.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], sourceLine = sourceLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapSpan]
  }
  
  @scala.inline
  implicit class SourceMapSpanOps[Self <: SourceMapSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmittedColumn(value: Double): Self = this.set("emittedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmittedLine(value: Double): Self = this.set("emittedLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceColumn(value: Double): Self = this.set("sourceColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIndex(value: Double): Self = this.set("sourceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLine(value: Double): Self = this.set("sourceLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameIndex(value: Double): Self = this.set("nameIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameIndex: Self = this.set("nameIndex", js.undefined)
  }
}
