package typings
package universalDashRouterLib.universalDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("universal-router", JSImport.Default)
@js.native
class default[C /* <: Context */, R] protected () extends UniversalRouter[C, R] {
  def this(routes: Route[C, R]) = this()
  def this(routes: Routes[C, R]) = this()
  def this(routes: Route[C, R], options: Options[C, _]) = this()
  def this(routes: Routes[C, R], options: Options[C, _]) = this()
}

@JSImport("universal-router", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * `path-to-regexp` function
    */
  @JSName("pathToRegexp")
  var pathToRegexp_Original: universalDashRouterLib.Anon_Path = js.native
  /**
    * `path-to-regexp` function
    */
  def pathToRegexp(path: pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Path): stdLib.RegExp = js.native
  /**
    * `path-to-regexp` function
    */
  def pathToRegexp(
    path: pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Path,
    keys: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Key]
  ): stdLib.RegExp = js.native
  /**
    * `path-to-regexp` function
    */
  def pathToRegexp(
    path: pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Path,
    keys: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.Key],
    options: pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.RegExpOptions with pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.ParseOptions
  ): stdLib.RegExp = js.native
}

