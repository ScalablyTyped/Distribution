package typings
package workerDashFarmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerFarm extends js.Object {
  def apply(name: java.lang.String): Workers = js.native
  def apply(name: java.lang.String, exportedMethods: js.Array[java.lang.String]): Workers = js.native
  def apply(options: FarmOptions, name: java.lang.String): Workers = js.native
  def apply(options: FarmOptions, name: java.lang.String, exportedMethods: js.Array[java.lang.String]): Workers = js.native
  def end(workers: Workers): scala.Unit = js.native
}

