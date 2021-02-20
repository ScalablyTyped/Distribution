package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InUse extends StObject {
  
  var inUse: Double = js.native
  
  var total: Double = js.native
}
object InUse {
  
  @scala.inline
  def apply(inUse: Double, total: Double): InUse = {
    val __obj = js.Dynamic.literal(inUse = inUse.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUse]
  }
  
  @scala.inline
  implicit class InUseMutableBuilder[Self <: InUse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInUse(value: Double): Self = StObject.set(x, "inUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
