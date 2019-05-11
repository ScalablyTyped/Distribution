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
  def this(routes: Route[C, R], options: Options[C, R]) = this()
  def this(routes: Routes[C, R], options: Options[C, R]) = this()
}

/* static members */
@JSImport("universal-router", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("pathToRegexp")
  var pathToRegexp_Original: universalDashRouterLib.Anon_Compile = js.native
  def pathToRegexp(path: pathDashToDashRegexpLib.pathDashToDashRegexpMod.Path): stdLib.RegExp = js.native
  def pathToRegexp(
    path: pathDashToDashRegexpLib.pathDashToDashRegexpMod.Path,
    keys: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.Key]
  ): stdLib.RegExp = js.native
  def pathToRegexp(
    path: pathDashToDashRegexpLib.pathDashToDashRegexpMod.Path,
    keys: js.Array[pathDashToDashRegexpLib.pathDashToDashRegexpMod.Key],
    options: pathDashToDashRegexpLib.pathDashToDashRegexpMod.RegExpOptions with pathDashToDashRegexpLib.pathDashToDashRegexpMod.ParseOptions
  ): stdLib.RegExp = js.native
}

