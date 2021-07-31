package typings.wiredep.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockDetect extends StObject {
  
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: RegExp
  
  var detect: Sass
  
  var replace: Scss
}
object BlockDetect {
  
  @scala.inline
  def apply(block: RegExp, detect: Sass, replace: Scss): BlockDetect = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDetect]
  }
  
  @scala.inline
  implicit class BlockDetectMutableBuilder[Self <: BlockDetect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: RegExp): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetect(value: Sass): Self = StObject.set(x, "detect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: Scss): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
  }
}
