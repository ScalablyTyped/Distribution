package typings.universalDashRouter.srcUniversalRouterSyncMod

import typings.pathDashToDashRegexp.pathDashToDashRegexpMod.Key
import typings.pathDashToDashRegexp.pathDashToDashRegexpMod.ParseOptions
import typings.pathDashToDashRegexp.pathDashToDashRegexpMod.Path
import typings.pathDashToDashRegexp.pathDashToDashRegexpMod.RegExpOptions
import typings.std.RegExp
import typings.universalDashRouter.Anon_Compile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("universal-router/src/UniversalRouterSync", JSImport.Default)
@js.native
class default[C /* <: Context */, R] protected () extends UniversalRouter[C, R] {
  def this(routes: Route[C, R]) = this()
  def this(routes: Routes[C, R]) = this()
  def this(routes: Route[C, R], options: Options[C, R]) = this()
  def this(routes: Routes[C, R], options: Options[C, R]) = this()
}

/* static members */
@JSImport("universal-router/src/UniversalRouterSync", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("pathToRegexp")
  var pathToRegexp_Original: Anon_Compile = js.native
  def pathToRegexp(path: Path): RegExp = js.native
  def pathToRegexp(path: Path, keys: js.Array[Key]): RegExp = js.native
  def pathToRegexp(path: Path, keys: js.Array[Key], options: RegExpOptions with ParseOptions): RegExp = js.native
}

