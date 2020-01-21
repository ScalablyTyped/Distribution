package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IFreezable because var conflicts: events. Inlined freeze, isFrozen, unfreeze
- typings.yandexMaps.mod.IPolygonGeometryAccess because var conflicts: events. Inlined contains, get, getChildGeometry, getClosest, getCoordinates, getFillRule, getLength, insert, remove, set, setCoordinates, setFillRule, splice */ @js.native
trait IPolygonGeometry extends IGeometry {
  def contains(position: js.Array[Double]): Boolean = js.native
  def freeze(): IFreezable = js.native
  def get(index: Double): js.Array[js.Array[Double]] = js.native
  def getChildGeometry(index: Double): ILinearRingGeometryAccess = js.native
  def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
  def getCoordinates(): js.Array[js.Array[js.Array[Double]]] = js.native
  def getFillRule(): String = js.native
  def getLength(): Double = js.native
  def insert(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess = js.native
  def isFrozen(): Boolean = js.native
  def remove(index: Double): ILinearRingGeometryAccess = js.native
  def set(index: Double, path: js.Array[js.Array[Double]]): IPolygonGeometryAccess = js.native
  def setCoordinates(coordinates: js.Array[js.Array[js.Array[Double]]]): IPolygonGeometryAccess = js.native
  def setFillRule(fillRule: String): IPolygonGeometryAccess = js.native
  def splice(index: Double, number: Double): js.Array[ILinearRingGeometryAccess] = js.native
  def unfreeze(): IFreezable = js.native
}

