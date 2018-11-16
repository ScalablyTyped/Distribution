package typings
package webpackDashEnvLib.underscoreUnderscoreWebpackModuleApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Module extends js.Object {
  var children: js.Array[_] = js.native
  var exports: js.Any = js.native
  var filename: java.lang.String = js.native
  var hot: js.UndefOr[Hot] = js.native
  var id: java.lang.String = js.native
  var loaded: scala.Boolean = js.native
  var parent: js.Any = js.native
  def require(id: java.lang.String): js.Any = js.native
  @JSName("require")
  def require_TT[T](id: java.lang.String): T = js.native
}

