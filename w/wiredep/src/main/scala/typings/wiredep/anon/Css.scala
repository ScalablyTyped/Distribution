package typings.wiredep.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Css extends StObject {
  
  /**
    * @example:
    *  /-\s(.+css)/gi
    */
  var css: RegExp
  
  /**
    * @example:
    *  /-\s(.+js)/gi
    */
  @JSName("js")
  var js_ : RegExp
}
object Css {
  
  @scala.inline
  def apply(css: RegExp, js_ : RegExp): Css = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Css]
  }
  
  @scala.inline
  implicit class CssMutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCss(value: RegExp): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJs_(value: RegExp): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
  }
}
