package typings.workerDashFarm.workerDashFarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("worker-farm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(name: String): Workers = js.native
  def apply(name: String, exportedMethods: js.Array[String]): Workers = js.native
  def apply(options: FarmOptions, name: String): Workers = js.native
  def apply(options: FarmOptions, name: String, exportedMethods: js.Array[String]): Workers = js.native
  def end(workers: Workers): Unit = js.native
  def end(workers: Workers, callback: js.Function): Unit = js.native
}

