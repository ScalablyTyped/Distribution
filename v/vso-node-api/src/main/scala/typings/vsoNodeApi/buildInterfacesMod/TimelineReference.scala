package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineReference extends StObject {
  
  /**
    * The change ID.
    */
  var changeId: Double = js.native
  
  /**
    * The ID of the timeline.
    */
  var id: String = js.native
  
  /**
    * The REST URL of the timeline.
    */
  var url: String = js.native
}
object TimelineReference {
  
  @scala.inline
  def apply(changeId: Double, id: String, url: String): TimelineReference = {
    val __obj = js.Dynamic.literal(changeId = changeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineReference]
  }
  
  @scala.inline
  implicit class TimelineReferenceMutableBuilder[Self <: TimelineReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeId(value: Double): Self = StObject.set(x, "changeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
