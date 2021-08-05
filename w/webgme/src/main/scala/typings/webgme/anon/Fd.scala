package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fd extends StObject {
  
  var fd: Double
}
object Fd {
  
  inline def apply(fd: Double): Fd = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fd]
  }
  
  extension [Self <: Fd](x: Self) {
    
    inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
  }
}
