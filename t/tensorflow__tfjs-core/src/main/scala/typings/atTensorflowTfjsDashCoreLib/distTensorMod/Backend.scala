package typings
package atTensorflowTfjsDashCoreLib.distTensorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backend extends js.Object {
  def disposeData(dataId: js.Object): scala.Unit
  def read(dataId: js.Object): js.Promise[atTensorflowTfjsDashCoreLib.distTypesMod.DataValues]
  def readSync(dataId: js.Object): atTensorflowTfjsDashCoreLib.distTypesMod.DataValues
  def write(dataId: js.Object, values: atTensorflowTfjsDashCoreLib.distTypesMod.DataValues): scala.Unit
}

object Backend {
  @scala.inline
  def apply(
    disposeData: js.Object => scala.Unit,
    read: js.Object => js.Promise[atTensorflowTfjsDashCoreLib.distTypesMod.DataValues],
    readSync: js.Object => atTensorflowTfjsDashCoreLib.distTypesMod.DataValues,
    write: (js.Object, atTensorflowTfjsDashCoreLib.distTypesMod.DataValues) => scala.Unit
  ): Backend = {
    val __obj = js.Dynamic.literal(disposeData = js.Any.fromFunction1(disposeData), read = js.Any.fromFunction1(read), readSync = js.Any.fromFunction1(readSync), write = js.Any.fromFunction2(write))
  
    __obj.asInstanceOf[Backend]
  }
}

