package typings.atTensorflowTfjsDashCore.distTensorMod

import typings.atTensorflowTfjsDashCore.distTypesMod.BackendValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backend extends js.Object {
  def disposeData(dataId: js.Object): Unit
  def read(dataId: js.Object): js.Promise[BackendValues]
  def readSync(dataId: js.Object): BackendValues
  def write(dataId: js.Object, values: BackendValues): Unit
}

object Backend {
  @scala.inline
  def apply(
    disposeData: js.Object => Unit,
    read: js.Object => js.Promise[BackendValues],
    readSync: js.Object => BackendValues,
    write: (js.Object, BackendValues) => Unit
  ): Backend = {
    val __obj = js.Dynamic.literal(disposeData = js.Any.fromFunction1(disposeData), read = js.Any.fromFunction1(read), readSync = js.Any.fromFunction1(readSync), write = js.Any.fromFunction2(write))
  
    __obj.asInstanceOf[Backend]
  }
}

