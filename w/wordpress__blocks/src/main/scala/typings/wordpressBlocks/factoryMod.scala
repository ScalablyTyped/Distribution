package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.anon.BlockName
import typings.wordpressBlocks.mod.Block
import typings.wordpressBlocks.mod.BlockInstance
import typings.wordpressBlocks.mod.Transform
import typings.wordpressBlocks.wordpressBlocksStrings.from
import typings.wordpressBlocks.wordpressBlocksStrings.to
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@wordpress/blocks/api/factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneBlock[T /* <: Record[String, js.Any] */](block: BlockInstance[T]): BlockInstance[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any]).asInstanceOf[BlockInstance[T]]
  inline def cloneBlock[T /* <: Record[String, js.Any] */](
    block: BlockInstance[T],
    mergeAttributes: Unit,
    newInnerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  ): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any], newInnerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  inline def cloneBlock[T /* <: Record[String, js.Any] */](block: BlockInstance[T], mergeAttributes: Partial[T]): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  inline def cloneBlock[T /* <: Record[String, js.Any] */](
    block: BlockInstance[T],
    mergeAttributes: Partial[T],
    newInnerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  ): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneBlock")(block.asInstanceOf[js.Any], mergeAttributes.asInstanceOf[js.Any], newInnerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  
  inline def createBlock[T /* <: Record[String, js.Any] */](name: String): BlockInstance[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any]).asInstanceOf[BlockInstance[T]]
  inline def createBlock[T /* <: Record[String, js.Any] */](name: String, attributes: Unit, innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  inline def createBlock[T /* <: Record[String, js.Any] */](name: String, attributes: Partial[T]): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  inline def createBlock[T /* <: Record[String, js.Any] */](
    name: String,
    attributes: Partial[T],
    innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  ): BlockInstance[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createBlock")(name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[BlockInstance[T]]
  
  inline def findTransform[T /* <: Transform[Record[String, js.Any]] */, U /* <: Record[String, js.Any] */](transforms: js.Array[T], predicate: js.Function1[/* transform */ T, Boolean]): Transform[U] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findTransform")(transforms.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Transform[U] | Null]
  
  inline def getBlockTransforms_from[T /* <: Record[String, js.Any] */](direction: from): js.Array[Transform[T] & BlockName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any]).asInstanceOf[js.Array[Transform[T] & BlockName]]
  inline def getBlockTransforms_from[T /* <: Record[String, js.Any] */](direction: from, blockTypeOrName: String): js.Array[Transform[T] & BlockName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transform[T] & BlockName]]
  inline def getBlockTransforms_from[T /* <: Record[String, js.Any] */](direction: from, blockTypeOrName: Block[js.Object]): js.Array[Transform[T] & BlockName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transform[T] & BlockName]]
  
  inline def getBlockTransforms_to[T /* <: Record[String, js.Any] */](direction: to): js.Array[Transform[T] & BlockName] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any]).asInstanceOf[js.Array[Transform[T] & BlockName]]
  inline def getBlockTransforms_to[T /* <: Record[String, js.Any] */](direction: to, blockTypeOrName: String): js.Array[Transform[T] & BlockName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transform[T] & BlockName]]
  inline def getBlockTransforms_to[T /* <: Record[String, js.Any] */](direction: to, blockTypeOrName: Block[js.Object]): js.Array[Transform[T] & BlockName] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBlockTransforms")(direction.asInstanceOf[js.Any], blockTypeOrName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Transform[T] & BlockName]]
  
  inline def getPossibleBlockTransformations(blocks: js.Array[BlockInstance[StringDictionary[js.Any]]]): js.Array[Block[Record[String, js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPossibleBlockTransformations")(blocks.asInstanceOf[js.Any]).asInstanceOf[js.Array[Block[Record[String, js.Any]]]]
  
  inline def switchToBlockType(blocks: js.Array[BlockInstance[StringDictionary[js.Any]]], name: String): js.Array[BlockInstance[StringDictionary[js.Any]]] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("switchToBlockType")(blocks.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]] | Null]
  inline def switchToBlockType(blocks: BlockInstance[StringDictionary[js.Any]], name: String): js.Array[BlockInstance[StringDictionary[js.Any]]] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("switchToBlockType")(blocks.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[js.Any]]] | Null]
}
