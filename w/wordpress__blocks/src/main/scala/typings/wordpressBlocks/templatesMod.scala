package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typings.std.ReadonlyArray
import typings.std.Record
import typings.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesMod {
  
  @JSImport("@wordpress/blocks/api/templates", "doBlocksMatchTemplate")
  @js.native
  def doBlocksMatchTemplate(): Boolean = js.native
  @JSImport("@wordpress/blocks/api/templates", "doBlocksMatchTemplate")
  @js.native
  def doBlocksMatchTemplate(blocks: js.UndefOr[scala.Nothing], template: TemplateArray): Boolean = js.native
  @JSImport("@wordpress/blocks/api/templates", "doBlocksMatchTemplate")
  @js.native
  def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]]): Boolean = js.native
  @JSImport("@wordpress/blocks/api/templates", "doBlocksMatchTemplate")
  @js.native
  def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]], template: TemplateArray): Boolean = js.native
  
  @JSImport("@wordpress/blocks/api/templates", "synchronizeBlocksWithTemplate")
  @js.native
  def synchronizeBlocksWithTemplate(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  @JSImport("@wordpress/blocks/api/templates", "synchronizeBlocksWithTemplate")
  @js.native
  def synchronizeBlocksWithTemplate(blocks: js.UndefOr[scala.Nothing], template: TemplateArray): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  @JSImport("@wordpress/blocks/api/templates", "synchronizeBlocksWithTemplate")
  @js.native
  def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]]): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  @JSImport("@wordpress/blocks/api/templates", "synchronizeBlocksWithTemplate")
  @js.native
  def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]], template: TemplateArray): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  type Template = js.Tuple3[String, js.UndefOr[Record[String, js.Any]], js.UndefOr[TemplateArray]]
  
  @js.native
  trait TemplateArray extends ReadonlyArray[Template]
}
