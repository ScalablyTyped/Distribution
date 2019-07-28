package typings.atUirouterCore.libStateStateMatcherMod

import org.scalablytyped.runtime.StringDictionary
import typings.atUirouterCore.libStateInterfaceMod.StateOrName
import typings.atUirouterCore.libStateStateObjectMod.StateObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state/stateMatcher", "StateMatcher")
@js.native
class StateMatcher protected () extends js.Object {
  def this(_states: StringDictionary[StateObject]) = this()
  var _states: js.Any = js.native
  def find(stateOrName: StateOrName): StateObject = js.native
  def find(stateOrName: StateOrName, base: StateOrName): StateObject = js.native
  def find(stateOrName: StateOrName, base: StateOrName, matchGlob: Boolean): StateObject = js.native
  def isRelative(stateName: String): Boolean = js.native
  def resolvePath(name: String, base: StateOrName): String = js.native
}

