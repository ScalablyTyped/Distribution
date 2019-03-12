package typings
package vsoDashNodeDashApiLib.clientApiBasesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/ClientApiBases", "ClientApiBase")
@js.native
class ClientApiBase protected () extends js.Object {
  def this(baseUrl: java.lang.String, handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler]) = this()
  def this(baseUrl: java.lang.String, handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler], userAgent: java.lang.String) = this()
  def this(baseUrl: java.lang.String, handlers: js.Array[vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler], userAgent: java.lang.String, options: vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestOptions) = this()
  var baseUrl: java.lang.String = js.native
  var http: typedDashRestDashClientLib.httpClientMod.HttpClient = js.native
  var rest: typedDashRestDashClientLib.restClientMod.RestClient = js.native
  var userAgent: java.lang.String = js.native
  var vsoClient: vsoDashNodeDashApiLib.vsoClientMod.VsoClient = js.native
  def createAcceptHeader(`type`: java.lang.String): java.lang.String = js.native
  def createAcceptHeader(`type`: java.lang.String, apiVersion: java.lang.String): java.lang.String = js.native
  def createRequestOptions(`type`: java.lang.String): typedDashRestDashClientLib.restClientMod.IRequestOptions = js.native
  def createRequestOptions(`type`: java.lang.String, apiVersion: java.lang.String): typedDashRestDashClientLib.restClientMod.IRequestOptions = js.native
  def formatResponse(data: js.Any, responseTypeMetadata: js.Any, isCollection: scala.Boolean): js.Any = js.native
}

