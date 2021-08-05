package typings.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Js extends StObject {
  
  /**
    * @example:
    *  '- {{filePath}}'
    */
  var css: String
  
  /**
    * @example:
    *  '- {{filePath}}'
    */
  @JSName("js")
  var js_ : String
}
object Js {
  
  inline def apply(css: String, js_ : String): Js = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
    __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Js]
  }
  
  extension [Self <: Js](x: Self) {
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setJs_(value: String): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
  }
}
