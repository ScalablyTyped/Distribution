package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontLikeObject
  extends StObject
     with _FontValue {
  
  var family: js.UndefOr[js.Array[String]] = js.undefined
  
  var size: Double
  
  var style: js.UndefOr[FontStyle] = js.undefined
  
  var weight: js.UndefOr[FontWeight] = js.undefined
}
object FontLikeObject {
  
  @scala.inline
  def apply(size: Double): FontLikeObject = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontLikeObject]
  }
  
  @scala.inline
  implicit class FontLikeObjectMutableBuilder[Self <: FontLikeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFamily(value: js.Array[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setFamilyVarargs(value: String*): Self = StObject.set(x, "family", js.Array(value :_*))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: FontStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWeight(value: FontWeight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
