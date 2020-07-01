package typings.tstl.mod.default

import typings.tstl.iforwardcontainerMod.IForwardContainer
import typings.tstl.iforwardcontainerMod.IForwardContainer.IteratorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "end")
@js.native
object end extends js.Object {
  def apply[Container /* <: js.Array[_] | IForwardContainer[_] */](container: Container): IteratorType[Container] = js.native
}

