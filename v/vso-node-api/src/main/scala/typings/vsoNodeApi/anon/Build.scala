package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Build extends StObject {
  
  var build: scala.Double
  
  var xaml: scala.Double
}
object Build {
  
  inline def apply(build: scala.Double, xaml: scala.Double): Build = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], xaml = xaml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Build]
  }
  
  extension [Self <: Build](x: Self) {
    
    inline def setBuild(value: scala.Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setXaml(value: scala.Double): Self = StObject.set(x, "xaml", value.asInstanceOf[js.Any])
  }
}
