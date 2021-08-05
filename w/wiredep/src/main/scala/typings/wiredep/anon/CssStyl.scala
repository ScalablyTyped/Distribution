package typings.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssStyl extends StObject {
  
  /**
    * @example:
    *  '@import "{{filePath}}"'
    */
  var css: String
  
  /**
    * @example:
    *  '@import "{{filePath}}"'
    */
  var styl: String
}
object CssStyl {
  
  inline def apply(css: String, styl: String): CssStyl = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssStyl]
  }
  
  extension [Self <: CssStyl](x: Self) {
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setStyl(value: String): Self = StObject.set(x, "styl", value.asInstanceOf[js.Any])
  }
}
