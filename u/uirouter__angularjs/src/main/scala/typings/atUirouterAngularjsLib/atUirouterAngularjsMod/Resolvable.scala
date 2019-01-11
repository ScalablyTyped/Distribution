package typings
package atUirouterAngularjsLib.atUirouterAngularjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "Resolvable")
@js.native
class Resolvable protected ()
  extends atUirouterCoreLib.atUirouterCoreMod.Resolvable {
  /** This constructor creates a new Resolvable from the plain old [[ResolvableLiteral]] javascript object */
  def this(resolvable: atUirouterCoreLib.libResolveInterfaceMod.ResolvableLiteral) = this()
  /** This constructor creates a Resolvable copy */
  def this(resolvable: atUirouterCoreLib.libResolveResolvableMod.Resolvable) = this()
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
  def this(token: js.Any, resolveFn: js.Function) = this()
  def this(token: js.Any, resolveFn: js.Function, deps: js.Array[_]) = this()
  def this(token: js.Any, resolveFn: js.Function, deps: js.Array[_], policy: atUirouterCoreLib.libResolveInterfaceMod.ResolvePolicy) = this()
  def this(token: js.Any, resolveFn: js.Function, deps: js.Array[_], policy: atUirouterCoreLib.libResolveInterfaceMod.ResolvePolicy, data: js.Any) = this()
}

@JSImport("@uirouter/angularjs", "Resolvable")
@js.native
object Resolvable extends js.Object {
  def fromData(token: js.Any, data: js.Any): atUirouterCoreLib.libResolveResolvableMod.Resolvable = js.native
}

