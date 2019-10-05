package typings.tstl.experimentalAlgorithmMod

import typings.std.Pick
import typings.tstl.baseDisposableIListAlgorithmMod._IListAlgorithm
import typings.tstl.baseDisposableIListAlgorithmMod._IListAlgorithm.ValueType
import typings.tstl.tstlStrings.remove_if
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/algorithm", "erase_if")
@js.native
object erase_if extends js.Object {
  def apply[Container /* <: Pick[_IListAlgorithm[ValueType[Container], Container], remove_if] */](contaier: Container, predicator: js.Function1[/* val */ ValueType[Container], Boolean]): Unit = js.native
}

