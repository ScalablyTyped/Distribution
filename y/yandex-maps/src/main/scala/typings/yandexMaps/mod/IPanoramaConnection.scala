package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaConnection extends StObject {
  
  def getConnectedPanorama(): js.Promise[IPanorama]
}
object IPanoramaConnection {
  
  inline def apply(getConnectedPanorama: () => js.Promise[IPanorama]): IPanoramaConnection = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = js.Any.fromFunction0(getConnectedPanorama))
    __obj.asInstanceOf[IPanoramaConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPanoramaConnection] (val x: Self) extends AnyVal {
    
    inline def setGetConnectedPanorama(value: () => js.Promise[IPanorama]): Self = StObject.set(x, "getConnectedPanorama", js.Any.fromFunction0(value))
  }
}
