package typings.uiGrid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFilterFlags extends StObject {
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
}
object IFilterFlags {
  
  @scala.inline
  def apply(): IFilterFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterFlags]
  }
  
  @scala.inline
  implicit class IFilterFlagsMutableBuilder[Self <: IFilterFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
  }
}
