package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Previous extends StObject {
  
  var none: scala.Double
  
  var previous: scala.Double
  
  var useRename: scala.Double
}
object Previous {
  
  inline def apply(none: scala.Double, previous: scala.Double, useRename: scala.Double): Previous = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], useRename = useRename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Previous]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Previous] (val x: Self) extends AnyVal {
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: scala.Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setUseRename(value: scala.Double): Self = StObject.set(x, "useRename", value.asInstanceOf[js.Any])
  }
}
