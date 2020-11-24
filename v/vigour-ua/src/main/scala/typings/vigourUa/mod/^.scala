package typings.vigourUa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vigour-ua", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Returns an object representing the user agent including data such as browser, device and platform
    * @param _ua the raw user agent string to be converted
    * @param obj object to be merged to the output result
    * @returns object representing your user agent
    */
  def apply(_ua: String): UserAgent = js.native
  /**
    * Returns an object representing the user agent including data such as browser, device and platform
    * @param _ua the raw user agent string to be converted
    * @returns object representing your user agent
    */
  def apply[T /* <: js.Object */](_ua: String, obj: T): UserAgent with T = js.native
}
