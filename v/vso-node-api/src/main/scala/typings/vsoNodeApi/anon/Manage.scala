package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Manage extends StObject {
  
  var manage: scala.Double
  
  var none: scala.Double
  
  var use: scala.Double
}
object Manage {
  
  inline def apply(manage: scala.Double, none: scala.Double, use: scala.Double): Manage = {
    val __obj = js.Dynamic.literal(manage = manage.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Manage] (val x: Self) extends AnyVal {
    
    inline def setManage(value: scala.Double): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setUse(value: scala.Double): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
  }
}
