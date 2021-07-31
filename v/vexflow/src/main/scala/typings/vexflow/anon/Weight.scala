package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Weight extends StObject {
  
  var family: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var weight: js.UndefOr[Double] = js.undefined
}
object Weight {
  
  @scala.inline
  def apply(): Weight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Weight]
  }
  
  @scala.inline
  implicit class WeightMutableBuilder[Self <: Weight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
