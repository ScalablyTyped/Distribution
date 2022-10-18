package typings.wordpressBlocks

import typings.wordpressBlocks.anon.PartialCategory
import typings.wordpressBlocks.apiCategoriesMod.Category
import typings.wordpressBlocks.mod.BlockConfiguration
import typings.wordpressBlocks.mod.BlockStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeActionsMod {
  
  @JSImport("@wordpress/blocks/store/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBlockStyles(blockName: String, styles: js.Array[BlockStyle]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBlockStyles")(blockName.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addBlockStyles(blockName: String, styles: BlockStyle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBlockStyles")(blockName.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addBlockTypes(blockTypes: js.Array[BlockConfiguration[Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBlockTypes")(blockTypes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addBlockTypes(blockTypes: BlockConfiguration[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addBlockTypes")(blockTypes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeBlockStyles(blockName: String, styleNames: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBlockStyles")(blockName.asInstanceOf[js.Any], styleNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeBlockStyles(blockName: String, styleNames: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeBlockStyles")(blockName.asInstanceOf[js.Any], styleNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeBlockTypes(names: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBlockTypes")(names.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def removeBlockTypes(names: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeBlockTypes")(names.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setCategories(categories: js.Array[Category]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCategories")(categories.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setDefaultBlockName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setFreeformFallbackBlockName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFreeformFallbackBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setGroupingBlockName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGroupingBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUnregisteredFallbackBlockName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUnregisteredFallbackBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def updateCategory(slug: String, category: PartialCategory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCategory")(slug.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
