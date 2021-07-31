package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ReactChild
import typings.react.mod.global.JSX.Element
import typings.std.ArrayLike
import typings.std.Node
import typings.std.ParentNode
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.anon.Attributetypeboolean
import typings.wordpressBlocks.anon.BlockName
import typings.wordpressBlocks.anon.Icon
import typings.wordpressBlocks.anon.Mode
import typings.wordpressBlocks.anon.PartialCategory
import typings.wordpressBlocks.anon.`0`
import typings.wordpressBlocks.categoriesMod.Category
import typings.wordpressBlocks.mod.Block
import typings.wordpressBlocks.mod.BlockConfiguration
import typings.wordpressBlocks.mod.BlockIcon
import typings.wordpressBlocks.mod.BlockIconNormalized
import typings.wordpressBlocks.mod.BlockInstance
import typings.wordpressBlocks.mod.BlockStyle
import typings.wordpressBlocks.mod.Transform
import typings.wordpressBlocks.parserMod.Schema.Attribute
import typings.wordpressBlocks.parserMod.Schema.Children
import typings.wordpressBlocks.parserMod.Schema.HTML
import typings.wordpressBlocks.parserMod.Schema.Query
import typings.wordpressBlocks.parserMod.Schema.Tag
import typings.wordpressBlocks.parserMod.Schema.Text
import typings.wordpressBlocks.parserMod.Source
import typings.wordpressBlocks.rawHandlingMod.PhrasingContentSchema
import typings.wordpressBlocks.rawHandlingMod.pasteHandler.Options
import typings.wordpressBlocks.templatesMod.TemplateArray
import typings.wordpressBlocks.wordpressBlocksStrings.align
import typings.wordpressBlocks.wordpressBlocksStrings.alignWide
import typings.wordpressBlocks.wordpressBlocksStrings.anchor
import typings.wordpressBlocks.wordpressBlocksStrings.className
import typings.wordpressBlocks.wordpressBlocksStrings.customClassName
import typings.wordpressBlocks.wordpressBlocksStrings.from
import typings.wordpressBlocks.wordpressBlocksStrings.html
import typings.wordpressBlocks.wordpressBlocksStrings.inserter
import typings.wordpressBlocks.wordpressBlocksStrings.multiple
import typings.wordpressBlocks.wordpressBlocksStrings.reusable
import typings.wordpressBlocks.wordpressBlocksStrings.to
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("@wordpress/blocks/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object children {
    
    @JSImport("@wordpress/blocks/api", "children")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given two or more block nodes, returns a new block node representing a
      * concatenation of its values.
      *
      * @param blockNodes - Block nodes to concatenate.
      */
    @scala.inline
    def concat(blockNodes: ReactChild*): js.Array[ReactChild] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(blockNodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactChild]]
    
    /**
      * Given an iterable set of DOM nodes, returns equivalent block children.
      * Ignores any non-element/text nodes included in set.
      *
      * @param domNodes - list of DOM nodes to convert.
      */
    @scala.inline
    def fromDOM(domNodes: ArrayLike[Node]): js.Array[ReactChild] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDOM")(domNodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactChild]]
    
    /**
      * Given block children, returns an array of block nodes.
      *
      * @param children - Block children object to convert.
      */
    @scala.inline
    def getChildrenArray(children: js.Array[ReactChild]): js.Array[ReactChild] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildrenArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactChild]]
    
    /**
      * Given a selector, returns an hpq matcher generating a WPBlockChildren value
      * matching the selector result.
      *
      * @param selector - DOM selector.
      */
    @scala.inline
    def matcher(selector: String): js.Function1[/* domNode */ Node & ParentNode, js.Array[ReactChild]] = ^.asInstanceOf[js.Dynamic].applyDynamic("matcher")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* domNode */ Node & ParentNode, js.Array[ReactChild]]]
    
    /**
      * Given a block node, returns its HTML string representation.
      *
      * @param children - Block node(s) to convert to string.
      */
    @scala.inline
    def toHTML(children: js.Array[ReactChild]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(children.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @scala.inline
  def cloneBlock[T /* <: Record[String, js.Any] */](block: BlockInstance[T]): BlockInstance[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any]).asInstanceOf[BlockInstance[T]]
  @scala.inline
  def cloneBlock[T /* <: Record[String, js.Any] */](
    block: BlockInstance[T],
    mergeAttributes: Unit,
    newInnerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  ): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any], newInnerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  @scala.inline
  def cloneBlock[T /* <: Record[String, js.Any] */](block: BlockInstance[T], mergeAttributes: Partial[T]): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  @scala.inline
  def cloneBlock[T /* <: Record[String, js.Any] */](
    block: BlockInstance[T],
    mergeAttributes: Partial[T],
    newInnerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  ): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any], newInnerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  
  @scala.inline
  def createBlock[T /* <: Record[String, js.Any] */](name: String): BlockInstance[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any]).asInstanceOf[BlockInstance[T]]
  @scala.inline
  def createBlock[T /* <: Record[String, js.Any] */](name: String, attributes: Unit, innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  @scala.inline
  def createBlock[T /* <: Record[String, js.Any] */](name: String, attributes: Partial[T]): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  @scala.inline
  def createBlock[T /* <: Record[String, js.Any] */](
    name: String,
    attributes: Partial[T],
    innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  ): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  
  @scala.inline
  def doBlocksMatchTemplate(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")().asInstanceOf[Boolean]
  @scala.inline
  def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[js.Any]]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[js.Any]]], template: TemplateArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def doBlocksMatchTemplate(blocks: Unit, template: TemplateArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def findTransform[T /* <: Transform[Record[String, js.Any]] */, U /* <: Record[String, js.Any] */](transforms: js.Array[T], predicate: js.Function1[/* transform */ T, Boolean]): Transform[U] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findTransform")(transforms.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Transform[U] | Null]
  
  @scala.inline
  def getBlockAttributes(blockTypeOrName: String, innerHTML: String): Record[String, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Any]]
  @scala.inline
  def getBlockAttributes(blockTypeOrName: String, innerHTML: String, attributes: Record[String, js.Any]): Record[String, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Any]]
  @scala.inline
  def getBlockAttributes[T /* <: Block[js.Any] */](blockTypeOrName: T, innerHTML: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def getBlockAttributes[T /* <: Block[js.Any] */](blockTypeOrName: T, innerHTML: String, attributes: Record[String, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getBlockContent(block: BlockInstance[StringDictionary[js.Any]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockContent")(block.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getBlockDefaultClassName(blockName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockDefaultClassName")(blockName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getBlockMenuDefaultClassName(blockName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockMenuDefaultClassName")(blockName.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  def getBlockTransforms_from[T /* <: Record[String, js.Any] */](direction: from): js.Array[Transform[T] & BlockName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any]).asInstanceOf[js.Array[Transform[T] & BlockName]]
  @scala.inline
  def getBlockTransforms_from[T /* <: Record[String, js.Any] */](direction: from, blockTypeOrName: String): js.Array[Transform[T] & BlockName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transform[T] & BlockName]]
  @scala.inline
  def getBlockTransforms_from[T /* <: Record[String, js.Any] */](direction: from, blockTypeOrName: Block[js.Object]): js.Array[Transform[T] & BlockName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transform[T] & BlockName]]
  
  @scala.inline
  def getBlockTransforms_to[T /* <: Record[String, js.Any] */](direction: to): js.Array[Transform[T] & BlockName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any]).asInstanceOf[js.Array[Transform[T] & BlockName]]
  @scala.inline
  def getBlockTransforms_to[T /* <: Record[String, js.Any] */](direction: to, blockTypeOrName: String): js.Array[Transform[T] & BlockName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transform[T] & BlockName]]
  @scala.inline
  def getBlockTransforms_to[T /* <: Record[String, js.Any] */](direction: to, blockTypeOrName: Block[js.Object]): js.Array[Transform[T] & BlockName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transform[T] & BlockName]]
  
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
  def getFreeformContentHandlerName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFreeformContentHandlerName")().asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def getGroupingBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroupingBlockName")().asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def getPhrasingContentSchema(): PhrasingContentSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("getPhrasingContentSchema")().asInstanceOf[PhrasingContentSchema]
  
  @scala.inline
  def getPossibleBlockTransformations(blocks: js.Array[BlockInstance[StringDictionary[js.Any]]]): js.Array[Block[Record[String, js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPossibleBlockTransformations")(blocks.asInstanceOf[js.Any]).asInstanceOf[js.Array[Block[Record[String, js.Any]]]]
  
  @scala.inline
  def getSaveContent[T](blockTypeOrName: String, attributes: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getSaveContent[T](
    blockTypeOrName: String,
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getSaveContent[T](blockTypeOrName: Block[T], attributes: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def getSaveContent[T](
    blockTypeOrName: Block[T],
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getSaveElement[T](blockTypeOrName: String, attributes: T): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
  @scala.inline
  def getSaveElement[T](
    blockTypeOrName: String,
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  ): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
  @scala.inline
  def getSaveElement[T](blockTypeOrName: Block[T], attributes: T): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
  @scala.inline
  def getSaveElement[T](
    blockTypeOrName: Block[T],
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  ): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
  
  @scala.inline
  def getUnregisteredTypeHandlerName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnregisteredTypeHandlerName")().asInstanceOf[js.UndefOr[String]]
  
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
  def isReusableBlock(blockOrType: Block[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReusableBlock")(blockOrType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isReusableBlock(blockOrType: BlockInstance[StringDictionary[js.Any]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReusableBlock")(blockOrType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isUnmodifiedDefaultBlock(block: BlockInstance[StringDictionary[js.Any]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnmodifiedDefaultBlock")(block.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidBlockContent[T](blockTypeOrName: String, attributes: T, originalBlockContent: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidBlockContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], originalBlockContent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isValidBlockContent[T](blockTypeOrName: Block[T], attributes: T, originalBlockContent: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidBlockContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], originalBlockContent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isValidIcon(icon: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidIcon")(icon.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Object of utility functions used in managing block attribute values of
    * source `node`.
    *
    * @see https://github.com/WordPress/gutenberg/pull/10439
    *
    * @deprecated since 4.0. The `node` source should not be used, and can be
    *             replaced by the `html` source.
    */
  object node {
    
    @JSImport("@wordpress/blocks/api", "node")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given a DOM Element or Text node, returns an equivalent block node. Throws
      * if passed any node type other than element or text.
      *
      * @throws {TypeError} If non-element/text node is passed.
      *
      * @param domNode - DOM node to convert.
      */
    @scala.inline
    def fromDOM(domNode: Node): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDOM")(domNode.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /**
      * Given a single node and a node type (e.g. `'br'`), returns `true` if the node
      * corresponds to that type, `false` otherwise.
      *
      * @param node - Block node to test
      * @param type - Node to type to test against.
      */
    @scala.inline
    def isNodeOfType_type(
      node: Element,
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNodeOfType")(node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Given a selector, returns an hpq matcher generating a WPBlockChildren value
      * matching the selector result.
      *
      * @param selector - DOM selector.
      */
    /* was `typeof children.matcher` */
    @scala.inline
    def matcher(selector: String): js.Function1[/* domNode */ Node & ParentNode, js.Array[ReactChild]] = ^.asInstanceOf[js.Dynamic].applyDynamic("matcher")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* domNode */ Node & ParentNode, js.Array[ReactChild]]]
    
    /**
      * Given a block node, returns its HTML string representation.
      *
      * @param node - Block node to convert to string.
      */
    @scala.inline
    def toHTML(node: ReactChild): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @scala.inline
  def normalizeIconObject(): BlockIconNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIconObject")().asInstanceOf[BlockIconNormalized]
  @scala.inline
  def normalizeIconObject(icon: BlockIcon): BlockIconNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIconObject")(icon.asInstanceOf[js.Any]).asInstanceOf[BlockIconNormalized]
  
  @scala.inline
  def parse(content: String): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(content.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  
  @scala.inline
  def parseWithAttributeSchema(innerHTML: String, schema: Attributetypeboolean): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  @scala.inline
  def parseWithAttributeSchema(innerHTML: String, schema: Attribute): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def parseWithAttributeSchema(innerHTML: String, schema: Children): js.Array[ReactChild] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactChild]]
  @scala.inline
  def parseWithAttributeSchema(innerHTML: String, schema: HTML): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def parseWithAttributeSchema(innerHTML: String, schema: typings.wordpressBlocks.parserMod.Schema.Node): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  @scala.inline
  def parseWithAttributeSchema(innerHTML: String, schema: Tag): js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 173 */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 173 */ js.Any
  ]]
  @scala.inline
  def parseWithAttributeSchema(innerHTML: String, schema: Text): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def parseWithAttributeSchema[T /* <: Record[String, Source[js.Any]] */](innerHTML: String, schema: Query[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.parseWithAttributeSchema & TopLevel[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.parseWithAttributeSchema & TopLevel[T]]
  
  object pasteHandler {
    
    @scala.inline
    def apply(options: Options & `0`): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
    @scala.inline
    def apply(options: Options & Mode): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def apply(options: Options): js.Array[BlockInstance[StringDictionary[js.Any]]] | String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]] | String]
    
    @JSImport("@wordpress/blocks/api", "pasteHandler")
    @js.native
    val ^ : js.Any = js.native
  }
  
  @scala.inline
  def rawHandler(options: typings.wordpressBlocks.anon.HTML): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("rawHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  
  @scala.inline
  def registerBlockCollection(namespace: String, settings: Icon): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockCollection")(namespace.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerBlockStyle(blockName: String, styleVariation: BlockStyle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockStyle")(blockName.asInstanceOf[js.Any], styleVariation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def registerBlockType[T /* <: Record[String, js.Any] */](name: String, settings: BlockConfiguration[T]): js.UndefOr[Block[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockType")(name.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Block[T]]]
  
  @scala.inline
  def serialize(blocks: js.Array[BlockInstance[StringDictionary[js.Any]]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(blocks.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def setCategories(categories: js.Array[Category]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCategories")(categories.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setDefaultBlockName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setFreeformContentHandlerName(blockName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFreeformContentHandlerName")(blockName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setGroupingBlockName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGroupingBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setUnregisteredTypeHandlerName(blockName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUnregisteredTypeHandlerName")(blockName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def switchToBlockType(blocks: js.Array[BlockInstance[StringDictionary[js.Any]]], name: String): js.Array[BlockInstance[StringDictionary[js.Any]]] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("switchToBlockType")(blocks.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]] | Null]
  @scala.inline
  def switchToBlockType(blocks: BlockInstance[StringDictionary[js.Any]], name: String): js.Array[BlockInstance[StringDictionary[js.Any]]] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("switchToBlockType")(blocks.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]] | Null]
  
  @scala.inline
  def synchronizeBlocksWithTemplate(): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")().asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  @scala.inline
  def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[js.Any]]]): js.Array[BlockInstance[StringDictionary[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  @scala.inline
  def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[js.Any]]], template: TemplateArray): js.Array[BlockInstance[StringDictionary[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  @scala.inline
  def synchronizeBlocksWithTemplate(blocks: Unit, template: TemplateArray): js.Array[BlockInstance[StringDictionary[js.Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]]]
  
  @scala.inline
  def unregisterBlockStyle(blockName: String, styleVariationName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockStyle")(blockName.asInstanceOf[js.Any], styleVariationName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unregisterBlockType(name: String): js.UndefOr[Block[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Block[js.Any]]]
  
  @scala.inline
  def updateCategory(slug: String, category: PartialCategory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCategory")(slug.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
