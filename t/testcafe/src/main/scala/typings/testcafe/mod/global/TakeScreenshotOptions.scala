package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakeScreenshotOptions extends StObject {
  
  /**
    * Specifies that TestCafe should take full-page screenshots.
    */
  var fullPage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the path where the screenshots are saved.
    */
  var path: js.UndefOr[String] = js.undefined
}
object TakeScreenshotOptions {
  
  inline def apply(): TakeScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TakeScreenshotOptions]
  }
  
  extension [Self <: TakeScreenshotOptions](x: Self) {
    
    inline def setFullPage(value: Boolean): Self = StObject.set(x, "fullPage", value.asInstanceOf[js.Any])
    
    inline def setFullPageUndefined: Self = StObject.set(x, "fullPage", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
