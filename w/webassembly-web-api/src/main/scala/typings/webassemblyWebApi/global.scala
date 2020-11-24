package typings.webassemblyWebApi

import typings.std.Response
import typings.webassemblyWebApi.WebAssembly.Module
import typings.webassemblyWebApi.WebAssembly.ResultObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object WebAssembly extends js.Object {
    
    def compileStreaming(source: js.Promise[Response]): js.Promise[Module] = js.native
    def compileStreaming(source: Response): js.Promise[Module] = js.native
    
    def instantiateStreaming(source: js.Promise[Response]): js.Promise[ResultObject] = js.native
    def instantiateStreaming(source: js.Promise[Response], importObject: js.Object): js.Promise[ResultObject] = js.native
    def instantiateStreaming(source: Response): js.Promise[ResultObject] = js.native
    def instantiateStreaming(source: Response, importObject: js.Object): js.Promise[ResultObject] = js.native
  }
}
