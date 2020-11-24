package typings.whoisParsed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("whois-parsed", "lookup")
@js.native
object lookup extends js.Object {
  
  def apply(domainName: String): js.Promise[WhoIsResult] = js.native
  def apply(domainName: String, whoIsOptions: WhoIsOptions): js.Promise[WhoIsResult] = js.native
}
