package typings.useragent.mod

import typings.useragent.anon.Major
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("useragent", "fromJSON")
@js.native
object fromJSON extends js.Object {
  
  /**
    * Transform a JSON object back to a valid userAgent string
    * @param obj A JSON object or stringified JSON object
    */
  def apply(obj: String): Agent = js.native
  def apply(obj: Major): Agent = js.native
}
