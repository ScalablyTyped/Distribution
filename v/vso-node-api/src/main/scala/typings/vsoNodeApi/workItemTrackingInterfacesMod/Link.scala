package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  /**
    * Collection of link attributes.
    */
  var attributes: StringDictionary[Any]
  
  /**
    * Relation type.
    */
  var rel: String
  
  /**
    * Link url.
    */
  var url: String
}
object Link {
  
  inline def apply(attributes: StringDictionary[Any], rel: String, url: String): Link = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  extension [Self <: Link](x: Self) {
    
    inline def setAttributes(value: StringDictionary[Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
