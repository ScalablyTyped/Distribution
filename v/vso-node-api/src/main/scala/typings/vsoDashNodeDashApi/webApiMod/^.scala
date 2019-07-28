package typings.vsoDashNodeDashApi.webApiMod

import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/WebApi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getBasicHandler(username: String, password: String): IRequestHandler = js.native
  def getBearerHandler(token: String): IRequestHandler = js.native
  def getHandlerFromToken(token: String): IRequestHandler = js.native
  def getNtlmHandler(username: String, password: String): IRequestHandler = js.native
  def getNtlmHandler(username: String, password: String, workstation: String): IRequestHandler = js.native
  def getNtlmHandler(username: String, password: String, workstation: String, domain: String): IRequestHandler = js.native
  def getPersonalAccessTokenHandler(token: String): IRequestHandler = js.native
}

