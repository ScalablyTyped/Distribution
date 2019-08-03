package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection extends Query {
  def add(options: CommonOption[_]): js.Promise[AddCollectionResult] = js.native
  def aggregate(): Aggregate = js.native
  def doc(id: String): Document = js.native
  def doc(id: Double): Document = js.native
  def where(rule: js.Object): Query = js.native
}

