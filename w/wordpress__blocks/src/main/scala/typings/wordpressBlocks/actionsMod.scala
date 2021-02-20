package typings.wordpressBlocks

import typings.wordpressBlocks.anon.PartialCategory
import typings.wordpressBlocks.categoriesMod.Category
import typings.wordpressBlocks.mod.BlockConfiguration
import typings.wordpressBlocks.mod.BlockStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("@wordpress/blocks/store/actions", "addBlockStyles")
  @js.native
  def addBlockStyles(blockName: String, styles: js.Array[BlockStyle]): Unit = js.native
  @JSImport("@wordpress/blocks/store/actions", "addBlockStyles")
  @js.native
  def addBlockStyles(blockName: String, styles: BlockStyle): Unit = js.native
  
  @JSImport("@wordpress/blocks/store/actions", "addBlockTypes")
  @js.native
  def addBlockTypes(blockTypes: js.Array[BlockConfiguration[_]]): Unit = js.native
  @JSImport("@wordpress/blocks/store/actions", "addBlockTypes")
  @js.native
  def addBlockTypes(blockTypes: BlockConfiguration[_]): Unit = js.native
  
  @JSImport("@wordpress/blocks/store/actions", "removeBlockStyles")
  @js.native
  def removeBlockStyles(blockName: String, styleNames: String): Unit = js.native
  @JSImport("@wordpress/blocks/store/actions", "removeBlockStyles")
  @js.native
  def removeBlockStyles(blockName: String, styleNames: js.Array[String]): Unit = js.native
  
  @JSImport("@wordpress/blocks/store/actions", "removeBlockTypes")
  @js.native
  def removeBlockTypes(names: String): Unit = js.native
  @JSImport("@wordpress/blocks/store/actions", "removeBlockTypes")
  @js.native
  def removeBlockTypes(names: js.Array[String]): Unit = js.native
  
  @JSImport("@wordpress/blocks/store/actions", "setCategories")
  @js.native
  def setCategories(categories: js.Array[Category]): Unit = js.native
  
  @JSImport("@wordpress/blocks/store/actions", "setDefaultBlockName")
  @js.native
  def setDefaultBlockName(name: String): Unit = js.native
  
  @JSImport("@wordpress/blocks/store/actions", "setFreeformFallbackBlockName")
  @js.native
  def setFreeformFallbackBlockName(name: String): Unit = js.native
  
  @JSImport("@wordpress/blocks/store/actions", "setGroupingBlockName")
  @js.native
  def setGroupingBlockName(name: String): Unit = js.native
  
  @JSImport("@wordpress/blocks/store/actions", "setUnregisteredFallbackBlockName")
  @js.native
  def setUnregisteredFallbackBlockName(name: String): Unit = js.native
  
  @JSImport("@wordpress/blocks/store/actions", "updateCategory")
  @js.native
  def updateCategory(slug: String, category: PartialCategory): Unit = js.native
}
