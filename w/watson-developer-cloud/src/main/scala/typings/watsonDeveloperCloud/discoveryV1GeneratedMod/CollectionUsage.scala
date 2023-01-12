package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Summary of the collection usage in the environment. */
trait CollectionUsage extends StObject {
  
  /** Number of active collections in the environment. */
  var available: js.UndefOr[Double] = js.undefined
  
  /** Total number of collections allowed in the environment. */
  var maximum_allowed: js.UndefOr[Double] = js.undefined
}
object CollectionUsage {
  
  inline def apply(): CollectionUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CollectionUsage] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setAvailableUndefined: Self = StObject.set(x, "available", js.undefined)
    
    inline def setMaximum_allowed(value: Double): Self = StObject.set(x, "maximum_allowed", value.asInstanceOf[js.Any])
    
    inline def setMaximum_allowedUndefined: Self = StObject.set(x, "maximum_allowed", js.undefined)
  }
}
