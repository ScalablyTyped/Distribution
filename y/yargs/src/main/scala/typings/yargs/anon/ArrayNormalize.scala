package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayNormalize extends StObject {
  
  var array: `true`
  
  var normalize: `true`
}
object ArrayNormalize {
  
  inline def apply(): ArrayNormalize = {
    val __obj = js.Dynamic.literal(array = true, normalize = true)
    __obj.asInstanceOf[ArrayNormalize]
  }
  
  extension [Self <: ArrayNormalize](x: Self) {
    
    inline def setArray(value: `true`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setNormalize(value: `true`): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
  }
}
