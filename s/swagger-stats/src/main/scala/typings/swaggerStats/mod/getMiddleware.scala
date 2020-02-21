package typings.swaggerStats.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-stats", "getMiddleware")
@js.native
object getMiddleware extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(opts: SWStats): RequestHandler[ParamsDictionary] = js.native
}

