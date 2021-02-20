package typings.wepy.anon

import typings.wepy.wepyStrings.facial
import typings.wepy.wepyStrings.fingerPrint
import typings.wepy.wepyStrings.speech
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckAuthMode extends StObject {
  
  var checkAuthMode: fingerPrint | facial | speech = js.native
}
object CheckAuthMode {
  
  @scala.inline
  def apply(checkAuthMode: fingerPrint | facial | speech): CheckAuthMode = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckAuthMode]
  }
  
  @scala.inline
  implicit class CheckAuthModeMutableBuilder[Self <: CheckAuthMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckAuthMode(value: fingerPrint | facial | speech): Self = StObject.set(x, "checkAuthMode", value.asInstanceOf[js.Any])
  }
}
