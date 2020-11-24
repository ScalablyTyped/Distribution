package typings.vsoNodeApi

import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vso-node-api/handlers/bearertoken", JSImport.Namespace)
@js.native
object bearertokenMod extends js.Object {
  
  @js.native
  class BearerCredentialHandler protected () extends IRequestHandler {
    def this(token: String) = this()
    
    var token: String = js.native
  }
}
