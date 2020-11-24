package typings.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CONTAINS extends js.Object {
  
  var CONTAINS: Double = js.native
  
  var ENDS_WITH: Double = js.native
  
  var EXACT: Double = js.native
  
  var GREATER_THAN: Double = js.native
  
  var GREATER_THAN_OR_EQUAL: Double = js.native
  
  var INPUT: String = js.native
  
  var LESS_THAN: Double = js.native
  
  var LESS_THAN_OR_EQUAL: Double = js.native
  
  var NOT_EQUAL: Double = js.native
  
  var SELECT: String = js.native
  
  var STARTS_WITH: Double = js.native
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
  implicit class CONTAINSOps[Self <: CONTAINS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCONTAINS(value: Double): Self = this.set("CONTAINS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setENDS_WITH(value: Double): Self = this.set("ENDS_WITH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXACT(value: Double): Self = this.set("EXACT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGREATER_THAN(value: Double): Self = this.set("GREATER_THAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGREATER_THAN_OR_EQUAL(value: Double): Self = this.set("GREATER_THAN_OR_EQUAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINPUT(value: String): Self = this.set("INPUT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLESS_THAN(value: Double): Self = this.set("LESS_THAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLESS_THAN_OR_EQUAL(value: Double): Self = this.set("LESS_THAN_OR_EQUAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOT_EQUAL(value: Double): Self = this.set("NOT_EQUAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSELECT(value: String): Self = this.set("SELECT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTARTS_WITH(value: Double): Self = this.set("STARTS_WITH", value.asInstanceOf[js.Any])
  }
}
