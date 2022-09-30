package typings.wordpressBlocks.anon

import typings.wordpressBlocks.mod.BlockAttributes
import typings.wordpressBlocks.mod.InnerBlockTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesInnerBlocks[Attributes /* <: BlockAttributes */] extends StObject {
  
  var attributes: Attributes
  
  var innerBlocks: js.UndefOr[js.Array[InnerBlockTemplate]] = js.undefined
}
object AttributesInnerBlocks {
  
  inline def apply[Attributes /* <: BlockAttributes */](attributes: Attributes): AttributesInnerBlocks[Attributes] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesInnerBlocks[Attributes]]
  }
  
  extension [Self <: AttributesInnerBlocks[?], Attributes /* <: BlockAttributes */](x: Self & AttributesInnerBlocks[Attributes]) {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setInnerBlocks(value: js.Array[InnerBlockTemplate]): Self = StObject.set(x, "innerBlocks", value.asInstanceOf[js.Any])
    
    inline def setInnerBlocksUndefined: Self = StObject.set(x, "innerBlocks", js.undefined)
    
    inline def setInnerBlocksVarargs(value: InnerBlockTemplate*): Self = StObject.set(x, "innerBlocks", js.Array(value*))
  }
}
