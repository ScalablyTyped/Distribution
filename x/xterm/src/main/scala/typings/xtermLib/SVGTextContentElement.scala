package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGTextContentElement extends SVGGraphicsElement {
  val LENGTHADJUST_SPACING: scala.Double = js.native
  val LENGTHADJUST_SPACINGANDGLYPHS: scala.Double = js.native
  val LENGTHADJUST_UNKNOWN: scala.Double = js.native
  val lengthAdjust: SVGAnimatedEnumeration = js.native
  val textLength: SVGAnimatedLength = js.native
  def getCharNumAtPosition(point: SVGPoint): scala.Double = js.native
  def getComputedTextLength(): scala.Double = js.native
  def getEndPositionOfChar(charnum: scala.Double): SVGPoint = js.native
  def getExtentOfChar(charnum: scala.Double): SVGRect = js.native
  def getNumberOfChars(): scala.Double = js.native
  def getRotationOfChar(charnum: scala.Double): scala.Double = js.native
  def getStartPositionOfChar(charnum: scala.Double): SVGPoint = js.native
  def getSubStringLength(charnum: scala.Double, nchars: scala.Double): scala.Double = js.native
  def selectSubString(charnum: scala.Double, nchars: scala.Double): scala.Unit = js.native
}

@JSGlobal("SVGTextContentElement")
@js.native
object SVGTextContentElement
  extends ScalablyTyped.runtime.Instantiable0[SVGTextContentElement] {
  val LENGTHADJUST_SPACING: scala.Double = js.native
  val LENGTHADJUST_SPACINGANDGLYPHS: scala.Double = js.native
  val LENGTHADJUST_UNKNOWN: scala.Double = js.native
}

