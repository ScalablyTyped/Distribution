package typings.xhrDashMock

import typings.xhrDashMock.libTypesMod.MockFunction
import typings.xhrDashMock.libTypesMod.MockObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/utils/sequence", JSImport.Namespace)
@js.native
object libUtilsSequenceMod extends js.Object {
  def sequence(mocks: js.Array[MockFunction | MockObject]): MockFunction = js.native
}

