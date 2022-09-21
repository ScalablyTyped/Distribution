package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerPlaylistItem extends StObject {
  
  /**
    * Index of playlist's item. Should be unique within playlist.
    */
  val index: String
  
  /**
    * Metadata associated with item.
    */
  val metadata: MediaControllerMetadata
}
object MediaControllerPlaylistItem {
  
  inline def apply(index: String, metadata: MediaControllerMetadata): MediaControllerPlaylistItem = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaControllerPlaylistItem]
  }
  
  extension [Self <: MediaControllerPlaylistItem](x: Self) {
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: MediaControllerMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
