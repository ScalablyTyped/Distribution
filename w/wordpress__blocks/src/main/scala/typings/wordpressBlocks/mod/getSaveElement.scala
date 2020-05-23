package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "getSaveElement")
@js.native
object getSaveElement extends js.Object {
  def apply[T](blockTypeOrName: String, attributes: T): ReactChild = js.native
  def apply[T](blockTypeOrName: String, attributes: T, innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): ReactChild = js.native
  def apply[T](blockTypeOrName: Block[T], attributes: T): ReactChild = js.native
  def apply[T](
    blockTypeOrName: Block[T],
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): ReactChild = js.native
}

