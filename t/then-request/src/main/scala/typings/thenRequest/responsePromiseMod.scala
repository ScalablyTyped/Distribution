package typings.thenRequest

import typings.httpResponseObject.mod.^
import typings.node.Buffer
import typings.promise.mod.ThenPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("then-request/lib/ResponsePromise", JSImport.Namespace)
@js.native
object responsePromiseMod extends js.Object {
  
  def default(result: ThenPromise[^[Buffer | String]]): ResponsePromise = js.native
  
  @js.native
  class ResponsePromise () extends ThenPromise[^[Buffer | String]] {
    
    def getBody(): ThenPromise[Buffer | String] = js.native
    def getBody(encoding: String): ThenPromise[String] = js.native
  }
}
