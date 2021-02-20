package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contains extends StObject {
  
  var contains: scala.Double = js.native
  
  var exact: scala.Double = js.native
  
  var startsWith: scala.Double = js.native
}
object Contains {
  
  @scala.inline
  def apply(contains: scala.Double, exact: scala.Double, startsWith: scala.Double): Contains = {
    val __obj = js.Dynamic.literal(contains = contains.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contains]
  }
  
  @scala.inline
  implicit class ContainsMutableBuilder[Self <: Contains] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: scala.Double): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExact(value: scala.Double): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartsWith(value: scala.Double): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
  }
}
