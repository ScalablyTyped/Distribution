package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ha extends StObject {
  
  var ha: Double = js.native
  
  var o: js.Array[String] = js.native
  
  var x_max: Double = js.native
  
  var x_min: Double = js.native
}
object Ha {
  
  @scala.inline
  def apply(ha: Double, o: js.Array[String], x_max: Double, x_min: Double): Ha = {
    val __obj = js.Dynamic.literal(ha = ha.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], x_max = x_max.asInstanceOf[js.Any], x_min = x_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ha]
  }
  
  @scala.inline
  implicit class HaMutableBuilder[Self <: Ha] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHa(value: Double): Self = StObject.set(x, "ha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: js.Array[String]): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOVarargs(value: String*): Self = StObject.set(x, "o", js.Array(value :_*))
    
    @scala.inline
    def setX_max(value: Double): Self = StObject.set(x, "x_max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_min(value: Double): Self = StObject.set(x, "x_min", value.asInstanceOf[js.Any])
  }
}
