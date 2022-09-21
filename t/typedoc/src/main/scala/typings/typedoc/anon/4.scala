package typings.typedoc.anon

import typings.typedoc.typedocStrings.gaID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var name: gaID
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal(name = "gaID")
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setName(value: gaID): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
