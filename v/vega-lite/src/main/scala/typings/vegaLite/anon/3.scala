package typings.vegaLite.anon

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var description: SignalRef | ValueString
}
object `3` {
  
  inline def apply(description: SignalRef | ValueString): `3` = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setDescription(value: SignalRef | ValueString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
  }
}
