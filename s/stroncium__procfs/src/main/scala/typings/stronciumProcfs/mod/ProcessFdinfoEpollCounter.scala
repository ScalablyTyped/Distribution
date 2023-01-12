package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessFdinfoEpollCounter extends StObject {
  
  var fd: Double
  
  var mask: Double
}
object ProcessFdinfoEpollCounter {
  
  inline def apply(fd: Double, mask: Double): ProcessFdinfoEpollCounter = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessFdinfoEpollCounter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessFdinfoEpollCounter] (val x: Self) extends AnyVal {
    
    inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}
