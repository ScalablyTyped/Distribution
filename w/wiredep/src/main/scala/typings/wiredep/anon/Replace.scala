package typings.wiredep.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replace extends StObject {
  
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: RegExp = js.native
  
  var detect: Less = js.native
  
  var replace: CssLess = js.native
}
object Replace {
  
  @scala.inline
  def apply(block: RegExp, detect: Less, replace: CssLess): Replace = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Replace]
  }
  
  @scala.inline
  implicit class ReplaceMutableBuilder[Self <: Replace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: RegExp): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetect(value: Less): Self = StObject.set(x, "detect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: CssLess): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
  }
}
