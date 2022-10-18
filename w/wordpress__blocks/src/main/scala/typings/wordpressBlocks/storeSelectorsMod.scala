package typings.wordpressBlocks

import typings.std.Record
import typings.wordpressBlocks.apiCategoriesMod.Category
import typings.wordpressBlocks.mod.Block
import typings.wordpressBlocks.mod.BlockStyle
import typings.wordpressBlocks.wordpressBlocksStrings.align
import typings.wordpressBlocks.wordpressBlocksStrings.alignWide
import typings.wordpressBlocks.wordpressBlocksStrings.anchor
import typings.wordpressBlocks.wordpressBlocksStrings.className
import typings.wordpressBlocks.wordpressBlocksStrings.color
import typings.wordpressBlocks.wordpressBlocksStrings.customClassName
import typings.wordpressBlocks.wordpressBlocksStrings.html
import typings.wordpressBlocks.wordpressBlocksStrings.inserter
import typings.wordpressBlocks.wordpressBlocksStrings.lock
import typings.wordpressBlocks.wordpressBlocksStrings.multiple
import typings.wordpressBlocks.wordpressBlocksStrings.reusable
import typings.wordpressBlocks.wordpressBlocksStrings.spacing
import typings.wordpressBlocks.wordpressBlocksStrings.typography
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeSelectorsMod {
  
  @JSImport("@wordpress/blocks/store/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBlockStyles(blockName: String): js.UndefOr[js.Array[BlockStyle]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockStyles")(blockName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[BlockStyle]]]
  
  inline def getBlockSupport(
    nameOrType: String,
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
  ): js.UndefOr[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Any]]
  inline def getBlockSupport(
    nameOrType: Block[Any],
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
  ): js.UndefOr[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Any]]
  inline def getBlockSupport[T](
    nameOrType: String,
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
    defaultSupports: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : T extends number ? number : T extends boolean ? boolean : T */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : T extends number ? number : T extends boolean ? boolean : T */ js.Any]
  inline def getBlockSupport[T](
    nameOrType: Block[Any],
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
    defaultSupports: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : T extends number ? number : T extends boolean ? boolean : T */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : T extends number ? number : T extends boolean ? boolean : T */ js.Any]
  
  inline def getBlockType[T /* <: Record[String, Any] */](): js.UndefOr[Block[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockType")().asInstanceOf[js.UndefOr[Block[T]]]
  inline def getBlockType[T /* <: Record[String, Any] */](name: String): js.UndefOr[Block[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Block[T]]]
  
  inline def getBlockTypes(): js.Array[Block[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTypes")().asInstanceOf[js.Array[Block[Any]]]
  
  inline def getCategories(): js.Array[Category] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCategories")().asInstanceOf[js.Array[Category]]
  
  inline def getChildBlockNames(blockName: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildBlockNames")(blockName.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getDefaultBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultBlockName")().asInstanceOf[js.UndefOr[String]]
  
  inline def getFreeformFallbackBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFreeformFallbackBlockName")().asInstanceOf[js.UndefOr[String]]
  
  inline def getGroupingBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroupingBlockName")().asInstanceOf[js.UndefOr[String]]
  
  inline def getUnregisteredFallbackBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnregisteredFallbackBlockName")().asInstanceOf[js.UndefOr[String]]
  
  inline def hasBlockSupport(
    nameOrType: String,
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasBlockSupport(
    nameOrType: String,
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
    defaultSupports: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasBlockSupport(
    nameOrType: Block[Any],
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasBlockSupport(
    nameOrType: Block[Any],
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
    defaultSupports: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasChildBlocks(blockName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasChildBlocks")(blockName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def hasChildBlocksWithInserterSupport(blockName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasChildBlocksWithInserterSupport")(blockName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMatchingSearchTerm(nameOrType: String, searchTerm: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingSearchTerm")(nameOrType.asInstanceOf[js.Any], searchTerm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMatchingSearchTerm(nameOrType: Block[Any], searchTerm: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingSearchTerm")(nameOrType.asInstanceOf[js.Any], searchTerm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
