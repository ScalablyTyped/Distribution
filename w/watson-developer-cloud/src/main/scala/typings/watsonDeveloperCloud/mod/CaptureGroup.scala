package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** A recognized capture group for a pattern-based entity. */
trait CaptureGroup extends StObject {
  
  /** A recognized capture group for the entity. */
  var group: String
  
  /** Zero-based character offsets that indicate where the entity value begins and ends in the input text. */
  var location: js.UndefOr[js.Array[Double]] = js.undefined
}
object CaptureGroup {
  
  inline def apply(group: String): CaptureGroup = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureGroup]
  }
  
  extension [Self <: CaptureGroup](x: Self) {
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
  }
}
