package typings.uirouterCore

import typings.uirouterCore.anon.Token
import typings.uirouterCore.interfaceMod.UIInjector
import typings.uirouterCore.pathNodeMod.PathNode
import typings.uirouterCore.resolvableMod.Resolvable
import typings.uirouterCore.resolveInterfaceMod.PolicyWhen
import typings.uirouterCore.resolveInterfaceMod.ResolvePolicy
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/resolve/resolveContext", JSImport.Namespace)
@js.native
object resolveContextMod extends js.Object {
  
  val NATIVE_INJECTOR_TOKEN: String = js.native
  
  @js.native
  class ResolveContext protected () extends js.Object {
    def this(_path: js.Array[PathNode]) = this()
    
    var _injector: UIInjector = js.native
    
    var _path: js.Any = js.native
    
    /**
      * Adds Resolvables to the node that matches the state
      *
      * This adds a [[Resolvable]] (generally one created on the fly; not declared on a [[StateDeclaration.resolve]] block).
      * The resolvable is added to the node matching the `state` parameter.
      *
      * These new resolvables are not automatically fetched.
      * The calling code should either fetch them, fetch something that depends on them,
      * or rely on [[resolvePath]] being called when some state is being entered.
      *
      * Note: each resolvable's [[ResolvePolicy]] is merged with the state's policy, and the global default.
      *
      * @param newResolvables the new Resolvables
      * @param state Used to find the node to put the resolvable on
      */
    def addResolvables(newResolvables: js.Array[Resolvable], state: StateObject): Unit = js.native
    
    def findNode(resolvable: Resolvable): PathNode = js.native
    
    /**
      * Gets the async dependencies of a Resolvable
      *
      * Given a Resolvable, returns its dependencies as a Resolvable[]
      */
    def getDependencies(resolvable: Resolvable): js.Array[Resolvable] = js.native
    
    /** Returns the [[ResolvePolicy]] for the given [[Resolvable]] */
    def getPolicy(resolvable: Resolvable): ResolvePolicy = js.native
    
    /**
      * Gets the Resolvable that matches the token
      *
      * Gets the last Resolvable that matches the token in this context, or undefined.
      * Throws an error if it doesn't exist in the ResolveContext
      */
    def getResolvable(token: js.Any): Resolvable = js.native
    
    /** Gets all the tokens found in the resolve context, de-duplicated */
    def getTokens(): js.Array[_] = js.native
    
    def injector(): UIInjector = js.native
    
    /**
      * Returns a promise for an array of resolved path Element promises
      *
      * @param when
      * @param trans
      * @returns {Promise<any>|any}
      */
    def resolvePath(): js.Promise[js.Array[Token]] = js.native
    def resolvePath(when: js.UndefOr[scala.Nothing], trans: Transition): js.Promise[js.Array[Token]] = js.native
    def resolvePath(when: PolicyWhen): js.Promise[js.Array[Token]] = js.native
    def resolvePath(when: PolicyWhen, trans: Transition): js.Promise[js.Array[Token]] = js.native
    
    /**
      * Returns a ResolveContext that includes a portion of this one
      *
      * Given a state, this method creates a new ResolveContext from this one.
      * The new context starts at the first node (root) and stops at the node for the `state` parameter.
      *
      * #### Why
      *
      * When a transition is created, the nodes in the "To Path" are injected from a ResolveContext.
      * A ResolveContext closes over a path of [[PathNode]]s and processes the resolvables.
      * The "To State" can inject values from its own resolvables, as well as those from all its ancestor state's (node's).
      * This method is used to create a narrower context when injecting ancestor nodes.
      *
      * @example
      * `let ABCD = new ResolveContext([A, B, C, D]);`
      *
      * Given a path `[A, B, C, D]`, where `A`, `B`, `C` and `D` are nodes for states `a`, `b`, `c`, `d`:
      * When injecting `D`, `D` should have access to all resolvables from `A`, `B`, `C`, `D`.
      * However, `B` should only be able to access resolvables from `A`, `B`.
      *
      * When resolving for the `B` node, first take the full "To Path" Context `[A,B,C,D]` and limit to the subpath `[A,B]`.
      * `let AB = ABCD.subcontext(a)`
      */
    def subContext(state: StateObject): ResolveContext = js.native
  }
}
