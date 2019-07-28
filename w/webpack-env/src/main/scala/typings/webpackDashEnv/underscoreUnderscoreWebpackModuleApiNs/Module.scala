package typings.webpackDashEnv.underscoreUnderscoreWebpackModuleApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  var children: js.Array[_] = js.native
  var exports: js.Any = js.native
  var filename: String = js.native
  var hot: js.UndefOr[Hot] = js.native
  var id: String = js.native
  var loaded: Boolean = js.native
  var parent: js.Any = js.native
  def require(id: String): js.Any = js.native
  @JSName("require")
  def require_T_T[T](id: String): T = js.native
}

