package typings.thenRequest

import typings.node.Buffer
import typings.promise.mod.ThenPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsePromiseMod {
  
  @JSImport("then-request/lib/ResponsePromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(result: ThenPromise[typings.httpResponseObject.mod.^[Buffer | String]]): ResponsePromise = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(result.asInstanceOf[js.Any]).asInstanceOf[ResponsePromise]
  
  @JSImport("then-request/lib/ResponsePromise", "ResponsePromise")
  @js.native
  class ResponsePromise ()
    extends StObject
       with ThenPromise[typings.httpResponseObject.mod.^[Buffer | String]] {
    
    def getBody(): ThenPromise[Buffer | String] = js.native
    def getBody(encoding: String): ThenPromise[String] = js.native
  }
}
