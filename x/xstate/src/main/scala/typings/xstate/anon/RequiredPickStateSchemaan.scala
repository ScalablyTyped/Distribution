package typings.xstate.anon

import org.scalablytyped.runtime.StringDictionary
import typings.xstate.typesMod.StateSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<xstate.xstate/lib/types.StateSchema<any>, 'states'>> */
trait RequiredPickStateSchemaan extends StObject {
  
  var states: StringDictionary[StateSchema[js.Any]]
}
object RequiredPickStateSchemaan {
  
  inline def apply(states: StringDictionary[StateSchema[js.Any]]): RequiredPickStateSchemaan = {
    val __obj = js.Dynamic.literal(states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickStateSchemaan]
  }
  
  extension [Self <: RequiredPickStateSchemaan](x: Self) {
    
    inline def setStates(value: StringDictionary[StateSchema[js.Any]]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
  }
}
