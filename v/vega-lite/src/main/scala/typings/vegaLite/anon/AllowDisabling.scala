package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowDisabling extends StObject {
  
  var allowDisabling: Boolean = js.native
  
  var includeDefault: js.UndefOr[Boolean] = js.native
}
object AllowDisabling {
  
  @scala.inline
  def apply(allowDisabling: Boolean): AllowDisabling = {
    val __obj = js.Dynamic.literal(allowDisabling = allowDisabling.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowDisabling]
  }
  
  @scala.inline
  implicit class AllowDisablingMutableBuilder[Self <: AllowDisabling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDisabling(value: Boolean): Self = StObject.set(x, "allowDisabling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDefault(value: Boolean): Self = StObject.set(x, "includeDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDefaultUndefined: Self = StObject.set(x, "includeDefault", js.undefined)
  }
}
