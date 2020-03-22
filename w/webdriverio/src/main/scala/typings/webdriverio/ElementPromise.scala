package typings.webdriverio

import typings.node.Buffer
import typings.webdriverio.WebdriverIO.AddValueOptions
import typings.webdriverio.WebdriverIO.CSSProperty
import typings.webdriverio.WebdriverIO.ClickOptions
import typings.webdriverio.WebdriverIO.Element
import typings.webdriverio.WebdriverIO.ElementArray
import typings.webdriverio.WebdriverIO.LocationParam
import typings.webdriverio.WebdriverIO.SizeParam
import typings.webdriverio.WebdriverIO.WaitForOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Element commands that should be wrapper with Promise
/* Inlined std.Omit<webdriverio.WebdriverIO.Element, 'addCommand' | '$' | '$$' | 'selector' | 'elementId' | 'element-6066-11e4-a52e-4f735466cecf' | 'ELEMENT' | 'index' | 'parent' | 'dragAndDrop' | 'touchAction'> */
@js.native
trait ElementPromise extends js.Object {
  @JSName("addValue")
  var addValue_Original: js.Function2[
    /* value */ String | Double | Boolean | js.Object | js.Array[_], 
    /* options */ js.UndefOr[AddValueOptions], 
    Unit
  ] = js.native
  @JSName("clearValue")
  var clearValue_Original: js.Function0[Unit] = js.native
  @JSName("click")
  var click_Original: js.Function1[/* options */ js.UndefOr[ClickOptions], Unit] = js.native
  @JSName("custom$")
  var custom$_Original: js.Function2[/* strategyName */ String, /* strategyArguments */ js.Any, Element] = js.native
  @JSName("custom$$")
  var customDollarDollar_Original: js.Function2[/* strategyName */ String, /* strategyArguments */ js.Any, ElementArray] = js.native
  @JSName("doubleClick")
  var doubleClick_Original: js.Function0[Unit] = js.native
  @JSName("getAttribute")
  var getAttribute_Original: js.Function1[/* attributeName */ String, String] = js.native
  @JSName("getCSSProperty")
  var getCSSProperty_Original: js.Function1[/* cssProperty */ String, CSSProperty] = js.native
  @JSName("getHTML")
  var getHTML_Original: js.Function1[/* includeSelectorTag */ js.UndefOr[Boolean], String] = js.native
  @JSName("getLocation")
  var getLocation_Original: js.Function1[/* prop */ LocationParam, Double] = js.native
  @JSName("getProperty")
  var getProperty_Original: js.Function1[/* property */ String, js.Object | String | Boolean | Double] = js.native
  @JSName("getSize")
  var getSize_Original: js.Function1[/* prop */ SizeParam, Double] = js.native
  @JSName("getTagName")
  var getTagName_Original: js.Function0[String] = js.native
  @JSName("getText")
  var getText_Original: js.Function0[String] = js.native
  @JSName("getValue")
  var getValue_Original: js.Function0[String] = js.native
  @JSName("isClickable")
  var isClickable_Original: js.Function0[Boolean] = js.native
  @JSName("isDisplayedInViewport")
  var isDisplayedInViewport_Original: js.Function0[Boolean] = js.native
  @JSName("isDisplayed")
  var isDisplayed_Original: js.Function0[Boolean] = js.native
  @JSName("isEnabled")
  var isEnabled_Original: js.Function0[Boolean] = js.native
  @JSName("isEqual")
  var isEqual_Original: js.Function1[/* el */ Element, Boolean] = js.native
  @JSName("isExisting")
  var isExisting_Original: js.Function0[Boolean] = js.native
  @JSName("isFocused")
  var isFocused_Original: js.Function0[Boolean] = js.native
  @JSName("isSelected")
  var isSelected_Original: js.Function0[Boolean] = js.native
  @JSName("moveTo")
  var moveTo_Original: js.Function2[/* xoffset */ js.UndefOr[Double], /* yoffset */ js.UndefOr[Double], Unit] = js.native
  @JSName("react$")
  var react$_Original: js.Function3[
    /* selector */ String, 
    /* props */ js.UndefOr[js.Object], 
    /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
    Element
  ] = js.native
  @JSName("react$$")
  var reactDollarDollar_Original: js.Function3[
    /* selector */ String, 
    /* props */ js.UndefOr[js.Object], 
    /* state */ js.UndefOr[js.Array[_] | Double | String | js.Object | Boolean], 
    ElementArray
  ] = js.native
  @JSName("saveScreenshot")
  var saveScreenshot_Original: js.Function1[/* filename */ String, Buffer] = js.native
  @JSName("scrollIntoView")
  var scrollIntoView_Original: js.Function1[/* scrollIntoViewOptions */ js.UndefOr[js.Object | Boolean], Unit] = js.native
  @JSName("selectByAttribute")
  var selectByAttribute_Original: js.Function2[/* attribute */ String, /* value */ String, Unit] = js.native
  @JSName("selectByIndex")
  var selectByIndex_Original: js.Function1[/* index */ Double, Unit] = js.native
  @JSName("selectByVisibleText")
  var selectByVisibleText_Original: js.Function1[/* text */ String, Unit] = js.native
  @JSName("setValue")
  var setValue_Original: js.Function2[
    /* value */ String | Double | Boolean | js.Object | js.Array[_], 
    /* options */ js.UndefOr[AddValueOptions], 
    Unit
  ] = js.native
  @JSName("shadow$")
  var shadow$_Original: js.Function1[/* selector */ String | js.Function, Element] = js.native
  @JSName("shadow$$")
  var shadowDollarDollar_Original: js.Function1[/* selector */ String | js.Function, ElementArray] = js.native
  @JSName("waitForClickable")
  var waitForClickable_Original: js.Function1[/* options */ js.UndefOr[WaitForOptions], Boolean] = js.native
  @JSName("waitForDisplayed")
  var waitForDisplayed_Original: js.Function3[
    /* ms */ js.UndefOr[Double], 
    /* reverse */ js.UndefOr[Boolean], 
    /* error */ js.UndefOr[String], 
    Boolean
  ] = js.native
  @JSName("waitForEnabled")
  var waitForEnabled_Original: js.Function3[
    /* ms */ js.UndefOr[Double], 
    /* reverse */ js.UndefOr[Boolean], 
    /* error */ js.UndefOr[String], 
    Boolean
  ] = js.native
  @JSName("waitForExist")
  var waitForExist_Original: js.Function3[
    /* ms */ js.UndefOr[Double], 
    /* reverse */ js.UndefOr[Boolean], 
    /* error */ js.UndefOr[String], 
    Boolean
  ] = js.native
  def addValue(value: String): Unit = js.native
  def addValue(value: String, options: AddValueOptions): Unit = js.native
  def addValue(value: js.Array[_]): Unit = js.native
  def addValue(value: js.Array[_], options: AddValueOptions): Unit = js.native
  def addValue(value: js.Object): Unit = js.native
  def addValue(value: js.Object, options: AddValueOptions): Unit = js.native
  def addValue(value: Boolean): Unit = js.native
  def addValue(value: Boolean, options: AddValueOptions): Unit = js.native
  def addValue(value: Double): Unit = js.native
  def addValue(value: Double, options: AddValueOptions): Unit = js.native
  def clearValue(): Unit = js.native
  def click(): Unit = js.native
  def click(options: ClickOptions): Unit = js.native
  @JSName("custom$")
  def custom$(strategyName: String, strategyArguments: js.Any): Element = js.native
  @JSName("custom$$")
  def customDollarDollar(strategyName: String, strategyArguments: js.Any): ElementArray = js.native
  def doubleClick(): Unit = js.native
  def getAttribute(attributeName: String): String = js.native
  def getCSSProperty(cssProperty: String): CSSProperty = js.native
  def getHTML(): String = js.native
  def getHTML(includeSelectorTag: Boolean): String = js.native
  def getLocation(prop: LocationParam): Double = js.native
  def getProperty(property: String): js.Object | String | Boolean | Double = js.native
  def getSize(prop: SizeParam): Double = js.native
  def getTagName(): String = js.native
  def getText(): String = js.native
  def getValue(): String = js.native
  def isClickable(): Boolean = js.native
  def isDisplayed(): Boolean = js.native
  def isDisplayedInViewport(): Boolean = js.native
  def isEnabled(): Boolean = js.native
  def isEqual(el: Element): Boolean = js.native
  def isExisting(): Boolean = js.native
  def isFocused(): Boolean = js.native
  def isSelected(): Boolean = js.native
  def moveTo(): Unit = js.native
  def moveTo(xoffset: Double): Unit = js.native
  def moveTo(xoffset: Double, yoffset: Double): Unit = js.native
  @JSName("react$")
  def react$(selector: String): Element = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object): Element = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: String): Element = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: js.Array[_]): Element = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: js.Object): Element = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: Boolean): Element = js.native
  @JSName("react$")
  def react$(selector: String, props: js.Object, state: Double): Element = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String): ElementArray = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String, props: js.Object): ElementArray = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String, props: js.Object, state: String): ElementArray = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String, props: js.Object, state: js.Array[_]): ElementArray = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String, props: js.Object, state: js.Object): ElementArray = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String, props: js.Object, state: Boolean): ElementArray = js.native
  @JSName("react$$")
  def reactDollarDollar(selector: String, props: js.Object, state: Double): ElementArray = js.native
  def saveScreenshot(filename: String): Buffer = js.native
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(scrollIntoViewOptions: js.Object): Unit = js.native
  def scrollIntoView(scrollIntoViewOptions: Boolean): Unit = js.native
  def selectByAttribute(attribute: String, value: String): Unit = js.native
  def selectByIndex(index: Double): Unit = js.native
  def selectByVisibleText(text: String): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: String, options: AddValueOptions): Unit = js.native
  def setValue(value: js.Array[_]): Unit = js.native
  def setValue(value: js.Array[_], options: AddValueOptions): Unit = js.native
  def setValue(value: js.Object): Unit = js.native
  def setValue(value: js.Object, options: AddValueOptions): Unit = js.native
  def setValue(value: Boolean): Unit = js.native
  def setValue(value: Boolean, options: AddValueOptions): Unit = js.native
  def setValue(value: Double): Unit = js.native
  def setValue(value: Double, options: AddValueOptions): Unit = js.native
  @JSName("shadow$")
  def shadow$(selector: String): Element = js.native
  @JSName("shadow$")
  def shadow$(selector: js.Function): Element = js.native
  @JSName("shadow$$")
  def shadowDollarDollar(selector: String): ElementArray = js.native
  @JSName("shadow$$")
  def shadowDollarDollar(selector: js.Function): ElementArray = js.native
  def waitForClickable(): Boolean = js.native
  def waitForClickable(options: WaitForOptions): Boolean = js.native
  def waitForDisplayed(): Boolean = js.native
  def waitForDisplayed(ms: Double): Boolean = js.native
  def waitForDisplayed(ms: Double, reverse: Boolean): Boolean = js.native
  def waitForDisplayed(ms: Double, reverse: Boolean, error: String): Boolean = js.native
  def waitForEnabled(): Boolean = js.native
  def waitForEnabled(ms: Double): Boolean = js.native
  def waitForEnabled(ms: Double, reverse: Boolean): Boolean = js.native
  def waitForEnabled(ms: Double, reverse: Boolean, error: String): Boolean = js.native
  def waitForExist(): Boolean = js.native
  def waitForExist(ms: Double): Boolean = js.native
  def waitForExist(ms: Double, reverse: Boolean): Boolean = js.native
  def waitForExist(ms: Double, reverse: Boolean, error: String): Boolean = js.native
}

