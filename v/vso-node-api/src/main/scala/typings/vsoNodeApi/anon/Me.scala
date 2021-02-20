package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Me extends StObject {
  
  var all: scala.Double = js.native
  
  var me: scala.Double = js.native
  
  var none: scala.Double = js.native
}
object Me {
  
  @scala.inline
  def apply(all: scala.Double, me: scala.Double, none: scala.Double): Me = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], me = me.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Me]
  }
  
  @scala.inline
  implicit class MeMutableBuilder[Self <: Me] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMe(value: scala.Double): Self = StObject.set(x, "me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
