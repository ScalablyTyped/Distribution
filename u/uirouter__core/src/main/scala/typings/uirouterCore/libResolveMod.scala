package typings.uirouterCore

import typings.uirouterCore.anon.EAGER
import typings.uirouterCore.anon.NOWAIT
import typings.uirouterCore.libPathPathNodeMod.PathNode
import typings.uirouterCore.libResolveInterfaceMod.ResolvableLiteral
import typings.uirouterCore.libResolveInterfaceMod.ResolvePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResolveMod {
  
  @JSImport("@uirouter/core/lib/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/resolve", "NATIVE_INJECTOR_TOKEN")
  @js.native
  val NATIVE_INJECTOR_TOKEN: String = js.native
  
  @JSImport("@uirouter/core/lib/resolve", "Resolvable")
  @js.native
  open class Resolvable protected ()
    extends typings.uirouterCore.libResolveResolvableMod.Resolvable {
    /** This constructor creates a new Resolvable from the plain old [[ResolvableLiteral]] javascript object */
    def this(resolvable: ResolvableLiteral) = this()
    /** This constructor creates a Resolvable copy */
    def this(resolvable: typings.uirouterCore.libResolveResolvableMod.Resolvable) = this()
    /**
      * This constructor creates a new `Resolvable`
      *
      * #### Example:
      * ```js
      * var resolvable1 = new Resolvable('mytoken', http => http.get('foo.json').toPromise(), [Http]);
      *
      * var resolvable2 = new Resolvable(UserService, dep => new UserService(dep.data), [SomeDependency]);
      *
      * var resolvable1Clone = new Resolvable(resolvable1);
      * ```
      *
      * @param token The new resolvable's injection token, such as `"userList"` (a string) or `UserService` (a class).
      *              When this token is used during injection, the resolved value will be injected.
      * @param resolveFn The function that returns the resolved value, or a promise for the resolved value
      * @param deps An array of dependencies, which will be injected into the `resolveFn`
      * @param policy the [[ResolvePolicy]] defines when and how the Resolvable is processed
      * @param data Pre-resolved data. If the resolve value is already known, it may be provided here.
      */
    def this(token: Any, resolveFn: js.Function) = this()
    def this(token: Any, resolveFn: js.Function, deps: js.Array[Any]) = this()
    def this(token: Any, resolveFn: js.Function, deps: js.Array[Any], policy: ResolvePolicy) = this()
    def this(token: Any, resolveFn: js.Function, deps: Unit, policy: ResolvePolicy) = this()
    def this(token: Any, resolveFn: js.Function, deps: js.Array[Any], policy: Unit, data: Any) = this()
    def this(token: Any, resolveFn: js.Function, deps: js.Array[Any], policy: ResolvePolicy, data: Any) = this()
    def this(token: Any, resolveFn: js.Function, deps: Unit, policy: Unit, data: Any) = this()
    def this(token: Any, resolveFn: js.Function, deps: Unit, policy: ResolvePolicy, data: Any) = this()
  }
  /* static members */
  object Resolvable {
    
    @JSImport("@uirouter/core/lib/resolve", "Resolvable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromData(token: Any, data: Any): typings.uirouterCore.libResolveResolvableMod.Resolvable = (^.asInstanceOf[js.Dynamic].applyDynamic("fromData")(token.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.libResolveResolvableMod.Resolvable]
  }
  
  @JSImport("@uirouter/core/lib/resolve", "ResolveContext")
  @js.native
  open class ResolveContext protected ()
    extends typings.uirouterCore.libResolveResolveContextMod.ResolveContext {
    def this(_path: js.Array[PathNode]) = this()
  }
  
  @JSImport("@uirouter/core/lib/resolve", "defaultResolvePolicy")
  @js.native
  def defaultResolvePolicy: ResolvePolicy = js.native
  inline def defaultResolvePolicy_=(x: ResolvePolicy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultResolvePolicy")(x.asInstanceOf[js.Any])
  
  object resolvePolicies {
    
    @JSImport("@uirouter/core/lib/resolve", "resolvePolicies")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@uirouter/core/lib/resolve", "resolvePolicies.async")
    @js.native
    def async: NOWAIT = js.native
    inline def async_=(x: NOWAIT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("async")(x.asInstanceOf[js.Any])
    
    @JSImport("@uirouter/core/lib/resolve", "resolvePolicies.when")
    @js.native
    def when: EAGER = js.native
    inline def when_=(x: EAGER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("when")(x.asInstanceOf[js.Any])
  }
}
