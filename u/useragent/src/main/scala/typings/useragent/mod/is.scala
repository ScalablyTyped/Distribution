package typings.useragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("useragent", "is")
@js.native
object is extends js.Object {
  
  /**
    * Does a more inaccurate but more common check for useragents identification.
    * @param useragent The user agent
    */
  def apply(): Details = js.native
  def apply(useragent: String): Details = js.native
}
