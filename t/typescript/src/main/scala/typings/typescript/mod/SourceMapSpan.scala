package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMapSpan extends StObject {
  
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
    sourceLine: Double
  ): SourceMapSpan = {
    val __obj = js.Dynamic.literal(emittedColumn = emittedColumn.asInstanceOf[js.Any], emittedLine = emittedLine.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], sourceLine = sourceLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapSpan]
  }
  
  @scala.inline
  implicit class SourceMapSpanMutableBuilder[Self <: SourceMapSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmittedColumn(value: Double): Self = StObject.set(x, "emittedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmittedLine(value: Double): Self = StObject.set(x, "emittedLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameIndex(value: Double): Self = StObject.set(x, "nameIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameIndexUndefined: Self = StObject.set(x, "nameIndex", js.undefined)
    
    @scala.inline
    def setSourceColumn(value: Double): Self = StObject.set(x, "sourceColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLine(value: Double): Self = StObject.set(x, "sourceLine", value.asInstanceOf[js.Any])
  }
}
