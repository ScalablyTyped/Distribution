package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistItem extends StObject {
  
  /**
    * Content contained in this playlist item.
    */
  val content: Content_
}
object PlaylistItem {
  
  inline def apply(content: Content_): PlaylistItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistItem]
  }
  
  extension [Self <: PlaylistItem](x: Self) {
    
    inline def setContent(value: Content_): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
