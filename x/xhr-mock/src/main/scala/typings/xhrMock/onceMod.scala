package typings.xhrMock

import typings.xhrMock.typesMod.MockFunction
import typings.xhrMock.typesMod.MockObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr-mock/lib/utils/once", JSImport.Namespace)
@js.native
object onceMod extends js.Object {
  def once(mock: MockFunction): MockFunction = js.native
  def once(mock: MockObject): MockFunction = js.native
}

