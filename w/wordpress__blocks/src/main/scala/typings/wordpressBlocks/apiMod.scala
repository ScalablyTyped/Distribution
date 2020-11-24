package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ReactChild
import typings.react.mod.global.JSX.Element
import typings.std.ArrayLike
import typings.std.ParentNode
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.anon.Attributetypeboolean
import typings.wordpressBlocks.anon.BlockName
import typings.wordpressBlocks.anon.Icon
import typings.wordpressBlocks.anon.Mode
import typings.wordpressBlocks.anon.PartialCategory
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
import typings.wordpressBlocks.parserMod.Schema.Node
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks/api", JSImport.Namespace)
@js.native
object apiMod extends js.Object {
  
  def cloneBlock[T /* <: Record[String, _] */](block: BlockInstance[T]): BlockInstance[T] = js.native
  def cloneBlock[T /* <: Record[String, _] */](
    block: BlockInstance[T],
    mergeAttributes: js.UndefOr[scala.Nothing],
    newInnerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): BlockInstance[T] = js.native
  def cloneBlock[T /* <: Record[String, _] */](block: BlockInstance[T], mergeAttributes: Partial[T]): BlockInstance[T] = js.native
  def cloneBlock[T /* <: Record[String, _] */](
    block: BlockInstance[T],
    mergeAttributes: Partial[T],
    newInnerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): BlockInstance[T] = js.native
  
  def createBlock[T /* <: Record[String, _] */](name: String): BlockInstance[T] = js.native
  def createBlock[T /* <: Record[String, _] */](
    name: String,
    attributes: js.UndefOr[scala.Nothing],
    innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): BlockInstance[T] = js.native
  def createBlock[T /* <: Record[String, _] */](name: String, attributes: Partial[T]): BlockInstance[T] = js.native
  def createBlock[T /* <: Record[String, _] */](name: String, attributes: Partial[T], innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): BlockInstance[T] = js.native
  
