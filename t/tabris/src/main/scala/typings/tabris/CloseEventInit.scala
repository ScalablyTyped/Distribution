package typings.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseEventInit
  extends StObject
     with EventInit {
  
  var code: js.UndefOr[Double] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
  
  var wasClean: js.UndefOr[Boolean] = js.undefined
}
object CloseEventInit {
  
  @scala.inline
  def apply(): CloseEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseEventInit]
  }
  
  @scala.inline
  implicit class CloseEventInitMutableBuilder[Self <: CloseEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setWasClean(value: Boolean): Self = StObject.set(x, "wasClean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasCleanUndefined: Self = StObject.set(x, "wasClean", js.undefined)
  }
}
