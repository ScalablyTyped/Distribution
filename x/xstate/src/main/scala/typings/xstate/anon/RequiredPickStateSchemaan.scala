package typings.xstate.anon

import org.scalablytyped.runtime.StringDictionary
import typings.xstate.typesMod.StateSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<xstate.xstate/lib/types.StateSchema<any>, 'states'>> */
@js.native
trait RequiredPickStateSchemaan extends StObject {
  
  var states: StringDictionary[StateSchema[_]] = js.native
}
object RequiredPickStateSchemaan {
  
  @scala.inline
  def apply(states: StringDictionary[StateSchema[_]]): RequiredPickStateSchemaan = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickStateSchemaan]
  }
  
  @scala.inline
  implicit class RequiredPickStateSchemaanMutableBuilder[Self <: RequiredPickStateSchemaan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStates(value: StringDictionary[StateSchema[_]]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
  }
}
