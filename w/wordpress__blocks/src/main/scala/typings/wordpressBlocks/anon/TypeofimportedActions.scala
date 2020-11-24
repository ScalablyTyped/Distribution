package typings.wordpressBlocks.anon

import typings.wordpressBlocks.categoriesMod.Category
import typings.wordpressBlocks.mod.BlockConfiguration
import typings.wordpressBlocks.mod.BlockStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedActions extends js.Object {
  
  def addBlockStyles(blockName: String, styles: js.Array[BlockStyle]): Unit = js.native
  def addBlockStyles(blockName: String, styles: BlockStyle): Unit = js.native
  
  def addBlockTypes(blockTypes: js.Array[BlockConfiguration[_]]): Unit = js.native
  def addBlockTypes(blockTypes: BlockConfiguration[_]): Unit = js.native
  
  def removeBlockStyles(blockName: String, styleNames: String): Unit = js.native
  def removeBlockStyles(blockName: String, styleNames: js.Array[String]): Unit = js.native
  
  def removeBlockTypes(names: String): Unit = js.native
  def removeBlockTypes(names: js.Array[String]): Unit = js.native
  
  def setCategories(categories: js.Array[Category]): Unit = js.native
  
  def setDefaultBlockName(name: String): Unit = js.native
  
  def setFreeformFallbackBlockName(name: String): Unit = js.native
  
  def setGroupingBlockName(name: String): Unit = js.native
  
  def setUnregisteredFallbackBlockName(name: String): Unit = js.native
  
  def updateCategory(slug: String, category: PartialCategory): Unit = js.native
}
