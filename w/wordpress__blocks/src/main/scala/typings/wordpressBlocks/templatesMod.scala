package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typings.std.ReadonlyArray
import typings.std.Record
import typings.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templatesMod {
  
  @JSImport("@wordpress/blocks/api/templates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def doBlocksMatchTemplate(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")().asInstanceOf[Boolean]
  @scala.inline
  def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[js.Any]]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[js.Any]]], template: TemplateArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def doBlocksMatchTemplate(blocks: Unit, template: TemplateArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def synchronizeBlocksWithTemplate(): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")().asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  @scala.inline
  def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[js.Any]]]): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  @scala.inline
  def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[js.Any]]], template: TemplateArray): js.Array[BlockInstance[StringDictionary[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  @scala.inline
  def synchronizeBlocksWithTemplate(blocks: Unit, template: TemplateArray): js.Array[BlockInstance[StringDictionary[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  
  type Template = js.Tuple3[String, js.UndefOr[Record[String, js.Any]], js.UndefOr[TemplateArray]]
  
  @js.native
  trait TemplateArray
    extends StObject
       with ReadonlyArray[Template]
}
