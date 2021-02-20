package typings.vsoNodeApi

import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ntlmMod {
  
  @JSImport("vso-node-api/handlers/ntlm", "NtlmCredentialHandler")
  @js.native
  class NtlmCredentialHandler protected () extends IRequestHandler {
    def this(username: String, password: String) = this()
    def this(username: String, password: String, workstation: String) = this()
    def this(username: String, password: String, workstation: js.UndefOr[scala.Nothing], domain: String) = this()
    def this(username: String, password: String, workstation: String, domain: String) = this()
    
    var domain: String = js.native
    
    var password: String = js.native
    
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
