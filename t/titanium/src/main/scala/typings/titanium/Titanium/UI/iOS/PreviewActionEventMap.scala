package typings.titanium.Titanium.UI.iOS

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewActionEventMap extends ProxyEventMap {
  
  var click: PreviewActionClickEvent = js.native
}
object PreviewActionEventMap {
  
  @scala.inline
  def apply(click: PreviewActionClickEvent): PreviewActionEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewActionEventMap]
  }
  
  @scala.inline
  implicit class PreviewActionEventMapMutableBuilder[Self <: PreviewActionEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: PreviewActionClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
  }
}
