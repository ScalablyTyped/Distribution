package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== PrecachingNamespace =====
  */
trait URLContext extends js.Object {
  /**
  	 * The request's URL.
  	 */
  var url: stdLib.URL
}

object URLContext {
  @scala.inline
  def apply(url: stdLib.URL): URLContext = {
    val __obj = js.Dynamic.literal(url = url)
  
    __obj.asInstanceOf[URLContext]
  }
}

