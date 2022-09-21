package typings.uirouterAngularjs.mod

import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.stateInterfaceMod._StateDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "StateObject")
@js.native
/** @deprecated use State.create() */
open class StateObject ()
  extends typings.uirouterCore.mod.StateObject {
  def this(config: StateDeclaration) = this()
}
/* static members */
object StateObject {
  
  @JSImport("@uirouter/angularjs", "StateObject")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a state object to put the private/internal implementation details onto.
    * The object's prototype chain looks like:
    * (Internal State Object) -> (Copy of State.prototype) -> (State Declaration object) -> (State Declaration's prototype...)
    *
    * @param stateDecl the user-supplied State Declaration
    * @returns {StateObject} an internal State object
    */
  inline def create(stateDecl: _StateDeclaration): typings.uirouterCore.stateObjectMod.StateObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(stateDecl.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.stateObjectMod.StateObject]
  
  /** Predicate which returns true if the object is an internal [[StateObject]] object */
  inline def isState(obj: Any): /* is @uirouter/core.@uirouter/core/lib/state/stateObject.StateObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isState")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @uirouter/core.@uirouter/core/lib/state/stateObject.StateObject */ Boolean]
  
  /** Predicate which returns true if the object is an class with @State() decorator */
  inline def isStateClass(stateDecl: _StateDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStateClass")(stateDecl.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Predicate which returns true if the object is a [[StateDeclaration]] object */
  inline def isStateDeclaration(obj: Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.StateDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStateDeclaration")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @uirouter/core.@uirouter/core/lib/state/interface.StateDeclaration */ Boolean]
}
