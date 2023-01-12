package typings.webpack.anon

import typings.webpack.mod.ConnectionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofModuleGraphConnecti extends StObject {
  
  /* static member */
  def addConnectionStates(a: ConnectionState, b: ConnectionState): ConnectionState
  /* static member */
  @JSName("addConnectionStates")
  var addConnectionStates_Original: js.Function2[/* a */ ConnectionState, /* b */ ConnectionState, ConnectionState]
}
object TypeofModuleGraphConnecti {
  
  inline def apply(addConnectionStates: (/* a */ ConnectionState, /* b */ ConnectionState) => ConnectionState): TypeofModuleGraphConnecti = {
    val __obj = js.Dynamic.literal(addConnectionStates = js.Any.fromFunction2(addConnectionStates))
    __obj.asInstanceOf[TypeofModuleGraphConnecti]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofModuleGraphConnecti] (val x: Self) extends AnyVal {
    
    inline def setAddConnectionStates(value: (/* a */ ConnectionState, /* b */ ConnectionState) => ConnectionState): Self = StObject.set(x, "addConnectionStates", js.Any.fromFunction2(value))
  }
}
