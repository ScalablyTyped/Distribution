package typings.useragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("useragent", "parse")
@js.native
object parse extends js.Object {
  
  /**
    * Parses the user agent string with the generated parsers from the ua-parser project on google code.
    * @param userAgent The user agent string
    * @param jsAgent Optional UA from js to detect chrome frame
    */
  def apply(): Agent = js.native
  def apply(userAgent: js.UndefOr[scala.Nothing], jsAgent: String): Agent = js.native
  def apply(userAgent: String): Agent = js.native
  def apply(userAgent: String, jsAgent: String): Agent = js.native
}
