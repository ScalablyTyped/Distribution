package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends StObject {
  
  var canPreventDefault: `true` = js.native
}
object `3` {
  
  @scala.inline
  def apply(canPreventDefault: `true`): `3` = {
    val __obj = js.Dynamic.literal(canPreventDefault = canPreventDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanPreventDefault(value: `true`): Self = StObject.set(x, "canPreventDefault", value.asInstanceOf[js.Any])
  }
}
