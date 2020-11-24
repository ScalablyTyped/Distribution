package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPixelCircleGeometry extends IPixelGeometry {
  
  def getCoordinates(): js.Array[Double] = js.native
  
  def getRadius(): Double = js.native
}
object IPixelCircleGeometry {
  
  @scala.inline
  def apply(
    equals: IPixelGeometry => Boolean,
    events: IEventManager[js.Object],
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getCoordinates: () => js.Array[Double],
    getMetaData: () => js.Object,
    getRadius: () => Double,
    getType: () => String,
    scale: Double => IPixelGeometry,
    shift: js.Array[Double] => IPixelGeometry
  ): IPixelCircleGeometry = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), events = events.asInstanceOf[js.Any], getBounds = js.Any.fromFunction0(getBounds), getCoordinates = js.Any.fromFunction0(getCoordinates), getMetaData = js.Any.fromFunction0(getMetaData), getRadius = js.Any.fromFunction0(getRadius), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.asInstanceOf[IPixelCircleGeometry]
  }
  
  @scala.inline
  implicit class IPixelCircleGeometryOps[Self <: IPixelCircleGeometry] (val x: Self) extends AnyVal {
    
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
    def setGetCoordinates(value: () => js.Array[Double]): Self = this.set("getCoordinates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRadius(value: () => Double): Self = this.set("getRadius", js.Any.fromFunction0(value))
  }
}
