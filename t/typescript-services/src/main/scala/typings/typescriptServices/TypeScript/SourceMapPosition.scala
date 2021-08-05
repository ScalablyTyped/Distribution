package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMapPosition extends StObject {
  
  var emittedColumn: Double
  
  var emittedLine: Double
  
  var sourceColumn: Double
  
  var sourceLine: Double
}
object SourceMapPosition {
  
  inline def apply(emittedColumn: Double, emittedLine: Double, sourceColumn: Double, sourceLine: Double): SourceMapPosition = {
    val __obj = js.Dynamic.literal(emittedColumn = emittedColumn.asInstanceOf[js.Any], emittedLine = emittedLine.asInstanceOf[js.Any], sourceColumn = sourceColumn.asInstanceOf[js.Any], sourceLine = sourceLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMapPosition]
  }
  
  extension [Self <: SourceMapPosition](x: Self) {
    
    inline def setEmittedColumn(value: Double): Self = StObject.set(x, "emittedColumn", value.asInstanceOf[js.Any])
    
    inline def setEmittedLine(value: Double): Self = StObject.set(x, "emittedLine", value.asInstanceOf[js.Any])
    
    inline def setSourceColumn(value: Double): Self = StObject.set(x, "sourceColumn", value.asInstanceOf[js.Any])
    
    inline def setSourceLine(value: Double): Self = StObject.set(x, "sourceLine", value.asInstanceOf[js.Any])
  }
}
