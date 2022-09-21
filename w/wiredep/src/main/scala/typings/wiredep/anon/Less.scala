package typings.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Less extends StObject {
  
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: js.RegExp
  
  /**
    * @example:
    *  /@import\s['"](.+less)['"]/gi
    */
  var less: js.RegExp
}
object Less {
  
  inline def apply(css: js.RegExp, less: js.RegExp): Less = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any])
    __obj.asInstanceOf[Less]
  }
  
  extension [Self <: Less](x: Self) {
    
    inline def setCss(value: js.RegExp): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setLess(value: js.RegExp): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
  }
}
