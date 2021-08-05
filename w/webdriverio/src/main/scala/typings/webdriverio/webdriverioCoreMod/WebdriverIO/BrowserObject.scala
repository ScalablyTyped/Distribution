package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.webdriverio.webdriverioBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserObject extends StObject {
  
  var isMultiremote: js.UndefOr[`false`] = js.undefined
}
object BrowserObject {
  
  inline def apply(): BrowserObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserObject]
  }
  
  extension [Self <: BrowserObject](x: Self) {
    
    inline def setIsMultiremote(value: `false`): Self = StObject.set(x, "isMultiremote", value.asInstanceOf[js.Any])
    
    inline def setIsMultiremoteUndefined: Self = StObject.set(x, "isMultiremote", js.undefined)
  }
}
