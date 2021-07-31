package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDirty extends StObject {
  
  var isDirty: Boolean
  
  var selectedIds: js.Array[js.Any]
}
object IsDirty {
  
  @scala.inline
  def apply(isDirty: Boolean, selectedIds: js.Array[js.Any]): IsDirty = {
    val __obj = js.Dynamic.literal(isDirty = isDirty.asInstanceOf[js.Any], selectedIds = selectedIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDirty]
  }
  
  @scala.inline
  implicit class IsDirtyMutableBuilder[Self <: IsDirty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIds(value: js.Array[js.Any]): Self = StObject.set(x, "selectedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIdsVarargs(value: js.Any*): Self = StObject.set(x, "selectedIds", js.Array(value :_*))
  }
}
