package typings.stylableWebpackPlugin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exports extends StObject {
  
  var exports: js.Any
}
object Exports {
  
  inline def apply(exports: js.Any): Exports = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exports]
  }
  
  extension [Self <: Exports](x: Self) {
    
    inline def setExports(value: js.Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
  }
}
