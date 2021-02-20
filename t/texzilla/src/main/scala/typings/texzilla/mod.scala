package typings.texzilla

import typings.std.DOMParser
import typings.std.Document
import typings.std.Element
import typings.std.HTMLImageElement
import typings.std.XMLSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("texzilla", "filterElement")
  @js.native
  def filterElement(el: Element): Unit = js.native
  @JSImport("texzilla", "filterElement")
  @js.native
  def filterElement(el: Element, throwOnError: Boolean): Unit = js.native
  
  @JSImport("texzilla", "filterString")
  @js.native
  def filterString(str: String): String = js.native
  @JSImport("texzilla", "filterString")
  @js.native
  def filterString(str: String, throwOnError: Boolean): String = js.native
  
  @JSImport("texzilla", "getTeXSource")
  @js.native
  def getTeXSource(el: String): String | Null = js.native
  @JSImport("texzilla", "getTeXSource")
  @js.native
  def getTeXSource(el: Element): String | Null = js.native
  
  @JSImport("texzilla", "setDOMParser")
  @js.native
  def setDOMParser(parser: DOMParser): Unit = js.native
  
  @JSImport("texzilla", "setItexIdentifierMode")
  @js.native
  def setItexIdentifierMode(enabled: Boolean): Unit = js.native
  
  @JSImport("texzilla", "setSafeMode")
  @js.native
  def setSafeMode(enabled: Boolean): Unit = js.native
  
  @JSImport("texzilla", "setXMLSerializer")
  @js.native
  def setXMLSerializer(serializer: XMLSerializer): Unit = js.native
  
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(str: String): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(
    str: String,
    rightToLeft: js.UndefOr[scala.Nothing],
    roundToPowerOfTwo: js.UndefOr[scala.Nothing],
    size: js.UndefOr[scala.Nothing],
    document: Document
  ): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(
    str: String,
    rightToLeft: js.UndefOr[scala.Nothing],
    roundToPowerOfTwo: js.UndefOr[scala.Nothing],
    size: Double
  ): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(
    str: String,
    rightToLeft: js.UndefOr[scala.Nothing],
    roundToPowerOfTwo: js.UndefOr[scala.Nothing],
    size: Double,
    document: Document
  ): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(str: String, rightToLeft: js.UndefOr[scala.Nothing], roundToPowerOfTwo: Boolean): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(
    str: String,
    rightToLeft: js.UndefOr[scala.Nothing],
    roundToPowerOfTwo: Boolean,
    size: js.UndefOr[scala.Nothing],
    document: Document
  ): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(str: String, rightToLeft: js.UndefOr[scala.Nothing], roundToPowerOfTwo: Boolean, size: Double): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(
    str: String,
    rightToLeft: js.UndefOr[scala.Nothing],
    roundToPowerOfTwo: Boolean,
    size: Double,
    document: Document
  ): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(str: String, rightToLeft: Boolean): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(
    str: String,
    rightToLeft: Boolean,
    roundToPowerOfTwo: js.UndefOr[scala.Nothing],
    size: js.UndefOr[scala.Nothing],
    document: Document
  ): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: js.UndefOr[scala.Nothing], size: Double): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(
    str: String,
    rightToLeft: Boolean,
    roundToPowerOfTwo: js.UndefOr[scala.Nothing],
    size: Double,
    document: Document
  ): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: Boolean): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(
    str: String,
    rightToLeft: Boolean,
    roundToPowerOfTwo: Boolean,
    size: js.UndefOr[scala.Nothing],
    document: Document
  ): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: Boolean, size: Double): HTMLImageElement = js.native
  @JSImport("texzilla", "toImage")
  @js.native
  def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: Boolean, size: Double, document: Document): HTMLImageElement = js.native
  
  @JSImport("texzilla", "toMathML")
  @js.native
  def toMathML(str: String): Element = js.native
  @JSImport("texzilla", "toMathML")
  @js.native
  def toMathML(
    str: String,
    displayMode: js.UndefOr[scala.Nothing],
    rightToLeft: js.UndefOr[scala.Nothing],
    throwOnError: Boolean
  ): Element = js.native
  @JSImport("texzilla", "toMathML")
  @js.native
  def toMathML(str: String, displayMode: js.UndefOr[scala.Nothing], rightToLeft: Boolean): Element = js.native
  @JSImport("texzilla", "toMathML")
  @js.native
  def toMathML(str: String, displayMode: js.UndefOr[scala.Nothing], rightToLeft: Boolean, throwOnError: Boolean): Element = js.native
  @JSImport("texzilla", "toMathML")
  @js.native
  def toMathML(str: String, displayMode: Boolean): Element = js.native
  @JSImport("texzilla", "toMathML")
  @js.native
  def toMathML(str: String, displayMode: Boolean, rightToLeft: js.UndefOr[scala.Nothing], throwOnError: Boolean): Element = js.native
  @JSImport("texzilla", "toMathML")
  @js.native
  def toMathML(str: String, displayMode: Boolean, rightToLeft: Boolean): Element = js.native
  @JSImport("texzilla", "toMathML")
  @js.native
  def toMathML(str: String, displayMode: Boolean, rightToLeft: Boolean, throwOnError: Boolean): Element = js.native
  
  @JSImport("texzilla", "toMathMLString")
  @js.native
  def toMathMLString(str: String): String = js.native
  @JSImport("texzilla", "toMathMLString")
  @js.native
  def toMathMLString(
    str: String,
    displayMode: js.UndefOr[scala.Nothing],
    rightToLeft: js.UndefOr[scala.Nothing],
    throwOnError: Boolean
  ): String = js.native
  @JSImport("texzilla", "toMathMLString")
  @js.native
  def toMathMLString(str: String, displayMode: js.UndefOr[scala.Nothing], rightToLeft: Boolean): String = js.native
  @JSImport("texzilla", "toMathMLString")
  @js.native
  def toMathMLString(str: String, displayMode: js.UndefOr[scala.Nothing], rightToLeft: Boolean, throwOnError: Boolean): String = js.native
  @JSImport("texzilla", "toMathMLString")
  @js.native
  def toMathMLString(str: String, displayMode: Boolean): String = js.native
  @JSImport("texzilla", "toMathMLString")
  @js.native
  def toMathMLString(str: String, displayMode: Boolean, rightToLeft: js.UndefOr[scala.Nothing], throwOnError: Boolean): String = js.native
  @JSImport("texzilla", "toMathMLString")
  @js.native
  def toMathMLString(str: String, displayMode: Boolean, rightToLeft: Boolean): String = js.native
  @JSImport("texzilla", "toMathMLString")
  @js.native
  def toMathMLString(str: String, displayMode: Boolean, rightToLeft: Boolean, throwOnError: Boolean): String = js.native
}
