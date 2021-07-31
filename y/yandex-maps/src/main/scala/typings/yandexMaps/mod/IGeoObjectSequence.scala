package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoObjectSequence
  extends StObject
     with ICustomizable
     with IParentOnMap {
  
  def each(callback: js.Function1[/* geoObject */ IGeoObject[IGeometry], Unit]): Unit = js.native
  def each(callback: js.Function1[/* geoObject */ IGeoObject[IGeometry], Unit], context: js.Object): Unit = js.native
  
  def get(index: Double): IGeoObject[IGeometry] = js.native
  
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def getIterator(): IIterator = js.native
  
  def getLength(): Double = js.native
  
  def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def indexOf(geoObject: IGeoObject[IGeometry]): Double = js.native
}
