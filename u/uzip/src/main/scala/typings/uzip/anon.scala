package typings.uzip

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Csize extends StObject {
    
    var csize: Double
    
    var usize: Double
  }
  object Csize {
    
    inline def apply(csize: Double, usize: Double): Csize = {
      val __obj = js.Dynamic.literal(csize = csize.asInstanceOf[js.Any], usize = usize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Csize]
    }
    
    extension [Self <: Csize](x: Self) {
      
      inline def setCsize(value: Double): Self = StObject.set(x, "csize", value.asInstanceOf[js.Any])
      
      inline def setUsize(value: Double): Self = StObject.set(x, "usize", value.asInstanceOf[js.Any])
    }
  }
}
