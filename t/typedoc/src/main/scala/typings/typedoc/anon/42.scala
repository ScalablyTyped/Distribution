package typings.typedoc.anon

import typings.typedoc.typedocStrings.disableSources
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42` extends StObject {
  
  var name: disableSources
}
object `42` {
  
  inline def apply(): `42` = {
    val __obj = js.Dynamic.literal(name = "disableSources")
    __obj.asInstanceOf[`42`]
  }
  
  extension [Self <: `42`](x: Self) {
    
    inline def setName(value: disableSources): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
