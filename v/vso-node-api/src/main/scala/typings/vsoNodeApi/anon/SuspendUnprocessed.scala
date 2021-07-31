package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspendUnprocessed extends StObject {
  
  var none: scala.Double
  
  var suspendUnprocessed: scala.Double
}
object SuspendUnprocessed {
  
  @scala.inline
  def apply(none: scala.Double, suspendUnprocessed: scala.Double): SuspendUnprocessed = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], suspendUnprocessed = suspendUnprocessed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspendUnprocessed]
  }
  
  @scala.inline
  implicit class SuspendUnprocessedMutableBuilder[Self <: SuspendUnprocessed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendUnprocessed(value: scala.Double): Self = StObject.set(x, "suspendUnprocessed", value.asInstanceOf[js.Any])
  }
}
