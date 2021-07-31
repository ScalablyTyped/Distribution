package typings.vsoNodeApi

import typings.vsoNodeApi.vsoBaseInterfacesMod.IHttpResponse
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personalaccesstokenMod {
  
  @JSImport("vso-node-api/handlers/personalaccesstoken", "PersonalAccessTokenCredentialHandler")
  @js.native
  class PersonalAccessTokenCredentialHandler protected ()
    extends StObject
       with IRequestHandler {
    def this(token: String) = this()
    
    /* CompleteClass */
    override def canHandleAuthentication(res: IHttpResponse): Boolean = js.native
    
    /* CompleteClass */
    override def handleAuthentication(httpClient: js.Any, protocol: js.Any, options: js.Any, objs: js.Any, finalCallback: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def prepareRequest(options: js.Any): Unit = js.native
    
    var token: String = js.native
  }
}
