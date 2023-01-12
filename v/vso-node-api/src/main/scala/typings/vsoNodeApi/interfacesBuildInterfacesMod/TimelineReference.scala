package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineReference extends StObject {
  
  /**
    * The change ID.
    */
  var changeId: Double
  
  /**
    * The ID of the timeline.
    */
  var id: String
  
  /**
    * The REST URL of the timeline.
    */
  var url: String
}
object TimelineReference {
  
  inline def apply(changeId: Double, id: String, url: String): TimelineReference = {
    val __obj = js.Dynamic.literal(changeId = changeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimelineReference] (val x: Self) extends AnyVal {
    
    inline def setChangeId(value: Double): Self = StObject.set(x, "changeId", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
