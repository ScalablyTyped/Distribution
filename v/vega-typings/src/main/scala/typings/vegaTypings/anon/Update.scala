package typings.vegaTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Update extends StObject {
  
  var update: typings.vegaTypings.onEventsMod.Update
}
object Update {
  
  inline def apply(update: typings.vegaTypings.onEventsMod.Update): Update = {
    val __obj = js.Dynamic.literal(update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update]
  }
  
  extension [Self <: Update](x: Self) {
    
    inline def setUpdate(value: typings.vegaTypings.onEventsMod.Update): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
