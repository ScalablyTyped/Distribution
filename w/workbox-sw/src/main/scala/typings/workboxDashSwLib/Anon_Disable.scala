package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Disable
  extends org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.NavigationPreloadNamespace] {
  /**
  	 * If the browser supports Navigation Preload, then this will disable it.
  	 */
  def disable(): scala.Unit = js.native
  /**
  	 * If the browser supports Navigation Preload, then this will enable it.
  	 * @param {string} [headerValue] - Optionally, allows developers to
  	 *                                 [override](https://developers.google.com/web/updates/2017/02/navigation-preload#changing_the_header)
  	 *                                 the value of the `Service-Worker-Navigation-Preload` header which will be sent to the server when making
  	 *                                 the navigation request.
  	 */
  def enable(): scala.Unit = js.native
  def enable(headerValue: java.lang.String): scala.Unit = js.native
  /**
  	 * @return {boolean} Whether or not the current browser supports enabling navigation preload.
  	 */
  def isSupported(): scala.Boolean = js.native
}

