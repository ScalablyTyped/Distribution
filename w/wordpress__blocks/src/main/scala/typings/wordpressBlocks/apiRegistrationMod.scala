package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.anon.Icon
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

object apiRegistrationMod {
  
  @JSImport("@wordpress/blocks/api/registration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def getBlockVariations(blockName: String): js.UndefOr[js.Array[BlockVariation[BlockAttributes]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockVariations")(blockName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[BlockVariation[BlockAttributes]]]]
  inline def getBlockVariations(blockName: String, scope: BlockVariationScope): js.UndefOr[js.Array[BlockVariation[BlockAttributes]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockVariations")(blockName.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[BlockVariation[BlockAttributes]]]]
  
  inline def getChildBlockNames(blockName: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildBlockNames")(blockName.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getDefaultBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultBlockName")().asInstanceOf[js.UndefOr[String]]
  
  inline def getFreeformContentHandlerName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFreeformContentHandlerName")().asInstanceOf[js.UndefOr[String]]
  
  inline def getGroupingBlockName(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGroupingBlockName")().asInstanceOf[js.UndefOr[String]]
  
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
  
  inline def registerBlockCollection(namespace: String, settings: Icon): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockCollection")(namespace.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerBlockStyle(blockName: String, styleVariation: BlockStyle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockStyle")(blockName.asInstanceOf[js.Any], styleVariation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerBlockType[TAttributes /* <: Record[String, Any] */](metadata: BlockConfiguration[TAttributes]): js.UndefOr[Block[TAttributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockType")(metadata.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Block[TAttributes]]]
  inline def registerBlockType[TAttributes /* <: Record[String, Any] */](metadata: BlockConfiguration[TAttributes], settings: Partial[BlockConfiguration[TAttributes]]): js.UndefOr[Block[TAttributes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockType")(metadata.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Block[TAttributes]]]
  inline def registerBlockType[TAttributes /* <: Record[String, Any] */](name: String, settings: BlockConfiguration[TAttributes]): js.UndefOr[Block[TAttributes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockType")(name.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Block[TAttributes]]]
  
  inline def registerBlockVariation(blockName: String, variation: js.Array[BlockVariation[BlockAttributes]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockVariation")(blockName.asInstanceOf[js.Any], variation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerBlockVariation(blockName: String, variation: BlockVariation[BlockAttributes]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerBlockVariation")(blockName.asInstanceOf[js.Any], variation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDefaultBlockName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setFreeformContentHandlerName(blockName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFreeformContentHandlerName")(blockName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setGroupingBlockName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGroupingBlockName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUnregisteredTypeHandlerName(blockName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUnregisteredTypeHandlerName")(blockName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unregisterBlockStyle(blockName: String, styleVariationName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockStyle")(blockName.asInstanceOf[js.Any], styleVariationName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unregisterBlockType(name: String): js.UndefOr[Block[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Block[Any]]]
  
  inline def unregisterBlockVariation(blockName: String, variationName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockVariation")(blockName.asInstanceOf[js.Any], variationName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unregisterBlockVariation(blockName: String, variationName: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterBlockVariation")(blockName.asInstanceOf[js.Any], variationName.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
