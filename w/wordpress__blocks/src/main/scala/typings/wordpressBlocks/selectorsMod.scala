package typings.wordpressBlocks

import typings.wordpressBlocks.categoriesMod.Category
import typings.wordpressBlocks.mod.Block
import typings.wordpressBlocks.mod.BlockStyle
import typings.wordpressBlocks.wordpressBlocksStrings.align
import typings.wordpressBlocks.wordpressBlocksStrings.alignWide
import typings.wordpressBlocks.wordpressBlocksStrings.anchor
import typings.wordpressBlocks.wordpressBlocksStrings.className
import typings.wordpressBlocks.wordpressBlocksStrings.customClassName
import typings.wordpressBlocks.wordpressBlocksStrings.html
import typings.wordpressBlocks.wordpressBlocksStrings.inserter
import typings.wordpressBlocks.wordpressBlocksStrings.multiple
import typings.wordpressBlocks.wordpressBlocksStrings.reusable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks/store/selectors", JSImport.Namespace)
@js.native
object selectorsMod extends js.Object {
  def getBlockStyles(blockName: String): js.UndefOr[js.Array[BlockStyle]] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_align(nameOrType: String, feature: align): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_align(nameOrType: Block[_], feature: align): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_align[T](nameOrType: String, feature: align, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_align[T](nameOrType: Block[_], feature: align, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_alignWide(nameOrType: String, feature: alignWide): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_alignWide(nameOrType: Block[_], feature: alignWide): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_alignWide[T](nameOrType: String, feature: alignWide, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_alignWide[T](nameOrType: Block[_], feature: alignWide, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_anchor(nameOrType: String, feature: anchor): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_anchor(nameOrType: Block[_], feature: anchor): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_anchor[T](nameOrType: String, feature: anchor, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_anchor[T](nameOrType: Block[_], feature: anchor, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_className(nameOrType: String, feature: className): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_className(nameOrType: Block[_], feature: className): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_className[T](nameOrType: String, feature: className, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_className[T](nameOrType: Block[_], feature: className, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_customClassName(nameOrType: String, feature: customClassName): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_customClassName(nameOrType: Block[_], feature: customClassName): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_customClassName[T](nameOrType: String, feature: customClassName, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_customClassName[T](nameOrType: Block[_], feature: customClassName, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_html(nameOrType: String, feature: html): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_html(nameOrType: Block[_], feature: html): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_html[T](nameOrType: String, feature: html, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_html[T](nameOrType: Block[_], feature: html, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_inserter(nameOrType: String, feature: inserter): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_inserter(nameOrType: Block[_], feature: inserter): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_inserter[T](nameOrType: String, feature: inserter, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_inserter[T](nameOrType: Block[_], feature: inserter, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_multiple(nameOrType: String, feature: multiple): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_multiple(nameOrType: Block[_], feature: multiple): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_multiple[T](nameOrType: String, feature: multiple, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_multiple[T](nameOrType: Block[_], feature: multiple, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_reusable(nameOrType: String, feature: reusable): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_reusable(nameOrType: Block[_], feature: reusable): js.UndefOr[js.Any] = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_reusable[T](nameOrType: String, feature: reusable, defaultSupports: T): T | Boolean | Double | String = js.native
  @JSName("getBlockSupport")
  def getBlockSupport_reusable[T](nameOrType: Block[_], feature: reusable, defaultSupports: T): T | Boolean | Double | String = js.native
  def getBlockType[T](): js.UndefOr[Block[T]] = js.native
  def getBlockType[T](name: String): js.UndefOr[Block[T]] = js.native
  def getBlockTypes(): js.Array[Block[_]] = js.native
  def getCategories(): js.Array[Category] = js.native
  def getChildBlockNames(blockName: String): js.Array[String] = js.native
  def getDefaultBlockName(): js.UndefOr[String] = js.native
  def getFreeformFallbackBlockName(): js.UndefOr[String] = js.native
  def getGroupingBlockName(): js.UndefOr[String] = js.native
  def getUnregisteredFallbackBlockName(): js.UndefOr[String] = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_align(nameOrType: String, feature: align): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_align(nameOrType: String, feature: align, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_align(nameOrType: Block[_], feature: align): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_align(nameOrType: Block[_], feature: align, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_alignWide(nameOrType: String, feature: alignWide): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_alignWide(nameOrType: String, feature: alignWide, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_alignWide(nameOrType: Block[_], feature: alignWide): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_alignWide(nameOrType: Block[_], feature: alignWide, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_anchor(nameOrType: String, feature: anchor): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_anchor(nameOrType: String, feature: anchor, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_anchor(nameOrType: Block[_], feature: anchor): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_anchor(nameOrType: Block[_], feature: anchor, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_className(nameOrType: String, feature: className): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_className(nameOrType: String, feature: className, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_className(nameOrType: Block[_], feature: className): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_className(nameOrType: Block[_], feature: className, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_customClassName(nameOrType: String, feature: customClassName): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_customClassName(nameOrType: String, feature: customClassName, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_customClassName(nameOrType: Block[_], feature: customClassName): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_customClassName(nameOrType: Block[_], feature: customClassName, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_html(nameOrType: String, feature: html): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_html(nameOrType: String, feature: html, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_html(nameOrType: Block[_], feature: html): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_html(nameOrType: Block[_], feature: html, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_inserter(nameOrType: String, feature: inserter): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_inserter(nameOrType: String, feature: inserter, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_inserter(nameOrType: Block[_], feature: inserter): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_inserter(nameOrType: Block[_], feature: inserter, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_multiple(nameOrType: String, feature: multiple): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_multiple(nameOrType: String, feature: multiple, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_multiple(nameOrType: Block[_], feature: multiple): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_multiple(nameOrType: Block[_], feature: multiple, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_reusable(nameOrType: String, feature: reusable): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_reusable(nameOrType: String, feature: reusable, defaultSupports: Boolean): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_reusable(nameOrType: Block[_], feature: reusable): Boolean = js.native
  @JSName("hasBlockSupport")
  def hasBlockSupport_reusable(nameOrType: Block[_], feature: reusable, defaultSupports: Boolean): Boolean = js.native
  def hasChildBlocks(blockName: String): Boolean = js.native
  def hasChildBlocksWithInserterSupport(blockName: String): Boolean = js.native
  def isMatchingSearchTerm(nameOrType: String, searchTerm: String): Boolean = js.native
  def isMatchingSearchTerm(nameOrType: Block[_], searchTerm: String): Boolean = js.native
}

