package typings.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scss extends StObject {
  
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var css: String
  
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var sass: String
  
  /**
    * @example:
    *  '@import "{{filePath}}";'
    */
  var scss: String
}
object Scss {
  
  @scala.inline
  def apply(css: String, sass: String, scss: String): Scss = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], sass = sass.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scss]
  }
  
  @scala.inline
  implicit class ScssMutableBuilder[Self <: Scss] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSass(value: String): Self = StObject.set(x, "sass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScss(value: String): Self = StObject.set(x, "scss", value.asInstanceOf[js.Any])
  }
}
