package typings.uiGrid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISortInfo extends StObject {
  
  var direction: js.UndefOr[String] = js.native
  
  var ignoreSort: js.UndefOr[Boolean] = js.native
  
  var priority: js.UndefOr[Double] = js.native
}
object ISortInfo {
  
  @scala.inline
  def apply(): ISortInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISortInfo]
  }
  
  @scala.inline
  implicit class ISortInfoMutableBuilder[Self <: ISortInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setIgnoreSort(value: Boolean): Self = StObject.set(x, "ignoreSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreSortUndefined: Self = StObject.set(x, "ignoreSort", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
