package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type StateValueMap = {[key: string] : xstate.xstate/lib/types.StateValue}
}}}
to avoid circular code involving: 
- xstate.xstate/lib/match.StatePatternTuple
- xstate.xstate/lib/types.StateValue
- xstate.xstate/lib/types.StateValueMap
*/
trait StateValueMap
  extends StObject
     with /* key */ StringDictionary[StateValue]
object StateValueMap {
  
  inline def apply(): StateValueMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateValueMap]
  }
}
