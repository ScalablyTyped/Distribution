package typings.uiGrid.mod

import typings.uiGrid.anon.AVG_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISharedTreeConstants extends StObject {
  
  var COLLAPSED: String = js.native
  
  var EXPANDED: String = js.native
  
  var aggregation: AVG_ = js.native
  
  var rowHeaderColName: String = js.native
}
object ISharedTreeConstants {
  
  @scala.inline
  def apply(COLLAPSED: String, EXPANDED: String, aggregation: AVG_, rowHeaderColName: String): ISharedTreeConstants = {
    val __obj = js.Dynamic.literal(COLLAPSED = COLLAPSED.asInstanceOf[js.Any], EXPANDED = EXPANDED.asInstanceOf[js.Any], aggregation = aggregation.asInstanceOf[js.Any], rowHeaderColName = rowHeaderColName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISharedTreeConstants]
  }
  
  @scala.inline
  implicit class ISharedTreeConstantsMutableBuilder[Self <: ISharedTreeConstants] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregation(value: AVG_): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCOLLAPSED(value: String): Self = StObject.set(x, "COLLAPSED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXPANDED(value: String): Self = StObject.set(x, "EXPANDED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeaderColName(value: String): Self = StObject.set(x, "rowHeaderColName", value.asInstanceOf[js.Any])
  }
}
