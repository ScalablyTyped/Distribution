package typings.uirouterCore.mod

import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.stateInterfaceMod._StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core", "StateObject")
@js.native
/** @deprecated use State.create() */
class StateObject ()
  extends typings.uirouterCore.stateMod.StateObject {
  def this(config: StateDeclaration) = this()
}
/* static members */
@JSImport("@uirouter/core", "StateObject")
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
  def create(stateDecl: _StateDeclaration): typings.uirouterCore.stateObjectMod.StateObject = js.native
  
  /** Predicate which returns true if the object is an internal [[StateObject]] object */
  def isState(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/stateObject.StateObject */ Boolean = js.native
  
  /** Predicate which returns true if the object is an class with @State() decorator */
  def isStateClass(stateDecl: _StateDeclaration): Boolean = js.native
  
  /** Predicate which returns true if the object is a [[StateDeclaration]] object */
  def isStateDeclaration(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.StateDeclaration */ Boolean = js.native
}
