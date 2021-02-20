package typings.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssLess extends StObject {
  
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var css: String = js.native
  
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var less: String = js.native
}
object CssLess {
  
  @scala.inline
  def apply(css: String, less: String): CssLess = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssLess]
  }
  
  @scala.inline
  implicit class CssLessMutableBuilder[Self <: CssLess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLess(value: String): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
  }
}
