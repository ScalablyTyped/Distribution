package typings.typedoc.anon

import typings.typedoc.typedocStrings.cleanOutputDir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  var name: cleanOutputDir
}
object `36` {
  
  inline def apply(): `36` = {
    val __obj = js.Dynamic.literal(name = "cleanOutputDir")
    __obj.asInstanceOf[`36`]
  }
  
  extension [Self <: `36`](x: Self) {
    
    inline def setName(value: cleanOutputDir): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
