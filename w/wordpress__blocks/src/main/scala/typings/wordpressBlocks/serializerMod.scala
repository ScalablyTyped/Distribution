package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactChild
import typings.wordpressBlocks.mod.Block
import typings.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializerMod {
  
  @JSImport("@wordpress/blocks/api/serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBlockContent(block: BlockInstance[StringDictionary[js.Any]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockContent")(block.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBlockDefaultClassName(blockName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockDefaultClassName")(blockName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBlockMenuDefaultClassName(blockName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBlockMenuDefaultClassName")(blockName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSaveContent[T](blockTypeOrName: String, attributes: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSaveContent[T](
    blockTypeOrName: String,
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSaveContent[T](blockTypeOrName: Block[T], attributes: T): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getSaveContent[T](
    blockTypeOrName: Block[T],
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSaveElement[T](blockTypeOrName: String, attributes: T): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
  inline def getSaveElement[T](
    blockTypeOrName: String,
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  ): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
  inline def getSaveElement[T](blockTypeOrName: Block[T], attributes: T): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
  inline def getSaveElement[T](
    blockTypeOrName: Block[T],
    attributes: T,
    innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  ): ReactChild = (^.asInstanceOf[js.Dynamic].applyDynamic("getSaveElement")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], innerBlocks.asInstanceOf[js.Any])).asInstanceOf[ReactChild]
  
  inline def serialize(blocks: js.Array[BlockInstance[StringDictionary[js.Any]]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(blocks.asInstanceOf[js.Any]).asInstanceOf[String]
}
