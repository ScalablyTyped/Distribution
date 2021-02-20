package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allow extends StObject {
  
  var allow: scala.Double = js.native
  
  var completed: scala.Double = js.native
  
  var disallow: scala.Double = js.native
}
object Allow {
  
  @scala.inline
  def apply(allow: scala.Double, completed: scala.Double, disallow: scala.Double): Allow = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], disallow = disallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allow]
  }
  
  @scala.inline
  implicit class AllowMutableBuilder[Self <: Allow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow(value: scala.Double): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted(value: scala.Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisallow(value: scala.Double): Self = StObject.set(x, "disallow", value.asInstanceOf[js.Any])
  }
}
