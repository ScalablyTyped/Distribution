package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProjection extends js.Object {
  
  def fromGlobalPixels(globalPixelPoint: js.Array[Double], zoom: Double): js.Array[Double] = js.native
  
  def getCoordSystem(): ICoordSystem = js.native
  
  def isCycled(): js.Array[Boolean] = js.native
  
  def toGlobalPixels(coordPoint: js.Array[Double], zoom: Double): js.Array[Double] = js.native
}
object IProjection {
  
  @scala.inline
  def apply(
    fromGlobalPixels: (js.Array[Double], Double) => js.Array[Double],
    getCoordSystem: () => ICoordSystem,
    isCycled: () => js.Array[Boolean],
    toGlobalPixels: (js.Array[Double], Double) => js.Array[Double]
  ): IProjection = {
    val __obj = js.Dynamic.literal(fromGlobalPixels = js.Any.fromFunction2(fromGlobalPixels), getCoordSystem = js.Any.fromFunction0(getCoordSystem), isCycled = js.Any.fromFunction0(isCycled), toGlobalPixels = js.Any.fromFunction2(toGlobalPixels))
    __obj.asInstanceOf[IProjection]
  }
  
  @scala.inline
  implicit class IProjectionOps[Self <: IProjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFromGlobalPixels(value: (js.Array[Double], Double) => js.Array[Double]): Self = this.set("fromGlobalPixels", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCoordSystem(value: () => ICoordSystem): Self = this.set("getCoordSystem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCycled(value: () => js.Array[Boolean]): Self = this.set("isCycled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToGlobalPixels(value: (js.Array[Double], Double) => js.Array[Double]): Self = this.set("toGlobalPixels", js.Any.fromFunction2(value))
  }
}
