package typings.workboxDashSw.workboxDashSwMod

import typings.std.URL
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
  var url: URL
}

object URLContext {
  @scala.inline
  def apply(url: URL): URLContext = {
    val __obj = js.Dynamic.literal(url = url)
  
    __obj.asInstanceOf[URLContext]
  }
}

