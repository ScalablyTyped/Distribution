package typings.thenRequest

import typings.httpResponseObject.mod.^
import typings.node.Buffer
import typings.promise.mod.ThenPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsePromiseMod {
  
  @JSImport("then-request/lib/ResponsePromise", JSImport.Default)
  @js.native
  def default(result: ThenPromise[^[Buffer | String]]): ResponsePromise = js.native
  
  @JSImport("then-request/lib/ResponsePromise", "ResponsePromise")
  @js.native
  class ResponsePromise () extends ThenPromise[^[Buffer | String]] {
    
    def getBody(): ThenPromise[Buffer | String] = js.native
    def getBody(encoding: String): ThenPromise[String] = js.native
  }
}
