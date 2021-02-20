package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolConfigurationMod.ConfigurationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfigurationRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "ConfigurationRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    ConfigurationParams with PartialResultParams, 
    js.Array[js.Any], 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
