package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.BaseboardData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "baseboard")
@js.native
object baseboard extends js.Object {
  
  def apply(): js.Promise[BaseboardData] = js.native
  def apply(cb: js.Function1[/* data */ BaseboardData, _]): js.Promise[BaseboardData] = js.native
}
