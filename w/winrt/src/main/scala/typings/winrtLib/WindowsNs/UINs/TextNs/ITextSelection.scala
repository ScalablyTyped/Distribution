package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextSelection extends ITextRange {
  var options: SelectionOptions
  var `type`: SelectionType
  def endKey(unit: TextRangeUnit, extend: scala.Boolean): scala.Double
  def homeKey(unit: TextRangeUnit, extend: scala.Boolean): scala.Double
  def moveDown(unit: TextRangeUnit, count: scala.Double, extend: scala.Boolean): scala.Double
  def moveLeft(unit: TextRangeUnit, count: scala.Double, extend: scala.Boolean): scala.Double
  def moveRight(unit: TextRangeUnit, count: scala.Double, extend: scala.Boolean): scala.Double
  def moveUp(unit: TextRangeUnit, count: scala.Double, extend: scala.Boolean): scala.Double
  def typeText(value: java.lang.String): scala.Unit
}

