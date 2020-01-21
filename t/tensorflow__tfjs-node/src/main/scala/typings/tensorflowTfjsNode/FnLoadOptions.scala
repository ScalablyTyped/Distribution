package typings.tensorflowTfjsNode

import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnLoadOptions extends js.Object {
  def apply(path: String): IOHandler = js.native
  def apply(path: String, loadOptions: LoadOptions): IOHandler = js.native
}

