package typings.xstate.anon

import typings.xstate.libTypesMod.ActionTypes.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeUpdate extends StObject {
  
  var `type`: Update
}
object TypeUpdate {
  
  inline def apply(`type`: Update): TypeUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeUpdate]
  }
  
  extension [Self <: TypeUpdate](x: Self) {
    
    inline def setType(value: Update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