  def doBlocksMatchTemplate(): Boolean = js.native
  def doBlocksMatchTemplate(blocks: js.UndefOr[scala.Nothing], template: TemplateArray): Boolean = js.native
  def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]]): Boolean = js.native
  def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]], template: TemplateArray): Boolean = js.native
  
  def findTransform[T /* <: Transform[Record[String, _]] */, U /* <: Record[String, _] */](transforms: js.Array[T], predicate: js.Function1[/* transform */ T, Boolean]): Transform[U] | Null = js.native
  
  def getBlockAttributes(blockTypeOrName: String, innerHTML: String): Record[String, _] = js.native
  def getBlockAttributes(blockTypeOrName: String, innerHTML: String, attributes: Record[String, _]): Record[String, _] = js.native
  def getBlockAttributes[T /* <: Block[_] */](blockTypeOrName: T, innerHTML: String): js.Any = js.native
  def getBlockAttributes[T /* <: Block[_] */](blockTypeOrName: T, innerHTML: String, attributes: Record[String, _]): js.Any = js.native
  
  def getBlockContent(block: BlockInstance[StringDictionary[_]]): String = js.native
  
  def getBlockDefaultClassName(blockName: String): String = js.native
  
  def getBlockMenuDefaultClassName(blockName: String): String = js.native
  
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
  
  @JSName("getBlockTransforms")
  def getBlockTransforms_from[T /* <: Record[String, _] */](direction: from): js.Array[Transform[T] with BlockName] = js.native
  @JSName("getBlockTransforms")
  def getBlockTransforms_from[T /* <: Record[String, _] */](direction: from, blockTypeOrName: String): js.Array[Transform[T] with BlockName] = js.native
  @JSName("getBlockTransforms")
  def getBlockTransforms_from[T /* <: Record[String, _] */](direction: from, blockTypeOrName: Block[js.Object]): js.Array[Transform[T] with BlockName] = js.native
  @JSName("getBlockTransforms")
  def getBlockTransforms_to[T /* <: Record[String, _] */](direction: to): js.Array[Transform[T] with BlockName] = js.native
  @JSName("getBlockTransforms")
  def getBlockTransforms_to[T /* <: Record[String, _] */](direction: to, blockTypeOrName: String): js.Array[Transform[T] with BlockName] = js.native
  @JSName("getBlockTransforms")
  def getBlockTransforms_to[T /* <: Record[String, _] */](direction: to, blockTypeOrName: Block[js.Object]): js.Array[Transform[T] with BlockName] = js.native
  
  def getBlockType[T](): js.UndefOr[Block[T]] = js.native
  def getBlockType[T](name: String): js.UndefOr[Block[T]] = js.native
  
  def getBlockTypes(): js.Array[Block[_]] = js.native
  
  def getCategories(): js.Array[Category] = js.native
  
  def getChildBlockNames(blockName: String): js.Array[String] = js.native
  
  def getDefaultBlockName(): js.UndefOr[String] = js.native
  
  def getFreeformContentHandlerName(): js.UndefOr[String] = js.native
  
  def getGroupingBlockName(): js.UndefOr[String] = js.native
  
  def getPhrasingContentSchema(): PhrasingContentSchema = js.native
  
  def getPossibleBlockTransformations(blocks: js.Array[BlockInstance[StringDictionary[_]]]): js.Array[Block[Record[String, _]]] = js.native
  
  def getSaveContent[T](blockTypeOrName: String, attributes: T): String = js.native
  def getSaveContent[T](blockTypeOrName: String, attributes: T, innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): String = js.native
  def getSaveContent[T](blockTypeOrName: Block[T], attributes: T): String = js.native
  def getSaveContent[T](
    blockTypeOrName: Block[T],
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): String = js.native
  
  def getSaveElement[T](blockTypeOrName: String, attributes: T): ReactChild = js.native
  def getSaveElement[T](blockTypeOrName: String, attributes: T, innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): ReactChild = js.native
  def getSaveElement[T](blockTypeOrName: Block[T], attributes: T): ReactChild = js.native
  def getSaveElement[T](
    blockTypeOrName: Block[T],
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): ReactChild = js.native
  
  def getUnregisteredTypeHandlerName(): js.UndefOr[String] = js.native
  
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
  
  def isReusableBlock(blockOrType: Block[_]): Boolean = js.native
  def isReusableBlock(blockOrType: BlockInstance[StringDictionary[_]]): Boolean = js.native
  
  def isUnmodifiedDefaultBlock(block: BlockInstance[StringDictionary[_]]): Boolean = js.native
  
  def isValidBlockContent[T](blockTypeOrName: String, attributes: T, originalBlockContent: String): Boolean = js.native
  def isValidBlockContent[T](blockTypeOrName: Block[T], attributes: T, originalBlockContent: String): Boolean = js.native
  
  def isValidIcon(icon: js.Any): Boolean = js.native
  
  def normalizeIconObject(): BlockIconNormalized = js.native
  def normalizeIconObject(icon: BlockIcon): BlockIconNormalized = js.native
  
  def parse(content: String): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  def parseWithAttributeSchema(innerHTML: String, schema: Attributetypeboolean): js.UndefOr[Boolean] = js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Attribute): js.UndefOr[String] = js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Children): js.Array[ReactChild] = js.native
  def parseWithAttributeSchema(innerHTML: String, schema: HTML): js.UndefOr[String] = js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Node): Element | Null = js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Tag): js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 173 */ js.Any
  ] = js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Text): js.UndefOr[String] = js.native
  def parseWithAttributeSchema[T /* <: Record[String, Source[_]] */](innerHTML: String, schema: Query[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.parseWithAttributeSchema with TopLevel[T] = js.native
  
  def rawHandler(options: typings.wordpressBlocks.anon.HTML): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  def registerBlockCollection(namespace: String, settings: Icon): Unit = js.native
  
  def registerBlockStyle(blockName: String, styleVariation: BlockStyle): Unit = js.native
  
  def registerBlockType[T /* <: Record[String, _] */](name: String, settings: BlockConfiguration[T]): js.UndefOr[Block[T]] = js.native
  
  def serialize(blocks: js.Array[BlockInstance[StringDictionary[_]]]): String = js.native
  
  def setCategories(categories: js.Array[Category]): Unit = js.native
  
  def setDefaultBlockName(name: String): Unit = js.native
  
  def setFreeformContentHandlerName(blockName: String): Unit = js.native
  
  def setGroupingBlockName(name: String): Unit = js.native
  
  def setUnregisteredTypeHandlerName(blockName: String): Unit = js.native
  
  def switchToBlockType(blocks: js.Array[BlockInstance[StringDictionary[_]]], name: String): js.Array[BlockInstance[StringDictionary[_]]] | Null = js.native
  def switchToBlockType(blocks: BlockInstance[StringDictionary[_]], name: String): js.Array[BlockInstance[StringDictionary[_]]] | Null = js.native
  
  def synchronizeBlocksWithTemplate(): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  def synchronizeBlocksWithTemplate(blocks: js.UndefOr[scala.Nothing], template: TemplateArray): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]]): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[_]]], template: TemplateArray): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  def unregisterBlockStyle(blockName: String, styleVariationName: String): Unit = js.native
  
  def unregisterBlockType(name: String): js.UndefOr[Block[_]] = js.native
  
  def updateCategory(slug: String, category: PartialCategory): Unit = js.native
  
  @js.native
  object children extends js.Object {
    
    /**
      * Given two or more block nodes, returns a new block node representing a
      * concatenation of its values.
      *
      * @param blockNodes - Block nodes to concatenate.
      */
    def concat(blockNodes: ReactChild*): js.Array[ReactChild] = js.native
    
    /**
      * Given an iterable set of DOM nodes, returns equivalent block children.
      * Ignores any non-element/text nodes included in set.
      *
      * @param domNodes - list of DOM nodes to convert.
      */
    def fromDOM(domNodes: ArrayLike[typings.std.Node]): js.Array[ReactChild] = js.native
    
    /**
      * Given block children, returns an array of block nodes.
      *
      * @param children - Block children object to convert.
      */
    def getChildrenArray(children: js.Array[ReactChild]): js.Array[ReactChild] = js.native
    
    /**
      * Given a selector, returns an hpq matcher generating a WPBlockChildren value
      * matching the selector result.
      *
      * @param selector - DOM selector.
      */
    def matcher(selector: String): js.Function1[/* domNode */ typings.std.Node with ParentNode, js.Array[ReactChild]] = js.native
    
    /**
      * Given a block node, returns its HTML string representation.
      *
      * @param children - Block node(s) to convert to string.
      */
    def toHTML(children: js.Array[ReactChild]): String = js.native
  }
  
  /**
    * Object of utility functions used in managing block attribute values of
    * source `node`.
    *
    * @see https://github.com/WordPress/gutenberg/pull/10439
    *
    * @deprecated since 4.0. The `node` source should not be used, and can be
    *             replaced by the `html` source.
    */
  @js.native
  object node extends js.Object {
    
    /**
      * Given a DOM Element or Text node, returns an equivalent block node. Throws
      * if passed any node type other than element or text.
      *
      * @throws {TypeError} If non-element/text node is passed.
      *
      * @param domNode - DOM node to convert.
      */
    def fromDOM(domNode: typings.std.Node): Element = js.native
    
    /**
      * Given a single node and a node type (e.g. `'br'`), returns `true` if the node
      * corresponds to that type, `false` otherwise.
      *
      * @param node - Block node to test
      * @param type - Node to type to test against.
      */
    @JSName("isNodeOfType")
    def isNodeOfType_type(
      node: Element,
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any
    ): Boolean = js.native
    
    /**
      * Given a selector, returns an hpq matcher generating a WPBlockNode value
      * matching the selector result.
      */
    val matcher: js.Function1[
        /* selector */ String, 
        js.Function1[/* domNode */ typings.std.Node with ParentNode, js.Array[ReactChild]]
      ] = js.native
    
    /**
      * Given a block node, returns its HTML string representation.
      *
      * @param node - Block node to convert to string.
      */
    def toHTML(node: ReactChild): String = js.native
  }
  
  @js.native
  object pasteHandler extends js.Object {
    
    def apply(options: Options with Mode): String = js.native
  }
}
