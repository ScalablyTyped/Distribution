package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suite extends StObject {
  
  var error: js.UndefOr[js.Any] = js.undefined
}
object Suite {
  
  @scala.inline
  def apply(): Suite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Suite]
  }
  
  @scala.inline
  implicit class SuiteMutableBuilder[Self <: Suite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
