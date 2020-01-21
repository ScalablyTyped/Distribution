package typings.universalRouter.universalRouterSyncMod

import typings.pathToRegexp.mod.Key
import typings.pathToRegexp.mod.ParseOptions
import typings.pathToRegexp.mod.Path
import typings.pathToRegexp.mod.RegExpOptions
import typings.std.RegExp
import typings.universalRouter.AnonCompile
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
  var pathToRegexp_Original: AnonCompile = js.native
  def pathToRegexp(path: Path): RegExp = js.native
  def pathToRegexp(path: Path, keys: js.Array[Key]): RegExp = js.native
  def pathToRegexp(path: Path, keys: js.Array[Key], options: RegExpOptions with ParseOptions): RegExp = js.native
}

