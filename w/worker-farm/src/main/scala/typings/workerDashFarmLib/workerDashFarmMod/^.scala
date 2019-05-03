package typings
package workerDashFarmLib.workerDashFarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("worker-farm", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(name: java.lang.String): Workers = js.native
  def apply(name: java.lang.String, exportedMethods: js.Array[java.lang.String]): Workers = js.native
  def apply(options: FarmOptions, name: java.lang.String): Workers = js.native
  def apply(options: FarmOptions, name: java.lang.String, exportedMethods: js.Array[java.lang.String]): Workers = js.native
  def end(workers: Workers): scala.Unit = js.native
  def end(workers: Workers, callback: js.Function): scala.Unit = js.native
}

