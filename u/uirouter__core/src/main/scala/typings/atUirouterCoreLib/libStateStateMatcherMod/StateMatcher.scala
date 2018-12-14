package typings
package atUirouterCoreLib.libStateStateMatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state/stateMatcher", "StateMatcher")
@js.native
class StateMatcher protected () extends js.Object {
  def this(_states: org.scalablytyped.runtime.StringDictionary[atUirouterCoreLib.libStateStateObjectMod.StateObject]) = this()
  var _states: js.Any = js.native
  def find(stateOrName: atUirouterCoreLib.libStateInterfaceMod.StateOrName): atUirouterCoreLib.libStateStateObjectMod.StateObject = js.native
  def find(
    stateOrName: atUirouterCoreLib.libStateInterfaceMod.StateOrName,
    base: atUirouterCoreLib.libStateInterfaceMod.StateOrName
  ): atUirouterCoreLib.libStateStateObjectMod.StateObject = js.native
  def find(
    stateOrName: atUirouterCoreLib.libStateInterfaceMod.StateOrName,
    base: atUirouterCoreLib.libStateInterfaceMod.StateOrName,
    matchGlob: scala.Boolean
  ): atUirouterCoreLib.libStateStateObjectMod.StateObject = js.native
  def isRelative(stateName: java.lang.String): scala.Boolean = js.native
  def resolvePath(name: java.lang.String, base: atUirouterCoreLib.libStateInterfaceMod.StateOrName): java.lang.String = js.native
}

