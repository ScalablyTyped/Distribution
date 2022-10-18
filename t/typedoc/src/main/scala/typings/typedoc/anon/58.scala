package typings.typedoc.anon

import typings.typedoc.typedocStrings.preserveWatchOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58` extends StObject {
  
  var name: preserveWatchOutput
}
object `58` {
  
  inline def apply(): `58` = {
    val __obj = js.Dynamic.literal(name = "preserveWatchOutput")
    __obj.asInstanceOf[`58`]
  }
  
  extension [Self <: `58`](x: Self) {
    
    inline def setName(value: preserveWatchOutput): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
