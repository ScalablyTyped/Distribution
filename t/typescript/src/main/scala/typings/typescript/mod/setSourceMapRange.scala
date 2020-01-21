package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "setSourceMapRange")
@js.native
object setSourceMapRange extends js.Object {
  def apply[T /* <: Node */](node: T): T = js.native
  /**
    * Sets a custom text range to use when emitting source maps.
    */
  def apply[T /* <: Node */](node: T, range: SourceMapRange): T = js.native
}

