package typings
package atUirouterAngularjsLib.atUirouterAngularjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "StateObject")
@js.native
/** @deprecated use State.create() */
class StateObject ()
  extends atUirouterCoreLib.atUirouterCoreMod.StateObject {
  def this(config: atUirouterCoreLib.libStateInterfaceMod.StateDeclaration) = this()
}

@JSImport("@uirouter/angularjs", "StateObject")
@js.native
object StateObject extends js.Object {
  /**
    * Create a state object to put the private/internal implementation details onto.
    * The object's prototype chain looks like:
    * (Internal State Object) -> (Copy of State.prototype) -> (State Declaration object) -> (State Declaration's prototype...)
    *
    * @param stateDecl the user-supplied State Declaration
    * @returns {StateObject} an internal State object
    */
  def create(stateDecl: atUirouterCoreLib.libStateInterfaceMod._StateDeclaration): atUirouterCoreLib.libStateStateObjectMod.StateObject = js.native
  /** Predicate which returns true if the object is an internal [[StateObject]] object */
  def isState(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/stateObject.StateObject */ scala.Boolean = js.native
  /** Predicate which returns true if the object is an class with @State() decorator */
  def isStateClass(stateDecl: atUirouterCoreLib.libStateInterfaceMod._StateDeclaration): scala.Boolean = js.native
}

