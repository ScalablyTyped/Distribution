package typings.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Change[T] extends js.Object {
  
  /**
    * The type of change that was made to the item.
    */
  var changeType: VersionControlChangeType = js.native
  
  /**
    * Current version.
    */
  var item: T = js.native
  
  /**
    * Content of the item after the change.
    */
  var newContent: ItemContent = js.native
  
  /**
    * Path of the item on the server.
    */
  var sourceServerItem: String = js.native
  
  /**
    * URL to retrieve the item.
    */
  var url: String = js.native
}
object Change {
  
  @scala.inline
  def apply[T](
    changeType: VersionControlChangeType,
    item: T,
    newContent: ItemContent,
    sourceServerItem: String,
    url: String
  ): Change[T] = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], newContent = newContent.asInstanceOf[js.Any], sourceServerItem = sourceServerItem.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change[T]]
  }
  
  @scala.inline
  implicit class ChangeOps[Self <: Change[_], T] (val x: Self with Change[T]) extends AnyVal {
    
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
    def setChangeType(value: VersionControlChangeType): Self = this.set("changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: T): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewContent(value: ItemContent): Self = this.set("newContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceServerItem(value: String): Self = this.set("sourceServerItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
