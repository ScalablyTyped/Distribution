package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublisherCreated extends StObject {
  
  var none: scala.Double
  
  var publisherCreated: scala.Double
  
  var userEditable: scala.Double
}
object PublisherCreated {
  
  inline def apply(none: scala.Double, publisherCreated: scala.Double, userEditable: scala.Double): PublisherCreated = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], publisherCreated = publisherCreated.asInstanceOf[js.Any], userEditable = userEditable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherCreated]
  }
  
  extension [Self <: PublisherCreated](x: Self) {
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setPublisherCreated(value: scala.Double): Self = StObject.set(x, "publisherCreated", value.asInstanceOf[js.Any])
    
    inline def setUserEditable(value: scala.Double): Self = StObject.set(x, "userEditable", value.asInstanceOf[js.Any])
  }
}
