package typings.structuredSource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("structured-source", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with StructuredSource {
    /**
      * @param source - source code text.
      */
    def this(source: String) = this()
    
    /* CompleteClass */
    override def indexToPosition(index: Double): SourcePosition = js.native
    
    /* CompleteClass */
    override def locationToRange(loc: SourceLocation): js.Tuple2[Double, Double] = js.native
    
    /* CompleteClass */
    override def positionToIndex(pos: SourcePosition): Double = js.native
    
    /* CompleteClass */
    override def rangeToLocation(range: js.Tuple2[Double, Double]): SourceLocation = js.native
  }
  
  trait SourceLocation extends StObject {
    
    var end: SourcePosition
    
    var start: SourcePosition
  }
  object SourceLocation {
    
    inline def apply(end: SourcePosition, start: SourcePosition): SourceLocation = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceLocation]
    }
    
    extension [Self <: SourceLocation](x: Self) {
      
      inline def setEnd(value: SourcePosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: SourcePosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait SourcePosition extends StObject {
    
    // Column number starts with 0.
    var column: Double
    
    // Line number starts with 1.
    var line: Double
  }
  object SourcePosition {
    
    inline def apply(column: Double, line: Double): SourcePosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourcePosition]
    }
    
    extension [Self <: SourcePosition](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait StructuredSource extends StObject {
    
    def indexToPosition(index: Double): SourcePosition
    
    def locationToRange(loc: SourceLocation): js.Tuple2[Double, Double]
    
    def positionToIndex(pos: SourcePosition): Double
    
    def rangeToLocation(range: js.Tuple2[Double, Double]): SourceLocation
  }
  object StructuredSource {
    
    inline def apply(
      indexToPosition: Double => SourcePosition,
      locationToRange: SourceLocation => js.Tuple2[Double, Double],
      positionToIndex: SourcePosition => Double,
      rangeToLocation: js.Tuple2[Double, Double] => SourceLocation
    ): StructuredSource = {
      val __obj = js.Dynamic.literal(indexToPosition = js.Any.fromFunction1(indexToPosition), locationToRange = js.Any.fromFunction1(locationToRange), positionToIndex = js.Any.fromFunction1(positionToIndex), rangeToLocation = js.Any.fromFunction1(rangeToLocation))
      __obj.asInstanceOf[StructuredSource]
    }
    
    extension [Self <: StructuredSource](x: Self) {
      
      inline def setIndexToPosition(value: Double => SourcePosition): Self = StObject.set(x, "indexToPosition", js.Any.fromFunction1(value))
      
      inline def setLocationToRange(value: SourceLocation => js.Tuple2[Double, Double]): Self = StObject.set(x, "locationToRange", js.Any.fromFunction1(value))
      
      inline def setPositionToIndex(value: SourcePosition => Double): Self = StObject.set(x, "positionToIndex", js.Any.fromFunction1(value))
      
      inline def setRangeToLocation(value: js.Tuple2[Double, Double] => SourceLocation): Self = StObject.set(x, "rangeToLocation", js.Any.fromFunction1(value))
    }
  }
}
