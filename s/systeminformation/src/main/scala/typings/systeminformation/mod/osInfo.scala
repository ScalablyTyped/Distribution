package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.OsData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "osInfo")
@js.native
object osInfo extends js.Object {
  
  def apply(): js.Promise[OsData] = js.native
  def apply(cb: js.Function1[/* data */ OsData, _]): js.Promise[OsData] = js.native
}
