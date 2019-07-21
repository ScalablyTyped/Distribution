package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- yandexDashMapsLib.yandexDashMapsMod.ILineStringGeometryAccess because var conflicts: events. Inlined get, getChildGeometry, getClosest, getCoordinates, getLength, insert, remove, set, setCoordinates, splice */ @js.native
trait ILineStringGeometry extends IGeometry {
  def get(index: scala.Double): js.Array[scala.Double] = js.native
  def getChildGeometry(index: scala.Double): IPointGeometryAccess = js.native
  def getClosest(anchorPosition: js.Array[scala.Double]): js.Object = js.native
  def getCoordinates(): js.Array[js.Array[scala.Double]] = js.native
  def getLength(): scala.Double = js.native
  def insert(index: scala.Double, coordinates: js.Array[js.Array[scala.Double]]): ILineStringGeometryAccess = js.native
  def remove(index: scala.Double): js.Array[scala.Double] = js.native
  def set(index: scala.Double, coordinates: js.Array[scala.Double]): ILineStringGeometryAccess = js.native
  def setCoordinates(coordinates: js.Array[scala.Double]): ILineStringGeometryAccess = js.native
  def splice(index: scala.Double, length: scala.Double): js.Array[js.Array[scala.Double]] = js.native
}

