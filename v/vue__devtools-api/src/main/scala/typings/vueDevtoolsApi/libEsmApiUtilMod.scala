package typings.vueDevtoolsApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmApiUtilMod {
  
  type ID = Double | String
  
  trait WithId extends StObject {
    
    var id: ID
  }
  object WithId {
    
    inline def apply(id: ID): WithId = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithId] (val x: Self) extends AnyVal {
      
      inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
