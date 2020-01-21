package typings.unistUtilIs

import typings.unist.mod.Node
import typings.unistUtilIs.mod.Test
import typings.unistUtilIs.mod.TestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unist-util-is/convert", JSImport.Namespace)
@js.native
object convertMod extends js.Object {
  def apply[T /* <: Node */](test: Test[T]): TestFunction[T] = js.native
}

