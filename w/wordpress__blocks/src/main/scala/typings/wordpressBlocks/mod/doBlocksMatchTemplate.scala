package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StringDictionary
import typings.wordpressBlocks.templatesMod.TemplateArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "doBlocksMatchTemplate")
@js.native
object doBlocksMatchTemplate extends js.Object {
  def apply(): Boolean = js.native
  def apply(blocks: js.Array[BlockInstance[StringDictionary[_]]]): Boolean = js.native
  def apply(blocks: js.Array[BlockInstance[StringDictionary[_]]], template: TemplateArray): Boolean = js.native
}

