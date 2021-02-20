package typings.titanium.Titanium.App

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidEventMap extends ProxyEventMap {
  
  var shortcutitemclick: AndroidShortcutitemclickEvent = js.native
}
object AndroidEventMap {
  
  @scala.inline
  def apply(shortcutitemclick: AndroidShortcutitemclickEvent): AndroidEventMap = {
    val __obj = js.Dynamic.literal(shortcutitemclick = shortcutitemclick.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidEventMap]
  }
  
  @scala.inline
  implicit class AndroidEventMapMutableBuilder[Self <: AndroidEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShortcutitemclick(value: AndroidShortcutitemclickEvent): Self = StObject.set(x, "shortcutitemclick", value.asInstanceOf[js.Any])
  }
}
