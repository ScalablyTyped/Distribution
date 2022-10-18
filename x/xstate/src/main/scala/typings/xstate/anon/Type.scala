package typings.xstate.anon

import typings.xstate.libTypesMod.ActionTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: ActionTypes
}
object Type {
  
  inline def apply(`type`: ActionTypes): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: ActionTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
