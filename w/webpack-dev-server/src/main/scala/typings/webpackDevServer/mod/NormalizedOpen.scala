package typings.webpackDevServer.mod

import typings.open.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizedOpen extends StObject {
  
  var options: Options
  
  var target: String
}
object NormalizedOpen {
  
  inline def apply(options: Options, target: String): NormalizedOpen = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedOpen]
  }
  
  extension [Self <: NormalizedOpen](x: Self) {
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
