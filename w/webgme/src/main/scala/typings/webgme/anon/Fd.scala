package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fd extends StObject {
  
  var fd: Double = js.native
}
object Fd {
  
  @scala.inline
  def apply(fd: Double): Fd = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fd]
  }
  
  @scala.inline
  implicit class FdMutableBuilder[Self <: Fd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
  }
}
