package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotsOptions
  extends StObject
     with TakeScreenshotOptions {
  
  /**
    * Specifies a custom pattern to compose screenshot files' relative path and name.
    */
  var pathPattern: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that a screenshot should be taken whenever a test fails.
    */
  var takeOnFails: js.UndefOr[Boolean] = js.undefined
}
object ScreenshotsOptions {
  
  inline def apply(): ScreenshotsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotsOptions]
  }
  
  extension [Self <: ScreenshotsOptions](x: Self) {
    
    inline def setPathPattern(value: String): Self = StObject.set(x, "pathPattern", value.asInstanceOf[js.Any])
    
    inline def setPathPatternUndefined: Self = StObject.set(x, "pathPattern", js.undefined)
    
    inline def setTakeOnFails(value: Boolean): Self = StObject.set(x, "takeOnFails", value.asInstanceOf[js.Any])
    
    inline def setTakeOnFailsUndefined: Self = StObject.set(x, "takeOnFails", js.undefined)
  }
}
