package typings
package texzillaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("texzilla", JSImport.Namespace)
@js.native
object texzillaMod extends js.Object {
  def filterElement(el: stdLib.Element): scala.Unit = js.native
  def filterElement(el: stdLib.Element, throwOnError: scala.Boolean): scala.Unit = js.native
  def filterString(str: java.lang.String): java.lang.String = js.native
  def filterString(str: java.lang.String, throwOnError: scala.Boolean): java.lang.String = js.native
  def getTeXSource(el: java.lang.String): java.lang.String | scala.Null = js.native
  def getTeXSource(el: stdLib.Element): java.lang.String | scala.Null = js.native
  def setDOMParser(parser: stdLib.DOMParser): scala.Unit = js.native
  def setItexIdentifierMode(enabled: scala.Boolean): scala.Unit = js.native
  def setSafeMode(enabled: scala.Boolean): scala.Unit = js.native
  def setXMLSerializer(serializer: stdLib.XMLSerializer): scala.Unit = js.native
  def toImage(str: java.lang.String): stdLib.HTMLImageElement = js.native
  def toImage(str: java.lang.String, rightToLeft: scala.Boolean): stdLib.HTMLImageElement = js.native
  def toImage(str: java.lang.String, rightToLeft: scala.Boolean, roundToPowerOfTwo: scala.Boolean): stdLib.HTMLImageElement = js.native
  def toImage(
    str: java.lang.String,
    rightToLeft: scala.Boolean,
    roundToPowerOfTwo: scala.Boolean,
    size: scala.Double
  ): stdLib.HTMLImageElement = js.native
  def toImage(
    str: java.lang.String,
    rightToLeft: scala.Boolean,
    roundToPowerOfTwo: scala.Boolean,
    size: scala.Double,
    document: stdLib.Document
  ): stdLib.HTMLImageElement = js.native
  def toMathML(str: java.lang.String): stdLib.Element = js.native
  def toMathML(str: java.lang.String, displayMode: scala.Boolean): stdLib.Element = js.native
  def toMathML(str: java.lang.String, displayMode: scala.Boolean, rightToLeft: scala.Boolean): stdLib.Element = js.native
  def toMathML(
    str: java.lang.String,
    displayMode: scala.Boolean,
    rightToLeft: scala.Boolean,
    throwOnError: scala.Boolean
  ): stdLib.Element = js.native
  def toMathMLString(str: java.lang.String): java.lang.String = js.native
  def toMathMLString(str: java.lang.String, displayMode: scala.Boolean): java.lang.String = js.native
  def toMathMLString(str: java.lang.String, displayMode: scala.Boolean, rightToLeft: scala.Boolean): java.lang.String = js.native
  def toMathMLString(
    str: java.lang.String,
    displayMode: scala.Boolean,
    rightToLeft: scala.Boolean,
    throwOnError: scala.Boolean
  ): java.lang.String = js.native
}

