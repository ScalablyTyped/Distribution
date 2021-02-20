package typings.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssStyl extends StObject {
  
  /**
    * @example:
    *  '@import "{{filePath}}"'
    */
  var css: String = js.native
  
  /**
    * @example:
    *  '@import "{{filePath}}"'
    */
  var styl: String = js.native
}
object CssStyl {
  
  @scala.inline
  def apply(css: String, styl: String): CssStyl = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssStyl]
  }
  
  @scala.inline
  implicit class CssStylMutableBuilder[Self <: CssStyl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyl(value: String): Self = StObject.set(x, "styl", value.asInstanceOf[js.Any])
  }
}
