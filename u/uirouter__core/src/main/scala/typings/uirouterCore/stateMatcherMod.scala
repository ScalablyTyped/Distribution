package typings.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.stateInterfaceMod.StateOrName
import typings.uirouterCore.stateObjectMod.StateObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMatcherMod {
  
  @JSImport("@uirouter/core/lib/state/stateMatcher", "StateMatcher")
  @js.native
  class StateMatcher protected () extends StObject {
    def this(_states: StringDictionary[StateObject]) = this()
    
    var _states: js.Any = js.native
    
    def find(stateOrName: StateOrName): StateObject = js.native
    def find(stateOrName: StateOrName, base: js.UndefOr[StateOrName], matchGlob: Boolean): StateObject = js.native
    def find(stateOrName: StateOrName, base: StateOrName): StateObject = js.native
    
    def isRelative(stateName: String): Boolean = js.native
    
    def resolvePath(name: String, base: StateOrName): String = js.native
  }
}
