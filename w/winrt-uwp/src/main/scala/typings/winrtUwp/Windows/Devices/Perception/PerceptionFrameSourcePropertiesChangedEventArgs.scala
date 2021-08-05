package typings.winrtUwp.Windows.Devices.Perception

import typings.winrtUwp.Windows.Foundation.Collections.CollectionChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about an attempt to change properties on a frame source. */
trait PerceptionFrameSourcePropertiesChangedEventArgs extends StObject {
  
  /** Gets the type of change that occurred as a result of the property change request. */
  var collectionChange: CollectionChange
  
  /** Gets a string key indicating the location of the change in the collection. */
  var key: String
}
object PerceptionFrameSourcePropertiesChangedEventArgs {
  
  inline def apply(collectionChange: CollectionChange, key: String): PerceptionFrameSourcePropertiesChangedEventArgs = {
    val __obj = js.Dynamic.literal(collectionChange = collectionChange.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionFrameSourcePropertiesChangedEventArgs]
  }
  
  extension [Self <: PerceptionFrameSourcePropertiesChangedEventArgs](x: Self) {
    
    inline def setCollectionChange(value: CollectionChange): Self = StObject.set(x, "collectionChange", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
