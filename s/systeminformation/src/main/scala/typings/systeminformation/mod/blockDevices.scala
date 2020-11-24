package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.BlockDevicesData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "blockDevices")
@js.native
object blockDevices extends js.Object {
  
  def apply(): js.Promise[js.Array[BlockDevicesData]] = js.native
  def apply(cb: js.Function1[/* data */ js.Array[BlockDevicesData], _]): js.Promise[js.Array[BlockDevicesData]] = js.native
}
