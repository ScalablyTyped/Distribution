package typings
package yogDashLogLib.yogDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yog-log", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* resp */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    _
  ] = js.native
  def apply(config: LogConfig): js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* resp */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    _
  ] = js.native
  def getLogger(): Logger = js.native
  def getLogger(config: LogConfig): Logger = js.native
}

