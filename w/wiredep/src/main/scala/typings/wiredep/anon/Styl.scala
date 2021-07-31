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
  
  @scala.inline
  def apply(css: RegExp, styl: RegExp): Styl = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Styl]
  }
  
  @scala.inline
  implicit class StylMutableBuilder[Self <: Styl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCss(value: RegExp): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyl(value: RegExp): Self = StObject.set(x, "styl", value.asInstanceOf[js.Any])
  }
}
