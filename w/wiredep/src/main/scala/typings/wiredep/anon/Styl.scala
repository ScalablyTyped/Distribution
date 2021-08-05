package typings.wiredep.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Styl extends StObject {
  
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: RegExp
  
  /**
    * @example:
    *   /@import\s['"](.+styl)['"]/gi
    */
  var styl: RegExp
}
object Styl {
  
  inline def apply(css: RegExp, styl: RegExp): Styl = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styl]
  }
  
  extension [Self <: Styl](x: Self) {
    
    inline def setCss(value: RegExp): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setStyl(value: RegExp): Self = StObject.set(x, "styl", value.asInstanceOf[js.Any])
  }
}
