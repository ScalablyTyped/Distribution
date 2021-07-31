package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaTileLevel extends StObject {
  
  def getImageSize(): js.Array[Double]
  
  def getTileUrl(x: Double, y: Double): String
}
object IPanoramaTileLevel {
  
  @scala.inline
  def apply(getImageSize: () => js.Array[Double], getTileUrl: (Double, Double) => String): IPanoramaTileLevel = {
    val __obj = js.Dynamic.literal(getImageSize = js.Any.fromFunction0(getImageSize), getTileUrl = js.Any.fromFunction2(getTileUrl))
    __obj.asInstanceOf[IPanoramaTileLevel]
  }
  
  @scala.inline
  implicit class IPanoramaTileLevelMutableBuilder[Self <: IPanoramaTileLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetImageSize(value: () => js.Array[Double]): Self = StObject.set(x, "getImageSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTileUrl(value: (Double, Double) => String): Self = StObject.set(x, "getTileUrl", js.Any.fromFunction2(value))
  }
}
