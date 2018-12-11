package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SVGStringList
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[java.lang.String] {
  val length: scala.Double
  val numberOfItems: scala.Double
  def appendItem(newItem: java.lang.String): java.lang.String
  def clear(): scala.Unit
  def getItem(index: scala.Double): java.lang.String
  def initialize(newItem: java.lang.String): java.lang.String
  def insertItemBefore(newItem: java.lang.String, index: scala.Double): java.lang.String
  def removeItem(index: scala.Double): java.lang.String
  def replaceItem(newItem: java.lang.String, index: scala.Double): java.lang.String
}

@JSGlobal("SVGStringList")
@js.native
object SVGStringList
  extends ScalablyTyped.runtime.Instantiable0[SVGStringList]

