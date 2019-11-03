package typings.yogDashLog.yogDashLogMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yog-log", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Function3[/* req */ Request[ParamsDictionary], /* resp */ Response, /* next */ NextFunction, _] = js.native
  def apply(config: LogConfig): js.Function3[/* req */ Request[ParamsDictionary], /* resp */ Response, /* next */ NextFunction, _] = js.native
}

