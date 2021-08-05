package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Custom extends StObject {
  
  var custom: scala.Double
  
  var latestOnBuild: scala.Double
  
  var latestOnQueue: scala.Double
}
object Custom {
  
  inline def apply(custom: scala.Double, latestOnBuild: scala.Double, latestOnQueue: scala.Double): Custom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], latestOnBuild = latestOnBuild.asInstanceOf[js.Any], latestOnQueue = latestOnQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
  
  extension [Self <: Custom](x: Self) {
    
    inline def setCustom(value: scala.Double): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setLatestOnBuild(value: scala.Double): Self = StObject.set(x, "latestOnBuild", value.asInstanceOf[js.Any])
    
    inline def setLatestOnQueue(value: scala.Double): Self = StObject.set(x, "latestOnQueue", value.asInstanceOf[js.Any])
  }
}
