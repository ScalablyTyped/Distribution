package typings.throng.throngMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("throng", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(startOrOptions: ProcessCallback | Options): Unit = js.native
  def apply(workers: WorkerCount, start: ProcessCallback): Unit = js.native
}

