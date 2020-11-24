package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitPathToItemsCollection extends js.Object {
  
  var items: StringDictionary[js.Array[GitItem]] = js.native
}
object GitPathToItemsCollection {
  
  @scala.inline
  def apply(items: StringDictionary[js.Array[GitItem]]): GitPathToItemsCollection = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPathToItemsCollection]
  }
  
  @scala.inline
  implicit class GitPathToItemsCollectionOps[Self <: GitPathToItemsCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItems(value: StringDictionary[js.Array[GitItem]]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
}
