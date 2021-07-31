package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var canPreventDefault: `true`
}
object `3` {
  
  @scala.inline
  def apply(): `3` = {
    val __obj = js.Dynamic.literal(canPreventDefault = true)
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanPreventDefault(value: `true`): Self = StObject.set(x, "canPreventDefault", value.asInstanceOf[js.Any])
  }
}
