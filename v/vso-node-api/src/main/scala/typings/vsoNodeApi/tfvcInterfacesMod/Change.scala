package typings.vsoNodeApi.tfvcInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Change[T] extends StObject {
  
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
  implicit class ChangeMutableBuilder[Self <: Change[_], T] (val x: Self with Change[T]) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: VersionControlChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewContent(value: ItemContent): Self = StObject.set(x, "newContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceServerItem(value: String): Self = StObject.set(x, "sourceServerItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
