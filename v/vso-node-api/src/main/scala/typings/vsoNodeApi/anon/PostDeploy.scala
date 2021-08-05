package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostDeploy extends StObject {
  
  var all: scala.Double
  
  var postDeploy: scala.Double
  
  var preDeploy: scala.Double
  
  var undefined: scala.Double
}
object PostDeploy {
  
  inline def apply(all: scala.Double, postDeploy: scala.Double, preDeploy: scala.Double, undefined: scala.Double): PostDeploy = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], postDeploy = postDeploy.asInstanceOf[js.Any], preDeploy = preDeploy.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostDeploy]
  }
  
  extension [Self <: PostDeploy](x: Self) {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setPostDeploy(value: scala.Double): Self = StObject.set(x, "postDeploy", value.asInstanceOf[js.Any])
    
    inline def setPreDeploy(value: scala.Double): Self = StObject.set(x, "preDeploy", value.asInstanceOf[js.Any])
    
    inline def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
  }
}
