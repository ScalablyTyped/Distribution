package typings
package atUirouterCoreLib.libStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state", "StateObject")
@js.native
class StateObject ()
  extends atUirouterCoreLib.libStateStateObjectMod.StateObject {
  /** @deprecated use State.create() */
  def this(config: atUirouterCoreLib.libStateInterfaceMod.StateDeclaration) = this()
}

@JSImport("@uirouter/core/lib/state", "StateObject")
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
  def isState(obj: js.Any): /* is StateObject */scala.Boolean = js.native
  /** Predicate which returns true if the object is an class with @State() decorator */
  def isStateClass(stateDecl: atUirouterCoreLib.libStateInterfaceMod._StateDeclaration): scala.Boolean = js.native
}

