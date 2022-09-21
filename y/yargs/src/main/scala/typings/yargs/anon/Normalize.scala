package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import typings.yargs.yargsStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Normalize extends StObject {
  
  var normalize: `true`
  
  var `type`: array
}
object Normalize {
  
  inline def apply(): Normalize = {
    val __obj = js.Dynamic.literal(normalize = true)
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[Normalize]
  }
  
  extension [Self <: Normalize](x: Self) {
    
    inline def setNormalize(value: `true`): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
    
    inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
