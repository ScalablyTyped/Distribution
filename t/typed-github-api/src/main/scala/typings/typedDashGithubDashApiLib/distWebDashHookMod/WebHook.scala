package typings
package typedDashGithubDashApiLib.distWebDashHookMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/web-hook", "WebHook")
@js.native
abstract class WebHook[TData /* <: WebHookData */, TApiData /* <: typedDashGithubDashApiLib.distApiDashInterfacesWebDashHooksMod.WebHookData */] protected ()
  extends typedDashGithubDashApiLib.distGithubDashRefMod.GitHubRef {
  def this(options: typedDashGithubDashApiLib.distGithubDashRefMod.OptionsOrRef) = this()
  def this(secret: java.lang.String, options: typedDashGithubDashApiLib.distGithubDashRefMod.OptionsOrRef) = this()
  def this(secret: js.UndefOr[scala.Nothing], options: typedDashGithubDashApiLib.distGithubDashRefMod.OptionsOrRef) = this()
  val handlers: js.Any = js.native
  val router: expressLib.expressMod.Router = js.native
  var secret: js.UndefOr[js.Any] = js.native
  /* protected */ def convertData(request: WebHookData, data: TApiData): TData = js.native
  def registerAsyncHandler(handler: typescriptDashEventDashHandlerLib.distFuncMod.AsyncAction[TData]): scala.Unit = js.native
  def registerHandler(handler: typescriptDashEventDashHandlerLib.distFuncMod.Action[TData]): scala.Unit = js.native
  /* private */ def requestHandler(req: js.Any, res: js.Any): js.Any = js.native
}

