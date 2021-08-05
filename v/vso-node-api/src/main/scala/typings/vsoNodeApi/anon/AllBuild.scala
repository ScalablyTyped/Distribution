package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllBuild extends StObject {
  
  var all: scala.Double
  
  var build: scala.Double
  
  var release: scala.Double
}
object AllBuild {
  
  inline def apply(all: scala.Double, build: scala.Double, release: scala.Double): AllBuild = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllBuild]
  }
  
  extension [Self <: AllBuild](x: Self) {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: scala.Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: scala.Double): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
  }
}
