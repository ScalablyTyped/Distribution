package typings
package vsoDashNodeDashApiLib.webapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/WebApi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getBasicHandler(username: java.lang.String, password: java.lang.String): vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler = js.native
  def getBearerHandler(token: java.lang.String): vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler = js.native
  def getHandlerFromToken(token: java.lang.String): vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler = js.native
  def getNtlmHandler(username: java.lang.String, password: java.lang.String): vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler = js.native
  def getNtlmHandler(username: java.lang.String, password: java.lang.String, workstation: java.lang.String): vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler = js.native
  def getNtlmHandler(
    username: java.lang.String,
    password: java.lang.String,
    workstation: java.lang.String,
    domain: java.lang.String
  ): vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler = js.native
  def getPersonalAccessTokenHandler(token: java.lang.String): vsoDashNodeDashApiLib.interfacesCommonVsoBaseInterfacesMod.IRequestHandler = js.native
}

