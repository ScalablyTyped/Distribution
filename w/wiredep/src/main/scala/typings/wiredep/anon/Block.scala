package typings.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block extends StObject {
  
  /**
    *  match the beginning-to-end of a bower block in this type of file
    */
  var block: js.RegExp
  
  var detect: TypeOfBowerFile
  
  var replace: AnotherTypeOfBowerFile
}
object Block {
  
  inline def apply(block: js.RegExp, detect: TypeOfBowerFile, replace: AnotherTypeOfBowerFile): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  extension [Self <: Block](x: Self) {
    
    inline def setBlock(value: js.RegExp): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setDetect(value: TypeOfBowerFile): Self = StObject.set(x, "detect", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: AnotherTypeOfBowerFile): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
  }
}
