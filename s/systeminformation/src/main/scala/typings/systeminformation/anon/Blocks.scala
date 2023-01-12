package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blocks extends StObject {
  
  var blocks: Double
  
  var bytes: Double
}
object Blocks {
  
  inline def apply(blocks: Double, bytes: Double): Blocks = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blocks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blocks] (val x: Self) extends AnyVal {
    
    inline def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
  }
}
