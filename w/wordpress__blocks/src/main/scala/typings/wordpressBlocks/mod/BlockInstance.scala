package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockInstance[T /* <: Record[String, js.Any] */] extends StObject {
  
  /**
    * Attributes for the block.
    */
  val attributes: T
  
  /**
    * Unique ID registered to the block.
    */
  val clientId: String
  
  /**
    * Array of inner blocks, if the block has any.
    */
  val innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]]
  
  /**
    * Indicates whether or not the block is valid.
    */
  val isValid: Boolean
  
  /**
    * The block's registered name.
    */
  val name: String
  
  /**
    * The parsed HTML content of the block.
    */
  val originalContent: js.UndefOr[String] = js.undefined
}
object BlockInstance {
  
  @scala.inline
  def apply[T /* <: Record[String, js.Any] */](
    attributes: T,
    clientId: String,
    innerBlocks: js.Array[BlockInstance[StringDictionary[js.Any]]],
    isValid: Boolean,
    name: String
  ): BlockInstance[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], innerBlocks = innerBlocks.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockInstance[T]]
  }
  
  @scala.inline
  implicit class BlockInstanceMutableBuilder[Self <: BlockInstance[?], T /* <: Record[String, js.Any] */] (val x: Self & BlockInstance[T]) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: T): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerBlocks(value: js.Array[BlockInstance[StringDictionary[js.Any]]]): Self = StObject.set(x, "innerBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerBlocksVarargs(value: BlockInstance[StringDictionary[js.Any]]*): Self = StObject.set(x, "innerBlocks", js.Array(value :_*))
    
    @scala.inline
    def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalContent(value: String): Self = StObject.set(x, "originalContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalContentUndefined: Self = StObject.set(x, "originalContent", js.undefined)
  }
}
