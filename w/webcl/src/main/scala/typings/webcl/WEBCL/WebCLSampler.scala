package typings.webcl.WEBCL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 3.7
trait WebCLSampler extends StObject {
  
  def getInfo(name: SamplerInfo): Any
  
  def release(): Unit
}
object WebCLSampler {
  
  inline def apply(getInfo: SamplerInfo => Any, release: () => Unit): WebCLSampler = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[WebCLSampler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebCLSampler] (val x: Self) extends AnyVal {
    
    inline def setGetInfo(value: SamplerInfo => Any): Self = StObject.set(x, "getInfo", js.Any.fromFunction1(value))
    
    inline def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
  }
}
