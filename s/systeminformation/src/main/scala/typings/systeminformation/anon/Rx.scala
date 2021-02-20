package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rx extends StObject {
  
  var rx: Double = js.native
  
  var wx: Double = js.native
}
object Rx {
  
  @scala.inline
  def apply(rx: Double, wx: Double): Rx = {
    val __obj = js.Dynamic.literal(rx = rx.asInstanceOf[js.Any], wx = wx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rx]
  }
  
  @scala.inline
  implicit class RxMutableBuilder[Self <: Rx] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWx(value: Double): Self = StObject.set(x, "wx", value.asInstanceOf[js.Any])
  }
}
