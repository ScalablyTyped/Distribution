package typings.tarn.utilsMod

import typings.tarn.promiseInspectionMod.PromiseInspection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tarn/dist/utils", "reflect")
@js.native
object reflect extends js.Object {
  def apply[T](promise: js.Promise[T]): js.Promise[PromiseInspection[_ | T]] = js.native
}

