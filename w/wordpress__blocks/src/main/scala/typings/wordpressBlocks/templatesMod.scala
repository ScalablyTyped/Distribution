package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typings.std.ReadonlyArray
import typings.std.Record
import typings.wordpressBlocks.mod.BlockInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks/api/templates", JSImport.Namespace)
@js.native
object templatesMod extends js.Object {
  @js.native
  trait TemplateArray extends ReadonlyArray[Template]
  
  def doBlocksMatchTemplate(): Boolean = js.native
  def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]]): Boolean = js.native
  def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]], template: TemplateArray): Boolean = js.native
  def synchronizeBlocksWithTemplate(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]]): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]], template: TemplateArray): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  type Template = js.Tuple3[String, js.UndefOr[Record[String, js.Any]], js.UndefOr[TemplateArray]]
}

