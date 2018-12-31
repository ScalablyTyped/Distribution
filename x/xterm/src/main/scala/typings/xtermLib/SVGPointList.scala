package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPointList extends js.Object {
  val numberOfItems: scala.Double
  def appendItem(newItem: SVGPoint): SVGPoint
  def clear(): scala.Unit
  def getItem(index: scala.Double): SVGPoint
  def initialize(newItem: SVGPoint): SVGPoint
  def insertItemBefore(newItem: SVGPoint, index: scala.Double): SVGPoint
  def removeItem(index: scala.Double): SVGPoint
  def replaceItem(newItem: SVGPoint, index: scala.Double): SVGPoint
}

@JSGlobal("SVGPointList")
@js.native
object SVGPointList
  extends org.scalablytyped.runtime.Instantiable0[SVGPointList]

