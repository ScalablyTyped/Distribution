package typings.webdriverio

import typings.std.Error
import typings.webdriverio.WebdriverIO.BrowserObject
import typings.webdriverio.webdriverioStrings.`element-6066-11e4-a52e-4f735466cecf`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait ElementObject
    extends StObject
       with ElementReference
       with BrowserObject {
    
    var ELEMENT: String = js.native
    
    var elementId: String = js.native
    
    var error: js.UndefOr[Error] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var isReactElement: js.UndefOr[Boolean] = js.native
    
    var parent: js.UndefOr[BrowserObject] = js.native
    
    var selector: js.UndefOr[String] = js.native
  }
  
  /* Inlined std.Record<webdriverio.webdriverio/build/types.ElementReferenceId, string> */
  trait ElementReference extends StObject {
    
    var `element-6066-11e4-a52e-4f735466cecf`: String
  }
  object ElementReference {
    
    inline def apply(`element-6066-11e4-a52e-4f735466cecf`: String): ElementReference = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("element-6066-11e4-a52e-4f735466cecf")(`element-6066-11e4-a52e-4f735466cecf`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementReference]
    }
    
    extension [Self <: ElementReference](x: Self) {
      
      inline def `setElement-6066-11e4-a52e-4f735466cecf`(value: String): Self = StObject.set(x, "element-6066-11e4-a52e-4f735466cecf", value.asInstanceOf[js.Any])
    }
  }
  
  type ElementReferenceId = `element-6066-11e4-a52e-4f735466cecf`
}
