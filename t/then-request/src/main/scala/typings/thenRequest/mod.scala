package typings.thenRequest

import typings.formData.mod.Options
import typings.formData.mod.^
import typings.node.Buffer
import typings.thenRequest.requestFnMod.RequestFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("then-request", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val default: RequestFn = js.native
  
  @js.native
  class FormData () extends ^ {
    def this(options: Options) = this()
  }
  
  @js.native
  class ResponsePromise ()
    extends typings.thenRequest.responsePromiseMod.ResponsePromise
  
  type Response = typings.httpResponseObject.mod.^[Buffer | String]
}
