package typings.victory.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Active extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var datum: js.UndefOr[js.Object] = js.undefined
}
object Active {
  
  @scala.inline
  def apply(): Active = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
  }
}
