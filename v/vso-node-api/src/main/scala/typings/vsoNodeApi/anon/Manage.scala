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
  
  @scala.inline
  def apply(manage: scala.Double, none: scala.Double, use: scala.Double): Manage = {
    val __obj = js.Dynamic.literal(manage = manage.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manage]
  }
  
  @scala.inline
  implicit class ManageMutableBuilder[Self <: Manage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManage(value: scala.Double): Self = StObject.set(x, "manage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse(value: scala.Double): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
  }
}
