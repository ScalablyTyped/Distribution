package typings.syncRequest

import typings.httpBasic.httpVerbMod.HttpVerb
import typings.node.urlMod.URL_
import typings.syncRequest.optionsMod.Options
import typings.thenRequest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sync-request/lib/browser", JSImport.Namespace)
@js.native
object browserMod extends js.Object {
  
  val FormData: js.Any = js.native
  
  def default(method: HttpVerb, url: String): Response = js.native
  def default(method: HttpVerb, url: String, options: Options): Response = js.native
  def default(method: HttpVerb, url: URL_): Response = js.native
  def default(method: HttpVerb, url: URL_, options: Options): Response = js.native
}
