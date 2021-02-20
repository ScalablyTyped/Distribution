package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactChild
import typings.wordpressBlocks.mod.Block
import typings.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializerMod {
  
  @JSImport("@wordpress/blocks/api/serializer", "getBlockContent")
  @js.native
  def getBlockContent(block: BlockInstance[StringDictionary[_]]): String = js.native
  
  @JSImport("@wordpress/blocks/api/serializer", "getBlockDefaultClassName")
  @js.native
  def getBlockDefaultClassName(blockName: String): String = js.native
  
  @JSImport("@wordpress/blocks/api/serializer", "getBlockMenuDefaultClassName")
  @js.native
  def getBlockMenuDefaultClassName(blockName: String): String = js.native
  
  @JSImport("@wordpress/blocks/api/serializer", "getSaveContent")
  @js.native
  def getSaveContent[T](blockTypeOrName: String, attributes: T): String = js.native
  @JSImport("@wordpress/blocks/api/serializer", "getSaveContent")
  @js.native
  def getSaveContent[T](blockTypeOrName: String, attributes: T, innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): String = js.native
  @JSImport("@wordpress/blocks/api/serializer", "getSaveContent")
  @js.native
  def getSaveContent[T](blockTypeOrName: Block[T], attributes: T): String = js.native
  @JSImport("@wordpress/blocks/api/serializer", "getSaveContent")
  @js.native
  def getSaveContent[T](
    blockTypeOrName: Block[T],
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): String = js.native
  
  @JSImport("@wordpress/blocks/api/serializer", "getSaveElement")
  @js.native
  def getSaveElement[T](blockTypeOrName: String, attributes: T): ReactChild = js.native
  @JSImport("@wordpress/blocks/api/serializer", "getSaveElement")
  @js.native
  def getSaveElement[T](blockTypeOrName: String, attributes: T, innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): ReactChild = js.native
  @JSImport("@wordpress/blocks/api/serializer", "getSaveElement")
  @js.native
  def getSaveElement[T](blockTypeOrName: Block[T], attributes: T): ReactChild = js.native
  @JSImport("@wordpress/blocks/api/serializer", "getSaveElement")
  @js.native
  def getSaveElement[T](
    blockTypeOrName: Block[T],
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]
  ): ReactChild = js.native
  
  @JSImport("@wordpress/blocks/api/serializer", "serialize")
  @js.native
  def serialize(blocks: js.Array[BlockInstance[StringDictionary[_]]]): String = js.native
}
