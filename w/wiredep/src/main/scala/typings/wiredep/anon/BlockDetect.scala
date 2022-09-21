package typings.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockDetect extends StObject {
  
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: js.RegExp
  
  var detect: Sass
  
  var replace: Scss
}
object BlockDetect {
  
  inline def apply(block: js.RegExp, detect: Sass, replace: Scss): BlockDetect = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDetect]
  }
  
  extension [Self <: BlockDetect](x: Self) {
    
    inline def setBlock(value: js.RegExp): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setDetect(value: Sass): Self = StObject.set(x, "detect", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: Scss): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
  }
}
