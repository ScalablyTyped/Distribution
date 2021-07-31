package typings.uiGrid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBuildColumnsOptions extends StObject {
  
  var orderByColumnDefs: js.UndefOr[Boolean] = js.undefined
}
object IBuildColumnsOptions {
  
  @scala.inline
  def apply(): IBuildColumnsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBuildColumnsOptions]
  }
  
  @scala.inline
  implicit class IBuildColumnsOptionsMutableBuilder[Self <: IBuildColumnsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrderByColumnDefs(value: Boolean): Self = StObject.set(x, "orderByColumnDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByColumnDefsUndefined: Self = StObject.set(x, "orderByColumnDefs", js.undefined)
  }
}
