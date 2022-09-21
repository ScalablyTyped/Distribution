package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Partition extends StObject {
  
  var blocks: Double
  
  var devId: Double
  
  var name: String
}
object Partition {
  
  inline def apply(blocks: Double, devId: Double, name: String): Partition = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], devId = devId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partition]
  }
  
  extension [Self <: Partition](x: Self) {
    
    inline def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setDevId(value: Double): Self = StObject.set(x, "devId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
