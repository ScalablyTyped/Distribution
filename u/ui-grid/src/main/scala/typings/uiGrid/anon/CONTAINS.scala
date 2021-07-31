package typings.uiGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CONTAINS extends StObject {
  
  var CONTAINS: Double
  
  var ENDS_WITH: Double
  
  var EXACT: Double
  
  var GREATER_THAN: Double
  
  var GREATER_THAN_OR_EQUAL: Double
  
  var INPUT: String
  
  var LESS_THAN: Double
  
  var LESS_THAN_OR_EQUAL: Double
  
  var NOT_EQUAL: Double
  
  var SELECT: String
  
  var STARTS_WITH: Double
}
object CONTAINS {
  
  @scala.inline
  def apply(
    CONTAINS: Double,
    ENDS_WITH: Double,
    EXACT: Double,
    GREATER_THAN: Double,
    GREATER_THAN_OR_EQUAL: Double,
    INPUT: String,
    LESS_THAN: Double,
    LESS_THAN_OR_EQUAL: Double,
    NOT_EQUAL: Double,
    SELECT: String,
    STARTS_WITH: Double
  ): CONTAINS = {
    val __obj = js.Dynamic.literal(CONTAINS = CONTAINS.asInstanceOf[js.Any], ENDS_WITH = ENDS_WITH.asInstanceOf[js.Any], EXACT = EXACT.asInstanceOf[js.Any], GREATER_THAN = GREATER_THAN.asInstanceOf[js.Any], GREATER_THAN_OR_EQUAL = GREATER_THAN_OR_EQUAL.asInstanceOf[js.Any], INPUT = INPUT.asInstanceOf[js.Any], LESS_THAN = LESS_THAN.asInstanceOf[js.Any], LESS_THAN_OR_EQUAL = LESS_THAN_OR_EQUAL.asInstanceOf[js.Any], NOT_EQUAL = NOT_EQUAL.asInstanceOf[js.Any], SELECT = SELECT.asInstanceOf[js.Any], STARTS_WITH = STARTS_WITH.asInstanceOf[js.Any])
    __obj.asInstanceOf[CONTAINS]
  }
  
  @scala.inline
  implicit class CONTAINSMutableBuilder[Self <: CONTAINS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCONTAINS(value: Double): Self = StObject.set(x, "CONTAINS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setENDS_WITH(value: Double): Self = StObject.set(x, "ENDS_WITH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXACT(value: Double): Self = StObject.set(x, "EXACT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGREATER_THAN(value: Double): Self = StObject.set(x, "GREATER_THAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGREATER_THAN_OR_EQUAL(value: Double): Self = StObject.set(x, "GREATER_THAN_OR_EQUAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINPUT(value: String): Self = StObject.set(x, "INPUT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLESS_THAN(value: Double): Self = StObject.set(x, "LESS_THAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLESS_THAN_OR_EQUAL(value: Double): Self = StObject.set(x, "LESS_THAN_OR_EQUAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_EQUAL(value: Double): Self = StObject.set(x, "NOT_EQUAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSELECT(value: String): Self = StObject.set(x, "SELECT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTARTS_WITH(value: Double): Self = StObject.set(x, "STARTS_WITH", value.asInstanceOf[js.Any])
  }
}
