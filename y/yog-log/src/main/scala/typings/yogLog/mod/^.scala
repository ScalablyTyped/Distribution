package typings.yogLog.mod

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yog-log", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* resp */ Response_[_], 
    /* next */ NextFunction, 
    _
  ] = js.native
  def apply(config: LogConfig): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* resp */ Response_[_], 
    /* next */ NextFunction, 
    _
  ] = js.native
}

