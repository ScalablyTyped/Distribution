package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  @JSName("$")
  def $(selector: java.lang.String): Element = js.native
  @JSName("$")
  def $(selector: js.Function): Element = js.native
  @JSName("$$")
  def $$(selector: java.lang.String): js.Array[Element] = js.native
  @JSName("$$")
  def $$(selector: js.Function): js.Array[Element] = js.native
  def addCommand(name: java.lang.String, func: js.Function): js.UndefOr[scala.Nothing] = js.native
  def addValue(value: js.Any): js.UndefOr[scala.Nothing] = js.native
  def clearValue(): js.UndefOr[scala.Nothing] = js.native
  def click(): js.UndefOr[scala.Nothing] = js.native
  def doubleClick(): js.UndefOr[scala.Nothing] = js.native
  def dragAndDrop(target: Element): js.UndefOr[scala.Nothing] = js.native
  def dragAndDrop(target: Element, duration: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def getAttribute(attributeName: java.lang.String): java.lang.String = js.native
  def getCSSProperty(cssProperty: java.lang.String): CSSProperty = js.native
  def getHTML(): java.lang.String = js.native
  def getHTML(includeSelectorTag: scala.Boolean): java.lang.String = js.native
  def getLocation(): LocationReturn = js.native
  def getLocation(prop: LocationParam): scala.Double = js.native
  def getProperty(property: java.lang.String): js.Object | java.lang.String = js.native
  def getSize(): SizeReturn = js.native
  def getSize(prop: SizeParam): scala.Double = js.native
  def getTagName(): java.lang.String = js.native
  def getText(): java.lang.String = js.native
  def getValue(): java.lang.String = js.native
  def isDisplayed(): scala.Boolean = js.native
  def isDisplayedInViewport(): scala.Boolean = js.native
  def isEnabled(): scala.Boolean = js.native
  def isExisting(): scala.Boolean = js.native
  def isFocused(): scala.Boolean = js.native
  def isSelected(): scala.Boolean = js.native
  def moveTo(): js.UndefOr[scala.Nothing] = js.native
  def moveTo(xoffset: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def moveTo(xoffset: scala.Double, yoffset: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def saveScreenshot(filename: java.lang.String): nodeLib.Buffer = js.native
  def scrollIntoView(): js.UndefOr[scala.Nothing] = js.native
  def selectByAttribute(attribute: java.lang.String, value: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def selectByIndex(index: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def selectByVisibleText(text: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def setValue(value: js.Any): js.UndefOr[scala.Nothing] = js.native
  def touchAction(action: TouchActions): js.UndefOr[scala.Nothing] = js.native
  def waitForDisplayed(): js.UndefOr[scala.Nothing] = js.native
  def waitForDisplayed(ms: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def waitForDisplayed(ms: scala.Double, reverse: scala.Boolean): js.UndefOr[scala.Nothing] = js.native
  def waitForDisplayed(ms: scala.Double, reverse: scala.Boolean, error: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def waitForEnabled(): js.UndefOr[scala.Nothing] = js.native
  def waitForEnabled(ms: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def waitForEnabled(ms: scala.Double, reverse: scala.Boolean): js.UndefOr[scala.Nothing] = js.native
  def waitForEnabled(ms: scala.Double, reverse: scala.Boolean, error: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def waitForExist(): js.UndefOr[scala.Nothing] = js.native
  def waitForExist(ms: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def waitForExist(ms: scala.Double, reverse: scala.Boolean): js.UndefOr[scala.Nothing] = js.native
  def waitForExist(ms: scala.Double, reverse: scala.Boolean, error: java.lang.String): js.UndefOr[scala.Nothing] = js.native
}

