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
  def addCommand(name: java.lang.String, func: js.Function): scala.Unit = js.native
  def addValue(value: js.Any): scala.Unit = js.native
  def clearValue(): scala.Unit = js.native
  def click(): scala.Unit = js.native
  def doubleClick(): scala.Unit = js.native
  def dragAndDrop(target: Element): scala.Unit = js.native
  def dragAndDrop(target: Element, duration: scala.Double): scala.Unit = js.native
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
  def moveTo(): scala.Unit = js.native
  def moveTo(xoffset: scala.Double): scala.Unit = js.native
  def moveTo(xoffset: scala.Double, yoffset: scala.Double): scala.Unit = js.native
  def saveScreenshot(filename: java.lang.String): nodeLib.Buffer = js.native
  def scrollIntoView(): scala.Unit = js.native
  def scrollIntoView(scrollIntoViewOptions: js.Object): scala.Unit = js.native
  def scrollIntoView(scrollIntoViewOptions: scala.Boolean): scala.Unit = js.native
  def selectByAttribute(attribute: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def selectByIndex(index: scala.Double): scala.Unit = js.native
  def selectByVisibleText(text: java.lang.String): scala.Unit = js.native
  def setValue(value: js.Any): scala.Unit = js.native
  @JSName("shadow$")
  def shadow$(): scala.Unit = js.native
  @JSName("shadow$$")
  def shadow$$(): scala.Unit = js.native
  def touchAction(action: TouchActions): scala.Unit = js.native
  def waitForDisplayed(): scala.Unit = js.native
  def waitForDisplayed(ms: scala.Double): scala.Unit = js.native
  def waitForDisplayed(ms: scala.Double, reverse: scala.Boolean): scala.Unit = js.native
  def waitForDisplayed(ms: scala.Double, reverse: scala.Boolean, error: java.lang.String): scala.Unit = js.native
  def waitForEnabled(): scala.Unit = js.native
  def waitForEnabled(ms: scala.Double): scala.Unit = js.native
  def waitForEnabled(ms: scala.Double, reverse: scala.Boolean): scala.Unit = js.native
  def waitForEnabled(ms: scala.Double, reverse: scala.Boolean, error: java.lang.String): scala.Unit = js.native
  def waitForExist(): scala.Unit = js.native
  def waitForExist(ms: scala.Double): scala.Unit = js.native
  def waitForExist(ms: scala.Double, reverse: scala.Boolean): scala.Unit = js.native
  def waitForExist(ms: scala.Double, reverse: scala.Boolean, error: java.lang.String): scala.Unit = js.native
}

