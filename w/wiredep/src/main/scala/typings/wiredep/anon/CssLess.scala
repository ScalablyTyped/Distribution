package typings.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssLess extends StObject {
  
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var css: String
  
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var less: String
}
object CssLess {
  
  inline def apply(css: String, less: String): CssLess = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssLess]
  }
  
  extension [Self <: CssLess](x: Self) {
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setLess(value: String): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
  }
}
