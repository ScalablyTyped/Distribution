package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import typings.yargs.yargsStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait String extends StObject {
  
  var string: `true`
  
  var `type`: array
}
object String {
  
  inline def apply(): String = {
    val __obj = js.Dynamic.literal(string = true)
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[String]
  }
  
  extension [Self <: String](x: Self) {
    
    inline def setString(value: `true`): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
