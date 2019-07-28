package typings.vsoDashNodeDashApi.clientApiBasesMod

import typings.typedDashRestDashClient.httpClientMod.HttpClient
import typings.typedDashRestDashClient.restClientMod.RestClient
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestOptions
import typings.vsoDashNodeDashApi.vsoClientMod.VsoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/ClientApiBases", "ClientApiBase")
@js.native
class ClientApiBase protected () extends js.Object {
  def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
  def this(baseUrl: String, handlers: js.Array[IRequestHandler], userAgent: String) = this()
  def this(baseUrl: String, handlers: js.Array[IRequestHandler], userAgent: String, options: IRequestOptions) = this()
  var baseUrl: String = js.native
  var http: HttpClient = js.native
  var rest: RestClient = js.native
  var userAgent: String = js.native
  var vsoClient: VsoClient = js.native
  def createAcceptHeader(`type`: String): String = js.native
  def createAcceptHeader(`type`: String, apiVersion: String): String = js.native
  def createRequestOptions(`type`: String): typings.typedDashRestDashClient.restClientMod.IRequestOptions = js.native
  def createRequestOptions(`type`: String, apiVersion: String): typings.typedDashRestDashClient.restClientMod.IRequestOptions = js.native
  def formatResponse(data: js.Any, responseTypeMetadata: js.Any, isCollection: Boolean): js.Any = js.native
}

