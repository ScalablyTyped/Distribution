package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealDependencyLocation
  extends StObject
     with DependencyLocation {
  
  var end: js.UndefOr[SourcePosition] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var start: SourcePosition
}
object RealDependencyLocation {
  
  inline def apply(start: SourcePosition): RealDependencyLocation = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealDependencyLocation]
  }
  
  extension [Self <: RealDependencyLocation](x: Self) {
    
    inline def setEnd(value: SourcePosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setStart(value: SourcePosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
