package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayNumber extends StObject {
  
  var array: `true`
  
  var number: `true`
}
object ArrayNumber {
  
  inline def apply(): ArrayNumber = {
    val __obj = js.Dynamic.literal(array = true, number = true)
    __obj.asInstanceOf[ArrayNumber]
  }
  
  extension [Self <: ArrayNumber](x: Self) {
    
    inline def setArray(value: `true`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: `true`): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
