package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactChild
import typings.wordpressBlocks.mod.Block
import typings.wordpressBlocks.mod.BlockInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks/api/serializer", JSImport.Namespace)
@js.native
object serializerMod extends js.Object {
  
  def getBlockContent(block: BlockInstance[StringDictionary[_]]): String = js.native
  
  def getBlockDefaultClassName(blockName: String): String = js.native
  
  def getBlockMenuDefaultClassName(blockName: String): String = js.native
  
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
  
  def serialize(blocks: js.Array[BlockInstance[StringDictionary[_]]]): String = js.native
}
