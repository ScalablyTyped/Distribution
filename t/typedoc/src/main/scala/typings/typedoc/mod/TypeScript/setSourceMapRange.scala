package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Node
import typings.typescript.mod.SourceMapRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.setSourceMapRange")
@js.native
object setSourceMapRange extends js.Object {
  /**
    * Sets a custom text range to use when emitting source maps.
    */
  def apply[T /* <: Node */](node: T): T = js.native
  def apply[T /* <: Node */](node: T, range: SourceMapRange): T = js.native
}

