package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuPopupEventMap extends ProxyEventMap {
  
  var click: MenuPopupClickEvent = js.native
}
object MenuPopupEventMap {
  
  @scala.inline
  def apply(click: MenuPopupClickEvent): MenuPopupEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuPopupEventMap]
  }
  
  @scala.inline
  implicit class MenuPopupEventMapMutableBuilder[Self <: MenuPopupEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: MenuPopupClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
  }
}
