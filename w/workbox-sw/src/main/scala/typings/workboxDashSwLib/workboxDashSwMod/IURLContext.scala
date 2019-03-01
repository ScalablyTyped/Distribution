package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== PrecachingNamespace =====
  */
trait IURLContext extends js.Object {
  /**
  	 * The request's URL.
  	 */
  var url: stdLib.URL
}

object IURLContext {
  @scala.inline
  def apply(url: stdLib.URL): IURLContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IURLContext]
  }
}

