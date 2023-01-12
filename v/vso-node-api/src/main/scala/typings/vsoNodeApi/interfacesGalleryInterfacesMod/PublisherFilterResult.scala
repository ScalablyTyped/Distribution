package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublisherFilterResult extends StObject {
  
  /**
    * This is the set of appplications that matched the query filter supplied.
    */
  var publishers: js.Array[Publisher]
}
object PublisherFilterResult {
  
  inline def apply(publishers: js.Array[Publisher]): PublisherFilterResult = {
    val __obj = js.Dynamic.literal(publishers = publishers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublisherFilterResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublisherFilterResult] (val x: Self) extends AnyVal {
    
    inline def setPublishers(value: js.Array[Publisher]): Self = StObject.set(x, "publishers", value.asInstanceOf[js.Any])
    
    inline def setPublishersVarargs(value: Publisher*): Self = StObject.set(x, "publishers", js.Array(value*))
  }
}
