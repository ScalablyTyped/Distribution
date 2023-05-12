package typings.structuredSource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("structured-source", "StructuredSource")
  @js.native
  open class StructuredSource protected () extends StObject {
    /**
      * @constructs StructuredSource
      * @param {string} source - source code text.
      */
    def this(source: String) = this()
    
    /**
      * @param {number} index - index to the source code.
      * @return {SourcePosition} position.
      */
    def indexToPosition(index: Double): SourcePosition = js.native
    
    /* private */ val indice: Any = js.native
    
    def line: Double = js.native
    
    /**
      * @param {SourceLocation} loc - location indicator.
      * @return {[ number, number ]} range.
      */
    def locationToRange(loc: SourceLocation): SourceRange = js.native
    
    /**
      * @param {SourcePosition} pos - position indicator.
      * @return {number} index.
      */
    def positionToIndex(pos: SourcePosition): Double = js.native
    
    /**
      * @param {[ number, number ]} range - pair of indice.
      * @return {SourceLocation} location.
      */
    def rangeToLocation(range: SourceRange): SourceLocation = js.native
  }
  
  trait SourceLocation extends StObject {
    
    val end: SourcePosition
    
    val start: SourcePosition
  }
  object SourceLocation {
    
    inline def apply(end: SourcePosition, start: SourcePosition): SourceLocation = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceLocation] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: SourcePosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: SourcePosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourcePosition extends StObject {
    
    val column: Double
    
    val line: Double
  }
  object SourcePosition {
    
    inline def apply(column: Double, line: Double): SourcePosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourcePosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourcePosition] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  type SourceRange = js.Tuple2[Double, Double]
}
