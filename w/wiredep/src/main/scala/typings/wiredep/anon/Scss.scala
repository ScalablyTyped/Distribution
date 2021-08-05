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
  
  inline def apply(css: String, sass: String, scss: String): Scss = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], sass = sass.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scss]
  }
  
  extension [Self <: Scss](x: Self) {
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setSass(value: String): Self = StObject.set(x, "sass", value.asInstanceOf[js.Any])
    
    inline def setScss(value: String): Self = StObject.set(x, "scss", value.asInstanceOf[js.Any])
  }
}
