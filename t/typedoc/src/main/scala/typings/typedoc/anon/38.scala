package typings.typedoc.anon

import typings.typedoc.typedocStrings.cleanOutputDir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38` extends StObject {
  
  var name: cleanOutputDir
}
object `38` {
  
  inline def apply(): `38` = {
    val __obj = js.Dynamic.literal(name = "cleanOutputDir")
    __obj.asInstanceOf[`38`]
  }
  
  extension [Self <: `38`](x: Self) {
    
    inline def setName(value: cleanOutputDir): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
