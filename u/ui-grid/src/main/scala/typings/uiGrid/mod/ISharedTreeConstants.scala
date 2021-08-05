package typings.uiGrid.mod

import typings.uiGrid.anon.AVG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISharedTreeConstants extends StObject {
  
  var COLLAPSED: String
  
  var EXPANDED: String
  
  var aggregation: AVG_
  
  var rowHeaderColName: String
}
object ISharedTreeConstants {
  
  inline def apply(COLLAPSED: String, EXPANDED: String, aggregation: AVG_, rowHeaderColName: String): ISharedTreeConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any], aggregation = aggregation.asInstanceOf[js.Any], rowHeaderColName = rowHeaderColName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISharedTreeConstants]
  }
  
  extension [Self <: ISharedTreeConstants](x: Self) {
    
    inline def setAggregation(value: AVG_): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setCOLLAPSED(value: String): Self = StObject.set(x, "COLLAPSED", value.asInstanceOf[js.Any])
    
    inline def setEXPANDED(value: String): Self = StObject.set(x, "EXPANDED", value.asInstanceOf[js.Any])
    
    inline def setRowHeaderColName(value: String): Self = StObject.set(x, "rowHeaderColName", value.asInstanceOf[js.Any])
  }
}
