package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ascending extends StObject {
  
  var default: scala.Double
  
  var ascending: scala.Double
  
  var descending: scala.Double
}
object Ascending {
  
  @scala.inline
  def apply(ascending: scala.Double, default: scala.Double, descending: scala.Double): Ascending = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], descending = descending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ascending]
  }
  
  @scala.inline
  implicit class AscendingMutableBuilder[Self <: Ascending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: scala.Double): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault(value: scala.Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescending(value: scala.Double): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
  }
}
