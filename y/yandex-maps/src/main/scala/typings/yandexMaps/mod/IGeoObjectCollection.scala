package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoObjectCollection
  extends ICustomizable
     with IParentOnMap {
  
  def add(child: IGeoObject[IGeometry]): this.type = js.native
  def add(child: IGeoObject[IGeometry], index: Double): this.type = js.native
  
  def each(callback: js.Function1[/* object */ IGeoObject[IGeometry], Unit]): Unit = js.native
  def each(callback: js.Function1[/* object */ IGeoObject[IGeometry], Unit], context: js.Object): Unit = js.native
  
  def get(index: Double): IGeoObject[IGeometry] = js.native
  
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def getIterator(): IIterator = js.native
  
  def getLength(): Double = js.native
  
  def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def indexOf(`object`: IGeoObject[IGeometry]): Double = js.native
  
  def remove(child: IGeoObject[IGeometry]): this.type = js.native
  
  def removeAll(): this.type = js.native
  
  def set(index: Double, child: IGeoObject[IGeometry]): this.type = js.native
  
  def splice(index: Double, length: Double): this.type = js.native
}
