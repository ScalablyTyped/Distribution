package typings.vegaLite.anon

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var value: String | SignalRef
}
object `3` {
  
  inline def apply(value: String | SignalRef): `3` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setValue(value: String | SignalRef): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
