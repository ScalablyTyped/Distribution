package typings.typedoc.anon

import typings.typedoc.typedocStrings.gaID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var name: gaID
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(name = "gaID")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setName(value: gaID): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
