package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.DisksIoData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "disksIO")
@js.native
object disksIO extends js.Object {
  
  def apply(): js.Promise[DisksIoData] = js.native
  def apply(cb: js.Function1[/* data */ DisksIoData, _]): js.Promise[DisksIoData] = js.native
}
