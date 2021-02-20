package typings.vsoNodeApi

import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personalaccesstokenMod {
  
  @JSImport("vso-node-api/handlers/personalaccesstoken", "PersonalAccessTokenCredentialHandler")
  @js.native
  class PersonalAccessTokenCredentialHandler protected () extends IRequestHandler {
    def this(token: String) = this()
    
    var token: String = js.native
  }
}
