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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorsMod {
  
  @JSImport("@wordpress/blocks/store/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getBlockStyles(blockName: String): js.UndefOr[js.Array[BlockStyle]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockStyles")(blockName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[BlockStyle]]]
  
  @scala.inline
  def getBlockSupport_align(nameOrType: String, feature: align): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_align(nameOrType: Block[js.Any], feature: align): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_align[T](nameOrType: String, feature: align, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  @scala.inline
  def getBlockSupport_align[T](nameOrType: Block[js.Any], feature: align, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  
  @scala.inline
  def getBlockSupport_alignWide(nameOrType: String, feature: alignWide): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_alignWide(nameOrType: Block[js.Any], feature: alignWide): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_alignWide[T](nameOrType: String, feature: alignWide, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  @scala.inline
  def getBlockSupport_alignWide[T](nameOrType: Block[js.Any], feature: alignWide, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  
  @scala.inline
  def getBlockSupport_anchor(nameOrType: String, feature: anchor): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_anchor(nameOrType: Block[js.Any], feature: anchor): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_anchor[T](nameOrType: String, feature: anchor, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  @scala.inline
  def getBlockSupport_anchor[T](nameOrType: Block[js.Any], feature: anchor, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  
  @scala.inline
  def getBlockSupport_className(nameOrType: String, feature: className): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_className(nameOrType: Block[js.Any], feature: className): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_className[T](nameOrType: String, feature: className, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  @scala.inline
  def getBlockSupport_className[T](nameOrType: Block[js.Any], feature: className, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  
  @scala.inline
  def getBlockSupport_customClassName(nameOrType: String, feature: customClassName): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_customClassName(nameOrType: Block[js.Any], feature: customClassName): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_customClassName[T](nameOrType: String, feature: customClassName, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  @scala.inline
  def getBlockSupport_customClassName[T](nameOrType: Block[js.Any], feature: customClassName, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  
  @scala.inline
  def getBlockSupport_html(nameOrType: String, feature: html): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_html(nameOrType: Block[js.Any], feature: html): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_html[T](nameOrType: String, feature: html, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  @scala.inline
  def getBlockSupport_html[T](nameOrType: Block[js.Any], feature: html, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  
  @scala.inline
  def getBlockSupport_inserter(nameOrType: String, feature: inserter): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_inserter(nameOrType: Block[js.Any], feature: inserter): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_inserter[T](nameOrType: String, feature: inserter, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  @scala.inline
  def getBlockSupport_inserter[T](nameOrType: Block[js.Any], feature: inserter, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  
  @scala.inline
  def getBlockSupport_multiple(nameOrType: String, feature: multiple): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_multiple(nameOrType: Block[js.Any], feature: multiple): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_multiple[T](nameOrType: String, feature: multiple, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  @scala.inline
  def getBlockSupport_multiple[T](nameOrType: Block[js.Any], feature: multiple, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  
  @scala.inline
  def getBlockSupport_reusable(nameOrType: String, feature: reusable): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_reusable(nameOrType: Block[js.Any], feature: reusable): js.UndefOr[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Any]]
  @scala.inline
  def getBlockSupport_reusable[T](nameOrType: String, feature: reusable, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  @scala.inline
  def getBlockSupport_reusable[T](nameOrType: Block[js.Any], feature: reusable, defaultSupports: T): T | Boolean | Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[T | Boolean | Double | String]
  
  @scala.inline
  def getBlockType[T](): js.UndefOr[Block[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockType")().asInstanceOf[js.UndefOr[Block[T]]]
  @scala.inline
  def getBlockType[T](name: String): js.UndefOr[Block[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Block[T]]]
  
  @scala.inline
  def getBlockTypes(): js.Array[Block[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTypes")().asInstanceOf[js.Array[Block[js.Any]]]
  
  @scala.inline
  def getCategories(): js.Array[Category] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCategories")().asInstanceOf[js.Array[Category]]
  
  @scala.inline
  def getChildBlockNames(blockName: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildBlockNames")(blockName.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def getDefaultBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultBlockName")().asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def getFreeformFallbackBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFreeformFallbackBlockName")().asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def getGroupingBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroupingBlockName")().asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def getUnregisteredFallbackBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnregisteredFallbackBlockName")().asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def hasBlockSupport_align(nameOrType: String, feature: align): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_align(nameOrType: String, feature: align, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_align(nameOrType: Block[js.Any], feature: align): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_align(nameOrType: Block[js.Any], feature: align, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def hasBlockSupport_alignWide(nameOrType: String, feature: alignWide): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_alignWide(nameOrType: String, feature: alignWide, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_alignWide(nameOrType: Block[js.Any], feature: alignWide): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_alignWide(nameOrType: Block[js.Any], feature: alignWide, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def hasBlockSupport_anchor(nameOrType: String, feature: anchor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_anchor(nameOrType: String, feature: anchor, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_anchor(nameOrType: Block[js.Any], feature: anchor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_anchor(nameOrType: Block[js.Any], feature: anchor, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def hasBlockSupport_className(nameOrType: String, feature: className): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_className(nameOrType: String, feature: className, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_className(nameOrType: Block[js.Any], feature: className): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_className(nameOrType: Block[js.Any], feature: className, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def hasBlockSupport_customClassName(nameOrType: String, feature: customClassName): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_customClassName(nameOrType: String, feature: customClassName, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_customClassName(nameOrType: Block[js.Any], feature: customClassName): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_customClassName(nameOrType: Block[js.Any], feature: customClassName, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def hasBlockSupport_html(nameOrType: String, feature: html): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_html(nameOrType: String, feature: html, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_html(nameOrType: Block[js.Any], feature: html): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_html(nameOrType: Block[js.Any], feature: html, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def hasBlockSupport_inserter(nameOrType: String, feature: inserter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_inserter(nameOrType: String, feature: inserter, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_inserter(nameOrType: Block[js.Any], feature: inserter): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_inserter(nameOrType: Block[js.Any], feature: inserter, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def hasBlockSupport_multiple(nameOrType: String, feature: multiple): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_multiple(nameOrType: String, feature: multiple, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_multiple(nameOrType: Block[js.Any], feature: multiple): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_multiple(nameOrType: Block[js.Any], feature: multiple, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def hasBlockSupport_reusable(nameOrType: String, feature: reusable): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_reusable(nameOrType: String, feature: reusable, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_reusable(nameOrType: Block[js.Any], feature: reusable): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasBlockSupport_reusable(nameOrType: Block[js.Any], feature: reusable, defaultSupports: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBlockSupport")(nameOrType.asInstanceOf[js.Any], feature.asInstanceOf[js.Any], defaultSupports.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def hasChildBlocks(blockName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasChildBlocks")(blockName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def hasChildBlocksWithInserterSupport(blockName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasChildBlocksWithInserterSupport")(blockName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isMatchingSearchTerm(nameOrType: String, searchTerm: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingSearchTerm")(nameOrType.asInstanceOf[js.Any], searchTerm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isMatchingSearchTerm(nameOrType: Block[js.Any], searchTerm: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMatchingSearchTerm")(nameOrType.asInstanceOf[js.Any], searchTerm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
