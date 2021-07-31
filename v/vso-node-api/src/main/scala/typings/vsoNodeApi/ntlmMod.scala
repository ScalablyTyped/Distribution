package typings.vsoNodeApi

import typings.vsoNodeApi.vsoBaseInterfacesMod.IHttpResponse
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ntlmMod {
  
  @JSImport("vso-node-api/handlers/ntlm", "NtlmCredentialHandler")
  @js.native
  class NtlmCredentialHandler protected ()
    extends StObject
       with IRequestHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, workstation: String) = this()
    def this(username: String, password: String, workstation: String, domain: String) = this()
    def this(username: String, password: String, workstation: Unit, domain: String) = this()
    
    /* CompleteClass */
    override def canHandleAuthentication(res: IHttpResponse): Boolean = js.native
    
    var domain: String = js.native
    
    /* CompleteClass */
    override def handleAuthentication(httpClient: js.Any, protocol: js.Any, options: js.Any, objs: js.Any, finalCallback: js.Any): Unit = js.native
    
    var password: String = js.native
    
    /* CompleteClass */
    override def prepareRequest(options: js.Any): Unit = js.native
    
    /* private */ def sendType1Message(
      httpClient: js.Any,
      protocol: js.Any,
      options: js.Any,
      objs: js.Any,
      keepaliveAgent: js.Any,
      callback: js.Any
    ): js.Any = js.native
    
    /* private */ def sendType3Message(
      httpClient: js.Any,
      protocol: js.Any,
      options: js.Any,
      objs: js.Any,
      keepaliveAgent: js.Any,
      res: js.Any,
      callback: js.Any
    ): js.Any = js.native
    
    var username: String = js.native
    
    var workstation: String = js.native
  }
}
