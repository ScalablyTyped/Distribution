package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleEventMap extends ProxyEventMap {
  
  var change: LocaleChangeEvent = js.native
}
object LocaleEventMap {
  
  @scala.inline
  def apply(change: LocaleChangeEvent): LocaleEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleEventMap]
  }
  
  @scala.inline
  implicit class LocaleEventMapMutableBuilder[Self <: LocaleEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: LocaleChangeEvent): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
