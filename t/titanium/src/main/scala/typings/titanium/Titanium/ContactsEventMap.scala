package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactsEventMap extends ProxyEventMap {
  
  var reload: ContactsReloadEvent = js.native
}
object ContactsEventMap {
  
  @scala.inline
  def apply(reload: ContactsReloadEvent): ContactsEventMap = {
    val __obj = js.Dynamic.literal(reload = reload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactsEventMap]
  }
  
  @scala.inline
  implicit class ContactsEventMapMutableBuilder[Self <: ContactsEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReload(value: ContactsReloadEvent): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
  }
}
