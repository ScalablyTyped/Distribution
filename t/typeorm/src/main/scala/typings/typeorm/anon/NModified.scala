package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NModified extends StObject {
  
  var n: Double = js.native
  
  var nModified: Double = js.native
  
  var ok: Double = js.native
}
object NModified {
  
  @scala.inline
  def apply(n: Double, nModified: Double, ok: Double): NModified = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], nModified = nModified.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[NModified]
  }
  
  @scala.inline
  implicit class NModifiedMutableBuilder[Self <: NModified] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNModified(value: Double): Self = StObject.set(x, "nModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: Double): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
