package typings.wordpressBlocks.anon

import typings.wordpressBlocks.BlockExampleInnerBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerBlocks extends StObject {
  
  var innerBlocks: js.UndefOr[js.Array[BlockExampleInnerBlock]] = js.undefined
}
object InnerBlocks {
  
  inline def apply(): InnerBlocks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InnerBlocks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InnerBlocks] (val x: Self) extends AnyVal {
    
    inline def setInnerBlocks(value: js.Array[BlockExampleInnerBlock]): Self = StObject.set(x, "innerBlocks", value.asInstanceOf[js.Any])
    
    inline def setInnerBlocksUndefined: Self = StObject.set(x, "innerBlocks", js.undefined)
    
    inline def setInnerBlocksVarargs(value: BlockExampleInnerBlock*): Self = StObject.set(x, "innerBlocks", js.Array(value*))
  }
}
