package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Release extends StObject {
  
  var build: scala.Double
  
  var release: scala.Double
}
object Release {
  
  inline def apply(build: scala.Double, release: scala.Double): Release = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[Release]
  }
  
  extension [Self <: Release](x: Self) {
    
    inline def setBuild(value: scala.Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: scala.Double): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
