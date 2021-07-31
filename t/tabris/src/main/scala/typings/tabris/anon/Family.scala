package typings.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Family extends StObject {
  
  var family: js.UndefOr[js.Array[String]] = js.undefined
  
  var size: Double
  
  var style: js.UndefOr[String] = js.undefined
  
  var weight: js.UndefOr[String] = js.undefined
}
object Family {
  
  @scala.inline
  def apply(size: Double): Family = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Family]
  }
  
  @scala.inline
  implicit class FamilyMutableBuilder[Self <: Family] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: js.Array[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setFamilyVarargs(value: String*): Self = StObject.set(x, "family", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
