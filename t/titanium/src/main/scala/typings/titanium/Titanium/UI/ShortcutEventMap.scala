package typings.titanium.Titanium.UI

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortcutEventMap extends ProxyEventMap {
  
  var click: ShortcutClickEvent = js.native
}
object ShortcutEventMap {
  
  @scala.inline
  def apply(click: ShortcutClickEvent): ShortcutEventMap = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutEventMap]
  }
  
  @scala.inline
  implicit class ShortcutEventMapMutableBuilder[Self <: ShortcutEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: ShortcutClickEvent): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
  }
}
