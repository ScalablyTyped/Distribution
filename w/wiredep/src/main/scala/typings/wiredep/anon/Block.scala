package typings.wiredep.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block extends StObject {
  
  /**
    *  match the beginning-to-end of a bower block in this type of file
    */
  var block: RegExp = js.native
  
  var detect: TypeOfBowerFile = js.native
  
  var replace: AnotherTypeOfBowerFile = js.native
}
object Block {
  
  @scala.inline
  def apply(block: RegExp, detect: TypeOfBowerFile, replace: AnotherTypeOfBowerFile): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: RegExp): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetect(value: TypeOfBowerFile): Self = StObject.set(x, "detect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: AnotherTypeOfBowerFile): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
  }
}
