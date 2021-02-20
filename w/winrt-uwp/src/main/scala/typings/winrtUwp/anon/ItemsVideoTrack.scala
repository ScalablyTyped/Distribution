package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Media.Core.VideoTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsVideoTrack extends StObject {
  
  /** The video tracks that start at startIndex in the list. */ var items: VideoTrack = js.native
  
  /** The number of video tracks retrieved. */ var returnValue: Double = js.native
}
object ItemsVideoTrack {
  
  @scala.inline
  def apply(items: VideoTrack, returnValue: Double): ItemsVideoTrack = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsVideoTrack]
  }
  
  @scala.inline
  implicit class ItemsVideoTrackMutableBuilder[Self <: ItemsVideoTrack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: VideoTrack): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
