package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.webdriverio.webdriverioBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserObject extends StObject {
  
  var isMultiremote: js.UndefOr[`false`] = js.undefined
}
object BrowserObject {
  
  @scala.inline
  def apply(): BrowserObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserObject]
  }
  
  @scala.inline
  implicit class BrowserObjectMutableBuilder[Self <: BrowserObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMultiremote(value: `false`): Self = StObject.set(x, "isMultiremote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultiremoteUndefined: Self = StObject.set(x, "isMultiremote", js.undefined)
  }
}
