package typings.universalRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("universal-router", JSImport.Default)
@js.native
class default[R, C /* <: RouterContext */] protected () extends UniversalRouter[R, C] {
  def this(routes: Route[R, C]) = this()
  def this(routes: Routes[R, C]) = this()
  def this(routes: Route[R, C], options: RouterOptions[R, C]) = this()
  def this(routes: Routes[R, C], options: RouterOptions[R, C]) = this()
}
