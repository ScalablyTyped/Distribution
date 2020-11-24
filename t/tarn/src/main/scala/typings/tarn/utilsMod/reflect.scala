package typings.tarn.utilsMod

import typings.tarn.promiseInspectionMod.PromiseInspection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tarn/dist/utils", "reflect")
@js.native
object reflect extends js.Object {
  
  def apply[T](promise: js.Promise[T]): js.Promise[PromiseInspection[_ | T]] = js.native
}
