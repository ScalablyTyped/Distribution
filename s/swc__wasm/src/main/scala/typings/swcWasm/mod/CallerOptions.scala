package typings.swcWasm.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallerOptions
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var name: String
}
object CallerOptions {
  
  inline def apply(name: String): CallerOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallerOptions]
  }
  
  extension [Self <: CallerOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
