package typings.workboxDashSw

import org.scalablytyped.runtime.Instantiable0
import typings.workboxDashSw.workboxDashSwMod.NavigationPreloadNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassNavigationPreloadNamespace extends Instantiable0[NavigationPreloadNamespace] {
  /**
  	 * If the browser supports Navigation Preload, then this will disable it.
  	 */
  def disable(): Unit = js.native
  /**
  	 * If the browser supports Navigation Preload, then this will enable it.
  	 * @param {string} [headerValue] - Optionally, allows developers to
  	 *                                 [override](https://developers.google.com/web/updates/2017/02/navigation-preload#changing_the_header)
  	 *                                 the value of the `Service-Worker-Navigation-Preload` header which will be sent to the server when making
  	 *                                 the navigation request.
  	 */
  def enable(): Unit = js.native
  def enable(headerValue: String): Unit = js.native
  /**
  	 * @return {boolean} Whether or not the current browser supports enabling navigation preload.
  	 */
  def isSupported(): Boolean = js.native
}

