package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typings.std.ReadonlyArray
import typings.std.Record
import typings.wordpressBlocks.mod.BlockInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks/api/templates", JSImport.Namespace)
@js.native
object templatesMod extends js.Object {
  
  def doBlocksMatchTemplate(): Boolean = js.native
  def doBlocksMatchTemplate(blocks: js.UndefOr[scala.Nothing], template: TemplateArray): Boolean = js.native
  def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]]): Boolean = js.native
  def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]], template: TemplateArray): Boolean = js.native
  
  def synchronizeBlocksWithTemplate(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  def synchronizeBlocksWithTemplate(blocks: js.UndefOr[scala.Nothing], template: TemplateArray): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]]): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]], template: TemplateArray): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  @js.native
  trait TemplateArray extends ReadonlyArray[Template]
  
  type Template = js.Tuple3[String, js.UndefOr[Record[String, js.Any]], js.UndefOr[TemplateArray]]
}
