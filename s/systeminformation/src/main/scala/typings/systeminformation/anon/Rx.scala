package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rx extends StObject {
  
  var rx: Double
  
  var wx: Double
}
object Rx {
  
  inline def apply(rx: Double, wx: Double): Rx = {
    val __obj = js.Dynamic.literal(rx = rx.asInstanceOf[js.Any], wx = wx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rx] (val x: Self) extends AnyVal {
    
    inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    inline def setWx(value: Double): Self = StObject.set(x, "wx", value.asInstanceOf[js.Any])
  }
}
