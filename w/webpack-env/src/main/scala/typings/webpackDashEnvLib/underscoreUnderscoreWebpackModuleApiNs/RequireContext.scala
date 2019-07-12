package typings
package webpackDashEnvLib.underscoreUnderscoreWebpackModuleApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequireContext extends js.Object {
  /** The module id of the context module. This may be useful for module.hot.accept. */
  var id: java.lang.String = js.native
  def apply(id: java.lang.String): js.Any = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def resolve(id: java.lang.String): java.lang.String = js.native
}

