package typings.uirouterCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends StObject {
  
  var params: StringDictionary[js.Any] = js.native
  
  var state: String | StateDeclaration = js.native
}
object State {
  
  @scala.inline
  def apply(params: StringDictionary[js.Any], state: String | StateDeclaration): State = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String | StateDeclaration): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
