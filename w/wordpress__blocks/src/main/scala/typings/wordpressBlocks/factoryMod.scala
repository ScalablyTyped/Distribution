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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod {
  
  @JSImport("@wordpress/blocks/api/factory", "cloneBlock")
  @js.native
  def cloneBlock[T /* <: Record[String, _] */](block: BlockInstance[T]): BlockInstance[T] = js.native
  @JSImport("@wordpress/blocks/api/factory", "cloneBlock")
  @js.native
  def cloneBlock[T /* <: Record[String, _] */](
    block: BlockInstance[T],
    mergeAttributes: js.UndefOr[scala.Nothing],
    newInnerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): BlockInstance[T] = js.native
  @JSImport("@wordpress/blocks/api/factory", "cloneBlock")
  @js.native
  def cloneBlock[T /* <: Record[String, _] */](block: BlockInstance[T], mergeAttributes: Partial[T]): BlockInstance[T] = js.native
  @JSImport("@wordpress/blocks/api/factory", "cloneBlock")
  @js.native
  def cloneBlock[T /* <: Record[String, _] */](
    block: BlockInstance[T],
    mergeAttributes: Partial[T],
    newInnerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): BlockInstance[T] = js.native
  
  @JSImport("@wordpress/blocks/api/factory", "createBlock")
  @js.native
  def createBlock[T /* <: Record[String, _] */](name: String): BlockInstance[T] = js.native
  @JSImport("@wordpress/blocks/api/factory", "createBlock")
  @js.native
  def createBlock[T /* <: Record[String, _] */](
    name: String,
    attributes: js.UndefOr[scala.Nothing],
    innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): BlockInstance[T] = js.native
  @JSImport("@wordpress/blocks/api/factory", "createBlock")
  @js.native
  def createBlock[T /* <: Record[String, _] */](name: String, attributes: Partial[T]): BlockInstance[T] = js.native
  @JSImport("@wordpress/blocks/api/factory", "createBlock")
  @js.native
  def createBlock[T /* <: Record[String, _] */](name: String, attributes: Partial[T], innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): BlockInstance[T] = js.native
  
  @JSImport("@wordpress/blocks/api/factory", "findTransform")
  @js.native
  def findTransform[T /* <: Transform[Record[String, _]] */, U /* <: Record[String, _] */](transforms: js.Array[T], predicate: js.Function1[/* transform */ T, Boolean]): Transform[U] | Null = js.native
  
  @JSImport("@wordpress/blocks/api/factory", "getBlockTransforms")
  @js.native
  def getBlockTransforms_from[T /* <: Record[String, _] */](direction: from): js.Array[Transform[T] with BlockName] = js.native
  @JSImport("@wordpress/blocks/api/factory", "getBlockTransforms")
  @js.native
  def getBlockTransforms_from[T /* <: Record[String, _] */](direction: from, blockTypeOrName: String): js.Array[Transform[T] with BlockName] = js.native
  @JSImport("@wordpress/blocks/api/factory", "getBlockTransforms")
  @js.native
  def getBlockTransforms_from[T /* <: Record[String, _] */](direction: from, blockTypeOrName: Block[js.Object]): js.Array[Transform[T] with BlockName] = js.native
  @JSImport("@wordpress/blocks/api/factory", "getBlockTransforms")
  @js.native
  def getBlockTransforms_to[T /* <: Record[String, _] */](direction: to): js.Array[Transform[T] with BlockName] = js.native
  @JSImport("@wordpress/blocks/api/factory", "getBlockTransforms")
  @js.native
  def getBlockTransforms_to[T /* <: Record[String, _] */](direction: to, blockTypeOrName: String): js.Array[Transform[T] with BlockName] = js.native
  @JSImport("@wordpress/blocks/api/factory", "getBlockTransforms")
  @js.native
  def getBlockTransforms_to[T /* <: Record[String, _] */](direction: to, blockTypeOrName: Block[js.Object]): js.Array[Transform[T] with BlockName] = js.native
  
  @JSImport("@wordpress/blocks/api/factory", "getPossibleBlockTransformations")
  @js.native
  def getPossibleBlockTransformations(blocks: js.Array[BlockInstance[StringDictionary[_]]]): js.Array[Block[Record[String, _]]] = js.native
  
  @JSImport("@wordpress/blocks/api/factory", "switchToBlockType")
  @js.native
  def switchToBlockType(blocks: js.Array[BlockInstance[StringDictionary[_]]], name: String): js.Array[BlockInstance[StringDictionary[_]]] | Null = js.native
  @JSImport("@wordpress/blocks/api/factory", "switchToBlockType")
  @js.native
  def switchToBlockType(blocks: BlockInstance[StringDictionary[_]], name: String): js.Array[BlockInstance[StringDictionary[_]]] | Null = js.native
}
