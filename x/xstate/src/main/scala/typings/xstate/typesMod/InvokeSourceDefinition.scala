package typings.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvokeSourceDefinition
  extends StObject
     with /* option */ StringDictionary[js.Any] {
  
  var `type`: String
}
object InvokeSourceDefinition {
  
  @scala.inline
  def apply(`type`: String): InvokeSourceDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvokeSourceDefinition]
  }
  
  @scala.inline
  implicit class InvokeSourceDefinitionMutableBuilder[Self <: InvokeSourceDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
