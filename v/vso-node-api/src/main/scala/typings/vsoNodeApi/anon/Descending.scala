package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descending extends StObject {
  
  var ascending: scala.Double
  
  var descending: scala.Double
  
  var none: scala.Double
}
object Descending {
  
  @scala.inline
  def apply(ascending: scala.Double, descending: scala.Double, none: scala.Double): Descending = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], descending = descending.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descending]
  }
  
  @scala.inline
  implicit class DescendingMutableBuilder[Self <: Descending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: scala.Double): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescending(value: scala.Double): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
