package typings.uirouterCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.libStateInterfaceMod.StateDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var params: StringDictionary[Any]
  
  var state: String | StateDeclaration
}
object State {
  
  inline def apply(params: StringDictionary[Any], state: String | StateDeclaration): State = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setState(value: String | StateDeclaration): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
