package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMapEntry extends StObject {
  
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
  implicit class SourceMapEntryMutableBuilder[Self <: SourceMapEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmittedColumn(value: Double): Self = StObject.set(x, "emittedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmittedFile(value: String): Self = StObject.set(x, "emittedFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmittedLine(value: Double): Self = StObject.set(x, "emittedLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceColumn(value: Double): Self = StObject.set(x, "sourceColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLine(value: Double): Self = StObject.set(x, "sourceLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
  }
}
