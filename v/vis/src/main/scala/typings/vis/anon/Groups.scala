package typings.vis.anon

import typings.vis.mod.DataGroup
import typings.vis.mod.DataGroupCollectionType
import typings.vis.mod.DataItem
import typings.vis.mod.DataItemCollectionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  var groups: js.UndefOr[DataGroupCollectionType] = js.undefined
  
  var items: js.UndefOr[DataItemCollectionType] = js.undefined
}
object Groups {
  
  @scala.inline
  def apply(): Groups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Groups]
  }
  
  @scala.inline
  implicit class GroupsMutableBuilder[Self <: Groups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: DataGroupCollectionType): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: DataGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: DataItemCollectionType): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DataItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
