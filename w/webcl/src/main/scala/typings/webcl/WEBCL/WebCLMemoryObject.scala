package typings.webcl.WEBCL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.6
trait WebCLMemoryObject extends StObject {
  
  def getInfo(name: MemInfo): Any
  
  def release(): Unit
}
object WebCLMemoryObject {
  
  inline def apply(getInfo: MemInfo => Any, release: () => Unit): WebCLMemoryObject = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[WebCLMemoryObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebCLMemoryObject] (val x: Self) extends AnyVal {
    
    inline def setGetInfo(value: MemInfo => Any): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
    
    inline def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
  }
}
