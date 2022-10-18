package typings.wordpressBlocks.anon

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

@js.native
trait TypeofimportedSelectors extends StObject {
  
  def getBlockStyles(blockName: String): js.UndefOr[js.Array[BlockStyle]] = js.native
  
  def getBlockSupport(
    nameOrType: String,
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
  ): js.UndefOr[Any] = js.native
  def getBlockSupport(
    nameOrType: Block[Any],
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
  ): js.UndefOr[Any] = js.native
  def getBlockSupport[T](
    nameOrType: String,
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
    defaultSupports: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : T extends number ? number : T extends boolean ? boolean : T */ js.Any = js.native
  def getBlockSupport[T](
    nameOrType: Block[Any],
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
    defaultSupports: T
  ): /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : T extends number ? number : T extends boolean ? boolean : T */ js.Any = js.native
  
  def getBlockType[T /* <: Record[String, Any] */](): js.UndefOr[Block[T]] = js.native
  def getBlockType[T /* <: Record[String, Any] */](name: String): js.UndefOr[Block[T]] = js.native
  
  def getBlockTypes(): js.Array[Block[Any]] = js.native
  
  def getCategories(): js.Array[Category] = js.native
  
  def getChildBlockNames(blockName: String): js.Array[String] = js.native
  
  def getDefaultBlockName(): js.UndefOr[String] = js.native
  
  def getFreeformFallbackBlockName(): js.UndefOr[String] = js.native
  
  def getGroupingBlockName(): js.UndefOr[String] = js.native
  
  def getUnregisteredFallbackBlockName(): js.UndefOr[String] = js.native
  
  def hasBlockSupport(
    nameOrType: String,
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
  ): Boolean = js.native
  def hasBlockSupport(
    nameOrType: String,
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
    defaultSupports: Boolean
  ): Boolean = js.native
  def hasBlockSupport(
    nameOrType: Block[Any],
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography
  ): Boolean = js.native
  def hasBlockSupport(
    nameOrType: Block[Any],
    feature: align | alignWide | anchor | color | customClassName | className | html | inserter | multiple | reusable | spacing | lock | typography,
    defaultSupports: Boolean
  ): Boolean = js.native
  
  def hasChildBlocks(blockName: String): Boolean = js.native
  
  def hasChildBlocksWithInserterSupport(blockName: String): Boolean = js.native
  
  def isMatchingSearchTerm(nameOrType: String, searchTerm: String): Boolean = js.native
  def isMatchingSearchTerm(nameOrType: Block[Any], searchTerm: String): Boolean = js.native
}
