package typings.traceEventLib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sortindex extends StObject {
  
  /**
    * Lower numbers are displayed higher in Trace Viewer.
    * If multiple items all have the same sort index then they are displayed sorted by name and, given duplicate names, by id.
    */
  var sort_index: Double
}
object Sortindex {
  
  inline def apply(sort_index: Double): Sortindex = {
    val __obj = js.Dynamic.literal(sort_index = sort_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sortindex]
  }
  
  extension [Self <: Sortindex](x: Self) {
    
    inline def setSort_index(value: Double): Self = StObject.set(x, "sort_index", value.asInstanceOf[js.Any])
  }
}
