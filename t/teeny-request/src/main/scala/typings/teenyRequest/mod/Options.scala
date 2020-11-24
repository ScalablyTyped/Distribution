package typings.teenyRequest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.teenyRequest.mod.OptionsWithUri
  - typings.teenyRequest.mod.OptionsWithUrl
*/
trait Options extends js.Object
object Options {
  
  @scala.inline
  def OptionsWithUri(uri: String): Options = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  def OptionsWithUrl(url: String): Options = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}
