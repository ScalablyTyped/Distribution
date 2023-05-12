package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
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
import typings.wordpressBlocks.apiCategoriesMod.Category
import typings.wordpressBlocks.apiParserMod.Schema.Attribute
import typings.wordpressBlocks.apiParserMod.Schema.Children
import typings.wordpressBlocks.apiParserMod.Schema.HTML
import typings.wordpressBlocks.apiParserMod.Schema.Query
import typings.wordpressBlocks.apiParserMod.Schema.Tag
import typings.wordpressBlocks.apiParserMod.Schema.Text
import typings.wordpressBlocks.apiParserMod.Source
import typings.wordpressBlocks.apiRawHandlingMod.PhrasingContentSchema
import typings.wordpressBlocks.apiRawHandlingMod.pasteHandler.Options
import typings.wordpressBlocks.apiTemplatesMod.TemplateArray
import typings.wordpressBlocks.wordpressBlocksStrings.align
import typings.wordpressBlocks.wordpressBlocksStrings.alignWide
import typings.wordpressBlocks.wordpressBlocksStrings.anchor
import typings.wordpressBlocks.wordpressBlocksStrings.className
import typings.wordpressBlocks.wordpressBlocksStrings.color
import typings.wordpressBlocks.wordpressBlocksStrings.customClassName
import typings.wordpressBlocks.wordpressBlocksStrings.from
import typings.wordpressBlocks.wordpressBlocksStrings.html
import typings.wordpressBlocks.wordpressBlocksStrings.inserter
import typings.wordpressBlocks.wordpressBlocksStrings.lock
import typings.wordpressBlocks.wordpressBlocksStrings.multiple
import typings.wordpressBlocks.wordpressBlocksStrings.reusable
import typings.wordpressBlocks.wordpressBlocksStrings.spacing
import typings.wordpressBlocks.wordpressBlocksStrings.to
import typings.wordpressBlocks.wordpressBlocksStrings.typography
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
      *
      * @deprecated since 11.17.0. Use the html source instead.
      */
    inline def concat(blockNodes: ReactChild*): js.Array[ReactChild] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(blockNodes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[ReactChild]]
    
    /**
      * Given an iterable set of DOM nodes, returns equivalent block children.
      * Ignores any non-element/text nodes included in set.
      *
      * @param domNodes - list of DOM nodes to convert.
      *
      * @deprecated since 11.17.0. Use the html source instead.
      */
    inline def fromDOM(domNodes: ArrayLike[Node]): js.Array[ReactChild] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDOM")(domNodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactChild]]
    
    /**
      * Given block children, returns an array of block nodes.
      *
      * @param children - Block children object to convert.
      *
      * @deprecated since 11.17.0. Use the html source instead.
      */
    inline def getChildrenArray(children: js.Array[ReactChild]): js.Array[ReactChild] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildrenArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactChild]]
    
    /**
      * Given a selector, returns an hpq matcher generating a WPBlockChildren value
      * matching the selector result.
      *
      * @param selector - DOM selector.
      *
      * @deprecated since 11.17.0. Use the html source instead.
      */
    inline def matcher(selector: String): js.Function1[/* domNode */ Node & ParentNode, js.Array[ReactChild]] = ^.asInstanceOf[js.Dynamic].applyDynamic("matcher")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* domNode */ Node & ParentNode, js.Array[ReactChild]]]
    
    /**
      * Given a block node, returns its HTML string representation.
      *
      * @param children - Block node(s) to convert to string.
      *
      * @deprecated since 11.17.0. Use the html source instead.
      */
    inline def toHTML(children: js.Array[ReactChild]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(children.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def cloneBlock[T /* <: Record[String, Any] */](block: BlockInstance[T]): BlockInstance[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any]).asInstanceOf[BlockInstance[T]]
  inline def cloneBlock[T /* <: Record[String, Any] */](
    block: BlockInstance[T],
    mergeAttributes: Unit,
    newInnerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]
  ): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any], newInnerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  inline def cloneBlock[T /* <: Record[String, Any] */](block: BlockInstance[T], mergeAttributes: Partial[T]): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  inline def cloneBlock[T /* <: Record[String, Any] */](
    block: BlockInstance[T],
    mergeAttributes: Partial[T],
    newInnerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]
  ): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any], newInnerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  
  inline def createBlock[T /* <: Record[String, Any] */](name: String): BlockInstance[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any]).asInstanceOf[BlockInstance[T]]
  inline def createBlock[T /* <: Record[String, Any] */](name: String, attributes: Unit, innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  inline def createBlock[T /* <: Record[String, Any] */](name: String, attributes: Partial[T]): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  inline def createBlock[T /* <: Record[String, Any] */](name: String, attributes: Partial[T], innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  
  inline def doBlocksMatchTemplate(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")().asInstanceOf[Boolean]
  inline def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[Any]]], template: TemplateArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def doBlocksMatchTemplate(blocks: Unit, template: TemplateArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def findTransform[T /* <: Transform[Record[String, Any]] */, U /* <: Record[String, Any] */](transforms: js.Array[T], predicate: js.Function1[/* transform */ T, Boolean]): Transform[U] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findTransform")(transforms.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Transform[U] | Null]
  
  inline def getBlockAttributes(blockTypeOrName: String, innerHTML: String): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def getBlockAttributes(blockTypeOrName: String, innerHTML: String, attributes: Record[String, Any]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def getBlockAttributes[T /* <: Block[Any] */](blockTypeOrName: T, innerHTML: String): /* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/blocks.Block<infer U> ? U : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/blocks.Block<infer U> ? U : never */ js.Any]
  inline def getBlockAttributes[T /* <: Block[Any] */](blockTypeOrName: T, innerHTML: String, attributes: Record[String, Any]): /* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/blocks.Block<infer U> ? U : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockAttributes")(blockTypeOrName.asInstanceOf[js.Any], innerHTML.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends @wordpress/blocks.Block<infer U> ? U : never */ js.Any]
  
  inline def getBlockContent(block: BlockInstance[StringDictionary[Any]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockContent")(block.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBlockDefaultClassName(blockName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockDefaultClassName")(blockName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBlockMenuDefaultClassName(blockName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockMenuDefaultClassName")(blockName.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  
  inline def getBlockTransforms[T /* <: Record[String, Any] */](direction: to | from): js.Array[Transform[T] & BlockName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any]).asInstanceOf[js.Array[Transform[T] & BlockName]]
  inline def getBlockTransforms[T /* <: Record[String, Any] */](direction: to | from, blockTypeOrName: String): js.Array[Transform[T] & BlockName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transform[T] & BlockName]]
  inline def getBlockTransforms[T /* <: Record[String, Any] */](direction: to | from, blockTypeOrName: Block[js.Object]): js.Array[Transform[T] & BlockName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transform[T] & BlockName]]
  
  inline def getBlockType[T /* <: Record[String, Any] */](): js.UndefOr[Block[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockType")().asInstanceOf[js.UndefOr[Block[T]]]
  inline def getBlockType[T /* <: Record[String, Any] */](name: String): js.UndefOr[Block[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Block[T]]]
  
  inline def getBlockTypes(): js.Array[Block[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTypes")().asInstanceOf[js.Array[Block[Any]]]
  
  inline def getBlockVariations(blockName: String): js.UndefOr[js.Array[BlockVariation[BlockAttributes]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockVariations")(blockName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[BlockVariation[BlockAttributes]]]]
  inline def getBlockVariations(blockName: String, scope: BlockVariationScope): js.UndefOr[js.Array[BlockVariation[BlockAttributes]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockVariations")(blockName.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[BlockVariation[BlockAttributes]]]]
  
  inline def getCategories(): js.Array[Category] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCategories")().asInstanceOf[js.Array[Category]]
  
  inline def getChildBlockNames(blockName: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildBlockNames")(blockName.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getDefaultBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultBlockName")().asInstanceOf[js.UndefOr[String]]
  
  inline def getFreeformContentHandlerName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFreeformContentHandlerName")().asInstanceOf[js.UndefOr[String]]
  
  inline def getGroupingBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroupingBlockName")().asInstanceOf[js.UndefOr[String]]
  
  inline def getPhrasingContentSchema(): PhrasingContentSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("getPhrasingContentSchema")().asInstanceOf[PhrasingContentSchema]
  
  inline def getPossibleBlockTransformations(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): js.Array[Block[Record[String, Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPossibleBlockTransformations")(blocks.asInstanceOf[js.Any]).asInstanceOf[js.Array[Block[Record[String, Any]]]]
  
  inline def getSaveContent[T /* <: Record[String, Any] */](blockTypeOrName: String, attributes: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSaveContent[T /* <: Record[String, Any] */](
    blockTypeOrName: String,
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSaveContent[T /* <: Record[String, Any] */](blockTypeOrName: Block[T], attributes: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSaveContent[T /* <: Record[String, Any] */](
    blockTypeOrName: Block[T],
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSaveElement[T /* <: Record[String, Any] */](blockTypeOrName: String, attributes: T): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
  inline def getSaveElement[T /* <: Record[String, Any] */](
    blockTypeOrName: String,
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]
  ): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
  inline def getSaveElement[T /* <: Record[String, Any] */](blockTypeOrName: Block[T], attributes: T): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
  inline def getSaveElement[T /* <: Record[String, Any] */](
    blockTypeOrName: Block[T],
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[Any]]]
  ): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
  
  inline def getUnregisteredTypeHandlerName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnregisteredTypeHandlerName")().asInstanceOf[js.UndefOr[String]]
  
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
  
  inline def isReusableBlock(blockOrType: Block[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReusableBlock")(blockOrType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isReusableBlock(blockOrType: BlockInstance[StringDictionary[Any]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReusableBlock")(blockOrType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUnmodifiedDefaultBlock(block: BlockInstance[StringDictionary[Any]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnmodifiedDefaultBlock")(block.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidBlockContent[T /* <: Record[String, Any] */](blockTypeOrName: String, attributes: T, originalBlockContent: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidBlockContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], originalBlockContent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidBlockContent[T /* <: Record[String, Any] */](blockTypeOrName: Block[T], attributes: T, originalBlockContent: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidBlockContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], originalBlockContent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isValidIcon(icon: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidIcon")(icon.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
      *
      * @deprecated since 11.17.0. Use the html source instead.
      */
    inline def fromDOM(domNode: Node): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDOM")(domNode.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /**
      * Given a single node and a node type (e.g. `'br'`), returns `true` if the node
      * corresponds to that type, `false` otherwise.
      *
      * @param node - Block node to test
      * @param type - Node to type to test against.
      *
      * @deprecated since 11.17.0. Use the html source instead.
      */
    inline def isNodeOfType_type(
      node: Element,
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNodeOfType")(node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Given a selector, returns an hpq matcher generating a WPBlockChildren value
      * matching the selector result.
      *
      * @param selector - DOM selector.
      *
      * @deprecated since 11.17.0. Use the html source instead.
      */
    /* was `typeof children.matcher` */
    inline def matcher(selector: String): js.Function1[/* domNode */ Node & ParentNode, js.Array[ReactChild]] = ^.asInstanceOf[js.Dynamic].applyDynamic("matcher")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* domNode */ Node & ParentNode, js.Array[ReactChild]]]
    
    /**
      * Given a block node, returns its HTML string representation.
      *
      * @param node - Block node to convert to string.
      *
      * @deprecated since 11.17.0. Use the html source instead.
      */
    inline def toHTML(node: ReactChild): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def normalizeIconObject(): BlockIconNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIconObject")().asInstanceOf[BlockIconNormalized]
  inline def normalizeIconObject(icon: BlockIcon): BlockIconNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIconObject")(icon.asInstanceOf[js.Any]).asInstanceOf[BlockIconNormalized]
  
  inline def parse(content: String): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(content.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  
  inline def parseWithAttributeSchema(innerHTML: String, schema: Attributetypeboolean): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  inline def parseWithAttributeSchema(innerHTML: String, schema: Attribute): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def parseWithAttributeSchema(innerHTML: String, schema: Children): js.Array[ReactChild] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactChild]]
  inline def parseWithAttributeSchema(innerHTML: String, schema: HTML): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def parseWithAttributeSchema(innerHTML: String, schema: typings.wordpressBlocks.apiParserMod.Schema.Node): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def parseWithAttributeSchema(innerHTML: String, schema: Tag): js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 171, starting with typings.wordpressBlocks.wordpressBlocksStrings.a, typings.wordpressBlocks.wordpressBlocksStrings.abbr, typings.wordpressBlocks.wordpressBlocksStrings.address */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 171, starting with typings.wordpressBlocks.wordpressBlocksStrings.a, typings.wordpressBlocks.wordpressBlocksStrings.abbr, typings.wordpressBlocks.wordpressBlocksStrings.address */ Any
  ]]
  inline def parseWithAttributeSchema(innerHTML: String, schema: Text): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def parseWithAttributeSchema[T /* <: Record[String, Source[Any]] */](innerHTML: String, schema: Query[T]): /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseWithAttributeSchema")(innerHTML.asInstanceOf[js.Any], schema.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>} */ js.Any]
  
  inline def pasteHandler(options: Options & `0`): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pasteHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  inline def pasteHandler(options: Options & Mode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pasteHandler")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def pasteHandler(options: Options): js.Array[BlockInstance[StringDictionary[Any]]] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("pasteHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]] | String]
  
  inline def rawHandler(options: typings.wordpressBlocks.anon.HTML): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("rawHandler")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  
  inline def registerBlockCollection(namespace: String, settings: Icon): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockCollection")(namespace.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerBlockStyle(blockName: String, styleVariation: BlockStyle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockStyle")(blockName.asInstanceOf[js.Any], styleVariation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerBlockType[TAttributes /* <: Record[String, Any] */](metadata: BlockConfiguration[TAttributes]): js.UndefOr[Block[TAttributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockType")(metadata.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Block[TAttributes]]]
  inline def registerBlockType[TAttributes /* <: Record[String, Any] */](metadata: BlockConfiguration[TAttributes], settings: Partial[BlockConfiguration[TAttributes]]): js.UndefOr[Block[TAttributes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockType")(metadata.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Block[TAttributes]]]
  inline def registerBlockType[TAttributes /* <: Record[String, Any] */](name: String, settings: BlockConfiguration[TAttributes]): js.UndefOr[Block[TAttributes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockType")(name.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Block[TAttributes]]]
  
  inline def registerBlockVariation(blockName: String, variation: js.Array[BlockVariation[BlockAttributes]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockVariation")(blockName.asInstanceOf[js.Any], variation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerBlockVariation(blockName: String, variation: BlockVariation[BlockAttributes]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockVariation")(blockName.asInstanceOf[js.Any], variation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def serialize(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(blocks.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setCategories(categories: js.Array[Category]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCategories")(categories.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setDefaultBlockName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setFreeformContentHandlerName(blockName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFreeformContentHandlerName")(blockName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setGroupingBlockName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGroupingBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUnregisteredTypeHandlerName(blockName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUnregisteredTypeHandlerName")(blockName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def switchToBlockType(blocks: js.Array[BlockInstance[StringDictionary[Any]]], name: String): js.Array[BlockInstance[StringDictionary[Any]]] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("switchToBlockType")(blocks.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]] | Null]
  inline def switchToBlockType(blocks: BlockInstance[StringDictionary[Any]], name: String): js.Array[BlockInstance[StringDictionary[Any]]] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("switchToBlockType")(blocks.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]] | Null]
  
  inline def synchronizeBlocksWithTemplate(): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")().asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  inline def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  inline def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[Any]]], template: TemplateArray): js.Array[BlockInstance[StringDictionary[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  inline def synchronizeBlocksWithTemplate(blocks: Unit, template: TemplateArray): js.Array[BlockInstance[StringDictionary[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  
  inline def unregisterBlockStyle(blockName: String, styleVariationName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockStyle")(blockName.asInstanceOf[js.Any], styleVariationName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregisterBlockType(name: String): js.UndefOr[Block[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Block[Any]]]
  
  inline def unregisterBlockVariation(blockName: String, variationName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockVariation")(blockName.asInstanceOf[js.Any], variationName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unregisterBlockVariation(blockName: String, variationName: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockVariation")(blockName.asInstanceOf[js.Any], variationName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateCategory(slug: String, category: PartialCategory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCategory")(slug.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
