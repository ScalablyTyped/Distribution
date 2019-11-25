package typings.tslint.libUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/utils", "flatMap")
@js.native
object flatMap extends js.Object {
  def apply[T, U](inputs: js.Array[T], getOutputs: js.Function2[/* input */ T, /* index */ Double, js.Array[U]]): js.Array[U] = js.native
}

