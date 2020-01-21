package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.CpuCacheData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "cpuCache")
@js.native
object cpuCache extends js.Object {
  def apply(): js.Promise[CpuCacheData] = js.native
  def apply(cb: js.Function1[/* data */ CpuCacheData, _]): js.Promise[CpuCacheData] = js.native
}

