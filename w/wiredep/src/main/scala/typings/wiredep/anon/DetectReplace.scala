package typings.wiredep.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectReplace extends StObject {
  
  /**
    * @example:
    *  /(([ \t]*)\/\/\s*bower:*(\S*))(\n|\r|.)*?(\/\/\s*endbower)/gi
    */
  var block: RegExp = js.native
  
  var detect: Styl = js.native
  
  var replace: CssStyl = js.native
}
object DetectReplace {
  
  @scala.inline
  def apply(block: RegExp, detect: Styl, replace: CssStyl): DetectReplace = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectReplace]
  }
  
  @scala.inline
  implicit class DetectReplaceMutableBuilder[Self <: DetectReplace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: RegExp): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetect(value: Styl): Self = StObject.set(x, "detect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: CssStyl): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
  }
}
