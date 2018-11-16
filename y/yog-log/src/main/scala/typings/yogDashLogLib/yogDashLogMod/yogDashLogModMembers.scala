package typings
package yogDashLogLib.yogDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yog-log", JSImport.Namespace)
@js.native
object yogDashLogModMembers extends js.Object {
  def apply(): js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* resp */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    _
  ] = js.native
  def apply(config: LogConfig): js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* resp */ expressLib.expressMod.eNs.Response, 
    /* next */ expressLib.expressMod.eNs.NextFunction, 
    _
  ] = js.native
  def getLogger(): yogDashLogLib.yogDashLogMod.yogUnderscoreLogNs.Logger = js.native
  def getLogger(config: LogConfig): yogDashLogLib.yogDashLogMod.yogUnderscoreLogNs.Logger = js.native
}

