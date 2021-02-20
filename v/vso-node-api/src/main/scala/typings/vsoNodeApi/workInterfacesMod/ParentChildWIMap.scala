package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentChildWIMap extends StObject {
  
  var childWorkItemIds: js.Array[Double] = js.native
  
  var id: Double = js.native
  
  var title: String = js.native
}
object ParentChildWIMap {
  
  @scala.inline
  def apply(childWorkItemIds: js.Array[Double], id: Double, title: String): ParentChildWIMap = {
    val __obj = js.Dynamic.literal(childWorkItemIds = childWorkItemIds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentChildWIMap]
  }
  
  @scala.inline
  implicit class ParentChildWIMapMutableBuilder[Self <: ParentChildWIMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildWorkItemIds(value: js.Array[Double]): Self = StObject.set(x, "childWorkItemIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildWorkItemIdsVarargs(value: Double*): Self = StObject.set(x, "childWorkItemIds", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
