package typings.vsoDashNodeDashApi

import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IHttpResponse
import typings.vsoDashNodeDashApi.interfacesCommonVsoBaseInterfacesMod.IRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vso-node-api/handlers/bearertoken", JSImport.Namespace)
@js.native
object handlersBearertokenMod extends js.Object {
  @js.native
  class BearerCredentialHandler protected () extends IRequestHandler {
    def this(token: String) = this()
    var token: String = js.native
    /* CompleteClass */
    override def canHandleAuthentication(res: IHttpResponse): Boolean = js.native
    /* CompleteClass */
    override def handleAuthentication(httpClient: js.Any, protocol: js.Any, options: js.Any, objs: js.Any, finalCallback: js.Any): Unit = js.native
    /* CompleteClass */
    override def prepareRequest(options: js.Any): Unit = js.native
  }
  
}

