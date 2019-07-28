package typings.webpackDashEnv.underscoreUnderscoreWebpackModuleApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequireContext extends js.Object {
  /** The module id of the context module. This may be useful for module.hot.accept. */
  var id: String = js.native
  def apply(id: String): js.Any = js.native
  def keys(): js.Array[String] = js.native
  def resolve(id: String): String = js.native
}

