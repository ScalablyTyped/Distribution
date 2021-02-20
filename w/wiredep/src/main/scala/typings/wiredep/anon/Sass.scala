package typings.wiredep.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sass extends StObject {
  
  /**
    * @example:
    *  /@import\s['"](.+css)['"]/gi
    */
  var css: RegExp = js.native
  
  /**
    * @example:
    *  /@import\s['"](.+sass)['"]/gi
    */
  var sass: RegExp = js.native
  
  /**
    * @example:
    *  /@import\s['"](.+scss)['"]/gi
    */
  var scss: RegExp = js.native
}
object Sass {
  
  @scala.inline
  def apply(css: RegExp, sass: RegExp, scss: RegExp): Sass = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], sass = sass.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sass]
  }
  
  @scala.inline
  implicit class SassMutableBuilder[Self <: Sass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCss(value: RegExp): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSass(value: RegExp): Self = StObject.set(x, "sass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScss(value: RegExp): Self = StObject.set(x, "scss", value.asInstanceOf[js.Any])
  }
}
