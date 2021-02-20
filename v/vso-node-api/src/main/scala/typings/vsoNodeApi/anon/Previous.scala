package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Previous extends StObject {
  
  var none: scala.Double = js.native
  
  var previous: scala.Double = js.native
  
  var useRename: scala.Double = js.native
}
object Previous {
  
  @scala.inline
  def apply(none: scala.Double, previous: scala.Double, useRename: scala.Double): Previous = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], useRename = useRename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Previous]
  }
  
  @scala.inline
  implicit class PreviousMutableBuilder[Self <: Previous] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: scala.Double): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseRename(value: scala.Double): Self = StObject.set(x, "useRename", value.asInstanceOf[js.Any])
  }
}
