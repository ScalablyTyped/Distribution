package typings.swfobject

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ie extends StObject {
    
    // number or boolean
    var ie: Boolean
    
    var mac: Boolean
    
    var pv: js.Array[Double]
    
    var w3: Boolean
    
    var win: Boolean
    
    var wk: Any
  }
  object Ie {
    
    inline def apply(ie: Boolean, mac: Boolean, pv: js.Array[Double], w3: Boolean, win: Boolean, wk: Any): Ie = {
      val __obj = js.Dynamic.literal(ie = ie.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], pv = pv.asInstanceOf[js.Any], w3 = w3.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any], wk = wk.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ie]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ie] (val x: Self) extends AnyVal {
      
      inline def setIe(value: Boolean): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
      
      inline def setMac(value: Boolean): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setPv(value: js.Array[Double]): Self = StObject.set(x, "pv", value.asInstanceOf[js.Any])
      
      inline def setPvVarargs(value: Double*): Self = StObject.set(x, "pv", js.Array(value*))
      
      inline def setW3(value: Boolean): Self = StObject.set(x, "w3", value.asInstanceOf[js.Any])
      
      inline def setWin(value: Boolean): Self = StObject.set(x, "win", value.asInstanceOf[js.Any])
      
      inline def setWk(value: Any): Self = StObject.set(x, "wk", value.asInstanceOf[js.Any])
    }
  }
}
