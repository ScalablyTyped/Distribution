package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Options
// EventEmitter
// Promise
// Cookie
// Grid
// Mobile
// Property
// Protocol
// State
// Utility
// Window
@js.native
trait Client[T] extends js.Object {
  var desiredCapabilities: DesiredCapabilities = js.native
  var isAndroid: scala.Boolean = js.native
  var isIOS: scala.Boolean = js.native
  var isMobile: scala.Boolean = js.native
  var options: Options = js.native
  var sessionId: java.lang.String = js.native
  @JSName("$")
  def $(selector: java.lang.String): Client[RawResult[Element]] with RawResult[Element] = js.native
  @JSName("$$")
  def $$(selector: java.lang.String): js.Array[Client[RawResult[Element]]] with js.Array[RawResult[Element]] = js.native
  @JSName("$$")
  def $$_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("$")
  def $_PClient[P](selector: java.lang.String): Client[P] = js.native
  def addCommand(commandName: java.lang.String, customMethod: js.Function1[/* repeated */ js.Any, scala.Unit]): Client[scala.Unit] with js.UndefOr[scala.Nothing] = js.native
  def addCommand(
    commandName: java.lang.String,
    customMethod: js.Function1[/* repeated */ js.Any, scala.Unit],
    overwrite: scala.Boolean
  ): Client[scala.Unit] with js.UndefOr[scala.Nothing] = js.native
  @JSName("addCommand")
  def addCommand_PClient[P](commandName: java.lang.String, customMethod: js.Function1[/* repeated */ js.Any, scala.Unit]): Client[P] = js.native
  @JSName("addCommand")
  def addCommand_PClient[P](
    commandName: java.lang.String,
    customMethod: js.Function1[/* repeated */ js.Any, scala.Unit],
    overwrite: scala.Boolean
  ): Client[P] = js.native
  def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): Client[T] = js.native
  def addValue(selector: java.lang.String, value: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def addValue(selector: java.lang.String, value: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def addValue(value: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def addValue(value: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("addValue")
  def addValue_PClient[P](selector: java.lang.String, value: java.lang.String): Client[P] = js.native
  @JSName("addValue")
  def addValue_PClient[P](selector: java.lang.String, value: scala.Double): Client[P] = js.native
  @JSName("addValue")
  def addValue_PClient[P](value: java.lang.String): Client[P] = js.native
  @JSName("addValue")
  def addValue_PClient[P](value: scala.Double): Client[P] = js.native
  def alertAccept(): Client[RawResult[scala.Null]] = js.native
  @JSName("alertAccept")
  def alertAccept_P[P](): Client[P] = js.native
  def alertDismiss(): Client[RawResult[scala.Null]] = js.native
  @JSName("alertDismiss")
  def alertDismiss_P[P](): Client[P] = js.native
  def alertText(): Client[java.lang.String] | java.lang.String = js.native
  def alertText(text: java.lang.String): Client[scala.Null] | scala.Null = js.native
  @JSName("alertText")
  def alertText_PClient[P](): Client[P] = js.native
  @JSName("alertText")
  def alertText_PClient[P](text: java.lang.String): Client[P] = js.native
  /** @deprecated */
  def applicationCacheStatus(): Client[RawResult[ApplicationCacheStatus]] with RawResult[ApplicationCacheStatus] with scala.Nothing = js.native
  /** @deprecated */
  @JSName("applicationCacheStatus")
  def applicationCacheStatus_PClient[P](): Client[P] = js.native
  def back(): Client[RawResult[scala.Null]] = js.native
  @JSName("back")
  def back_P[P](): Client[P] = js.native
  def background(seconds: scala.Double): Client[T] = js.native
  /** @deprecated in favour of Actions.pointerDown */
  def buttonDown(): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  def buttonDown(button: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  def buttonDown(button: Button): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated in favour of Actions.pointerDown */
  @JSName("buttonDown")
  def buttonDown_PClient[P](): Client[P] = js.native
  @JSName("buttonDown")
  def buttonDown_PClient[P](button: java.lang.String): Client[P] = js.native
  @JSName("buttonDown")
  def buttonDown_PClient[P](button: Button): Client[P] = js.native
  /** @deprecated in favour of Actions.pointerDown */
  def buttonPress(): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  def buttonPress(button: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  def buttonPress(button: Button): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated in favour of Actions.pointerDown */
  @JSName("buttonPress")
  def buttonPress_PClient[P](): Client[P] = js.native
  @JSName("buttonPress")
  def buttonPress_PClient[P](button: java.lang.String): Client[P] = js.native
  @JSName("buttonPress")
  def buttonPress_PClient[P](button: Button): Client[P] = js.native
  /** @deprecated in favour of Actions.pointerUp */
  def buttonUp(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def buttonUp(button: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def buttonUp(button: Button): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  /** @deprecated in favour of Actions.pointerUp */
  @JSName("buttonUp")
  def buttonUp_PClient[P](): Client[P] = js.native
  @JSName("buttonUp")
  def buttonUp_PClient[P](button: java.lang.String): Client[P] = js.native
  @JSName("buttonUp")
  def buttonUp_PClient[P](button: Button): Client[P] = js.native
  def call[P](callback: js.Function0[scala.Unit]): Client[P] with js.Any = js.native
  def `catch`[P](): Client[P] = js.native
  def `catch`[P](onRejected: js.Function1[/* error */ js.Any, P | Client[P]]): Client[P] = js.native
  def chooseFile(localPath: java.lang.String): Client[scala.Unit] = js.native
  def chooseFile(selector: java.lang.String, localPath: java.lang.String): Client[scala.Unit] with js.UndefOr[scala.Nothing] = js.native
  @JSName("chooseFile")
  def chooseFile_P[P](localPath: java.lang.String): Client[P] = js.native
  @JSName("chooseFile")
  def chooseFile_PClient[P](selector: java.lang.String, localPath: java.lang.String): Client[P] = js.native
  def clearElement(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def clearElement(selector: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("clearElement")
  def clearElement_PClient[P](): Client[P] = js.native
  @JSName("clearElement")
  def clearElement_PClient[P](selector: java.lang.String): Client[P] = js.native
  def click(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def click(selector: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("click")
  def click_PClient[P](): Client[P] = js.native
  @JSName("click")
  def click_PClient[P](selector: java.lang.String): Client[P] = js.native
  def close(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def close(windowHandle: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def closeApp(): Client[T] = js.native
  @JSName("close")
  def close_PClient[P](): Client[P] = js.native
  @JSName("close")
  def close_PClient[P](windowHandle: java.lang.String): Client[P] = js.native
  def context(): Client[T] with RawResult[java.lang.String] = js.native
  def context(id: java.lang.String): Client[T] with RawResult[java.lang.String] = js.native
  def contexts(): Client[T] with RawResult[js.Array[java.lang.String]] = js.native
  def cookie(): (Client[RawResult[js.Array[Cookie] with js.Array[RawResult[java.lang.String]]]]) with (RawResult[js.Array[Cookie] with js.Array[RawResult[java.lang.String]]]) = js.native
  def cookie(method: Method): (Client[RawResult[js.Array[Cookie] with js.Array[RawResult[java.lang.String]]]]) with (RawResult[js.Array[Cookie] with js.Array[RawResult[java.lang.String]]]) = js.native
  def cookie(method: Method, key: Cookie with RawResult[java.lang.String]): (Client[RawResult[js.Array[Cookie] with js.Array[RawResult[java.lang.String]]]]) with (RawResult[js.Array[Cookie] with js.Array[RawResult[java.lang.String]]]) = js.native
  def cookie(method: Method, key: java.lang.String): (Client[RawResult[js.Array[Cookie] with js.Array[RawResult[java.lang.String]]]]) with (RawResult[js.Array[Cookie] with js.Array[RawResult[java.lang.String]]]) = js.native
  def currentActivity(): js.Any = js.native
  def debug(): Client[scala.Unit] = js.native
  @JSName("debug")
  def debug_P[P](): Client[P] = js.native
  def deleteCookie(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def deleteCookie(name: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("deleteCookie")
  def deleteCookie_PClient[P](): Client[P] = js.native
  @JSName("deleteCookie")
  def deleteCookie_PClient[P](name: java.lang.String): Client[P] = js.native
  def deviceKeyEvent(keyValue: scala.Double): Client[T] = js.native
  /** @deprecated in favour of Actions.pointerDown(0) + Actions.pointerMove */
  def doDoubleClick(): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated in favour of Actions.pointerDown(0) + Actions.pointerMove */
  @JSName("doDoubleClick")
  def doDoubleClick_PClient[P](): Client[P] = js.native
  def doubleClick(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def doubleClick(selector: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("doubleClick")
  def doubleClick_PClient[P](): Client[P] = js.native
  @JSName("doubleClick")
  def doubleClick_PClient[P](selector: java.lang.String): Client[P] = js.native
  def dragAndDrop(destinationElem: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def dragAndDrop(sourceElem: java.lang.String, destinationElem: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("dragAndDrop")
  def dragAndDrop_PClient[P](destinationElem: java.lang.String): Client[P] = js.native
  @JSName("dragAndDrop")
  def dragAndDrop_PClient[P](sourceElem: java.lang.String, destinationElem: java.lang.String): Client[P] = js.native
  def element(selector: java.lang.String): Client[RawResult[Element]] with RawResult[Element] = js.native
  def elementActive(): Client[RawResult[Element]] with RawResult[Element] = js.native
  @JSName("elementActive")
  def elementActive_PClient[P](): Client[P] = js.native
  def elementIdAttribute(id: ElementId, attributeName: java.lang.String): Client[RawResult[java.lang.String]] with RawResult[java.lang.String] = js.native
  @JSName("elementIdAttribute")
  def elementIdAttribute_PClient[P](id: ElementId, attributeName: java.lang.String): Client[P] = js.native
  def elementIdClear(id: ElementId): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("elementIdClear")
  def elementIdClear_PClient[P](id: ElementId): Client[P] = js.native
  def elementIdClick(id: ElementId): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("elementIdClick")
  def elementIdClick_PClient[P](id: ElementId): Client[P] = js.native
  def elementIdCssProperty(id: ElementId, propertyName: java.lang.String): Client[RawResult[java.lang.String]] with RawResult[java.lang.String] = js.native
  @JSName("elementIdCssProperty")
  def elementIdCssProperty_PClient[P](id: ElementId, propertyName: java.lang.String): Client[P] = js.native
  /** @deprecated */
  def elementIdDisplayed(id: ElementId): Client[RawResult[scala.Boolean]] with RawResult[scala.Boolean] with scala.Nothing = js.native
  /** @deprecated */
  @JSName("elementIdDisplayed")
  def elementIdDisplayed_PClient[P](id: ElementId): Client[P] = js.native
  def elementIdElement(id: ElementId, selector: java.lang.String): Client[RawResult[Element]] with RawResult[Element] = js.native
  @JSName("elementIdElement")
  def elementIdElement_PClient[P](id: ElementId, selector: java.lang.String): Client[P] = js.native
  def elementIdElements(id: ElementId, selector: java.lang.String): Client[RawResult[js.Array[Element]]] with RawResult[js.Array[Element]] = js.native
  @JSName("elementIdElements")
  def elementIdElements_PClient[P](id: ElementId, selector: java.lang.String): Client[P] = js.native
  def elementIdEnabled(id: ElementId): Client[RawResult[scala.Boolean]] with RawResult[scala.Boolean] = js.native
  @JSName("elementIdEnabled")
  def elementIdEnabled_PClient[P](id: ElementId): Client[P] = js.native
  /** @deprecated in favour of elementIdRect */
  def elementIdLocation(id: ElementId): Client[RawResult[Position]] with RawResult[Position] with scala.Nothing = js.native
  /** @deprecated in favour of elementIdRect */
  def elementIdLocationInView(id: ElementId): Client[RawResult[Position]] with RawResult[Position] with scala.Nothing = js.native
  /** @deprecated in favour of elementIdRect */
  @JSName("elementIdLocationInView")
  def elementIdLocationInView_PClient[P](id: ElementId): Client[P] = js.native
  /** @deprecated in favour of elementIdRect */
  @JSName("elementIdLocation")
  def elementIdLocation_PClient[P](id: ElementId): Client[P] = js.native
  def elementIdName(id: ElementId): Client[RawResult[java.lang.String]] with RawResult[java.lang.String] = js.native
  @JSName("elementIdName")
  def elementIdName_PClient[P](id: ElementId): Client[P] = js.native
  def elementIdRect(id: ElementId): Client[RawResult[DOMRect]] with RawResult[DOMRect] = js.native
  @JSName("elementIdRect")
  def elementIdRect_PClient[P](id: ElementId): Client[P] = js.native
  def elementIdSelected(id: ElementId): Client[RawResult[scala.Boolean]] with RawResult[scala.Boolean] = js.native
  @JSName("elementIdSelected")
  def elementIdSelected_PClient[P](id: ElementId): Client[P] = js.native
  /** @deprecated in favour of elementIdRect */
  def elementIdSize(id: ElementId): Client[RawResult[Size]] with RawResult[Size] with scala.Nothing = js.native
  /** @deprecated in favour of elementIdRect */
  @JSName("elementIdSize")
  def elementIdSize_PClient[P](id: ElementId): Client[P] = js.native
  def elementIdText(id: ElementId): Client[RawResult[java.lang.String]] with RawResult[java.lang.String] = js.native
  @JSName("elementIdText")
  def elementIdText_PClient[P](id: ElementId): Client[P] = js.native
  def elementIdValue(id: ElementId, values: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def elementIdValue(id: ElementId, values: js.Array[java.lang.String]): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("elementIdValue")
  def elementIdValue_PClient[P](id: ElementId, values: java.lang.String): Client[P] = js.native
  @JSName("elementIdValue")
  def elementIdValue_PClient[P](id: ElementId, values: js.Array[java.lang.String]): Client[P] = js.native
  @JSName("element")
  def element_PClient[P](selector: java.lang.String): Client[P] = js.native
  def elements(selector: java.lang.String): Client[RawResult[js.Array[Element]]] with RawResult[js.Array[Element]] = js.native
  @JSName("elements")
  def elements_PClient[P](selector: java.lang.String): Client[P] = js.native
  def emit(event: java.lang.String, args: js.Any*): Client[T] = js.native
  def end(): Client[scala.Unit] = js.native
  def endAll(): Client[scala.Unit] = js.native
  @JSName("endAll")
  def endAll_P[P](): Client[P] = js.native
  @JSName("end")
  def end_P[P](): Client[P] = js.native
  def execute(script: java.lang.String, args: js.Any*): Client[RawResult[_]] with RawResult[_] = js.native
  def execute(script: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): Client[RawResult[_]] with RawResult[_] = js.native
  def executeAsync(script: java.lang.String, args: js.Any*): Client[RawResult[_]] with RawResult[_] = js.native
  def executeAsync(script: js.Function1[/* repeated */ js.Any, scala.Unit], args: js.Any*): Client[RawResult[_]] with RawResult[_] = js.native
  /** @deprecated */
  def file(date: java.lang.String): Client[RawResult[scala.Null]] with scala.Nothing = js.native
  /** @deprecated */
  @JSName("file")
  def file_P[P](date: java.lang.String): Client[P] with scala.Nothing = js.native
  def `finally`(callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Client[T] = js.native
  def forward(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("forward")
  def forward_PClient[P](): Client[P] = js.native
  def frame(id: js.Any): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def frameParent(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("frameParent")
  def frameParent_PClient[P](): Client[P] = js.native
  @JSName("frame")
  def frame_PClient[P](id: js.Any): Client[P] = js.native
  def getAppStrings(language: java.lang.String): Client[T] = js.native
  def getAttribute(attributeName: java.lang.String): Client[java.lang.String] with Client[scala.Null] with java.lang.String with scala.Null = js.native
  def getAttribute(selector: java.lang.String, attributeName: java.lang.String): Client[java.lang.String] with Client[scala.Null] with java.lang.String with scala.Null = js.native
  @JSName("getAttribute")
  def getAttribute_PClient[P](attributeName: java.lang.String): Client[P] = js.native
  @JSName("getAttribute")
  def getAttribute_PClient[P](selector: java.lang.String, attributeName: java.lang.String): Client[P] = js.native
  def getCommandHistory(): Client[js.Array[CommandHistoryEntry]] with js.Array[CommandHistoryEntry] = js.native
  @JSName("getCommandHistory")
  def getCommandHistory_PClient[P](): Client[P] = js.native
  def getCookie(): (Client[Cookie with js.Array[RawResult[java.lang.String]]]) with js.Array[Cookie] with js.Array[RawResult[java.lang.String]] = js.native
  def getCookie(name: java.lang.String): (Client[Cookie with RawResult[java.lang.String]]) with Cookie with RawResult[java.lang.String] = js.native
  @JSName("getCookie")
  def getCookie_PClient[P](): Client[P] = js.native
  @JSName("getCookie")
  def getCookie_PClient[P](name: java.lang.String): Client[P] = js.native
  def getCssProperty(cssProperty: java.lang.String): Client[CssProperty] with CssProperty = js.native
  def getCssProperty(selector: java.lang.String, cssProperty: java.lang.String): Client[CssProperty] with CssProperty = js.native
  @JSName("getCssProperty")
  def getCssProperty_PClient[P](cssProperty: java.lang.String): Client[P] = js.native
  @JSName("getCssProperty")
  def getCssProperty_PClient[P](selector: java.lang.String, cssProperty: java.lang.String): Client[P] = js.native
  def getCurrentDeviceActivity(): Client[T] = js.native
  def getCurrentTabId(): Client[java.lang.String] with java.lang.String = js.native
  @JSName("getCurrentTabId")
  def getCurrentTabId_PClient[P](): Client[P] = js.native
  def getDeviceTime(): Client[T] = js.native
  def getElementSize(): Client[Size] with Size = js.native
  def getElementSize(selector: java.lang.String): Client[Size] with Size = js.native
  def getElementSize(selector: java.lang.String, dimension: java.lang.String): Client[scala.Double] with scala.Double = js.native
  @JSName("getElementSize")
  def getElementSize_PClient[P](): Client[P] = js.native
  @JSName("getElementSize")
  def getElementSize_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("getElementSize")
  def getElementSize_PClient[P](selector: java.lang.String, dimension: java.lang.String): Client[P] = js.native
  def getGeoLocation(): Client[T] = js.native
  def getGridNodeDetails(): Client[UnknownOptions] with UnknownOptions = js.native
  @JSName("getGridNodeDetails")
  def getGridNodeDetails_PClient[P](): Client[P] = js.native
  def getHTML(): Client[java.lang.String] with java.lang.String = js.native
  def getHTML(includeSelectorTag: scala.Boolean): Client[java.lang.String] with java.lang.String = js.native
  def getHTML(selector: java.lang.String): Client[java.lang.String] with java.lang.String = js.native
  def getHTML(selector: java.lang.String, includeSelectorTag: scala.Boolean): Client[java.lang.String] with java.lang.String = js.native
  @JSName("getHTML")
  def getHTML_PClient[P](): Client[P] = js.native
  @JSName("getHTML")
  def getHTML_PClient[P](includeSelectorTag: scala.Boolean): Client[P] = js.native
  @JSName("getHTML")
  def getHTML_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("getHTML")
  def getHTML_PClient[P](selector: java.lang.String, includeSelectorTag: scala.Boolean): Client[P] = js.native
  def getLocation(): Client[scala.Double] with scala.Double = js.native
  def getLocation(axis: Axis): Client[scala.Double] with scala.Double = js.native
  def getLocation(selector: java.lang.String): Client[Position] with Position = js.native
  def getLocation(selector: java.lang.String, axis: Axis): Client[scala.Double] with scala.Double = js.native
  def getLocationInView(): Client[scala.Double] with scala.Double = js.native
  def getLocationInView(axis: Axis): Client[scala.Double] with scala.Double = js.native
  def getLocationInView(selector: java.lang.String): Client[Position] with Position = js.native
  def getLocationInView(selector: java.lang.String, axis: Axis): Client[scala.Double] with scala.Double = js.native
  @JSName("getLocationInView")
  def getLocationInView_PClient[P](): Client[P] = js.native
  @JSName("getLocationInView")
  def getLocationInView_PClient[P](axis: Axis): Client[P] = js.native
  @JSName("getLocationInView")
  def getLocationInView_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("getLocationInView")
  def getLocationInView_PClient[P](selector: java.lang.String, axis: Axis): Client[P] = js.native
  @JSName("getLocation")
  def getLocation_PClient[P](): Client[P] = js.native
  @JSName("getLocation")
  def getLocation_PClient[P](axis: Axis): Client[P] = js.native
  @JSName("getLocation")
  def getLocation_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("getLocation")
  def getLocation_PClient[P](selector: java.lang.String, axis: Axis): Client[P] = js.native
  def getNetworkConnection(): Client[T] = js.native
  def getOrientation(): Client[T] = js.native
  def getSource(): Client[java.lang.String] with java.lang.String = js.native
  @JSName("getSource")
  def getSource_PClient[P](): Client[P] = js.native
  def getTabIds(): Client[js.Array[java.lang.String]] with js.Array[java.lang.String] = js.native
  @JSName("getTabIds")
  def getTabIds_PClient[P](): Client[P] = js.native
  def getTagName(): Client[java.lang.String] with java.lang.String = js.native
  def getTagName(selector: java.lang.String): Client[java.lang.String] with java.lang.String = js.native
  @JSName("getTagName")
  def getTagName_PClient[P](): Client[P] = js.native
  @JSName("getTagName")
  def getTagName_PClient[P](selector: java.lang.String): Client[P] = js.native
  def getText(): Client[java.lang.String] with java.lang.String = js.native
  def getText(selector: java.lang.String): Client[java.lang.String] with java.lang.String = js.native
  @JSName("getText")
  def getText_PClient[P](): Client[P] = js.native
  @JSName("getText")
  def getText_PClient[P](selector: java.lang.String): Client[P] = js.native
  def getTitle(): Client[java.lang.String] with java.lang.String = js.native
  @JSName("getTitle")
  def getTitle_PClient[P](): Client[P] = js.native
  def getUrl(): Client[java.lang.String] with java.lang.String = js.native
  @JSName("getUrl")
  def getUrl_PClient[P](): Client[P] = js.native
  def getValue(): Client[java.lang.String] with java.lang.String = js.native
  def getValue(selector: java.lang.String): Client[java.lang.String] with java.lang.String = js.native
  @JSName("getValue")
  def getValue_PClient[P](): Client[P] = js.native
  @JSName("getValue")
  def getValue_PClient[P](selector: java.lang.String): Client[P] = js.native
  def getViewportSize(): Client[Size] with Size = js.native
  def getViewportSize(dimension: java.lang.String): Client[scala.Double] with scala.Double = js.native
  @JSName("getViewportSize")
  def getViewportSize_PClient[P](): Client[P] = js.native
  @JSName("getViewportSize")
  def getViewportSize_PClient[P](dimension: java.lang.String): Client[P] = js.native
  def gridProxyDetails(): Client[UnknownOptions] with UnknownOptions = js.native
  @JSName("gridProxyDetails")
  def gridProxyDetails_PClient[P](): Client[P] = js.native
  def gridTestSession(): Client[UnknownOptions] with UnknownOptions = js.native
  @JSName("gridTestSession")
  def gridTestSession_PClient[P](): Client[P] = js.native
  def hasFocus(): Client[scala.Boolean] with scala.Boolean = js.native
  def hasFocus(selector: java.lang.String): Client[scala.Boolean] with scala.Boolean = js.native
  @JSName("hasFocus")
  def hasFocus_PClient[P](): Client[P] = js.native
  @JSName("hasFocus")
  def hasFocus_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("hideDeviceKeyboard")
  def hideDeviceKeyboard_pressKey(strategy: webdriverioLib.webdriverioLibStrings.pressKey): Client[T] = js.native
  @JSName("hideDeviceKeyboard")
  def hideDeviceKeyboard_tapOutside(strategy: webdriverioLib.webdriverioLibStrings.tapOutside): Client[T] = js.native
  def hold(selector: java.lang.String): Client[T] = js.native
  /** @deprecated */
  def imeActivate(engine: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated */
  @JSName("imeActivate")
  def imeActivate_P[P](engine: java.lang.String): Client[P] with scala.Nothing = js.native
  /** @deprecated */
  def imeActivated(): Client[RawResult[scala.Boolean]] with RawResult[scala.Boolean] with scala.Nothing = js.native
  /** @deprecated */
  @JSName("imeActivated")
  def imeActivated_PClient[P](): Client[P] = js.native
  /** @deprecated */
  def imeActiveEngine(): Client[RawResult[java.lang.String]] with java.lang.String with scala.Nothing = js.native
  /** @deprecated */
  @JSName("imeActiveEngine")
  def imeActiveEngine_PClient[P](): Client[P] = js.native
  /** @deprecated */
  def imeAvailableEngines(): Client[RawResult[js.Array[java.lang.String]]] with RawResult[js.Array[java.lang.String]] with scala.Nothing = js.native
  /** @deprecated */
  @JSName("imeAvailableEngines")
  def imeAvailableEngines_PClient[P](): Client[P] = js.native
  /** @deprecated */
  def imeDeactivated(): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated */
  @JSName("imeDeactivated")
  def imeDeactivated_PClient[P](): Client[P] = js.native
  def init(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def init(capabilities: DesiredCapabilities): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("init")
  def init_PClient[P](): Client[P] = js.native
  @JSName("init")
  def init_PClient[P](capabilities: DesiredCapabilities): Client[P] = js.native
  def inspect(): webdriverioLib.Anon_State[T] = js.native
  def installApp(path: java.lang.String): Client[T] = js.native
  def isAppInstalled(bundleId: java.lang.String): Client[T] = js.native
  def isEnabled(): Client[scala.Boolean] with scala.Boolean = js.native
  def isEnabled(selector: java.lang.String): Client[scala.Boolean] with scala.Boolean = js.native
  @JSName("isEnabled")
  def isEnabled_PClient[P](): Client[P] = js.native
  @JSName("isEnabled")
  def isEnabled_PClient[P](selector: java.lang.String): Client[P] = js.native
  def isExisting(): Client[scala.Boolean] with scala.Boolean = js.native
  def isExisting(selector: java.lang.String): Client[scala.Boolean] with scala.Boolean = js.native
  @JSName("isExisting")
  def isExisting_PClient[P](): Client[P] = js.native
  @JSName("isExisting")
  def isExisting_PClient[P](selector: java.lang.String): Client[P] = js.native
  def isLocked(): scala.Boolean = js.native
  def isSelected(): Client[scala.Boolean] with scala.Boolean = js.native
  def isSelected(selector: java.lang.String): Client[scala.Boolean] with scala.Boolean = js.native
  @JSName("isSelected")
  def isSelected_PClient[P](): Client[P] = js.native
  @JSName("isSelected")
  def isSelected_PClient[P](selector: java.lang.String): Client[P] = js.native
  def isVisible(): Client[scala.Boolean] with scala.Boolean = js.native
  def isVisible(selector: java.lang.String): Client[scala.Boolean] with scala.Boolean = js.native
  def isVisibleWithinViewport(): Client[scala.Boolean] with scala.Boolean = js.native
  def isVisibleWithinViewport(selector: java.lang.String): Client[scala.Boolean] with scala.Boolean = js.native
  @JSName("isVisibleWithinViewport")
  def isVisibleWithinViewport_PClient[P](): Client[P] = js.native
  @JSName("isVisibleWithinViewport")
  def isVisibleWithinViewport_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("isVisible")
  def isVisible_PClient[P](): Client[P] = js.native
  @JSName("isVisible")
  def isVisible_PClient[P](selector: java.lang.String): Client[P] = js.native
  /** @deprecated in favour of Actions.keyDown */
  def keys(value: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] with Client[scala.Unit] = js.native
  def keys(value: js.Array[java.lang.String]): Client[RawResult[scala.Null]] with RawResult[scala.Null] with Client[scala.Unit] = js.native
  /** @deprecated in favour of Actions.keyDown */
  @JSName("keys")
  def keys_PClient[P](value: java.lang.String): Client[P] = js.native
  @JSName("keys")
  def keys_PClient[P](value: js.Array[java.lang.String]): Client[P] = js.native
  def launch(): Client[T] = js.native
  def leftClick(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def leftClick(selector: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def leftClick(selector: java.lang.String, xoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def leftClick(selector: java.lang.String, xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def leftClick(xoffset: scala.Double): Client[scala.Unit] with js.UndefOr[scala.Nothing] = js.native
  def leftClick(xoffset: scala.Double, yoffset: scala.Double): Client[scala.Unit] with js.UndefOr[scala.Nothing] = js.native
  @JSName("leftClick")
  def leftClick_PClient[P](): Client[P] = js.native
  @JSName("leftClick")
  def leftClick_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("leftClick")
  def leftClick_PClient[P](selector: java.lang.String, xoffset: scala.Double): Client[P] = js.native
  @JSName("leftClick")
  def leftClick_PClient[P](selector: java.lang.String, xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  @JSName("leftClick")
  def leftClick_PClient[P](xoffset: scala.Double): Client[P] = js.native
  @JSName("leftClick")
  def leftClick_PClient[P](xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  def listeners(event: java.lang.String): Client[T] = js.native
  /** @deprecated */
  def localStorage(): Client[RawResult[js.Array[StorageItems]]] with RawResult[js.Array[StorageItems]] = js.native
  /** @deprecated */
  def localStorage(method: Method): Client[RawResult[js.Array[StorageItems]]] with RawResult[js.Array[StorageItems]] with scala.Nothing = js.native
  def localStorage(method: Method, key: java.lang.String): Client[RawResult[js.Array[StorageItems]]] with RawResult[js.Array[StorageItems]] with scala.Nothing = js.native
  def localStorage[P](method: Method, key: StorageItems): Client[P] = js.native
  /** @deprecated */
  def localStorageSize(): Client[RawResult[scala.Double]] with RawResult[scala.Double] with scala.Nothing = js.native
  /** @deprecated */
  @JSName("localStorageSize")
  def localStorageSize_PClient[P](): Client[P] = js.native
  /** @deprecated */
  @JSName("localStorage")
  def localStorage_PClient[P](): Client[P] = js.native
  /** @deprecated */
  @JSName("localStorage")
  def localStorage_PClient[P](method: Method): Client[P] = js.native
  @JSName("localStorage")
  def localStorage_PClient[P](method: Method, key: java.lang.String): Client[P] = js.native
  /** @deprecated in favour of elementIdRect */
  def location(`type`: GeoLocation): Client[RawResult[scala.Double]] with RawResult[scala.Double] with scala.Nothing = js.native
  /** @deprecated in favour of elementIdRect */
  @JSName("location")
  def location_PClient[P](`type`: GeoLocation): Client[P] = js.native
  def lock(seconds: scala.Double): Client[T] = js.native
  /** @deprecated */
  def log(`type`: LoggingPreferences): Client[RawResult[js.Array[LogEntry]]] with scala.Nothing = js.native
  /** @deprecated */
  def logTypes(): Client[RawResult[js.Array[LoggingPreferences]]] with RawResult[js.Array[LoggingPreferences]] with scala.Nothing = js.native
  /** @deprecated */
  @JSName("logTypes")
  def logTypes_PClient[P](): Client[P] = js.native
  /** @deprecated */
  @JSName("log")
  def log_PClient[P](`type`: LoggingPreferences): Client[P] = js.native
  def longPressKeycode(keyCode: java.lang.String, metaState: java.lang.String): Client[T] = js.native
  def middleClick(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def middleClick(selector: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def middleClick(selector: java.lang.String, xoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def middleClick(selector: java.lang.String, xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def middleClick(xoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def middleClick(xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("middleClick")
  def middleClick_PClient[P](): Client[P] = js.native
  @JSName("middleClick")
  def middleClick_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("middleClick")
  def middleClick_PClient[P](selector: java.lang.String, xoffset: scala.Double): Client[P] = js.native
  @JSName("middleClick")
  def middleClick_PClient[P](selector: java.lang.String, xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  @JSName("middleClick")
  def middleClick_PClient[P](xoffset: scala.Double): Client[P] = js.native
  @JSName("middleClick")
  def middleClick_PClient[P](xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  /** @deprecated in favour of Actions.pointerMove */
  def moveTo(id: ElementId, xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated in favour of Actions.pointerMove */
  def moveTo(xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated in favour of Actions.pointerMove */
  def moveTo[P](id: ElementId): Client[P] = js.native
  def moveToObject(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def moveToObject(selector: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def moveToObject(selector: java.lang.String, xoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def moveToObject(selector: java.lang.String, xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def moveToObject(xoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def moveToObject(xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("moveToObject")
  def moveToObject_PClient[P](): Client[P] = js.native
  @JSName("moveToObject")
  def moveToObject_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("moveToObject")
  def moveToObject_PClient[P](selector: java.lang.String, xoffset: scala.Double): Client[P] = js.native
  @JSName("moveToObject")
  def moveToObject_PClient[P](selector: java.lang.String, xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  @JSName("moveToObject")
  def moveToObject_PClient[P](xoffset: scala.Double): Client[P] = js.native
  @JSName("moveToObject")
  def moveToObject_PClient[P](xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  /** @deprecated in favour of Actions.pointerMove */
  @JSName("moveTo")
  def moveTo_PClient[P](id: ElementId, xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  def newWindow(url: java.lang.String, windowName: java.lang.String, windowFeatures: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("newWindow")
  def newWindow_PClient[P](url: java.lang.String, windowName: java.lang.String, windowFeatures: java.lang.String): Client[P] = js.native
  def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): Client[T] = js.native
  def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): Client[T] = js.native
  def openNotifications(): Client[T] = js.native
  def orientation(): webdriverioLib.webdriverioLibStrings.landscape | webdriverioLib.webdriverioLibStrings.portrait = js.native
  @JSName("orientation")
  def orientation_landscape(setTo: webdriverioLib.webdriverioLibStrings.landscape): webdriverioLib.webdriverioLibStrings.landscape | webdriverioLib.webdriverioLibStrings.portrait = js.native
  @JSName("orientation")
  def orientation_portrait(setTo: webdriverioLib.webdriverioLibStrings.portrait): webdriverioLib.webdriverioLibStrings.landscape | webdriverioLib.webdriverioLibStrings.portrait = js.native
  def pause(milliseconds: scala.Double): Client[scala.Unit] = js.native
  @JSName("pause")
  def pause_P[P](milliseconds: scala.Double): Client[P] = js.native
  def performMultiAction(touchAttributes: js.Any): Client[T] = js.native
  def performTouchAction(touchAttributes: js.Any): Client[T] = js.native
  def pressKeycode(keyCode: java.lang.String, metaState: java.lang.String): Client[T] = js.native
  def pullFile(path: java.lang.String): Client[T] = js.native
  def pullFolder(path: java.lang.String): Client[T] = js.native
  def pushFile(path: java.lang.String, data: js.Any): Client[T] = js.native
  def refresh(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("refresh")
  def refresh_PClient[P](): Client[P] = js.native
  def release(selector: java.lang.String): Client[T] = js.native
  def reload(): Client[js.Array[java.lang.String]] with js.Array[java.lang.String] = js.native
  @JSName("reload")
  def reload_PClient[P](): Client[P] = js.native
  def removeAllListeners(): Client[T] = js.native
  def removeAllListeners(event: java.lang.String): Client[T] = js.native
  def removeApp(bundleId: java.lang.String): Client[T] = js.native
  def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): Client[T] = js.native
  def reset(): Client[T] = js.native
  def rightClick(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def rightClick(selector: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def rightClick(selector: java.lang.String, xoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def rightClick(selector: java.lang.String, xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def rightClick(xoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def rightClick(xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("rightClick")
  def rightClick_PClient[P](): Client[P] = js.native
  @JSName("rightClick")
  def rightClick_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("rightClick")
  def rightClick_PClient[P](selector: java.lang.String, xoffset: scala.Double): Client[P] = js.native
  @JSName("rightClick")
  def rightClick_PClient[P](selector: java.lang.String, xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  @JSName("rightClick")
  def rightClick_PClient[P](xoffset: scala.Double): Client[P] = js.native
  @JSName("rightClick")
  def rightClick_PClient[P](xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  def rotate(x: scala.Double, y: scala.Double): Client[T] = js.native
  def rotate(x: scala.Double, y: scala.Double, duration: scala.Double): Client[T] = js.native
  def rotate(x: scala.Double, y: scala.Double, duration: scala.Double, radius: scala.Double): Client[T] = js.native
  def rotate(
    x: scala.Double,
    y: scala.Double,
    duration: scala.Double,
    radius: scala.Double,
    rotation: scala.Double
  ): Client[T] = js.native
  def rotate(
    x: scala.Double,
    y: scala.Double,
    duration: scala.Double,
    radius: scala.Double,
    rotation: scala.Double,
    touchCount: scala.Double
  ): Client[T] = js.native
  def saveScreenshot(): Client[nodeLib.Buffer] with nodeLib.Buffer = js.native
  def saveScreenshot(filename: java.lang.String): Client[nodeLib.Buffer] with nodeLib.Buffer = js.native
  @JSName("saveScreenshot")
  def saveScreenshot_PClient[P](): Client[P] = js.native
  @JSName("saveScreenshot")
  def saveScreenshot_PClient[P](filename: java.lang.String): Client[P] = js.native
  def screenshot(): Client[RawResult[java.lang.String]] with RawResult[java.lang.String] = js.native
  def scroll(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def scroll(selector: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def scroll(selector: java.lang.String, xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def scroll(xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("scroll")
  def scroll_PClient[P](): Client[P] = js.native
  @JSName("scroll")
  def scroll_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("scroll")
  def scroll_PClient[P](selector: java.lang.String, xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  @JSName("scroll")
  def scroll_PClient[P](xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  def selectByAttribute(attribute: java.lang.String, value: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def selectByAttribute(attribute: java.lang.String, value: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def selectByAttribute(selector: java.lang.String, attribute: java.lang.String, value: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def selectByAttribute(selector: java.lang.String, attribute: java.lang.String, value: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("selectByAttribute")
  def selectByAttribute_PClient[P](attribute: java.lang.String, value: java.lang.String): Client[P] = js.native
  @JSName("selectByAttribute")
  def selectByAttribute_PClient[P](attribute: java.lang.String, value: scala.Double): Client[P] = js.native
  @JSName("selectByAttribute")
  def selectByAttribute_PClient[P](selector: java.lang.String, attribute: java.lang.String, value: java.lang.String): Client[P] = js.native
  @JSName("selectByAttribute")
  def selectByAttribute_PClient[P](selector: java.lang.String, attribute: java.lang.String, value: scala.Double): Client[P] = js.native
  def selectByIndex(index: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def selectByIndex(selectElem: java.lang.String, index: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("selectByIndex")
  def selectByIndex_PClient[P](index: scala.Double): Client[P] = js.native
  @JSName("selectByIndex")
  def selectByIndex_PClient[P](selectElem: java.lang.String, index: scala.Double): Client[P] = js.native
  def selectByValue(selectElem: java.lang.String, value: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def selectByValue(value: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("selectByValue")
  def selectByValue_PClient[P](selectElem: java.lang.String, value: java.lang.String): Client[P] = js.native
  @JSName("selectByValue")
  def selectByValue_PClient[P](value: java.lang.String): Client[P] = js.native
  def selectByVisibleText(selectElem: java.lang.String, text: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def selectByVisibleText(text: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("selectByVisibleText")
  def selectByVisibleText_P[P](text: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("selectByVisibleText")
  def selectByVisibleText_PClient[P](selectElem: java.lang.String, text: java.lang.String): Client[P] = js.native
  def selectorExecute[P](
    selectors: java.lang.String,
    script: js.Function2[
      /* elements */ stdLib.HTMLElement | js.Array[stdLib.HTMLElement], 
      /* repeated */ js.Any, 
      P
    ],
    args: js.Any*
  ): Client[P] with js.Any = js.native
  def selectorExecute[P](
    selectors: js.Array[java.lang.String],
    script: js.Function2[
      /* elements */ stdLib.HTMLElement | js.Array[stdLib.HTMLElement], 
      /* repeated */ js.Any, 
      P
    ],
    args: js.Any*
  ): Client[P] with js.Any = js.native
  def selectorExecuteAsync[P](
    selectors: java.lang.String,
    script: js.Function2[
      /* elements */ stdLib.HTMLElement | js.Array[stdLib.HTMLElement], 
      /* repeated */ js.Any, 
      P
    ],
    args: js.Any*
  ): Client[P] with js.Any = js.native
  def selectorExecuteAsync[P](
    selectors: js.Array[java.lang.String],
    script: js.Function2[
      /* elements */ stdLib.HTMLElement | js.Array[stdLib.HTMLElement], 
      /* repeated */ js.Any, 
      P
    ],
    args: js.Any*
  ): Client[P] with js.Any = js.native
  def session(): Client[RawResult[DesiredCapabilities]] with RawResult[DesiredCapabilities] = js.native
  def session(action: Method): Client[RawResult[DesiredCapabilities]] with RawResult[DesiredCapabilities] = js.native
  def session(action: Method, sessionId: java.lang.String): Client[RawResult[DesiredCapabilities]] with RawResult[DesiredCapabilities] = js.native
  /** @deprecated */
  def sessionStorage(): Client[RawResult[StorageItems]] with RawResult[StorageItems] with scala.Nothing = js.native
  /** @deprecated */
  def sessionStorage(method: Method): Client[RawResult[js.Array[java.lang.String]]] with RawResult[js.Array[java.lang.String]] with scala.Nothing = js.native
  /** @deprecated */
  def sessionStorage(method: Method, key: java.lang.String): Client[RawResult[js.Array[java.lang.String]]] with RawResult[js.Array[java.lang.String]] with scala.Nothing = js.native
  /** @deprecated */
  def sessionStorage(method: Method, key: StorageItems): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  /** @deprecated */
  def sessionStorageSize(): Client[RawResult[scala.Double]] with RawResult[scala.Double] with scala.Nothing = js.native
  /** @deprecated */
  @JSName("sessionStorageSize")
  def sessionStorageSize_PClient[P](): Client[P] = js.native
  /** @deprecated */
  @JSName("sessionStorage")
  def sessionStorage_PClient[P](): Client[P] = js.native
  /** @deprecated */
  @JSName("sessionStorage")
  def sessionStorage_PClient[P](method: Method): Client[P] = js.native
  /** @deprecated */
  @JSName("sessionStorage")
  def sessionStorage_PClient[P](method: Method, key: java.lang.String): Client[P] = js.native
  /** @deprecated */
  @JSName("sessionStorage")
  def sessionStorage_PClient[P](method: Method, key: StorageItems): Client[P] = js.native
  @JSName("session")
  def session_P[P](): Client[P] with scala.Null = js.native
  @JSName("session")
  def session_P[P](action: Method): Client[P] with scala.Null = js.native
  @JSName("session")
  def session_P[P](action: Method, sessionId: java.lang.String): Client[P] with scala.Null = js.native
  @JSName("session")
  def session_PClient[P](): Client[P] = js.native
  @JSName("session")
  def session_PClient[P](action: Method): Client[P] = js.native
  /** @deprecated */
  def sessions(): Client[RawResult[js.Array[Session]]] with RawResult[js.Array[Session]] with scala.Nothing = js.native
  /** @deprecated */
  @JSName("sessions")
  def sessions_PClient[P](): Client[P] = js.native
  def setCookie(cookie: Cookie): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("setCookie")
  def setCookie_PClient[P](cookie: Cookie): Client[P] = js.native
  def setGeoLocation(location: GeoLocation): Client[T] = js.native
  def setImmediateValue(id: java.lang.String, value: java.lang.String): Client[T] = js.native
  def setImmediateValue(id: java.lang.String, value: js.Array[java.lang.String]): Client[T] = js.native
  def setMaxListeners(n: scala.Double): Client[T] = js.native
  def setNetworkConnection(flags: webdriverioLib.webdriverioLibNumbers.`0`): Client[T] = js.native
  def setNetworkConnection(flags: webdriverioLib.webdriverioLibNumbers.`1`): Client[T] = js.native
  def setNetworkConnection(flags: webdriverioLib.webdriverioLibNumbers.`2`): Client[T] = js.native
  def setNetworkConnection(flags: webdriverioLib.webdriverioLibNumbers.`4`): Client[T] = js.native
  def setNetworkConnection(flags: webdriverioLib.webdriverioLibNumbers.`6`): Client[T] = js.native
  @JSName("setOrientation")
  def setOrientation_landscape(setTo: webdriverioLib.webdriverioLibStrings.landscape): Client[T] = js.native
  @JSName("setOrientation")
  def setOrientation_portrait(setTo: webdriverioLib.webdriverioLibStrings.portrait): Client[T] = js.native
  def setValue(selector: java.lang.String, values: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def setValue(selector: java.lang.String, values: js.Array[java.lang.String]): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def setValue(selector: java.lang.String, values: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def setValue(values: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def setValue(values: js.Array[java.lang.String]): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def setValue(values: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("setValue")
  def setValue_P[P](selector: java.lang.String, values: java.lang.String): Client[scala.Unit] with js.UndefOr[scala.Nothing] = js.native
  @JSName("setValue")
  def setValue_P[P](selector: java.lang.String, values: js.Array[java.lang.String]): Client[scala.Unit] with js.UndefOr[scala.Nothing] = js.native
  @JSName("setValue")
  def setValue_P[P](selector: java.lang.String, values: scala.Double): Client[scala.Unit] with js.UndefOr[scala.Nothing] = js.native
  @JSName("setValue")
  def setValue_P[P](values: java.lang.String): Client[scala.Unit] with js.UndefOr[scala.Nothing] = js.native
  @JSName("setValue")
  def setValue_P[P](values: js.Array[java.lang.String]): Client[scala.Unit] with js.UndefOr[scala.Nothing] = js.native
  @JSName("setValue")
  def setValue_P[P](values: scala.Double): Client[scala.Unit] with js.UndefOr[scala.Nothing] = js.native
  def setViewportSize(size: Size): Client[scala.Unit] with js.UndefOr[scala.Nothing] = js.native
  def setViewportSize(size: Size, `type`: scala.Boolean): Client[scala.Unit] with js.UndefOr[scala.Nothing] = js.native
  @JSName("setViewportSize")
  def setViewportSize_PClient[P](size: Size): Client[P] = js.native
  @JSName("setViewportSize")
  def setViewportSize_PClient[P](size: Size, `type`: scala.Boolean): Client[P] = js.native
  def settings(): Client[T] = js.native
  def settings(settings: org.scalablytyped.runtime.StringDictionary[java.lang.String]): Client[T] = js.native
  def shake(): Client[T] = js.native
  def source(): Client[RawResult[java.lang.String]] with RawResult[java.lang.String] = js.native
  @JSName("source")
  def source_PClient[P](): Client[P] = js.native
  def startActivity(appPackage: java.lang.String, activity: java.lang.String): Client[T] = js.native
  def startActivity(appPackage: java.lang.String, activity: java.lang.String, appWaitPackage: java.lang.String): Client[T] = js.native
  def startActivity(
    appPackage: java.lang.String,
    activity: java.lang.String,
    appWaitPackage: java.lang.String,
    appWaitActivity: java.lang.String
  ): Client[T] = js.native
  def status(): Client[java.lang.String] = js.native
  @JSName("status")
  def `status_<intersection>`(): Client[RawResult[Status]] with RawResult[Status] = js.native
  def strings(language: java.lang.String): Client[T] = js.native
  /** @deprecated */
  def submit(id: ElementId): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  def submitForm(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def submitForm(selector: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("submitForm")
  def submitForm_PClient[P](): Client[P] = js.native
  @JSName("submitForm")
  def submitForm_PClient[P](selector: java.lang.String): Client[P] = js.native
  /** @deprecated */
  @JSName("submit")
  def submit_PClient[P](id: ElementId): Client[P] = js.native
  def swipe(): Client[T] = js.native
  def swipe(selector: java.lang.String): Client[T] = js.native
  def swipe(selector: java.lang.String, xOffset: scala.Double): Client[T] = js.native
  def swipe(selector: java.lang.String, xOffset: scala.Double, yOffset: scala.Double): Client[T] = js.native
  def swipe(selector: java.lang.String, xOffset: scala.Double, yOffset: scala.Double, speed: scala.Double): Client[T] = js.native
  def swipeDown(selector: java.lang.String): Client[T] = js.native
  def swipeDown(selector: java.lang.String, speed: scala.Double): Client[T] = js.native
  def swipeLeft(selector: java.lang.String): Client[T] = js.native
  def swipeLeft(selector: java.lang.String, speed: scala.Double): Client[T] = js.native
  def swipeRight(selector: java.lang.String): Client[T] = js.native
  def swipeRight(selector: java.lang.String, speed: scala.Double): Client[T] = js.native
  def swipeUp(selector: java.lang.String): Client[T] = js.native
  def swipeUp(selector: java.lang.String, speed: scala.Double): Client[T] = js.native
  def switchTab(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def switchTab(windowHandle: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("switchTab")
  def switchTab_PClient[P](): Client[P] = js.native
  @JSName("switchTab")
  def switchTab_PClient[P](windowHandle: java.lang.String): Client[P] = js.native
  def `then`[P](): Client[P] = js.native
  def `then`[P](onFulfilled: js.Function1[/* value */ T, P | Client[P]]): Client[P] = js.native
  def `then`[P](
    onFulfilled: js.Function1[/* value */ T, P | Client[P]],
    onRejected: js.Function1[/* error */ js.Any, P | Client[P]]
  ): Client[P] = js.native
  def timeouts[P](`type`: Timeouts, ms: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  /** @deprecated in favour of timeouts */
  def timeoutsAsyncScript(ms: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated in favour of timeouts */
  @JSName("timeoutsAsyncScript")
  def timeoutsAsyncScript_PClient[P](ms: scala.Double): Client[P] = js.native
  /** @deprecated in favour of timeouts */
  def timeoutsImplicitWait(ms: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated in favour of timeouts */
  @JSName("timeoutsImplicitWait")
  def timeoutsImplicitWait_PClient[P](ms: scala.Double): Client[P] = js.native
  def title(): Client[RawResult[java.lang.String]] with RawResult[java.lang.String] = js.native
  @JSName("title")
  def title_PClient[P](): Client[P] = js.native
  def toggleAirplaneMode(): Client[T] = js.native
  def toggleData(): Client[T] = js.native
  def toggleLocationServices(): Client[T] = js.native
  def toggleTouchIdEnrollment(`match`: scala.Boolean): Client[T] = js.native
  def toggleWiFi(): Client[T] = js.native
  def touch(selector: java.lang.String, longClick: scala.Boolean): Client[T] = js.native
  @JSName("touchAction")
  def touchAction_press(selector: java.lang.String, action: webdriverioLib.webdriverioLibStrings.press): Client[T] = js.native
  @JSName("touchAction")
  def touchAction_tap(selector: java.lang.String, action: webdriverioLib.webdriverioLibStrings.tap): Client[T] = js.native
  /** @deprecated in favour of Actions.pointerDown */
  def touchClick(id: ElementId): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated in favour of Actions.pointerDown */
  @JSName("touchClick")
  def touchClick_PClient[P](id: ElementId): Client[P] = js.native
  /** @deprecated in favour of Actions.pointerDown */
  def touchDown(xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated in favour of Actions.pointerDown */
  @JSName("touchDown")
  def touchDown_PClient[P](xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  /** @deprecated in favour of Actions.perform */
  def touchFlick(id: ElementId, xoffset: scala.Double, yoffset: scala.Double, speed: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated in favour of Actions.perform */
  @JSName("touchFlick")
  def touchFlick_PClient[P](id: ElementId, xoffset: scala.Double, yoffset: scala.Double, speed: scala.Double): Client[P] = js.native
  def touchId(): Client[T] = js.native
  def touchId(validFingerprint: scala.Boolean): Client[T] = js.native
  /** @deprecated in favour of Actions.perform */
  def touchLongClick(id: ElementId): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated in favour of Actions.perform */
  @JSName("touchLongClick")
  def touchLongClick_PClient[P](id: ElementId): Client[P] = js.native
  /** @deprecated in favour of Actions.pointerMove */
  def touchMove(xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated in favour of Actions.pointerMove */
  @JSName("touchMove")
  def touchMove_PClient[P](xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  def touchMultiPerform(actions: js.Any): Client[T] = js.native
  def touchPerform(actions: js.Any): Client[T] = js.native
  /** @deprecated in favour of Actions.perform */
  def touchScroll(id: ElementId, xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated in favour of Actions.perform */
  @JSName("touchScroll")
  def touchScroll_PClient[P](id: ElementId, xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  /** @deprecated in favour of Actions.pointerUp */
  def touchUp(xoffset: scala.Double, yoffset: scala.Double): Client[RawResult[scala.Null]] with RawResult[scala.Null] with scala.Nothing = js.native
  /** @deprecated in favour of Actions.pointerUp */
  @JSName("touchUp")
  def touchUp_PClient[P](xoffset: scala.Double, yoffset: scala.Double): Client[P] = js.native
  def unlock(): Client[T] = js.native
  def uploadFile(localPath: java.lang.String): Client[RawResult[java.lang.String]] with RawResult[java.lang.String] = js.native
  @JSName("uploadFile")
  def uploadFile_PClient[P](localPath: java.lang.String): Client[P] = js.native
  def url(): Client[RawResult[java.lang.String]] with RawResult[java.lang.String] = js.native
  def url(url: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("url")
  def url_PClient[P](): Client[P] = js.native
  @JSName("url")
  def url_PClient[P](url: java.lang.String): Client[P] = js.native
  def waitForEnabled(): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForEnabled(milliseconds: scala.Double): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForEnabled(milliseconds: scala.Double, reverse: scala.Boolean): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForEnabled(selector: java.lang.String): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForEnabled(selector: java.lang.String, milliseconds: scala.Double): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForEnabled(selector: java.lang.String, milliseconds: scala.Double, reverse: scala.Boolean): Client[scala.Boolean] with scala.Boolean = js.native
  @JSName("waitForEnabled")
  def waitForEnabled_PClient[P](): Client[P] = js.native
  @JSName("waitForEnabled")
  def waitForEnabled_PClient[P](milliseconds: scala.Double): Client[P] = js.native
  @JSName("waitForEnabled")
  def waitForEnabled_PClient[P](milliseconds: scala.Double, reverse: scala.Boolean): Client[P] = js.native
  @JSName("waitForEnabled")
  def waitForEnabled_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("waitForEnabled")
  def waitForEnabled_PClient[P](selector: java.lang.String, milliseconds: scala.Double): Client[P] = js.native
  @JSName("waitForEnabled")
  def waitForEnabled_PClient[P](selector: java.lang.String, milliseconds: scala.Double, reverse: scala.Boolean): Client[P] = js.native
  def waitForExist(): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForExist(milliseconds: scala.Double): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForExist(milliseconds: scala.Double, reverse: scala.Boolean): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForExist(selector: java.lang.String): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForExist(selector: java.lang.String, milliseconds: scala.Double): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForExist(selector: java.lang.String, milliseconds: scala.Double, reverse: scala.Boolean): Client[scala.Boolean] with scala.Boolean = js.native
  @JSName("waitForExist")
  def waitForExist_PClient[P](): Client[P] = js.native
  @JSName("waitForExist")
  def waitForExist_PClient[P](milliseconds: scala.Double): Client[P] = js.native
  @JSName("waitForExist")
  def waitForExist_PClient[P](milliseconds: scala.Double, reverse: scala.Boolean): Client[P] = js.native
  @JSName("waitForExist")
  def waitForExist_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("waitForExist")
  def waitForExist_PClient[P](selector: java.lang.String, milliseconds: scala.Double): Client[P] = js.native
  @JSName("waitForExist")
  def waitForExist_PClient[P](selector: java.lang.String, milliseconds: scala.Double, reverse: scala.Boolean): Client[P] = js.native
  def waitForSelected(): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForSelected(milliseconds: scala.Double): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForSelected(milliseconds: scala.Double, reverse: scala.Boolean): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForSelected(selector: java.lang.String): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForSelected(selector: java.lang.String, milliseconds: scala.Double): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForSelected(selector: java.lang.String, milliseconds: scala.Double, reverse: scala.Boolean): Client[scala.Boolean] with scala.Boolean = js.native
  @JSName("waitForSelected")
  def waitForSelected_PClient[P](): Client[P] = js.native
  @JSName("waitForSelected")
  def waitForSelected_PClient[P](milliseconds: scala.Double): Client[P] = js.native
  @JSName("waitForSelected")
  def waitForSelected_PClient[P](milliseconds: scala.Double, reverse: scala.Boolean): Client[P] = js.native
  @JSName("waitForSelected")
  def waitForSelected_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("waitForSelected")
  def waitForSelected_PClient[P](selector: java.lang.String, milliseconds: scala.Double): Client[P] = js.native
  @JSName("waitForSelected")
  def waitForSelected_PClient[P](selector: java.lang.String, milliseconds: scala.Double, reverse: scala.Boolean): Client[P] = js.native
  def waitForText(): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForText(milliseconds: scala.Double): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForText(milliseconds: scala.Double, reverse: scala.Boolean): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForText(selector: java.lang.String): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForText(selector: java.lang.String, milliseconds: scala.Double): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForText(selector: java.lang.String, milliseconds: scala.Double, reverse: scala.Boolean): Client[scala.Boolean] with scala.Boolean = js.native
  @JSName("waitForText")
  def waitForText_PClient[P](): Client[P] = js.native
  @JSName("waitForText")
  def waitForText_PClient[P](milliseconds: scala.Double): Client[P] = js.native
  @JSName("waitForText")
  def waitForText_PClient[P](milliseconds: scala.Double, reverse: scala.Boolean): Client[P] = js.native
  @JSName("waitForText")
  def waitForText_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("waitForText")
  def waitForText_PClient[P](selector: java.lang.String, milliseconds: scala.Double): Client[P] = js.native
  @JSName("waitForText")
  def waitForText_PClient[P](selector: java.lang.String, milliseconds: scala.Double, reverse: scala.Boolean): Client[P] = js.native
  def waitForValue(): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForValue(milliseconds: scala.Double): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForValue(milliseconds: scala.Double, reverse: scala.Boolean): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForValue(selector: java.lang.String): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForValue(selector: java.lang.String, milliseconds: scala.Double): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForValue(selector: java.lang.String, milliseconds: scala.Double, reverse: scala.Boolean): Client[scala.Boolean] with scala.Boolean = js.native
  @JSName("waitForValue")
  def waitForValue_PClient[P](): Client[P] = js.native
  @JSName("waitForValue")
  def waitForValue_PClient[P](milliseconds: scala.Double): Client[P] = js.native
  @JSName("waitForValue")
  def waitForValue_PClient[P](milliseconds: scala.Double, reverse: scala.Boolean): Client[P] = js.native
  @JSName("waitForValue")
  def waitForValue_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("waitForValue")
  def waitForValue_PClient[P](selector: java.lang.String, milliseconds: scala.Double): Client[P] = js.native
  @JSName("waitForValue")
  def waitForValue_PClient[P](selector: java.lang.String, milliseconds: scala.Double, reverse: scala.Boolean): Client[P] = js.native
  def waitForVisible(): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForVisible(milliseconds: scala.Double): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForVisible(milliseconds: scala.Double, reverse: scala.Boolean): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForVisible(selector: java.lang.String): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForVisible(selector: java.lang.String, milliseconds: scala.Double): Client[scala.Boolean] with scala.Boolean = js.native
  def waitForVisible(selector: java.lang.String, milliseconds: scala.Double, reverse: scala.Boolean): Client[scala.Boolean] with scala.Boolean = js.native
  @JSName("waitForVisible")
  def waitForVisible_PClient[P](): Client[P] = js.native
  @JSName("waitForVisible")
  def waitForVisible_PClient[P](milliseconds: scala.Double): Client[P] = js.native
  @JSName("waitForVisible")
  def waitForVisible_PClient[P](milliseconds: scala.Double, reverse: scala.Boolean): Client[P] = js.native
  @JSName("waitForVisible")
  def waitForVisible_PClient[P](selector: java.lang.String): Client[P] = js.native
  @JSName("waitForVisible")
  def waitForVisible_PClient[P](selector: java.lang.String, milliseconds: scala.Double): Client[P] = js.native
  @JSName("waitForVisible")
  def waitForVisible_PClient[P](selector: java.lang.String, milliseconds: scala.Double, reverse: scala.Boolean): Client[P] = js.native
  def waitUntil(
    condition: js.Function0[
      (scala.Boolean | js.Promise[scala.Boolean] | Client[RawResult[_]]) with RawResult[_]
    ]
  ): Client[scala.Boolean] with js.Any = js.native
  def waitUntil(
    condition: js.Function0[
      (scala.Boolean | js.Promise[scala.Boolean] | Client[RawResult[_]]) with RawResult[_]
    ],
    timeout: scala.Double
  ): Client[scala.Boolean] with js.Any = js.native
  def waitUntil(
    condition: js.Function0[
      (scala.Boolean | js.Promise[scala.Boolean] | Client[RawResult[_]]) with RawResult[_]
    ],
    timeout: scala.Double,
    timeoutMsg: java.lang.String
  ): Client[scala.Boolean] with js.Any = js.native
  def waitUntil(
    condition: js.Function0[
      (scala.Boolean | js.Promise[scala.Boolean] | Client[RawResult[_]]) with RawResult[_]
    ],
    timeout: scala.Double,
    timeoutMsg: java.lang.String,
    interval: scala.Double
  ): Client[scala.Boolean] with js.Any = js.native
  @JSName("waitUntil")
  def waitUntil_PClient[P](
    condition: js.Function0[
      (scala.Boolean | js.Promise[scala.Boolean] | Client[RawResult[_]]) with RawResult[_]
    ]
  ): Client[P] = js.native
  @JSName("waitUntil")
  def waitUntil_PClient[P](
    condition: js.Function0[
      (scala.Boolean | js.Promise[scala.Boolean] | Client[RawResult[_]]) with RawResult[_]
    ],
    timeout: scala.Double
  ): Client[P] = js.native
  @JSName("waitUntil")
  def waitUntil_PClient[P](
    condition: js.Function0[
      (scala.Boolean | js.Promise[scala.Boolean] | Client[RawResult[_]]) with RawResult[_]
    ],
    timeout: scala.Double,
    timeoutMsg: java.lang.String
  ): Client[P] = js.native
  @JSName("waitUntil")
  def waitUntil_PClient[P](
    condition: js.Function0[
      (scala.Boolean | js.Promise[scala.Boolean] | Client[RawResult[_]]) with RawResult[_]
    ],
    timeout: scala.Double,
    timeoutMsg: java.lang.String,
    interval: scala.Double
  ): Client[P] = js.native
  def window(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def window(windowHandle: java.lang.String): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  def windowHandle(): Client[RawResult[java.lang.String]] with RawResult[java.lang.String] = js.native
  def windowHandleFullscreen(): Client[RawResult[scala.Null]] with RawResult[scala.Null] = js.native
  @JSName("windowHandleFullscreen")
  def windowHandleFullscreen_PClient[P](): Client[P] = js.native
  def windowHandleMaximize(): Client[RawResult[java.lang.String]] with RawResult[java.lang.String] = js.native
  @JSName("windowHandleMaximize")
  def windowHandleMaximize_PClient[P](): Client[P] = js.native
  /** @deprecated in favour of /session/{session id}/window/rect */
  def windowHandlePosition(): Client[RawResult[Position]] with RawResult[Position] with scala.Nothing = js.native
  /** @deprecated in favour of /session/{session id}/window/rect */
  def windowHandlePosition(position: Position): Client[RawResult[Position]] with RawResult[Position] with scala.Nothing = js.native
  def windowHandlePosition(windowHandle: java.lang.String): Client[RawResult[Position]] with RawResult[Position] with scala.Nothing = js.native
  def windowHandlePosition(windowHandle: java.lang.String, position: Position): Client[RawResult[Position]] with RawResult[Position] with scala.Nothing = js.native
  /** @deprecated in favour of /session/{session id}/window/rect */
  @JSName("windowHandlePosition")
  def windowHandlePosition_PClient[P](): Client[P] = js.native
  /** @deprecated in favour of /session/{session id}/window/rect */
  @JSName("windowHandlePosition")
  def windowHandlePosition_PClient[P](position: Position): Client[P] = js.native
  @JSName("windowHandlePosition")
  def windowHandlePosition_PClient[P](windowHandle: java.lang.String): Client[P] = js.native
  @JSName("windowHandlePosition")
  def windowHandlePosition_PClient[P](windowHandle: java.lang.String, position: Position): Client[P] = js.native
  /** @deprecated in favour of /session/{session id}/window/rect */
  def windowHandleSize(): Client[RawResult[Size]] with RawResult[Size] with scala.Nothing = js.native
  /** @deprecated in favour of /session/{session id}/window/rect */
  def windowHandleSize(dimension: Size): Client[RawResult[Size]] with RawResult[Size] with scala.Nothing = js.native
  def windowHandleSize(windowHandle: java.lang.String): Client[RawResult[Size]] with RawResult[Size] with scala.Nothing = js.native
  def windowHandleSize(windowHandle: java.lang.String, dimension: Size): Client[RawResult[Size]] with RawResult[Size] with scala.Nothing = js.native
  /** @deprecated in favour of /session/{session id}/window/rect */
  @JSName("windowHandleSize")
  def windowHandleSize_PClient[P](): Client[P] = js.native
  @JSName("windowHandleSize")
  def windowHandleSize_PClient[P](dimension: Size): Client[P] = js.native
  @JSName("windowHandleSize")
  def windowHandleSize_PClient[P](windowHandle: java.lang.String): Client[P] = js.native
  @JSName("windowHandleSize")
  def windowHandleSize_PClient[P](windowHandle: java.lang.String, dimension: Size): Client[P] = js.native
  @JSName("windowHandle")
  def windowHandle_PClient[P](): Client[P] = js.native
  /** @deprecated */
  def windowHandles(): Client[RawResult[js.Array[java.lang.String]]] with RawResult[js.Array[java.lang.String]] with scala.Nothing = js.native
  /** @deprecated */
  @JSName("windowHandles")
  def windowHandles_P[P](): Client[P] with scala.Nothing = js.native
  @JSName("window")
  def window_PClient[P](): Client[P] = js.native
  @JSName("window")
  def window_PClient[P](windowHandle: java.lang.String): Client[P] = js.native
}

