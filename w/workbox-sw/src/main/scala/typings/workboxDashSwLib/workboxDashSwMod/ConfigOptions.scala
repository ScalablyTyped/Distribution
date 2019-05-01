package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  /**
  	 * If true, `dev` builds are used, otherwise `prod` builds are used.
  	 * By default, `prod` is used unless on localhost.
  	 */
  var debug: scala.Boolean = js.native
  /**
  	 * If defined,
  	 * this callback will be responsible for determining the path of each
  	 * workbox module.
  	 */
  @JSName("modulePathCb")
  var modulePathCb_Original: ModulePathCallback = js.native
  /**
  	 * To avoid using the CDN with `workbox-sw`
  	 * set the path prefix of where modules should be loaded from.
  	 * For example `modulePathPrefix: '/third_party/workbox/v3.0.0/'`.
  	 */
  var modulePathPrefix: java.lang.String = js.native
  /**
  	 * If defined,
  	 * this callback will be responsible for determining the path of each
  	 * workbox module.
  	 */
  def modulePathCb(moduleName: java.lang.String, debug: scala.Boolean): java.lang.String = js.native
}

