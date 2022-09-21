package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayString extends StObject {
  
  var array: `true`
  
  var string: `true`
}
object ArrayString {
  
  inline def apply(): ArrayString = {
    val __obj = js.Dynamic.literal(array = true, string = true)
    __obj.asInstanceOf[ArrayString]
  }
  
  extension [Self <: ArrayString](x: Self) {
    
    inline def setArray(value: `true`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setString(value: `true`): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
