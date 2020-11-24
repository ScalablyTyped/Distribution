package typings.useragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("useragent", "lookup")
@js.native
object lookup extends js.Object {
  
  /**
    * If you are doing a lot of lookups you might want to cache the results of the parsed user agent string instead, in memory.
    * @param userAgent The user agent string
    * @param jsAgent Optional UA from js to detect chrome frame
    */
  def apply(): Agent = js.native
  def apply(userAgent: js.UndefOr[scala.Nothing], jsAgent: String): Agent = js.native
  def apply(userAgent: String): Agent = js.native
  def apply(userAgent: String, jsAgent: String): Agent = js.native
}
