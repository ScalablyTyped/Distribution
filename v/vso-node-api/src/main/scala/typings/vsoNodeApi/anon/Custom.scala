package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Custom extends StObject {
  
  var custom: scala.Double = js.native
  
  var latestOnBuild: scala.Double = js.native
  
  var latestOnQueue: scala.Double = js.native
}
object Custom {
  
  @scala.inline
  def apply(custom: scala.Double, latestOnBuild: scala.Double, latestOnQueue: scala.Double): Custom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], latestOnBuild = latestOnBuild.asInstanceOf[js.Any], latestOnQueue = latestOnQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
  
  @scala.inline
  implicit class CustomMutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom(value: scala.Double): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestOnBuild(value: scala.Double): Self = StObject.set(x, "latestOnBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestOnQueue(value: scala.Double): Self = StObject.set(x, "latestOnQueue", value.asInstanceOf[js.Any])
  }
}
