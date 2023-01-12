package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMapEntry extends StObject {
  
  var emittedColumn: Double
  
  var emittedFile: String
  
  var emittedLine: Double
  
  var sourceColumn: Double
  
  var sourceFile: String
  
  var sourceLine: Double
  
  var sourceName: String
}
object SourceMapEntry {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: SourceMapEntry] (val x: Self) extends AnyVal {
    
    inline def setEmittedColumn(value: Double): Self = StObject.set(x, "emittedColumn", value.asInstanceOf[js.Any])
    
    inline def setEmittedFile(value: String): Self = StObject.set(x, "emittedFile", value.asInstanceOf[js.Any])
    
    inline def setEmittedLine(value: Double): Self = StObject.set(x, "emittedLine", value.asInstanceOf[js.Any])
    
    inline def setSourceColumn(value: Double): Self = StObject.set(x, "sourceColumn", value.asInstanceOf[js.Any])
    
    inline def setSourceFile(value: String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    inline def setSourceLine(value: Double): Self = StObject.set(x, "sourceLine", value.asInstanceOf[js.Any])
    
    inline def setSourceName(value: String): Self = StObject.set(x, "sourceName", value.asInstanceOf[js.Any])
  }
}
