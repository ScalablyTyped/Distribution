package typings.wiredep.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Detect extends StObject {
  
  /**
    * @example:
    *  /(([ \t]*)#\s*bower:*(\S*))(\n|\r|.)*?(#\s*endbower)/gi
    */
  var block: RegExp = js.native
  
  var detect: Css = js.native
  
  var replace: Js = js.native
}
object Detect {
  
  @scala.inline
  def apply(block: RegExp, detect: Css, replace: Js): Detect = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detect]
  }
  
  @scala.inline
  implicit class DetectMutableBuilder[Self <: Detect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlock(value: RegExp): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetect(value: Css): Self = StObject.set(x, "detect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: Js): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
  }
}
