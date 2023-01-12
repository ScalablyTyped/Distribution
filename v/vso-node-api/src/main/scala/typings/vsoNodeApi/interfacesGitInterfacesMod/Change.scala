package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change[T] extends StObject {
  
  /**
    * The type of change that was made to the item.
    */
  var changeType: VersionControlChangeType
  
  /**
    * Current version.
    */
  var item: T
  
  /**
    * Content of the item after the change.
    */
  var newContent: ItemContent
  
  /**
    * Path of the item on the server.
    */
  var sourceServerItem: String
  
  /**
    * URL to retrieve the item.
    */
  var url: String
}
object Change {
  
  inline def apply[T](
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
  implicit open class MutableBuilder[Self <: Change[?], T] (val x: Self & Change[T]) extends AnyVal {
    
    inline def setChangeType(value: VersionControlChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setNewContent(value: ItemContent): Self = StObject.set(x, "newContent", value.asInstanceOf[js.Any])
    
    inline def setSourceServerItem(value: String): Self = StObject.set(x, "sourceServerItem", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
