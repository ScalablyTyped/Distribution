package typings.vsoNodeApi

import typings.typedRestClient.httpClientMod.HttpClient
import typings.typedRestClient.restClientMod.RestClient
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoNodeApi.vsoClientMod.VsoClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientApiBasesMod {
  
  @JSImport("vso-node-api/ClientApiBases", "ClientApiBase")
  @js.native
  open class ClientApiBase protected () extends StObject {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], userAgent: String) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], userAgent: String, options: IRequestOptions) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], userAgent: Unit, options: IRequestOptions) = this()
    
    var baseUrl: String = js.native
    
    def createAcceptHeader(`type`: String): String = js.native
    def createAcceptHeader(`type`: String, apiVersion: String): String = js.native
    
    def createRequestOptions(`type`: String): typings.typedRestClient.restClientMod.IRequestOptions = js.native
    def createRequestOptions(`type`: String, apiVersion: String): typings.typedRestClient.restClientMod.IRequestOptions = js.native
    
    def formatResponse(data: Any, responseTypeMetadata: Any, isCollection: Boolean): Any = js.native
    
    var http: HttpClient = js.native
    
    var rest: RestClient = js.native
    
    var userAgent: String = js.native
    
    var vsoClient: VsoClient = js.native
  }
}
