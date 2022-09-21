package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import typings.yargs.yargsStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayType extends StObject {
  
  var array: `true`
  
  var `type`: number
}
object ArrayType {
  
  inline def apply(): ArrayType = {
    val __obj = js.Dynamic.literal(array = true)
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[ArrayType]
  }
  
  extension [Self <: ArrayType](x: Self) {
    
    inline def setArray(value: `true`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
